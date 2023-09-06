package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//First step toward creating the custom annotation is to declare
//using keyword @interface
//next to add meta data - Runtime Visibilty - type means it can apply to all class

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE)

public @interface JsonSerializable {

}
