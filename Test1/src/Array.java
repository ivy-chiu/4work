public class Array {

	public static void main(String[] args) {
		int array[] = { 10, 3, 1, 8, 2 };
		System.out.print("The original array numbers:\n");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		
		System.out.println();
		SortArray(array);
	}

	private static void SortArray(int[] ar) {
		int temp;
		for (int i = ar.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
					
					System.out.print("Each Swap: \n");

					for (int k = 0; k < ar.length; k++) {
						System.out.print(ar[k] + ",");
					}
					System.out.println();
				}
			}
		}
		System.out.print("The new nubmer: \n");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ",");
		}
		System.out.println();
	}
}