// 

class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		System.out.println(str.charAt(0) - '0'); // > 숫자3
		System.out.println('3' - '0' + 1); // > 숫자 4
		System.out.println(Integer.parseInt("3") + 1); //숫자4
		System.out.println("3" + 1); // > 문자열31
		System.out.println((char)(3 + '0'));   // >> 문자3 '0'은 숫자로 48
	}
}