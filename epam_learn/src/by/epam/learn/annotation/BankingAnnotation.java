package by.epam.learn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * одночленная аннотация метода # BankingAnnotation.java
 * Аннотация BankingAnnotation предназначена для задания 
 * уровня проверки безопасности при вызове метода.
 * @author bas
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BankingAnnotation {
	SecurityLevelType securityLevel() default SecurityLevelType.MEDIUM;
}
