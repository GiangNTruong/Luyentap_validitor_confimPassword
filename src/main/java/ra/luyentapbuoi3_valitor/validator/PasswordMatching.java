package ra.luyentapbuoi3_valitor.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;

import java.lang.annotation.*;

@Constraint(validatedBy = PasswordMatchingValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatching {
    String password();
    String confirmPassword();
    //Khai bao các thuộc tính của annotion
    String message() default "ConfirmPassword is not matching";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    @Target(ElementType.ANNOTATION_TYPE)
    @Retention(RetentionPolicy.RUNTIME)

    public @interface List {
        PasswordMatching[] value();
    }
}
