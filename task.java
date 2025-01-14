class Student{
    String name;
    int rollNumber;
    String branch;
    int age;

    public void stInfo(){
        System.out.println(this.name);
        System.out.println(this.rollNumber);
        System.out.println(this.branch);
        System.out.println(this.age);
    }
}

public class task {
      public static void main(String[] args) {
        Student St1 = new Student();
        St1.name= "yogesh";
        St1.rollNumber =002;
        St1.branch = "IT";
        St1.age=21;

        Student St2 = new Student();
        St2.name= "Azad";
        St2.rollNumber =003;
        St2.branch = "IT";
        St2.age=23;

        Student St3 = new Student();
        St3.name= "Yogi";
        St3.rollNumber =004;
        St3.branch = "IT";
        St3.age=25;


        St1.stInfo();
        St2.stInfo();
        St3.stInfo();

      }
}