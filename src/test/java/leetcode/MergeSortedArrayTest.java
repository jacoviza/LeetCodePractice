package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 */
class MergeSortedArrayTest {

	@Test
	void testShouldMerge1() {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		int expected[] = { 1, 2, 2, 3, 5, 6 };

		merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1);
	}

	@Test
	void testShouldMerge2() {
		int nums1[] = { 1 };
		int nums2[] = {};
		int m = 1;
		int n = 0;
		int expected[] = { 1 };

		merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1);
	}

	@Test
	void testShouldMerge3() {
		int nums1[] = { 0 };
		int nums2[] = { 1 };
		int m = 0;
		int n = 1;
		int expected[] = { 1 };

		merge(nums1, m, nums2, n);

		assertArrayEquals(expected, nums1);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;

		while (j >= 0) {
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
	}

}
