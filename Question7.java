import java.util.*;
class Question7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char char1=sc.next().charAt(0);
		if(char1>=65 && char1<=91)
			System.out.println(char1+"->"+(char)((int)char1+32));
		else
			System.out.println(char1+"->"+(char)((int)char1-32));
	}
}