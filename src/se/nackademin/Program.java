package se.nackademin;

import java.util.ArrayList;

public class Program {
    //VARIABLES
    private String name;
    private ProgramCoordinator programCoordinator;
    private ArrayList<Seminar> seminars = new ArrayList<>();

    //-------------------------------
    //CONSTRUCTORS
    public Program() {
    }

    public Program(String name) {
        this.name = name;
    }

    //-----------------------
    //METHODS

    public String getName() {
        return name;
    }

    public ArrayList<Seminar> getSeminars() {
        return seminars;
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        for (Seminar seminar : seminars) {                                     //genom alla attendances i alla seminars
            for (Attendance attendance : seminar.getAttendances()) {
                if (!students.contains(attendance.getStudent())) {              //för att undvika repetitionerna
                    students.add(attendance.getStudent());
                }
            }
        }
        return students;
    }

    public void setProgramCoordinator(ProgramCoordinator programCoordinator) {
        this.programCoordinator = programCoordinator;
    }

    public void addSeminar(Seminar seminar) {
        this.seminars.add(seminar);
    }

}