package cl.bci.palma.domain.converters;

import cl.bci.palma.infrastructure.inbound.api.model.UserSimpleVo;
import cl.bci.palma.infrastructure.inbound.api.model.UserVo;
import cl.bci.palma.infrastructure.outbound.repository.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserEntity2UserSimpleVo implements Converter<User, UserSimpleVo> {
    @Override
    public UserSimpleVo convert(User user) {
        UserSimpleVo userVo = new UserSimpleVo();

        userVo.setId(user.getId());
        userVo.setName(user.getName());
        userVo.setEmail(user.getEmail());
        userVo.setEnable(user.isEnable());

        return userVo;
    }
}
