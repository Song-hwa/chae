package day03;

import java.util.Scanner;

public class maxnim {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<arr.length; i++) {
			System.out.print((i+1)+"��° ���� �Է�>>");
			arr[i] = sc.nextInt();
		}
		System.out.print("�Էµ� ����: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"  ");
		}
        System.out.println();
        
        int max = arr[0];
        for(int i =0; i<arr.length; i++) {
        	if(max<arr[i]) {
        		max =arr[i];
        	}
        }
	    int min = arr[0];
	    for(int i =0; i<arr.length; i++) {
	    	if(min>arr[i]) {
	    		min = arr[i];
	    	}
	    }
	    System.out.println("�ְ�����:"+max);
	    System.out.println("��������:"+min);
	    
	}
	
	

}
