package With_number;

public class SwappingTwoNumber_WithoutUsingThirdvariable 
{
public static void main(String[] args) 
{
int num1=10;
int num2=20;

System.out.println("before swapping");
System.out.println("num1: 10");
System.out.println("num2:20");

num1=num1+num2;      //this is the logic for swappiing two number 
num2=num1-num2;
num1=num1-num2;

System.out.println("-------------");
System.out.println("after swapping");
System.out.println("num1:"+num1);
System.out.println("num2:"+num2);
}
}
