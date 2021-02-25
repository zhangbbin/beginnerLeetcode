package TwoSum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 * @author zhangbin
 * @category TwoSum
 * @Time 2021.2.17 15:21
 * 
 */
public class Solution {

	/**
	 * 将数组中的 元素存储在map中，并查看target减去数组中的一个元素之后其差值是否也存在于map中,
	 * 若存在，返回这两个数组元素的下标以数组的形式。
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length<2)
            return res;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {                      
            if(map.containsKey(target-nums[i])) {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i); 
        }
        return res;
    }
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}

