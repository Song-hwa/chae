package day4;

public class method {

	public static void main(String[] args) {
		//�޼ҵ� ȣ���ϱ�
		int result = addNumber(2,3);
		System.out.println(result);
		
		//���� ������� �ʰ� �޼ҵ� ����� Ȯ���ϱ�
		System.out.println(addNumber(1,9));}
	

		
		
		//
		//�޼ҵ� �����ϱ�
		//�ٸ� �޼ҵ�� ��ġ�� �ȵȴ� ���θ޼ҵ� �Ʒ����� ���Ӱ� ����
		//�޼ҵ��� ����1.����������(����������)-publicŬ������ ��/�ܺο��� ���ٰ���
	//2.����Ÿ��:�޼ҵ尡 ȣ��ǰ� �� ���� ������� ���� Ÿ��
		//-int,string,char>�޼ҵ� ���� return Ű���� ���
		//Ÿ���� ���� ���>void
		//3. �޼ҵ��� �̸�
		//4. �޼ҵ� ������ ���� ����>�޼ҵ忡 ���� �Է°�(x��)>�Ű�����
		public static int addNumber(int num1, int num2) {
		   int result = num1+num2;
		   
			return result;
		}


}
