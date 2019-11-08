package cn.com.dsp.leetcode;

public class RemoveDumplicates2 {

	
	public static int removeDumplicates(int[] nums) {
		int olength = nums.length;
		int step = 0 ;
		int slow = 0;
		for(int i = 0;i<olength-1;i++) {
			
			if(nums[i]!= nums[i+1]) {
				slow++;
				nums[slow] = nums[i+1];
			}else {
				step++;
			}
		}
		return olength - step;
		
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
