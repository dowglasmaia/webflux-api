package br.com.maia.webfluxapi.mapper;

import br.com.maia.webfluxapi.entity.User;
import br.com.maia.webfluxapi.model.user.UserRequest;
import br.com.maia.webfluxapi.model.user.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(UserRequest request);

    UserResponse toUserResponse(User entity);
}
