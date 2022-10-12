class Ex6_2_1인스턴스2참조변수 {
	public static void main(String args[]) {
		 Tv t1 = new Tv();		//Tv t1; t1=newTv(); 를 한문장으로 요약
		 Tv t2 = new Tv();
		 
		 System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
		 System.out.println("t2의 channel 값은" + t2.channel + "입니다.");
		 
		 t1.channel = 7;		// channel 값을 7으로 한다.
		 System.out.println("t1의 channel 값을 7로 변경하였습니다.");
		 
		 t2 = t1;		// 참조변수 t1의 값을 t2에 저장.
		 System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
		 System.out.println("t2의 channel 값은" + t2.channel + "입니다.");

	}
}