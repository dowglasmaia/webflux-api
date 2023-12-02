package br.com.maia.webfluxapi.model.user;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) {
}
