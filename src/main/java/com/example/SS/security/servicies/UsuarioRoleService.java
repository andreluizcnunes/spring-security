package com.example.SS.security.servicies;

import com.example.SS.security.entities.UsuarioRole;
import com.example.SS.security.repositories.UsuarioRoleRepository;
import com.example.SS.security.serviciesImplements.UsuarioRoleImp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioRoleService implements UsuarioRoleImp {

    private final UsuarioRoleRepository usuarioRoleRepository;

    public UsuarioRoleService(UsuarioRoleRepository usuarioRoleRepository) {
        this.usuarioRoleRepository = usuarioRoleRepository;
    }

    @Override
    public UsuarioRole createUsuarioRole(UsuarioRole usuarioRole) {
        return usuarioRoleRepository.save(usuarioRole);
    }

    @Override
    public List<UsuarioRole> getAllUsuarioRoles() {
        return usuarioRoleRepository.findAll();
    }

    @Override
    public Optional<UsuarioRole> getUsuarioRoleById(Long id) {
        return usuarioRoleRepository.findById(id);
    }

    @Override
    public UsuarioRole updateUsuarioRole(Long id, UsuarioRole usuarioRole) {
        return usuarioRoleRepository.save(usuarioRole);
    }

    @Override
    public void deleteUsuarioRole(Long id) {
        usuarioRoleRepository.deleteById(id);
    }
}
