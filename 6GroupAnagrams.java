class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(str);
                map.put(key,strList);
            }
        }
        res.addAll(map.values());
        return res;
        
    }
}
