package br.com.maia.webfluxapi.service;

import br.com.maia.webfluxapi.entity.User;
import br.com.maia.webfluxapi.model.user.UserRequest;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User>save(UserRequest request);
}
