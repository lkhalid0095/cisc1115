package classLabs;

import java.util.Arrays;

public class Exam2D2 {

	public static void main(String[] args) {
		
		int a = 9, b = 8, c = 7,d;
		int[] arr = new int[] {2,4,6,8};
		int[] barr = arr;
		
		System.out.println("Exam2D2 CISC 1115");
		System.out.println("\n1)");
		d= q1(a,b,c);
		System.out.printf("main: %d %d %d\n", a,b,d);
		System.out.println("\n2)");
		d=9;
		q2(d);
		System.out.println("\n3)");
		q3(arr,barr,arr[3]);
		//System.out.println(Arrays.toString(arr));
		barr[2] = 7;
		System.out.printf("main two: %d %d %d\n", arr[0],arr[2],arr[3]);
		System.out.println("\n4)");
		b = 6;
		c = 8;
		if(q4(b,c)) {
			System.out.println(c);
		} else {
			System.out.println(b);
		}
		System.out.println("\n5)");
		q5();
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(barr));

	}

	private static void q5() {
		int[] x = {4,8,7,15,-5};
		for(int sub = 1; sub < x.length;sub++) {
			x[sub-1] = sub * x[sub];
		}
			x[4] = 27;
		
			for(int sub= 0; sub<x.length;sub++) {
				System.out.printf("%5d%5d%n", sub,x[sub]);
		}
		
	}

	// TODO Auto-generated method stub
	private static boolean q4(int a, int b) {
		if(a+b < 7) {
			return true;
		} else {
		return false;
		}
	}

	// ...
	private static void q3(int[] a, int[] b, int c) {
		int[]d = new int[a.length];
		b=d;
		a[0] = 0;
		b[1] = 1;
		c = a[1];
	}

	// ...
	private static void q2(int k) {
		int m;
		do {
			m = k*3;
			k+= 3;
		}while(m<30 && k<13);
		System.out.printf("%d %d\n", k,m);
		
		m =0;
		for(int i =1; i<=2;i++) {
			k=10;
			for(int j = 1;j<=2;j++) {
				k--;
				m+= k+j;
			}
		}
		System.out.printf("%2d %3d\n",k,m);
		
	}

	//...
	private static int q1(int x, int y, int z) {
		z = x*z*y - (Math.max(Math.max(z,y), x));
		y--;
		x++;
		System.out.printf("%d %d\n", x,y);
		return z;
	}

}
