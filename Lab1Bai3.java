import java.util.Scanner;

public class Lab1Bai3 {
	public static void main(String[] args) {
		
		float a, v;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap A:");

		a = scanner.nextFloat();
		
		
		
		if (a>0) {
			v= a*a*a;
			System.out.print("The tich khoi lap phuong: ");
			System.out.print(v);
		//hoac co the su dung cach 2	
			
			 double v1 = Math.pow(a, 3);
			System.out.print("\nThe tich khoi lap phuong: ");
			System.out.print(v1);
		}else {

			System.out.print("Du lieu nhap sai!");
		}
	}
}