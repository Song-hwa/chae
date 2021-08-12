package day03;

public class minimum {

	public static void main(String[] args) {
		// 
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.print("가장 작은 값은");
		int max =arr [0];
		
	
		for(int i =0; i<arr.length; i++ ) {
	       if (arr[i]<max) {
	    	   max=arr[i];
	       }
		}
        System.out.print(max+"입니다.");
}



}

