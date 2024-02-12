package az.edu.turing.lesson13;

public class New {
    public static void main(String[] args) {
        int [] age = {13,22,42,35};
        String [] name = {"Eli", "Veli", "Pirveli","Shirveli"};
        int[] grade = {34,35,67,23};

        int MaxGrade = 0;
        int result = 0;
        for (int i = 0; i<grade.length;i++){
            if(grade[i]>MaxGrade){
                MaxGrade = grade[i];
                result = i;
            }
        }

        System.out.println("Name : " +name[result] + "/nAge : " + age[result] + "/nGrade : " + grade[result]);
    }
}
