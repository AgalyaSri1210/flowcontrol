import java.util.*;
class Question5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char char1=sc.next().charAt(0);
		if(Character.isLetter(char1)){
			System.out.println("Alphabhet");
		}
		else if(Character.isDigit(char1)){
			System.out.println("Digit");
		}else{
			System.out.println("Special Character");
		}
	}
}