class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> mapString=new HashMap<String,List<String>>();
     for(String s:strs){
        char[] charArray=s.toCharArray();
        Arrays.sort(charArray);
        String sortedValue=new String(charArray);
        mapString.putIfAbsent(sortedValue,new ArrayList<>());
        mapString.get(sortedValue).add(s);
     }              
    return new ArrayList<>(mapString.values());
    }
}
