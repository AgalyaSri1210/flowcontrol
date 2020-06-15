import java.util.*;
class Question8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char char1=sc.next().charAt(0);
		switch(char1){
		case 'R':System.out.println("Red Color");break;
		case 'B':System.out.println("Blue Color");break;
		case 'G':System.out.println("Green Color");break;
		case 'O':System.out.println("Orange Color");break;
		case 'Y':System.out.println("Yellow Color");break;
		default:System.out.println("Invalid Code");break;
		}
	}
}