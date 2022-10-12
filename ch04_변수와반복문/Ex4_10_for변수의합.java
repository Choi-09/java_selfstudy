class Ex4_10_for변수의합 {
	public static void main(String[] args) { 
		int sum = 0; //합계를 저장하기 위한 변수
		
		for(int i=1; i <=5; i++) {
			sum += i ; //sum = sum + i;
			System.out.printf("1부터 %d 까지의 합: %d %n", i, sum );
		}
		
	} 
}