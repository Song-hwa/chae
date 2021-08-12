package day4;

public class method07 {

	public static void main(String[] args) {
//ctrl +space 자동완성
      int [] array = {1,3,4,8,7,9,10};
      
      arrayToString(array);
        
      
	}
public static void arrayToString(int[] arr) {
	for(int i=0; i<=arr.length; i++) {
		System.out.print(arr[i]+"  ");
	}
}
}
