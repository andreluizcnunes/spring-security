package com.example.SS.security.controlles;

import com.example.SS.security.entities.UsuarioRole;
import com.example.SS.security.servicies.UsuarioRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/role")
public class UsuarioRolesController {

    private final UsuarioRoleService usuarioRoleService;

    public UsuarioRolesController(UsuarioRoleService usuarioRoleService) {
        this.usuarioRoleService = usuarioRoleService;
    }

    @PostMapping
    public UsuarioRole createUsuarioRole(@RequestBody UsuarioRole usuarioRole) {
        return usuarioRoleService.createUsuarioRole(usuarioRole);
    }

    @GetMapping
    public List<UsuarioRole> getAllUsuarioRoles() {
        return usuarioRoleService.getAllUsuarioRoles();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioRole> getUsuarioRoleById(@PathVariable Long id) {
        return usuarioRoleService.getUsuarioRoleById(id);
    }

    @PutMapping("/{id}")
    public UsuarioRole updateUsuarioRole(@PathVariable Long id, @RequestBody UsuarioRole usuarioRole) {
        return usuarioRoleService.updateUsuarioRole(id, usuarioRole);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuarioRole(@PathVariable Long id) {
        usuarioRoleService.deleteUsuarioRole(id);
    }

}
