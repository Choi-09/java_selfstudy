import java.util.*;

class Ex4_11_중첩for문_구구단 {
	public static void main(String[] args) { 

		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	} // main의 끝
}