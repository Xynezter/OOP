public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade(){
        double s = (mScore*0.4)+(fScore*0.4)+ 20;
        char grade;
        if (s < 50){
            grade = 'F';
        }
        else if ((50 <= s) && (s < 60)){
            grade = 'D';
        }
        else if ((60 <= s) && (s < 70)){
            grade = 'D';
        }
        else if ((70 <= s) && (s < 80)){
            grade = 'D';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade + ".");
    }
}
