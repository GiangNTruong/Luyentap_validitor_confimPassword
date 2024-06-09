package ra.luyentapbuoi3_valitor.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.luyentapbuoi3_valitor.validator.PasswordMatching;
import ra.luyentapbuoi3_valitor.validator.UserNameUnique;

@NoArgsConstructor
@AllArgsConstructor
@Data
@PasswordMatching(
        password = "password",
        confirmPassword = "conFirmPassword"
)
public class UserDto {
    @NotBlank
    @UserNameUnique
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String conFirmPassword;
}
