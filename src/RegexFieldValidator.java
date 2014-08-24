import Annotations.Regex;
import Interfaces.FieldValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kamrul.hasan on 8/21/14.
 */
public class RegexFieldValidator implements FieldValidator {
    public void  validateField(Object object,Field field,Annotation annotation)
    {

        try {
            field.setAccessible(true);
            String value=(String)field.get(object);
            Regex regexPattern= ((Regex) annotation);

            Pattern p = Pattern.compile(regexPattern.value());
            Matcher m = p.matcher(value);

            if (m.find())
                System.out.println("Valid "+field.getName());
            else System.out.println("Not Valid "+field.getName());


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
