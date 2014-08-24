import Annotations.NotNull;
import Annotations.Range;
import Annotations.Regex;

/**
 * Created by kamrul.hasan on 8/21/14.
 */
public class Student {
    @NotNull()
    private  String name;
    @NotNull()
    @Regex(value = RegexPattern.EMAIL_PATTERN)
    private  String email;
    @Regex(value = RegexPattern.MOBILE_NUM_PATTERN)
    private  String mobileNum;
    @Range(min=10, max=30)
    private int age;

    public Student(String name, String email, String mobileNum, int age)
    {
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.age = age;
    }






}
