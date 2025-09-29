class Solution {
    public int firstMissingPositive(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            if(num==0 || num<0){
                continue;
            }else{
                pq.add(num);
            }
        }
        int smaller=1;
        int prev=-1;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(curr==prev){
                continue;
            }
            if(smaller<curr){
                return smaller;
            }
            if(smaller==curr){
                smaller++;
            }
            prev=curr;
        }
        return smaller;
    }
}