package com.example.SS.security.serviciesImplements;

import com.example.SS.security.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioImp {

    public Usuario creaUsuario(Usuario usuario);
    public List<Usuario> listaUsuarios();
}
