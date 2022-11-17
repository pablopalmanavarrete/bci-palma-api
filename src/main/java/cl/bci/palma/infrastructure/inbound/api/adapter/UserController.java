package cl.bci.palma.infrastructure.inbound.api.adapter;

import cl.bci.palma.domain.service.UserService;
import cl.bci.palma.infrastructure.inbound.api.model.UserDetailVo;
import cl.bci.palma.infrastructure.inbound.api.model.UserRequest;
import cl.bci.palma.infrastructure.inbound.api.model.UserSimpleVo;
import cl.bci.palma.infrastructure.inbound.api.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserVo> create(@RequestBody UserRequest userRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(userRequest));
    }

    @GetMapping
    public ResponseEntity<List<UserSimpleVo>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetailVo> getUser(@PathVariable final UUID id) {
        return ResponseEntity.ok().body(userService.getUser(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserVo> update(@PathVariable final UUID id,
                                         @RequestBody UserRequest userRequest) {
        return ResponseEntity.accepted().body(userService.update(id, userRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final UUID id) {
        userService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
