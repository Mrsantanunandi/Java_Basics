class Student {
    int rollno;
    String name;
    int marks;
}

public class Arrays_of_Object {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 3;
        s1.name = "Santanu";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Kiran";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 5;
        s3.name = "Bikash";
        s3.marks = 99;

        Student student[]=new Student[3]; 
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        // for(int i=0;i<student.length;i++)
        // {
            // System.out.println(student[i].name+ " : " + student[i].marks);
        // }

        //for each loop
        for(Student s: student)
        {
            System.out.println(s.name+ " : " + s.marks);
        }
    }
}
