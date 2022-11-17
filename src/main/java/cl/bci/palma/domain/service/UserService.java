package cl.bci.palma.domain.service;

import cl.bci.palma.infrastructure.inbound.api.model.UserDetailVo;
import cl.bci.palma.infrastructure.inbound.api.model.UserRequest;
import cl.bci.palma.infrastructure.inbound.api.model.UserSimpleVo;
import cl.bci.palma.infrastructure.inbound.api.model.UserVo;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserVo create(final UserRequest userRequest);

    List<UserSimpleVo> getUsers();
    UserDetailVo getUser(final UUID id);

    UserVo update(final UUID id, final UserRequest userRequest);

    void delete(final UUID id);
}
