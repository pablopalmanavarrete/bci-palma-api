package cl.bci.palma.domain.converters;

import cl.bci.palma.infrastructure.inbound.api.model.UserVo;
import cl.bci.palma.infrastructure.outbound.repository.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserEntity2Vo implements Converter<User, UserVo> {
    @Override
    public UserVo convert(User user) {
        UserVo userVo = new UserVo();

        userVo.setId(user.getId());
        userVo.setName(user.getName());
        userVo.setEmail(user.getEmail());
        userVo.setPassword(user.getPassword());
        userVo.setToken(user.getToken());
        userVo.setCreationDate(user.getCreationDate());
        userVo.setLastModifiedDate(user.getLastModifiedDate());
        userVo.setLastLogin(user.getLastLogin());
        userVo.setEnable(user.isEnable());

        return userVo;
    }
}
