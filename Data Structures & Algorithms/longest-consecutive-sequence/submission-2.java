class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sequenceStart=nums[0];
        int largestSequen=1;
        int maxSequenceSoFar=0;
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums){
             hashSet.add(i);
        }
        for (int num : hashSet) {

            // Only start counting if this is the beginning of a sequence
            if (!hashSet.contains(num - 1)) {

                int current = num;
                int currentLength = 1;

                while (hashSet.contains(current + 1)) {
                    current++;
                    currentLength++;
                }

                maxSequenceSoFar = Math.max(maxSequenceSoFar, currentLength);
            }
}
return maxSequenceSoFar;
    }
}
