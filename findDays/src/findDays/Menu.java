package findDays;

import java.util.Scanner;

public class Menu {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS");
		int i=sc.nextInt();
		int j=sc.nextInt();
		//System.out.println("ENTER inputNUMBERS");
	sc.nextLine();
		System.out.println("ADD");
		System.out.println("MUL");
		System.out.println("SUB");
		System.out.println("DIVIDE");
		System.out.println("ENTER inputNUMBERS");
		//Scanner sc=new Scanner(System.in);
		String a=sc.nextLine().toLowerCase();;
		switch(a){
		case "add":
			System.out.println(i+j);
			break;
		case "mul":
			System.out.println(i*j);
			break;
		case "sub":
			System.out.println(i-j);
			break;
		case "DIVIDE":
			System.out.println(i/j);
			break;
		}
	}

}
