package lab1;

/**
 * CollegeLevelCoruses all have a courseNumber and set of CreditHours
 * Some Colleges require students to do enrollment tours or intoToCollege courses 
 * that are simply pass/fail by attending and thus don't actually effect the GPA
 * so with that in mind credits is not mandatory but may not be negative or some 
 * outrageous number.
 * 
 * CollegeLevelCourse does require a name which is mandatory via GenericSchoolCoruse
 * and all CollegeLevelCourses should have a course number which should follow a specific format
 * 
 * CollegeLevelCourse also inherits invisibly the SchoolCode property.
 * 
 * @author Brandon
 */
public class CollegeLevelCourse extends GenericSchoolCourse{
    public static final double MAX_CREDITS = 5.0;
    public static final double MIN_CREDITS = 0.0; //Could just be a manditory meeting coruse
    
    private String courseNumber;
    private double credits;
    
    public CollegeLevelCourse(String courseName, String courseNumber){
        super(courseName);
        setCourseNumber(courseNumber);
    }
    
    //----------------------//
    //--- GETTER METHODS ---//
    //----------------------//
  
    public final String getCourseNumber() {return courseNumber;}
    public final double getCredits(){return credits;}
    
    //----------------------//
    //--- SETTER METHODS ---//
    //----------------------//
    
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS|| credits > MAX_CREDITS) 
            throw new IllegalArgumentException("Invalid Credit Range");
        this.credits = credits;
    }

    public final void setCourseNumber(String courseNumber) {
        if(!courseNumberIsValid(courseNumber)) throw new IllegalArgumentException("Course Number must be ###-###-### Format");
        this.courseNumber = courseNumber;
    }
    
    //----------------------//
    //- Validation Helpers -//
    //----------------------//
    
    private boolean stringIsNullOrEmpty(String testString){
        return testString == null || testString.isEmpty();
    }
    
    private boolean courseNumberIsValid(String testNumber){
        return !stringIsNullOrEmpty(testNumber) &&
                testNumber.matches("\\d{3}-\\d{3}-\\d{3}");
    }
}
