package com.example.SS.security.serviciesImplements;

import com.example.SS.security.entities.Usuario;

public interface TokenImp {

    public String generateToken(Usuario usuario);

}
