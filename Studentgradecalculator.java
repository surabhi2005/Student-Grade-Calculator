import java.util.*;
public class Studentgradecalculator  {
    public static void displaydetails(String a,String b,char c,char d)
    {
        System.out.println("STUDENT DETAILS");
        System.out.println("Name: "+a);
        System.out.println("Roll No: "+b);
        System.out.println("Class: "+c);
        System.out.println("Section: "+d);

    }
    public static void displaygrade(double avg)
    {
        String g;
        if(avg>=95 && avg<=100)
        g="O";
        else if(avg>=90)
        g="A";
        else if(avg>=80)
        g="B";
        else if(avg>=70)
        g="C";
        else if(avg>=60)
        g="D";
        else if(avg>=50)
        g="E";
        else
        g="Fail";
        System.out.println("Grade: "+g);
    }
    public static void displaymarks(int a[])
    {
        int n=a.length;
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+a[i];
        }
        double avg=(double)(total/n);
        System.out.println("Total Marks: "+total);
        System.out.printf("Average Percentage: %.2f%%\n",avg);
        displaygrade(avg);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student's Name: ");
        String name=sc.nextLine();
        System.out.print("Enter the student's Roll No: ");
        String rollno=sc.nextLine();
        System.out.print("Enter the student's Class: ");
        char cla=sc.next().charAt(0);
        System.out.print("Enter the students's Section: ");
        char section=sc.next().charAt(0);
        System.out.print("Enter the number of subject's: ");
        int totalsubjects=sc.nextInt();
        int[] marks=new int[totalsubjects];
        for(int i=0;i<totalsubjects;i++)
        {
            System.out.print("Enter the marks of Subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
        }
        displaydetails(name,rollno,cla,section);
        displaymarks(marks);
        sc.close();
    }   
}
