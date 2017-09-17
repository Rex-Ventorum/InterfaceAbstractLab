package lab2;

/**
 * The startup method for Lab2 is exactly the same as Lab1. The diffrence with the interface version and the abstract is that properties where no longer
 * inherited by the CollegeLevelCousre class and thus had to be created in that class instead. One thing that an author should be aware of 
 * though is that GenericSchoolCourse no longer dictates that courseName be present, instead only that its getters and setters be present. 
 * That means when using GenericSchoolCourse properties one needs to be careful that the return values is not null. Likewise schoolCode could 
 * also be negative. Even though CollegeLevelCoruse follows this another subclass such as MiddleSchool course could decided otherwise. 
 * Interfaces likely should not be used in cases where common properties are mandatory for a method. 
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
