package ra.luyentapbuoi3_valitor.service;

import ra.luyentapbuoi3_valitor.dto.UserDto;
import ra.luyentapbuoi3_valitor.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User insert(UserDto userDto);
}
