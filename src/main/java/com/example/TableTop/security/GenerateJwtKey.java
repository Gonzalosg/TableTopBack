package com.example.TableTop.security;

import java.security.Key;
import java.util.Base64;

import io.jsonwebtoken.security.Keys;

public class GenerateJwtKey {
    public static void main(String[] args) {    
        Key key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);
        String base64Key = Base64.getEncoder().encodeToString(key.getEncoded());
        System.out.println("Clave secreta segura (Base64): " + base64Key);
    }
}
