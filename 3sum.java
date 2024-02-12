class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])
            continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
    
                if(nums[i]+nums[k]+nums[j]<0){
                    j++;
                }
                else if(nums[i]+nums[k]+nums[j]>0)
                k--;
                else{
                    List<Integer> res=Arrays.asList(nums[i],nums[k],nums[j]);
                    ans.add(res);
                    j++;
                    k--;
                    while(j<k&& nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
    

    }
    return ans;
}
}
// Set<List<Integer>> ans=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     Set<Integer> res=new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){
        //         int third=-(nums[i]+nums[j]);
        //         if(res.contains(third)){
        //         List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
        //         Collections.sort(temp);
        //         ans.add(temp);
        //         }
        //         res.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> res=new ArrayList<>(ans);
        // return res;