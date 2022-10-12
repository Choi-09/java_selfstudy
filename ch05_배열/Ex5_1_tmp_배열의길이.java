import java.util.Arrays;  // Arrays.toString()�� ����ϱ� ���� �߰�

class Ex5_1_tmp_배열의길이 {
	public static void main(String[] args) {
		int[]arr = new int[10]; //길이가 10인 int 배열 arr을 생성
		System.out.println("arr.length=" + arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
	}
}