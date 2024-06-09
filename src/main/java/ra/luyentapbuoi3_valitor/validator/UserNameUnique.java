package ra.luyentapbuoi3_valitor.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UsernameUniqueValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserNameUnique {
    //Khai bao các thuộc tính của annotion
    String message() default "Username is exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
