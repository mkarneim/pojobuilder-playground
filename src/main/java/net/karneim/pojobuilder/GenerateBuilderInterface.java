package net.karneim.pojobuilder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
public @interface GenerateBuilderInterface {
  public final String DEFAULT_NAME = "*BuilderInterface";
  
  String withName() default DEFAULT_NAME;

}
