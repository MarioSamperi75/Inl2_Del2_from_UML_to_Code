package se.nackademin;

public class Subject {
    //VARIABLES
    private String name;
    private Seminar seminar;

    //-----------------------
    //CONSTRUCTORS
    public Subject() {};

    public Subject(String name, Seminar seminar) {
        this.name = name;
        this.seminar = seminar;
        this.seminar.addSubject(this);
    }

    //-----------------------
    //METHODS

    public String getName() {
        return name;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public String viewSubjectInfo() {
            String subjectname = this.getName();
            String seminarName = this.seminar.getName();
            String teacherName = this.seminar.getTeacher().getName();
            String info = subjectname + "\n" + seminarName + "\n" + teacherName;
            return info;
        }

}
