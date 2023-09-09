package String;

public class Pallindrome_string 
{
public static void main(String[] args) 
{
	//pallindrome(org input=reverse of input)
String	orgstr="madam";
//String org="aba";
String rev="";

for(int i=orgstr.length()-1; i>=0; i--)
{
	rev=rev+orgstr.charAt(i);
}
System.out.println(rev);

if(orgstr.equals(rev))
{
	System.out.println("pallindrome");
}
else
{
	System.out.println("not pallindrome");
}
}

}
