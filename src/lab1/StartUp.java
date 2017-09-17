package lab1;

/**
 * All example classes provided had similar properties aside from one not having prerequisites. 
 * This means that they should all be created as once class and instantiated with unique properties. 
 * In this case I chose CollegeLevelCourse. 
 * 
 * For all classes that had prerequisites I noticed that 1 they where still CollegeLevelCourses and 
 * 2 that all prerequisites would likely be CollegeLevelCoruses as well. So AdvancedCollegeLevelCourse 
 * subclasses CollegeLevelCourse and requires an array of prerequisites which not all CollegeLevelCourses share
 * 
 * Since you should be able to instantiate a CollegeLevelCourse as well as an AdvancedCollegeLevelCourse I made them 
 * concrete but included an abstract GenericSchoolCourse that had minimal properties of a school course such as a Name
 * and a school code that can be used for polymorphism but should likely be extended to include more specific values such as 
 * MiddleSchoolCourse which might have gradeLevel instead off creditHours.
 * 
 * @author Brandon
 * @version 1.0
 */
public class StartUp {
    
    public static void main(String[] args) {
        CollegeLevelCourse introToProgramming = new CollegeLevelCourse("Intro To Programming", "152-107-001");
        CollegeLevelCourse introToJava = new AdvancedCollegeLevelCourse("Intro To Java", "152-134-001", new CollegeLevelCourse[]{introToProgramming});
        CollegeLevelCourse advancedJavaProgramming = new AdvancedCollegeLevelCourse("Advanced Java Programming", "152-135-001", new CollegeLevelCourse[]{introToJava});
        
        GenericSchoolCourse[] courses = {introToProgramming,introToJava,advancedJavaProgramming};
        for(GenericSchoolCourse course : courses){
            System.out.println(course.getCourseName());
        }
    }
    
}
