package day03;


import java.util.Scanner;

public class diet {

   public static void main(String[] args) {
      //1. ��ĳ�� ��� �ҷ�����
         Scanner sc = new Scanner(System.in);
         int cnt = 0;
      //2. ��������� ��� �� �Է¹ޱ�
         System.out.print("���� ������ :");
         int now = sc.nextInt();
      //3. ��ǥ������ ��� �� �Է¹ޱ�
         System.out.print("��ǥ ������ :");
         int goal = sc.nextInt();
      //4. ������ ���� ������ ��� �� �Է¹ޱ�
         do {
            //�ѹ��� ������ ����Ǿ� �ϴ� �κ�
            //�ݺ��۾��� ������ �κ�
            System.out.print(cnt+"���� ���� ������ :");
            int minus = sc.nextInt();
            now -= minus;
            cnt++;
         }while(now>goal);
         
         System.out.println(now+" kg �޼� �����մϴ�");
      
      //5. ��ǥġ�� �޼������� �����մϴ� �޼��� �����ϱ�.
   }

}