package az.edu.turing.module01.lesson13;

public class Student {

    public  String name;
    public double grade;
    public int age;

    public Student(String name,double grade,int age){
        this.name=name;
        this.grade=grade;
        this.age=age;
    }

    public static void main(String[] args) {
        Student student1=new Student("Eli",94,23);
        Student student2=new Student("Veli",83,27);
        Student student3=new Student("Pirveli",97,20);
        Student[] students=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        double max=students[0].grade;
        int count=0;
        for (int i = 0; i < 3; i++) {
            if(max<students[i].grade){
                max=students[i].grade;
                count=i;
            }
        }
        System.out.println(students[count].name+" "+students[count].grade+" "+students[count].age);
    }
}
