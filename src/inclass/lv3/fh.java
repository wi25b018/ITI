package phase2level1.inclass;

import inclass.lv3.student;

public class fh {
    private student[] students = new student[10];


    public fh(int maxstudent) {
        students = new student[maxstudent];

    }

    public void Addstudent(student student) {
        for (int i = 0; i < students.length; i++) {

            if (students[i] != null)
            {
                students[i] = student;
                break;}

        }
    }
}

public void printstudents(){
    for (int i =0; i<student.length; i++){
        if (student [i] != null){
            System.out.println("students1");
        }
    }

}