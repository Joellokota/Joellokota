package com.cl.reservationservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ConfigSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .headers(head -> head.frameOptions(Customizer.withDefaults()).frameOptions(Customizer.withDefaults()).disable())
                .authorizeHttpRequests(ar -> ar.requestMatchers("/h2-console/**", "/bookings/**").permitAll())
                .authorizeHttpRequests(ar -> ar.anyRequest().authenticated())
                .build();
    }
}
