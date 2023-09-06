package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Another method level Annotation
//Lets imagine before serializing the object to a JSON.String
//we want to execute one method to initialize an object

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)

public @interface Init {

}
