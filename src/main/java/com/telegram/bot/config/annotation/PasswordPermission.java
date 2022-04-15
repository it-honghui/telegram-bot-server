package com.telegram.bot.config.annotation;

import java.lang.annotation.*;

/**
 * @author honghui 2022/4/13
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PasswordPermission {

  boolean requirePassword() default false;

}
