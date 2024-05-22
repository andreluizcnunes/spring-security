package com.example.SS.security.dto;

import com.example.SS.security.entities.UsuarioRole;

public record RegisterDTO(String login, String password, UsuarioRole role) {
}
