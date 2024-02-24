package Array;
// TODO: Sum of each each subarray & find maximum & minimus sum of array

// [2,4,6] = >  sum=12, like this

public class PrintSubarrays {
	public static void printSubarrays(int numbers[]) {
		int totalSubarrays = 0;
		int sumOfSubarrays = 0;
		int element = 0;
		int positiveInfinity = Integer.MAX_VALUE;
		int negativeInfinity = Integer.MIN_VALUE;
		int smallestSum = positiveInfinity;
		int largestSum = negativeInfinity;

		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			for (int j = i; j < numbers.length; j++) {
				int end = j;
				for (int k = start; k <= end; k++) {
					System.out.print(numbers[k] + " ");
					sumOfSubarrays += numbers[k];
					if (sumOfSubarrays < smallestSum) {
						smallestSum = sumOfSubarrays;
					} else if (sumOfSubarrays > largestSum) {
						largestSum = sumOfSubarrays;
					}

				}
				System.out.print(" = " + sumOfSubarrays);
				sumOfSubarrays = 0;
				totalSubarrays++;
				System.out.println();

			}
		}
		System.out.println("Total number of subArrays are " + totalSubarrays);
		System.out.println("Largest sum of subArrays are " + largestSum);
		System.out.println("Smallest sum of subArrays are " + smallestSum);

	}

	public static void printSumOfSubArrays(int numbers[]) {
		// int totalSubarrays = 0;
		int sumOfSubarrays = 0;
		int element = 0;
		int positiveInfinity = Integer.MAX_VALUE;
		int negativeInfinity = Integer.MIN_VALUE;
		int smallestSum = positiveInfinity;
		int largestSum = negativeInfinity;

		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			for (int j = i; j < numbers.length; j++) {
				int end = j;
				for (int k = start; k <= end; k++) {
					// System.out.print(numbers[k]+" ");
					sumOfSubarrays += numbers[k];
					if (sumOfSubarrays < smallestSum) {
						smallestSum = sumOfSubarrays;
					} else if (sumOfSubarrays > largestSum) {
						largestSum = sumOfSubarrays;
					}
				}
				System.out.print(" = " + sumOfSubarrays);
				sumOfSubarrays = 0;
				// totalSubarrays++;
				System.out.println();

			}
		}
		// System.out.println("Total number of subArrays are "+totalSubarrays);
		System.out.println("Largest sum of subArrays are " + largestSum);
		System.out.println("Smallest sum of subArrays are " + smallestSum);

	}

	public static void printSubarraysPrefixSum(int numbers[]) {
		int sumOfSubArrays = 0;
		int positiveInfinity = Integer.MAX_VALUE;
		int negativeInfinity = Integer.MIN_VALUE;
		int smallestSum = positiveInfinity;
		int largestSum = negativeInfinity;
		int prefixArray[] = new int[numbers.length];

		// calculate prefixArray
		prefixArray[0] = numbers[0];
		for (int i = 1; i < prefixArray.length; i++) {
			prefixArray[i] = prefixArray[i - 1] + numbers[i];
		}
		for (int i = 0; i < numbers.length; i++) {
			int start = i;
			for (int j = i; j < numbers.length; j++) {
				int end = j;
				

				sumOfSubArrays = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[start - 1];
				if (sumOfSubArrays > largestSum) {
					largestSum = sumOfSubArrays;
				}

			}
		}
		System.out.println("largest Sum " + largestSum);
	}


	public static void kadanesAlgorithm(int numbers[]){
		int cs = 0;
		int ms = 0;
		int largestNumber = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			cs += numbers[i];
			if(cs<0){
				cs = 0;
			}
			ms = Math.max(cs, ms);
		}
		System.out.println(ms);
	}
	

	
	public static void main(String[] args) {
		// int numbers[] = { 1, -2, 6, -1, 3 };
		// int numbers[] = { 1, 2, 3, 4, 5 };
		int numbers[] = { -2, -3, 4, -1, -2, 1, 5,-3};

		// printSubarrays(numbers);
		// printSumOfSubArrays(numbers);
		// printSubarraysPrefixSum(numbers);
		kadanesAlgorithm(numbers);
	}
}
