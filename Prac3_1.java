import java.util.*;
class Student
{
Scanner sc=new Scanner(System.in);
    int roll;
    String name;
    String add;
    String branch;
    void get()
    {
        System.out.println("Enter Name : ");
        name=sc.next();
sc.nextLine();
         System.out.println("Enter Address : ");
        add=sc.nextLine();

        System.out.println("Enter Rollno : ");
        roll=sc.nextInt();



        System.out.println("Enter Branch : ");
        branch=sc.next();
    }
    void put()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Address: "+add);
        System.out.println("Branch: "+branch);
    }
}
class Test
{
    public static void main(String a[])
    {
        Student s1= new Student();
        s1.get();
        s1.put();
    }
}

