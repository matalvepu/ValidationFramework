import Annotations.Range;
import Interfaces.FieldValidator;

import java.lang.reflect.Field;
import java.lang.annotation.Annotation;

/**
 * Created by kamrul.hasan on 8/21/14.
 */
public class RangeFieldValidator implements FieldValidator {

    public void validateField(Object object,Field field,Annotation annotation)
    {
        try {
            field.setAccessible(true);
            int value=(Integer)field.get(object);
            Range range= ((Range) annotation);

            if(value>=range.min() && value<=range.max())
                System.out.println("In range");

            else System.out.println("Not in range");

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



    }

}
