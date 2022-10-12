import java.io.InterruptedIOException;
import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_1_tmp_StringClass {
	public static void main(String[] args) {
		
		String string = "ABCDE";
		char ch = string.charAt(2); // C
		String str2 = string.substring(1,4); //BCD
		String str3 = string.substring(1); // BCDE
		//String str3 = string.substring(1, str.length()); // BCDE
		System.out.println(str3);
	}
}