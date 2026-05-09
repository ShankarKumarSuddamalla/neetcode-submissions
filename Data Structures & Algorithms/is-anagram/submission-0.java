class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> frequencyMap=new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(char c : s.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!frequencyMap.containsKey(c)) return false;

            frequencyMap.put(c,frequencyMap.get(c)-1);

            if(frequencyMap.get(c)<0) return false;
        }
        return true;
    }
}
