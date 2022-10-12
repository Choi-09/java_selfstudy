class Ex4_17_continue문 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue; //조건식이 참이되어 continue문이 수행되면 블럭의 끝으로 이동한다.
						  //break문과 달리 반복문을 벗어나지 않는다. 
						  //조건식만 건너뛰고 결과를 프린트함.
			System.out.println(i);
		}
	}
}