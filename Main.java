import java.util.*;
import java.io.*;
class student{
void details(){
String stname="GLD";
String stroll="21HP1A0510";
String stbranch="CSE";
System.out.println("Student Name:"+stname);
System.out.println("Student rollno:"+stroll);
System.out.println("Student Branch:"+stbranch);
}
}
class totMarks extends student{
void marksCal(){
Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
int s4=sc.nextInt();
int s5=sc.nextInt();
int s6=sc.nextInt();
int total=(s1+s2+s3+s4+s5+s6);
System.out.println("subject-1 marks:"+s1);
System.out.println("subject-2 marks:"+s2);
System.out.println("subject-3 marks:"+s3);
System.out.println("subject-4 marks:"+s4);
System.out.println("subject-5 marks:"+s5);
System.out.println("subject-6 marks:"+s6);
System.out.println("Total marks:"+total);
percentage.percentCal(total);
}
}
class percentage extends student{
static void percentCal(int total){
float percent=(total*100)/600;
System.out.println("Percentage:"+percent);
grade g=new grade();
g.gradeCal(percent);

}
}
class grade extends student{
void gradeCal(float percent){
if(percent >= 90){
System.out.println("Grade:A");
}
else if(percent>=75){
System.out.println("Grade:B");
}
else if(percent>=50){
System.out.println("Grade:C");
}
else{
System.out.println("Grade:F");
}
}
}
class Main{
public static void main(String args[])
{
totMarks t=new totMarks();
t.details();
t.marksCal();

}
}
