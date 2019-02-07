package edu.tamu.scholars.middleware.harvest.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ FIELD })
@Retention(RUNTIME)
@Documented
public @interface PropertySource {

    String template();

    String key();

    String id() default "";

    // NOTE: extracts identifier from url, after last / or #
    boolean parse() default false;

}
