import Interfaces.FieldValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by kamrul.hasan on 8/21/14.
 */
public class NotNullFieldValidator implements FieldValidator {

    public void validateField(Object object,Field field,Annotation annotation)
    {
        try {
            field.setAccessible(true);
            String value=(String)field.get(object);

            if(value!=null)
                System.out.println("Not Null");
            else System.out.println("Null");

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



    }

}

