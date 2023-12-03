package br.com.maia.webfluxapi.service.impl;

import br.com.maia.webfluxapi.entity.User;
import br.com.maia.webfluxapi.mapper.UserMapper;
import br.com.maia.webfluxapi.model.user.UserRequest;
import br.com.maia.webfluxapi.repository.UserRepository;
import br.com.maia.webfluxapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserRepository repository;

    @Override
    public Mono<User> save(UserRequest request) {
        var entity = mapper.toEntity(request);
        return repository.insert(entity);
    }
}
