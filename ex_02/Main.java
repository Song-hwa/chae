package ex_02;

public class Main {

	public static void main(String[] args) {
		   //������ ���� �� �ִ� �����̱� ��� �����
	      //�ʿ��� �� : ���, ����
	      
	      //�����̱� ��ü ����
	      Machine m = new Machine();
	      //���� ��ü ����
	      Pika pika = new Pika();
	      
	      m.run(pika);
	      
	      //���̸� ���� �̱�
	      Pairi pairi = new Pairi();
	      m.run(pairi);
	      
	      //���α� ���� �̱�
	      Kkobuk kkobuk = new Kkobuk();
	      m.run(kkobuk);
	      
	      System.out.println();
	      
	      m.run(new Kkobuk());
	      m.run(new Pairi());
	      m.run(new Pika());
	      
	      

	}

}
