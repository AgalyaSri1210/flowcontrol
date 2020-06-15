import java.util.*;
class Question16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int temp=0;
		while(num!=0){
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);
	}
}