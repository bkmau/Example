package exercise_08;

public class GenericsPractice {
    /*
     * Complete the implementation of the following program so that when it is executed, 
     * the following message will print out on your screen
     * Array integerArray contains:
     * 1 2 3 4 5 6 
     * 
     * Array doubleArray contains:
     * 1.1 2.2 3.3 4.4 5.5 6.6 7.7
     * 
     * Array characterArray contains:
     * H E L L O 
     */
	public static void main(String[] args) {
		// create arrays of Integer, Double and Character
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("The integerArray contains:");
		printArray(integerArray); // pass an Integer array

		System.out.println("Array doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("Array characterArray contains:");
		printArray(characterArray); // pass a Character array

	}
	
	public static <T> void printArray(T array[]) {
		String str = "";
		
		for(int i = 0; i < array.length; i++) {
			str += array[i] + " ";
//			if(i!= array.length -1) {
//				str += ", "; 
//			}
		}
		System.out.println(str + "\r");
		
	}

}
