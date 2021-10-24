package University;

public class mainStudent
{
    public static void main(String[] args)

    {

        Student student1 = new Student(1, "Georgel", 25);
        Student student2 = new Student(2, "Mihaita", 35);
        Student student3 = new Student(3,"Gabriel", 19);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


    }
}
