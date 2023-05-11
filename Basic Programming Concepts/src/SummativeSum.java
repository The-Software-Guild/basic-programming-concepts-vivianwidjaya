
public class SummativeSum {

	public static void main(String[] args) {
		int[] arr1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
		System.out.println("1 Array Sum: "+addArrayElements(arr1));
		
		int[] arr2 = { 999, -60, -77, 14, 160, 301 };
		System.out.println("2 Array Sum: "+addArrayElements(arr2));
		
		int[] arr3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
		System.out.println("3 Array Sum: "+addArrayElements(arr3));
		
	}

	private static int addArrayElements(int[] myarra) {
		int sum = 0; // keep running total
		for (int i = 0; i < myarra.length; i++) {
			sum += myarra[i];
		}
		return sum;

	}
}
