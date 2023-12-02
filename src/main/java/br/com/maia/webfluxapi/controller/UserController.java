package br.com.maia.webfluxapi.controller;

import br.com.maia.webfluxapi.model.user.UserRequest;
import br.com.maia.webfluxapi.model.user.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserController {

    @PostMapping
    public ResponseEntity<Mono<Void>> save(@RequestBody UserRequest request) {

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<UserResponse>> findById(@PathVariable String id) {
        return null;
    }

    @GetMapping
    public ResponseEntity<Flux<UserResponse>> findAll() {
        return null;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Mono<UserResponse>> findById(
            @PathVariable String id,
            @RequestBody UserRequest request) {

        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Mono<Void>> delete(@PathVariable String id) {
        return null;
    }
}
