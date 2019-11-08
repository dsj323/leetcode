package cn.com.dsp.leetcode;

public class RotateArray2 {

	public static void rotate(int[] nums, int k) {

		int length = nums.length;
		if (length <= 1 || k <= 0) {
			System.out.println("input parameters error!");
		}
		for(int i = 0 ; i < k; i++) {
			int temp = nums[length-1];
			for(int j = length-1;j >=1;j--) {
				nums[j]=nums[j-1];
			}
			nums[0] = temp;
		}

	}
	
	public static void test1() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 1;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("---------------------");
	}
	public static void test2() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("---------------------");
	}
	public static void test3() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("---------------------");
	}
	
	public static void test4() {
		int[] nums = {-1,-100,3,99 };
		int k = 1;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("---------------------");
	}
	public static void test5() {
		int[] nums = {-1,-100,3,99 };
		int k = 2;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("---------------------");
	}
	public static void test6() {
		int[] nums = {1,2,3,4,5,6 };
		int k = 4;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		
		test4();
		test5();
		test6();
	}

}
