package Interfaces;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by kamrul.hasan on 8/21/14.
 */
public interface FieldValidator {

    public void validateField(Object object,Field field,Annotation annotation);

}
