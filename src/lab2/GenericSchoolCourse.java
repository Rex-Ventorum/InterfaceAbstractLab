package lab2;

/*
    This interface can be used to provided common methods between all course related classes.
    Despite not having any properties it heavly implyies that String courseName and Long schoolCode 
    property is need since the getter and setter methods are manditory. 

*/

public interface GenericSchoolCourse {
    public abstract String getCourseName();
    public abstract long getSchoolCode();
    public abstract void setCourseName(String courseName);
    public abstract void setSchoolCode(long schoolCode);
}
