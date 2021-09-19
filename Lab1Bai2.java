import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		
		float a, x, y, p, s, min, min2;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap X:");

		x = scanner.nextFloat();
		
		System.out.print("Nhap Y:");

		y = scanner.nextFloat();
		
		if ( (x>0) && (y>0) ) {
			p=(x+y)*2;
			System.out.print("Chu vi HCN: ");
			System.out.print(p);
			
			s= x*y;
			System.out.print("\nDien tich HCN: ");
			System.out.print(s);
			
			min = Math.min(x,y);
			System.out.print("\nCanh nho nhat trong HCN: ");
			System.out.print(min);
			// cach 2
			min2 = x;
			if (min2 > y) {
				min2 = y;
			}
			System.out.print("\nCanh nho nhat trong HCN: ");			
			System.out.print(min2);	
	
		}else {

			System.out.print("Du lieu nhap sai!");
		}
		
	}
}
