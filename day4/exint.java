package day4;

public class exint {

	public static void main(String[] args) {
	int num1 =5;
	int num2 = 11;
	int result = close10(num1, num2);
	System.out.println("10�� ������:"+result);

	}

	public static int close10(int num1, int num2) {
	 
		//���׿����ڸ� ���� ���� Ȯ��
	  int diff1 = num1>10? num1 -10 : 10 -num1;
	  int diff2 = num2>10? num2 -10 : 10 -num2;
	  if(diff1>diff2) {
		return num2;
	} else if (diff1<diff2) {
		return num1;
	}else {
		return 0;
	}
	}

}
