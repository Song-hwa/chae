package practice3;

import java.util.ArrayList;
import java.util.Random;

public class Qus5 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(45)+1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				while(arr[i]==arr[j]) {
					arr[j] = rd.nextInt(45)+1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("행운의 번호 : " + arr[i]);
		} 
		
	}

}
