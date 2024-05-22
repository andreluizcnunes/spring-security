package com.example.SS.security.servicies;

import com.example.SS.security.entities.Usuario;
import com.example.SS.security.repositories.UsuarioRepository;
import com.example.SS.security.serviciesImplements.UsuarioImp;

import java.util.List;

public class UsuarioService implements UsuarioImp {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario creaUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }
}
