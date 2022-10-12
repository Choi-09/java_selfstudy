import java.util.*;

class Ex4_18_break_continue문 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) { //무한반복문
			System.out.println("(1) 페퍼로니 피자");
			System.out.println("(2) 고르곤졸라 피자");
			System.out.println("(3) 마르게리따 피자");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0):");

			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;		
			}
			
			System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
		}
	} // main의 끝
}