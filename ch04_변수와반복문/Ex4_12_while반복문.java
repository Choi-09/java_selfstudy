class Ex4_12_while반복문 {
	public static void main(String[] args) { 
		int i = 10; //반복할 횟수를 넣는다.
		
		while(i--!=0) { //i가 하나씩감소하면서 조건식이 거짓일때까지 반복
			System.out.println(i + " - I can do it.");
		}
	} // main의 끝
}