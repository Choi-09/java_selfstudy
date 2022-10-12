class Ex4_11_중첩for문_별 {
	public static void main(String[] args) { 

		for(int i=1;i<=10;i++) {
			for(int j = 1; j <= (i) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // main의 끝
}