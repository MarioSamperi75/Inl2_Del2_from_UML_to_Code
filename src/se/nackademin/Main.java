package se.nackademin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Vilket program en Coordinator ansvarar för?
        //Vilka lärare som finns för ett Program?
        //Hur många studenter som finns i ett Program?
        //Hur man lägger till en ny student till ett Program
        //Vad närvaron är för Student X?
        //Vilka kurser/seminarier som en lärare undervisat i?
        //Vilka ämnen som undervisats i ett Seminar?
        //Närvaron för Seminar X?
        //Hur man skapar en ny Attendance?
        //-----------------------------------------------------------------------------------

        //SKAPA Coordinator
        ProgramCoordinator programCoordinator = new ProgramCoordinator("Sara Strömvall");

        //Skapa Program
        Program program = new Program("Java19");

        //Skapa några studenter
        Student student1 = new Student("Mario Samperi");
        Student student2 = new Student("Victor Jannerlid-Söderberg");
        Student student3 = new Student("Johan Casserfelt");
        Student student4 = new Student("Yuanheng Li");
        Student student5 = new Student("Allan Jamil");


        //Skapa seminarerna

        Seminar seminar1 = new Seminar("seminar1");
        Seminar seminar2 = new Seminar("seminar2");
        Seminar seminar3 = new Seminar("seminar3");
        Seminar seminar4 = new Seminar("seminar4");
        Seminar seminar5 = new Seminar("seminar5");

        //Skapa några teacher
        Teacher teacher1= new Teacher("Mahmud Al Hakim");
        Teacher teacher2= new Teacher("Sigrun Olafsdottir");
        Teacher teacher3= new Teacher("Robert Kärrbrant");
        Teacher teacher4= new Teacher("James Gosling");
        Teacher teacher5= new Teacher("Julian Assange");

        //Skapa närvaro

        //new Attendance().registerAttendance(seminar1, student1);
        //new Attendance().registerAttendance(seminar1, student2);
        //new Attendance().registerAttendance(seminar1, student3);
        new Attendance().registerAttendance(seminar1, student4);
        new Attendance().registerAttendance(seminar1, student5);


        new Attendance().registerAttendance(seminar2, student1);
        new Attendance().registerAttendance(seminar2, student2);
        new Attendance().registerAttendance(seminar2, student3);
        // new Attendance().registerAttendance(seminar2, student4);
        new Attendance().registerAttendance(seminar2, student5);


        new Attendance().registerAttendance(seminar3, student1);
        new Attendance().registerAttendance(seminar3, student2);
        new Attendance().registerAttendance(seminar3, student3);
        new Attendance().registerAttendance(seminar3, student4);
        new Attendance().registerAttendance(seminar3, student5);


        new Attendance().registerAttendance(seminar4, student1);
        new Attendance().registerAttendance(seminar4, student2);
        new Attendance().registerAttendance(seminar4, student3);
        new Attendance().registerAttendance(seminar4, student4);
        new Attendance().registerAttendance(seminar4, student5);


        //new Attendance().registerAttendance(seminar5, student1);
        new Attendance().registerAttendance(seminar5, student2);
        new Attendance().registerAttendance(seminar5, student3);
        new Attendance().registerAttendance(seminar5, student4);
        new Attendance().registerAttendance(seminar5, student5);



        program.addSeminar(seminar1);
        program.addSeminar(seminar2);
        program.addSeminar(seminar3);
        program.addSeminar(seminar4);
        program.addSeminar(seminar5);


        //Vilket program en Coordinator ansvarar för?

        programCoordinator.setProgram(program);                     //set programm till koordinator, visa Coordinator;
        System.out.println("Coordinator och program:");
        System.out.println(programCoordinator.getName() + " " + programCoordinator.getProgram().getName() );
        System.out.println();


        //Vilka lärare som finns för ett Program?

        programCoordinator.addTeacher(teacher1);                    //add teachers i programCoordinatorslista
        programCoordinator.addTeacher(teacher2);
        programCoordinator.addTeacher(teacher3);
        programCoordinator.addTeacher(teacher4);
        programCoordinator.addTeacher(teacher5);

        System.out.println("New teacher?");                         //skapa teachers från inläsning
        String teacher = input.readLine();
        programCoordinator.addTeacher(new Teacher(teacher));

        System.out.println();
        System.out.println("Teachers list");                        //visa  programsCoordinatorLista
        for (Teacher t: (programCoordinator.getTeachers())){
            System.out.println(t.getName() + " ");
        }
        System.out.println();

        System.out.println("Vilken teacher vill du leta efter?");    //search & show teacher genom findTeacher
        teacher = input.readLine();
        Teacher teacherFound = programCoordinator.findTeacher(teacher);
        if (teacherFound != null)
            System.out.println(teacherFound.getName());
        else
            System.out.println("Teacher not found");
        System.out.println();


        //Hur många studenter som finns i ett Program?

        System.out.println(program.getName() + ": number of students = " + program.getStudents().size());
        System.out.println();
        for (Student s: program.getStudents())
            System.out.println(s.getName());
        System.out.println();

        //Hur man lägger till en ny student till ett Program? Automatiskt när man  registrera attandence
        //Hur man skapar en ny Attendance?


        System.out.println("New student?");                         //skapa teachers från inläsning
        String studentName = input.readLine();
        Student student6= new Student(studentName);
        new Attendance().registerAttendance(seminar1, student6);
        System.out.println();
                                                                    //kolla igen antalet
        System.out.println(program.getName() + ": number of students = " + program.getStudents().size());
        System.out.println();
        for (Student s: program.getStudents())
            System.out.println(s.getName());
        System.out.println();


        //Vad närvaron är för Student X?

        System.out.println("Seminar attended för students[0]");
        System.out.println(program.getStudents().get(0).getSeminarsAttended().size());
        System.out.println();
        System.out.println(program.getStudents().get(0).getSeminarsAttendedToString());

        //Närvaron för Seminar X?

        System.out.println("Antal student i seminars[0]");
        System.out.println(program.getSeminars().get(0).getAttendances().size());



        //Vilka kurser/seminarier som en lärare undervisat i?
        seminar1.setTeacher(teacher1);
        seminar2.setTeacher(teacher2);
        seminar3.setTeacher(teacher3);
        seminar4.setTeacher(teacher3);
        seminar5.setTeacher(teacher3);

        System.out.println();
        System.out.println("Alla seminarier för teacher3");
        System.out.println(teacher3.getSeminarHistory().size());
        System.out.println(teacher3.getSeminarHistorytoString());

        System.out.println("Sista seminarien (Current) för teacher3");
        System.out.println(programCoordinator.getTeachers().get(2).getCurrentSeminar().getName());


        //Vilka ämnen som undervisats i ett Seminar?

        Subject subject1 = new Subject("TDD", seminar1);
        Subject subject2 = new Subject("UML Class diagram", seminar1);
        Subject subject3 = new Subject("MVC", seminar1);

        System.out.println();
        System.out.println("Skriva subjects för seminars[0]");
        for (Subject s: (program.getSeminars().get(0).getSubjects()))
            System.out.println(s.getName());

        System.out.println();
        System.out.println("Skriva info för seminar[0] subject[0]");
        System.out.println( subject1.viewSubjectInfo());

        System.out.println();
        System.out.println("Skriva antalet attendances för seminar[0]");
        System.out.println(program.getSeminars().get(0).getTotalAttendance());

        System.out.println();
        System.out.println("Skriva ut alla närvaro i alla kurser och räkna dem");
        int x = 0;
        for (Seminar s: program.getSeminars()) {
            for (Attendance a: s.getAttendances()) {
                if (a.isAttendanceLevel()) {
                    System.out.println(s.getName() + " " + a.getStudent().getName());
                    x += 1;
                }
            }
        }
        System.out.println(x);

        //Remove närvaro

        System.out.println("REMOVE ATTENDANCE: Allan är sjuk i sista lektionen");
        seminar5.getAttendances().get(3).removeAttendance();

        System.out.println();
        System.out.println("Skriva ut alla närvaro i alla kurser och räkna dem");
         x = 0;
        for (Seminar s: program.getSeminars()) {
            for (Attendance a: s.getAttendances()) {
                if (a.isAttendanceLevel()) {
                    System.out.println(s.getName() + " " + a.getStudent().getName());
                    x += 1;
                }
            }
        }
        System.out.println(x);
    }
}




