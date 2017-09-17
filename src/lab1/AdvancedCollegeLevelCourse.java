
package lab1;

/*
    An AdvacnedCollegeLevelCourse is almost exactly the same as CollegeLevelCoruse except
    they reqire previous CollegeLevelCourses to have been completed before they can be taken

    With that in mind they inhearit everything CollegeLevelCourses do and should have a reasonable 
    list of CollegeLevelCourse objects as prerequisites

*/
public class AdvancedCollegeLevelCourse extends CollegeLevelCourse{
    public static final int MAX_PREREQUISITES = 4;
    public static final int MIN_PREREQUISITES = 1;
    
    private CollegeLevelCourse[] prerequisites;
    
    public AdvancedCollegeLevelCourse(String courseName, String courseNumber, CollegeLevelCourse[] prerequisites){
        super(courseName,courseNumber);
        setPrerequisites(prerequisites);
    }
    
    public final void setPrerequisites(CollegeLevelCourse[] prerequisites){
        if(prerequisites.length > MAX_PREREQUISITES || prerequisites.length < MIN_PREREQUISITES)
            throw new IllegalArgumentException("Must jave at least 1 prerequisite to be Advanced Level and Max of 4");
        this.prerequisites = prerequisites;
    }
    
    public final CollegeLevelCourse[] setPrerequisites(){return prerequisites;}
    
}
