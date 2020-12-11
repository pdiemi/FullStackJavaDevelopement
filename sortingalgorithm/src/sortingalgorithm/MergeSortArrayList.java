package sortingalgorithm;
import java.util.ArrayList;

public class MergeSortArrayList {

	void merge(ArrayList<Integer> arr, int left, int middle, int right) {
		int leftLength = middle - left + 1;
		int rightLength = right - middle;

		/* create temp ArrayList */
		ArrayList<Integer> leftHalf = new ArrayList<>();
		ArrayList<Integer> rightHalf = new ArrayList<>();

		/* copy data to temp array */
		for (int i = 0; i < leftLength; i++) {
			leftHalf.add(arr.get(left + i));
		}
		for (int j = 0; j < rightLength; j++) {
			rightHalf.add(arr.get(middle + 1 + j));
		}

		int i = 0, j = 0, k = left;

		while (i < leftLength && j < rightLength) {
			if (leftHalf.get(i) <= rightHalf.get(j)) {
				arr.set(k, leftHalf.get(i));
				i++;
			} else {
				arr.set(k, rightHalf.get(j));
				j++;
			}
			k++;
		}
		while (i < leftLength) {
			arr.set(k, leftHalf.get(i));
			i++;
			k++;
		}
		while (j < rightLength) {
			arr.set(k, rightHalf.get(j));
			j++;
			k++;
		}
		
	}

	public void sort(ArrayList<Integer> arr, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			sort(arr, left, middle);
			sort(arr, middle + 1, right);

			merge(arr, left, middle, right);
		}
	}
}
