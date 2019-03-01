package edu.tamu.scholars.middleware.view.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import edu.tamu.scholars.middleware.view.validator.DiscoveryCollectionValidator;

@Documented
@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = DiscoveryCollectionValidator.class)
public @interface ValidDiscoveryCollection {
    
    String message();

}
