package lab2;

/**
 * This version of CollegeLevelCoruse now implements GenericSchoolCourse Interface instead of extending it
 * This means it needs to provide implementation to the required methods of that interface. This has some disivantages 
 * than the abstract version since properties such as courseName which should likely always be given in a constructor 
 * are not longer mandatory. In fact if an author wanted to they could simply have the getCoruseName() method always return 
 * null. The interface dictates that the method should be present but not the property. Even though a getter and setter
 * heavily implies that a property exists it is legal to exclude it.  
 * @author Brandon
 */
public class CollegeLevelCourse implements GenericSchoolCourse{
    public static final double MAX_CREDITS = 5.0;
    public static final double MIN_CREDITS = 0.0; //Could just be a manditory meeting coruse
    
    private String courseName;
    private long schoolCode;
    private String courseNumber;
    private double credits;
    
    public CollegeLevelCourse(String courseName, String courseNumber){
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }
    
    //----------------------//
    //--- GETTER METHODS ---//
    //----------------------//
    @Override
    public final String getCourseName() {return courseName;}
   
    @Override
    public final long getSchoolCode(){return schoolCode;}
    
    public final String getCourseNumber() {return courseNumber;}
    public final double getCredits(){return credits;}
    
    //----------------------//
    //--- SETTER METHODS ---//
    //----------------------//
    
    @Override
    public final void setSchoolCode(long schoolCode){
        if(schoolCode < 0) throw new IllegalArgumentException("School Code must be postive number");
        this.schoolCode = schoolCode;
    }
    
    @Override
    public final void setCourseName(String courseName) {
        if(stringIsNullOrEmpty(courseName)) throw new IllegalArgumentException("Course Name may not be null or empty");
        this.courseName = courseName;
    }
    
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
