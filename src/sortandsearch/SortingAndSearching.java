
package sortandsearch;


public class SortingAndSearching {

	public static void selectionSort(int arr[]) {
		int tmp;
		for (int i = 0; i < arr.length; i++) {
			tmp = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < tmp) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
	}
	
	public static void bubbleSort(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = arr.length - 1; i > 0; i--) {
				if (arr[i - 1] > arr[i]) {
					int t = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = t;
				}
			}
		}
	}
	
	public static int binarySearch(int arr[], int key) {
		int low, high, mid;
		low = 0;
		high = arr.length - 1;
		while (high >= low) {
			mid = (high + low) / 2;
			if (key > arr[mid]) {
				low = mid + 1;
			} else if (key == arr[mid]) {
				return mid;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
