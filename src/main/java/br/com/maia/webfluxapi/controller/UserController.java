package br.com.maia.webfluxapi.controller;

import br.com.maia.webfluxapi.model.user.UserRequest;
import br.com.maia.webfluxapi.model.user.UserResponse;
import br.com.maia.webfluxapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Mono<Void>> save(@RequestBody UserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body( userService.save(request)  );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<UserResponse>> findById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(
                        userService.findById(id)

                );
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
