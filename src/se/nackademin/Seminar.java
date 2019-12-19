package se.nackademin;

import java.util.ArrayList;

public class Seminar {
    //VARIABLES
    private String name;
    private Teacher teacher;
    private Program program;
    private ArrayList<Subject> subjects= new ArrayList<>();
    private ArrayList<Attendance> attendances = new ArrayList<>();

    //-----------------------
    //CONSTRUCTORS
    public Seminar(){};

    public Seminar(String name) {
        this.name = name;
    }
    //---------------------------
    //METHODS

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public ArrayList<Attendance> getAttendances() {
        return attendances;
    }

    public int getTotalAttendance(){
        int counter = 0;
        for(Attendance attendance: attendances) {
            if(attendance.isAttendanceLevel()){
                counter++;
            }
        }
        return counter;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        this.teacher.setCurrentSeminar(this);
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public void addAttendance(Attendance attendance) {
        this.attendances.add(attendance);
    }

}
