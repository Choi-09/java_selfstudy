import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_1_String배열 {
	public static void main(String[] args) {
		
		//index 범위: 0~2
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i = 0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}
		
	}
}