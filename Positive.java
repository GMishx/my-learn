import java.util.Scanner;
class Positive{
	public static void main(String args[]){
		String input;
		Scanner sc=new Scanner(System.in);
		input = sc.next();
		int n = Integer.parseInt(input);
		if(n>=1){
			System.out.println(35);
		}
		else if(n==0){
			System.out.println(0);
		}
		else{
			System.out.println(-1);
		}
	}
}