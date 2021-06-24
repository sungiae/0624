import java.util.Scanner;


public class 메소드응용 {

	static int input(String s) {
		Scanner scan=new Scanner(System.in);
		System.out.printf("%s 입력:\n",s);
		return scan.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		input("년");
	}

}
