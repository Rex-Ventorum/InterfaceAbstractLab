
package lab1;

public abstract class AdvancedCollegeLevelCourse extends CollegeLevelCourse{
    public static final int MAX_PREREQUISITES = 4;
    public static final int MIN_PREREQUISITES = 1;
    
    private CollegeLevelCourse[] prerequisites;
    
    public AdvancedCollegeLevelCourse(String courseName, String courseNumber, String departmentName, CollegeLevelCourse[] prerequisites){
        super(courseName,courseNumber,departmentName);
        setPrerequisites(prerequisites);
    }
    
    public final void setPrerequisites(CollegeLevelCourse[] prerequisites){
        if(prerequisites.length > MAX_PREREQUISITES || prerequisites.length < MIN_PREREQUISITES)
            throw new IllegalArgumentException("Must jave at least 1 prerequisite to be Advanced Level and Max of 4");
        this.prerequisites = prerequisites;
    }
    
    public final CollegeLevelCourse[] setPrerequisites(){return prerequisites;}
    
}
