import java.util.*;
class Question1B{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>0 && num2>0){
			int chk1=num1%10;
			int chk2=num2%10;
			if(chk1==chk2)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}