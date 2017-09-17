package lab1;

/**
 *
 * @author Brandon
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
