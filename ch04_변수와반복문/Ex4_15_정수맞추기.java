import java.util.*;

class Ex4_15_정수맞추기 {
	public static void main(String[] args) { 
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1; //1에서 100사이의 임의의 수를 저장
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("1과 100 사이의 정수를 입력하세요. :");
//		input = sc.nextInt();
		
//		do-while 구문
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요. :");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해 보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해 보세요.");
			}
		} while(input!=answer);
		
//		while 구문
//		while(input!=answer) {
//			
//			if(input> answer) {
//				System.out.println("더 작은 수로 다시 시도해 보세요.");
//			} else if (input < answer) {
//				System.out.println("더 큰 수로 다시 시도해 보세요.");
//			}
//			System.out.println("1과 100 사이의 정수를 입력하세요. :");
//			input = sc.nextInt();
//		};
		System.out.println("정답입니다!");
	}
}