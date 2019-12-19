package se.nackademin;

public class Attendance {
    //VARIABLES
    private Student student;
    private  Seminar seminar;
    private boolean attendanceLevel;

    //-----------------------
    //CONSTRUCTORS

    public Attendance() {
    }

    public Attendance(Student student, Seminar seminar){
        this.seminar = seminar;
        this.student = student;
        registerAttendance(seminar,student);
    }

    //METHODS
    public Seminar getSeminar() {
        return seminar;
    }

    public Student getStudent() {
        return student;
    }

    public boolean isAttendanceLevel() {
        return attendanceLevel;
    }

    public void registerAttendance(Seminar seminar, Student student){
        this.student = student;
        this.seminar = seminar;
        this.student.attendSeminar(this);
        this.seminar.addAttendance(this);
        this.attendanceLevel = true;
    }

    public void removeAttendance(){
        this.attendanceLevel = false;
    }

}
