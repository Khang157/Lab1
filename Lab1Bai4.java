import java.util.Scanner;

public class Lab1Bai4 {
	public static void main(String[] args) {
		float a, b, c;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap A:");

		a = scanner.nextFloat();
		
		System.out.print("Nhap B:");

		b = scanner.nextFloat();
		
		System.out.print("Nhap C:");

		c = scanner.nextFloat();
		
		if ( (a!=0)) {
			double delta = Math.pow(b, 2)-4*a*c;
			double v = Math.sqrt(delta);
			
			System.out.print("\ndelta= ");
			System.out.print(v);
			
			if(delta > 0) {
				System.out.print("\nphuong trinh co 2 nghiem");
			}if(delta == 0) {
				System.out.print("\nphuong trinh co nghiem kep");
			}if(delta < 0) {
				System.out.print("\nphuong trinh vo nghiem");
			}
		}else {
			System.out.print("Du lieu nhap sai!");
		}
	}
}
