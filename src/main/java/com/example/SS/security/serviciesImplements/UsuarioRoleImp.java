package com.example.SS.security.serviciesImplements;

import com.example.SS.security.entities.UsuarioRole;

import java.util.List;
import java.util.Optional;

public interface UsuarioRoleImp {

    public UsuarioRole createUsuarioRole(UsuarioRole usuarioRole);
    public List<UsuarioRole> getAllUsuarioRoles();
    public Optional<UsuarioRole> getUsuarioRoleById(Long id);
    public UsuarioRole updateUsuarioRole(Long id, UsuarioRole usuarioRole);
    public void deleteUsuarioRole(Long id);
}
