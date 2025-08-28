package com.esfe.cleanapp.domain.model.port.in;

/** Caso de uso: comprobar que la base de datos responde. */
public interface CheckDbHealthUseCase {
    boolean isHealthy();
}
