import java.util.*;
class Question12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=0;
		for(int i=3;i<Math.sqrt(num);i++)
			if(num%i==0)
				cnt++;
		if(num==1 || num==2)
			System.out.println("the number is a prime number");
		else if(num%2==0)
			System.out.println("the number is not a prime number");	
		else if(cnt>0)
			System.out.println("the number is not a prime number");
		else
			System.out.println("the number is a prime number");
	}
}