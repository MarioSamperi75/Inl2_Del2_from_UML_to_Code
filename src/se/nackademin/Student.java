package se.nackademin;

import java.util.ArrayList;

public class Student {
    //VARIABLES
    private String name;
    private ArrayList<Attendance> seminarsAttended = new ArrayList<>();

    //-----------------------
    //CONSTRUCTOR

    public Student(String name) {
        this.name = name;
    }

    //-----------------------
    //METHODS
    public String getName() {
        return name;
    }


    public ArrayList<Attendance> getSeminarsAttended() {
        return seminarsAttended;
    }

    public String getSeminarsAttendedToString() {
        String list="";
        for (Attendance a: seminarsAttended){
            list += a.getSeminar().getName() + "\n";
        }
        return list;
    }

    public void attendSeminar (Attendance attendance){
        this.seminarsAttended.add(attendance);
    }

}
