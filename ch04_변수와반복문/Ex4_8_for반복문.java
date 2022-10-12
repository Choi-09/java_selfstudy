class Ex4_8_for반복문 {
	public static void main(String args[]) {
//		int i;
//		int j;
		for( int i = 1, j = 10; i <= 10 ; i++, j--) {  //{}안의 문장을 5번 반복
			System.out.println("i = "+ i + ", j = "+j);
		} // scope(범위): 선언위치부터 선언된 블럭의 끝까지
	}
}