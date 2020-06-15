import java.util.*;
class Question17{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int val=num;
		int rev=0;
		int temp=0;
		while(num!=0){
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if(val==rev)
			System.out.println(val+" is a palindrome");
		else
			System.out.println(val+" is not a palindrome");
	}
}