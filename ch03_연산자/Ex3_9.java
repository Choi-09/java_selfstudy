class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 = 10의6제곱. 
		int b = 2_000_000;    // 2,000,000   2백만 = 10의 6제곱

		//10의 12제곱. int의 범위는 10의 9제곱.
		//계산 결과가 이미 int를 넘어섰다(오버플로우)
		//int * int = int
		//그러므로 둘 중 하나를 long타입으로 먼저 바꿔준다.
		long c = (long)a * b;       // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}