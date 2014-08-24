import Interfaces.FieldValidator;

/**
 * Created by kamrul.hasan on 8/21/14.
 */
public class AnnotationTypeExtractor {

    public static FieldValidator extractAnnotationObject(String type)
    {

        if(type.equals("interface Annotations.Range")) {
            return new RangeFieldValidator();
        }
        else if(type.equals("interface Annotations.Regex"))
            return new RegexFieldValidator();
        else if(type.equals("interface Annotations.NotNull"))
            return new NotNullFieldValidator();

        return null;
    }


}
