class Ex4_16_break문 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { //while의 무한반복문에는 반드시 조건문자리에 true가 들어가야한다.
			if(sum > 100)
				break; //자신이 속한 하나의 반복문을 벗어난다.
			++i;
			sum += i;
		} // end of while
		
//		방법2
//		while(sum <=100) {
//		++i;
//		sum +=i;
//		}
		
//		for문
//		for(;;) {
//			if(sum > 100)
//				break;
//			++i;
//			sum += i;
//		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}