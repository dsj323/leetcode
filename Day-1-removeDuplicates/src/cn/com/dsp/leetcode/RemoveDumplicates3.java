package cn.com.dsp.leetcode;

public class RemoveDumplicates3 {

	
	public static int removeDumplicates(int[] nums) {
		int olength = nums.length;
		if(olength<=1) {
			return 1;
		}
		int slow = 0;
		for(int i = 0;i<olength-1;i++) {
			if(nums[i]!= nums[i+1]) {
				nums[++slow] = nums[i+1];
			}
		}
		return slow+1;
		
	}
	
	public static void test1() {
		int[] nums = {1,1,2};
		int len = removeDumplicates(nums);
		System.out.println("len = "+len);
		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		}
	}
	
	public static void test2() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int len = removeDumplicates(nums);
		System.out.println("len = "+len);
		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		
		
	}

}
