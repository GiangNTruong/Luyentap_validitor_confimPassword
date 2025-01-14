package ra.luyentapbuoi3_valitor.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import ra.luyentapbuoi3_valitor.repository.UserRepository;

@RequiredArgsConstructor
public class UsernameUniqueValidator implements ConstraintValidator<UserNameUnique,String> {
    private final UserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {

        return !userRepository.existsByUsername(username);
    }
}
