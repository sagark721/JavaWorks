/*
 *   0 1 0 1
 *   0 1 0 1
 *   0 1 0 1
 *   0 1 0 1
 */


package Patterns;

public class P28 {

	public static void main(String[] args) {
		int a=0;
		for(int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				if(j%2==0) {
					System.out.print(a);
				}
				else {
					System.out.print(a+1);
				}
			}
			System.out.println();
		}
	}

}
