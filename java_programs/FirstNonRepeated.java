package array;

public class FirstNonRepeated {

	public static void main(String[] args) {
		int arr[]= {8,2,3,3,4,5,6,2,1};
		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]); 
                    return;
                }
            }
        }

	}

}
