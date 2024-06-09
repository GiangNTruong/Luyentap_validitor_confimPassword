package ra.luyentapbuoi3_valitor.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.luyentapbuoi3_valitor.dto.UserDto;
import ra.luyentapbuoi3_valitor.entity.Role;
import ra.luyentapbuoi3_valitor.entity.User;
import ra.luyentapbuoi3_valitor.repository.IRoleRepository;
import ra.luyentapbuoi3_valitor.repository.UserRepository;
import ra.luyentapbuoi3_valitor.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final IRoleRepository roleRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User insert(UserDto userDto) {
        Role userRole = roleRepository.findById(3L).orElseThrow(() -> new NoSuchElementException("Role not found"));

        User user = User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .roles(Set.of(userRole))
                .build();

        return userRepository.save(user);
    }
}
