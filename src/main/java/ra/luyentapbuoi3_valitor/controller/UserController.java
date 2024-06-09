package ra.luyentapbuoi3_valitor.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.luyentapbuoi3_valitor.dto.UserDto;
import ra.luyentapbuoi3_valitor.entity.User;
import ra.luyentapbuoi3_valitor.service.UserService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@Valid @ModelAttribute UserDto userDto) {
        User newUser = userService.insert(userDto);
        return ResponseEntity.ok(newUser);
    }
}
