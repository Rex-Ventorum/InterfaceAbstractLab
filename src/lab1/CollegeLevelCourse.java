package lab1;

public abstract class CollegeLevelCourse {
    public static final double MAX_CREDITS = 4.0;
    public static final double MIN_CREDITS = 0.0; //Could just be a manditory meeting coruse
    
    private String departmentName;
    private String courseName;
    private String courseNumber;
    private double credits;
    
    //----------------------//
    //--- GETTER METHODS ---//
    //----------------------//
    
    public final String getDepartmentName(){return departmentName;}
    public final String getCourseName() {return courseName;}
    public final String getCourseNumber() {return courseNumber;}
    public final double getCredits(){return credits;}
    
    //----------------------//
    //--- SETTER METHODS ---//
    //----------------------//
    
    public final void setDepartmentName(String departmentName){
        if(stringIsNullOrEmpty(departmentName)) throw new IllegalArgumentException("Course Name may not be null or empty");
        this.departmentName = departmentName;
    }
    
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS|| credits > MAX_CREDITS) 
            throw new IllegalArgumentException("Invalid Credit Range");
        this.credits = credits;
    }


    public final void setCourseName(String courseName) {
        if(stringIsNullOrEmpty(courseName)) throw new IllegalArgumentException("Course Name may not be null or empty");
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber) {
        if(!courseNumberIsValid(courseNumber)) throw new IllegalArgumentException("Course Number must be ###-###-#####-## Format");
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
                testNumber.matches("\\d{3}-\\d{3}-\\d{5}-\\d{2}");
    }
}
