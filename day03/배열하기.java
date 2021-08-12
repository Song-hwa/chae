package day03;

public class 배열하기 {

	public static void main(String[] args) {
		// 
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.print("가장 큰 값은");
		int max =arr [0];
		for(int i =0; i>arr.length; i++ ) {
		       if (arr[i]>max) {
		    	   max=arr[i];
	}
}
	    int min = arr[0];
		for(int i =0; i<arr.length; i++ ) {
	       if (arr[i]<min) {
	    	   min=arr[i];
	       }
		}
        System.out.println("최고점수 : "+max);
        System.out.println("최저점수 : "+min);
        
}
}

