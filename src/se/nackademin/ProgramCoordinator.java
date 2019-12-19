package se.nackademin;

import java.util.ArrayList;

public class ProgramCoordinator {
    //VARIABLES
    private String name;
    private Program program;
    private ArrayList<Teacher> teachers = new ArrayList<>();

    //-------------------------------
    //CONSTRUCTORS

    public ProgramCoordinator(){}

    public ProgramCoordinator(String name) {
        this.name = name;
    }
    //-------------------------------
    //METHODS

    public String getName() {
        return name;
    }

    public Program getProgram() {
        return program;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    }

    public Teacher findTeacher(String input){
        for (Teacher t: teachers){
            if (t.getName().equalsIgnoreCase(input))
                return t;
        }
        return null;
    }

}

