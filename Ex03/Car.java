package Ex03;

//�߻� Ŭ���� �����
//abstract
//1. �߻�Ŭ������ �ϳ� �̻��� �߻� �޼ҵ带 �����ϰ� �־�� �Ѵ�.
public abstract class Car {
 
 //������ �� �� �ִ� ��� -> �߻�޼ҵ� ����
 //�߻� �޼ҵ�� ��ü���� ������ ���� �� ����. -> ��ü�� ���� �� ����.
 public abstract void runner();
 
 int tire=4;
 String color;
 
 //Ÿ�̾� ���� Ȯ�� �޼ҵ�
 public int getTire() {
    return tire;
 }
 
}