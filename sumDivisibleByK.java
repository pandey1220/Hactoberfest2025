class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> ss=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ss.put(nums[i],ss.getOrDefault(nums[i],0)+1);
        }
        int s=0;
        for(Map.Entry<Integer,Integer> j:ss.entrySet()){
            if(j.getValue()%k==0)s+=j.getValue() * j.getKey();
        }
        return s;
    }
}
