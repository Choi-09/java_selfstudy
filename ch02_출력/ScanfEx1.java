//Scanner 클래스

import java.util.Scanner; //① import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //② 객체생성

		int num = scanner.nextInt(); //③생성된 객체를 화면에서 입력받음
		int num2 = scanner.nextInt(); //③생성된 객체를 화면에서 입력받음
//		↑ 한줄로 작성가능
//		System.out.println(num); //④ 출력 > 콘솔화면에 입력
//		System.out.println(num2);//④ 출력 > 콘솔화면에 입력

//		↓이렇게 두줄로 쓸수도있지만
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}

}
