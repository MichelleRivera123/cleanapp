package com.esfe.cleanapp.domain.model.port;

/**
 * Dominio puro: entidad de ejemplo sin anotaciones de frameworks.
 * Aquí validamos invariantes con código normal (clean domain).
 */
public class Usuario {
    private String nombre;
    private String email;
    private String password;
    private boolean Estado;

    private Usuario(String nombre, String email) {
        if (nombre == null || nombre.trim().length() < 2 || nombre.length() > 50)
            throw new IllegalArgumentException("Nombre debe tener entre 2 y 50 caracteres");
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Email inválido");
        this.nombre = nombre.trim();
        this.email = email;
    }

    public static Usuario of(String nombre, String email) { return new Usuario(nombre, email); }
    public String getNombre(){ return nombre; }
    public String getEmail(){ return email; }
}
