package se.nackademin;

import java.util.ArrayList;

public class Teacher {
    //VARIABLES
    private String name;
    private ArrayList<Seminar> seminarHistory = new ArrayList<>();
    private ProgramCoordinator programCoordinator;

    //-------------------------------
    //CONSTRUCTORS
    public Teacher(){}

    public Teacher(String name) {
        this.name = name;
    }

    //-------------------------------
    //METHODS
    public String getName() {
        return name;
    }

    public ArrayList<Seminar> getSeminarHistory() {
        return seminarHistory;
    }

    public String getSeminarHistorytoString() {
        String list="";
        for (Seminar s: seminarHistory){
            list += s.getName() + "\n";
        }
        return list;
    }

    public Seminar getCurrentSeminar(){
        if (seminarHistory.size()==0) {
            System.out.println("no seminars");
            return null;
        }
        else
            return seminarHistory.get(seminarHistory.size() - 1);
    }

    public ProgramCoordinator getProgramCoordinator() {
        return programCoordinator;
    }

    public void setCurrentSeminar(Seminar currentSeminar) {
        this.seminarHistory.add(currentSeminar);
    }

}
