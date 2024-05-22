package com.example.SS.security.controlles;

import com.example.SS.security.dto.AuthenticationDTO;
import com.example.SS.security.dto.LoginResponseDTO;
import com.example.SS.security.dto.RegisterDTO;
import com.example.SS.security.entities.Usuario;
import com.example.SS.security.repositories.UsuarioRepository;
import com.example.SS.security.servicies.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;

    private final UsuarioRepository usuarioRepository;
    private final TokenService tokenService;

    public AuthenticationController(AuthenticationManager authenticationManager, UsuarioRepository usuarioRepository, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.usuarioRepository = usuarioRepository;
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Validated AuthenticationDTO data){
        var userNamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(userNamePassword);

        var token = tokenService.generateToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Validated RegisterDTO data){
        if(this.usuarioRepository.findByLogin(data.login()) != null) return ResponseEntity.ok().build();

        String encryptedPàssword = new BCryptPasswordEncoder().encode(data.password());
        var novoUsuario = new Usuario(data.login(), encryptedPàssword, data.role());

        this.usuarioRepository.save(novoUsuario);
        return ResponseEntity.ok().build();
    }

}
