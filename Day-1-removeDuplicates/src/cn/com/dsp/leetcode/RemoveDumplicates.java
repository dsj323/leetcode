package cn.com.dsp.leetcode;

public class RemoveDumplicates {

	
	public static int removeDumplicates(int[] nums) {
		int olength = nums.length;
		
		for(int i = olength-1;i >= 1; i--) {
			int step=0;
			while( (i>=1) && (nums[i] == nums[i-1]) ){
				i--;
				step++;
			}
			for(int j = i;j < olength - step;j++) {
				nums[j] = nums[j+step];
			}
			olength = olength - step;
		}
		return olength;
		
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
