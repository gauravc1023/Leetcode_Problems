class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		for(int i=0;i<n-2;i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue;
			int low=i+1;
			int high = n-1;
			
			while(low<high) {
				int sum = nums[i]+nums[low]+nums[high];
				if(sum==0) {
					set.add(Arrays.asList(nums[i],nums[low],nums[high]));
					low++;
					high--;
				}
				else if(sum<0) {
					low++;
				}
				else {
					high--;
				}
			}
		}
		ans.addAll(set);
		return ans;
    }
}