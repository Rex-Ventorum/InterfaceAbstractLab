
package lab1;

/**
 * A Generic School course is one that just has a name and school code that it belongs to
 * The name is required but the school code can be left as 0 if it is a nation wide course or
 * just not needed. This class does not contain a lot of information and thus should be subclassed 
 * and not instantiated.
 * 
 * Examples may be: CollegeLevelCourse, ElementryCourse, MiddleSchoolCourse, or even CommunityCourse
 * 
 * @author Brandon
 * @version 1.0
 */
public abstract class GenericSchoolCourse {
        
    private String courseName;
    private long schoolCode;
    
    public GenericSchoolCourse(String courseName){
        setCourseName(courseName);
    }
    //----------------------//
    //--- GETTER METHODS ---//
    //----------------------//
    public final String getCourseName() {return courseName;}
    
    public final long getSchoolCode(){return schoolCode;}
    
    //----------------------//
    //--- SETTER METHODS ---//
    //----------------------//
    
    public final void setSchoolCode(long schoolCode){
        if(schoolCode < 0) throw new IllegalArgumentException("School Code must be postive number");
        this.schoolCode = schoolCode;
    }
    
    public final void setCourseName(String courseName) {
        if(stringIsNullOrEmpty(courseName)) throw new IllegalArgumentException("Course Name may not be null or empty");
        this.courseName = courseName;
    }
    
    //----------------------//
    //- Validation Helpers -//
    //----------------------//
    
    private boolean stringIsNullOrEmpty(String testString){
        return testString == null || testString.isEmpty();
    }
}
