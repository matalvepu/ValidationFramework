/**
 * Created by kamrul.hasan on 8/21/14.
 */
import Interfaces.FieldValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
public class Validator {


   public Field[] getObjectFields(Object object)
   {
       return object.getClass().getDeclaredFields();
   }

   public Annotation[] getAnnotations(Field field)
   {
      return field.getAnnotations();
   }

   public void validateObject(Object object)throws SecurityException
   {

       FieldValidator fieldValidator;
       Field[] field;
       Annotation[] annotation;

       try {

           field = getObjectFields(object);
           for (int i = 0; i < field.length; i++) {
               annotation = getAnnotations(field[i]);

               for (int j = 0; j < annotation.length; j++) {
                   String type=String.valueOf(annotation[j].annotationType());
                   System.out.println("\n"+type);
                   fieldValidator= AnnotationTypeExtractor.extractAnnotationObject(type);
                   fieldValidator.validateField(object, field[i], annotation[j]);
               }

           }
       }catch (SecurityException  e) {
                     e.printStackTrace();
                  }

   }


}
