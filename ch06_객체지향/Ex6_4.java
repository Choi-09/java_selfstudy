
// 1. MyMath 클래스 작성(메서드 작성)
class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
	}	// return a + b 로 간단히 가능
	long max(long a, long b) {
		return a > b? a : b; // 삼항연산자: a가b보다 크면 a반환, 아니면 b 반환 
	}
	long subtract(long a, long b) {return a-b;}
	long multiple(long a, long b) {return a*b;}
	double divide(double a, double b) {
		return a / b;
	}
	
}

class Ex6_4 {
	public static void main(String args[]) {
		// 2. MyMath 객체 생성
		MyMath myMath = new MyMath();
		// 3. MyMath 객체 사용(객체의 메서드 호출)
		long result1 = myMath.add(5L, 3L); //add 메서드 호출
		long result2 = myMath.subtract(5L, 3L); // subtract 메서드 호출
		long result3 = myMath.multiple(5L, 3L); // multiple 메서드 호출
		double result4 = myMath.divide(5L, 3L); // divide 메서드 호출
		long result = myMath.max(5L,  3L);
		
				
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiple(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5L, 3L) = " + result);
	}
 }

