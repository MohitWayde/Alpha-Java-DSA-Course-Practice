package Array;

public class ArrayAssignments {
	public static boolean assignmentNo_1(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}

			}
		}
		return false;
	}

	// PURE BINARY SEARCH
	public static int binarySearch(int nums[], int target) {
		int start = 0, end = nums.length - 1;

		// System.out.println(mid);
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				System.out.println(nums[mid] + " is target " + target);
				return mid;
			}
			if (nums[mid] < target) {
				System.out.println(nums[mid] + " is greater than target " + target);
				end = mid - 1;
				System.out.println("the end is " + end);
			} else {
				System.out.println(nums[mid] + " is less than target " + target);
				start = mid + 1;
				System.out.println("the start is " + start);

			}

		}

		return -1;

	}

	// Assignment 2
	public static int assignmentNo_2(int[] nums, int target) {
		// min will have index of minimum element of nums
		int min = minSearch(nums);
		// System.out.println("In search method having TWO arguments");
		// find in sorted left
		if (nums[min] <= target && target <= nums[nums.length - 1]) {
			return search(nums, min, nums.length - 1, target);

		}
		// find in sorted right
		else // (nums[min]>= target && target>=nums[0])
		{
			return search(nums, 0, min, target);

		}
	}

	// binary search to find target in left to right boundary
	public static int search(int[] nums, int left, int right, int target) {
		// System.out.println("In the search function having FOUR arguments");
		int l = left;
		int r = right;
		// System.out.println(left+" "+right);
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				// System.out.println("returned mid");
				return mid;
			} else if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	// smallest element index
	public static int minSearch(int[] nums) {
		// System.out.println("In the minSearch function");
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			// System.out.println("the mid is "+mid+" BTW program control is in the
			// MINSEARCH");
			if (mid > 0 && nums[mid - 1] > nums[mid]) {
				// System.out.println("mid in if loop is "+mid);
				return mid;
			} else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
				left = mid + 1;
				// System.out.println("left in elseif loop is "+left);
			} else {
				right = mid - 1;
				// System.out.println("right in else loop is "+right);
			}
		}
		return left;
	}

	// Assignment 5
	public static void assignmentNo_5(int nums[]) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n + 1; j++) {				
				for (int k = i + 2; k < n + 1; j++) {
					if(nums[i]+
					)
				}
			}
		}
	}

	public static void main(String[] args) {
		// int nums[] = {1,2,3,1};
		// int nums[] = {1,2,3,4};
		// int nums[] = {4,5,6,7,0,1,2};
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		int target = 0;
		// Assignment 1
		// boolean assignmentNo_1_Results = assignmentNo_1(nums);;
		// System.out.println(assignmentNo_1_Results);

		// Assignment 2
		// int assignmentNo_2_Results = assignmentNo_2(nums, target);
		// if(assignmentNo_2_Results<0){
		// System.out.println("Target not found!");
		// }
		// else{
		// System.out.println("the target "+target+" is on the index location
		// "+assignmentNo_2(nums, target));
		// }
		// System.out.println(assignmentNo_2(nums, target));
		assignmentNo_5(nums);
	}
}
