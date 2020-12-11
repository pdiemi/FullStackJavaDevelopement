package lisdynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LisDynamicProgramming {

	public void lis(ArrayList<Integer> sequence) {
		/*
		 * find and print length of longest increasing sub-sequence, return length of
		 * the longest sub-sequence
		 */
		ArrayList<Integer> subLength = new ArrayList<>();
		for (int i = 0; i < sequence.size(); i++) {
			subLength.add(1);
		}

		ArrayList<Integer> subSequence = new ArrayList<>();
		for (int i = 0; i < sequence.size(); i++) {
			subSequence.add(-1);
		}

		for (int i = 1; i < sequence.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (sequence.get(i) > sequence.get(j)) {
					if (subLength.get(i) <= (subLength.get(j) + 1)) {
						subLength.set(i, subLength.get(j) + 1);
						subSequence.set(i, j);
					}
				}
			}
		}
		int maxLength = Collections.max(subLength);
		int maxIndex = findIndexOf(subLength, maxLength);

		System.out.println("\nLength of the longest increasing sub-sequence is " + maxLength + "\n");
		System.out.println("The longest increasing sub-sequence: ");
		printLIS(sequence, subSequence, maxIndex);

	}

	public int findIndexOf(ArrayList<Integer> sequence, int value) {
		/*
		 * return the first index of element equals to value, otherwise return -1
		 */
		int i;
		for (i = 0; i < sequence.size(); i++) {
			if (sequence.get(i) == value)
				return i;
		}
		return -1;
	}
	
	public void printLIS(ArrayList<Integer> sequence, ArrayList<Integer> subSequence, int maxIndex) {
		int currentIndex = maxIndex;
		ArrayList<Integer> lis = new ArrayList<>();
		while (currentIndex >= 0) {
			lis.add(sequence.get(currentIndex));
			currentIndex = subSequence.get(currentIndex);
		}
		Collections.reverse(lis);
		System.out.println(lis);
	}

}
