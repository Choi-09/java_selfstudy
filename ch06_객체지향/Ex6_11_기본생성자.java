class Data_1 {
	int value; //생성자가 없으면 컴파일러가 자동으로 Data_1(){} 기본생성자를 추가한다. 
}

class Data_2 {
	int value;

	Data_2(){} //기본생성자. 모든 클래스에는 반드시 하나의 생성자가 있어야한다.
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11_기본생성자 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
	}
}