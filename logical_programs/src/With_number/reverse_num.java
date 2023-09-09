package With_number;

public class reverse_num 
{
public static void main(String[] args) 
{
int orgnum=121;
int temp=orgnum;
int revnum=0;

for(int i=orgnum; i>0; i=i/10)
{
	int rem=i%10;
	revnum=revnum*10+rem;
	temp=temp/10;
}
System.out.println(revnum);

if(orgnum==revnum)
{
	System.out.println("pallindrome");
}
else
{
	System.out.println("not pallindrome");
}
} 
}
