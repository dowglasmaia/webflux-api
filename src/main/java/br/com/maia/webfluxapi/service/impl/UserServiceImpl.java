package br.com.maia.webfluxapi.service.impl;

import br.com.maia.webfluxapi.mapper.UserMapper;
import br.com.maia.webfluxapi.model.user.UserRequest;
import br.com.maia.webfluxapi.model.user.UserResponse;
import br.com.maia.webfluxapi.repository.UserRepository;
import br.com.maia.webfluxapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private UserRepository repository;

    @Override
    public Mono<Void> save(UserRequest request) {
        var entity = mapper.toEntity(request);
        return repository.insert(entity).then();
    }

    @Override
    public Mono<UserResponse> findById(String id) {
        return repository.findById(id)
                .map(entity -> mapper.toUserResponse(entity))
                .switchIfEmpty( Mono.error(ChangeSetPersister.NotFoundException::new));
    }
}
