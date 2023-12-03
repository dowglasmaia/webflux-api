package br.com.maia.webfluxapi.service;

import br.com.maia.webfluxapi.entity.User;
import br.com.maia.webfluxapi.model.user.UserRequest;
import br.com.maia.webfluxapi.model.user.UserResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<Void>save(UserRequest request);

    Mono<UserResponse> findById(String id);
}
