import java.io.*;
import java.util.*;
class Person
{
String Name;
String Gender;
String Address;
int Age;
}
class Empolyee extends Person
{
int empid;
String Company_name;
String Qualification;
int salary;
Employee()
{
empid=0;
Company_name="";
Qualification="";
salary=0;
}
}
class Teacher extends Employee
{
String Subject;
String Department;
int Teacherid;
Teacher()
{
Subject="";
Department="";
Teacherid=0;
}
void add()
{
Scanner sc=new Scanner(System.in);
System.out.println("Subject");
Subject=sc.nextLine();
System.out.println("Department");
Department=sc.nextLine();
System.out.println("Teacherid");
Teacherid=sc.nextInt();
}
void display()
{
System.out.println("Subject: "+Subject);
System.out.println("Department: "+Department);
System.out.println("Teacherid"+Teacherid);
}
public class E
{
public static void main(String[] args) throws Exception
{
Teacher t[]=new Teacher();
System.out.println("Enter the number of Teachers: ");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
t[i].add();
t[i].display();
}
}
}
}

