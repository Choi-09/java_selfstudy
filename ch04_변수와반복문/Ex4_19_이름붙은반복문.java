class Ex4_19_이름붙은반복문
{
	public static void main(String[] args)
	{
      // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==9)
						break Loop1;
//						break;
//						continue Loop1; //continue에서는 잘 안쓰인다.
//						continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} // end of Loop1

	}
}