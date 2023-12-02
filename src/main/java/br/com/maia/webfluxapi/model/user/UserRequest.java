package br.com.maia.webfluxapi.model.user;

public record UserRequest(
        String name,
        String email,
        String password
        ) {}
