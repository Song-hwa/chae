package day03;

public class array {

			public static void main(String[] args) {
				// ������ �迭 �����ϱ�
				int[][]arr = new int[5][5];
				//������ �迭�� ���鼭 �������� �� ����
				
				int data =0;
				//���� �������ֱ� ���� �۾�
				//������ �ݺ��ϱ� ����for�� (��)
				for(int i = 0; i<5; i++) {
					//ȣ���� �ݺ��ϱ� ���� for��(��)
					for(int j =0; j<5; j++) {
						arr[i][j] = data;
						data++;
					}
				}
				//���� Ȯ�����ֱ� ���� �۾�
				for(int i =0; i<5; i++) {
					for(int j =0; j<5; j++) {
						System.out.print(arr[i][j]+"	");
					}
					//���� ������ ���� �����۾�
					System.out.println();
				}

			}

		}