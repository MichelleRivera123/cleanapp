package com.esfe.cleanapp.infrastructure.config;

import com.esfe.cleanapp.application.usecase.CheckDbHealthService;
import com.esfe.cleanapp.domain.model.port.in.CheckDbHealthUseCase;
import com.esfe.cleanapp.domain.model.port.out.SqlHealthPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Wiring: conecta puertos del dominio con adaptadores concretos. */
@Configuration
public class BeanConfig {
    @Bean
    CheckDbHealthUseCase checkDbHealthUseCase(SqlHealthPort port){

        return new CheckDbHealthService(port);
    }
}