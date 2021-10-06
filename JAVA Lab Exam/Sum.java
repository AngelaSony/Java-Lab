import java.io.*;
import java.util.*;
class Sum
{
public static void main(String [] args) throws Exception
{
int count;
int i;
int s;
File r=new File("Sum.txt");
FileWriter fw=new FileWriter(r);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
fw.write(n+"\n");
fw.close();
FileReader fn=new FileReader(r);
i=fn.read();
{
if(i!=-1)
{
System.out.println((char)i);
}
fn.close();
}
}
}



