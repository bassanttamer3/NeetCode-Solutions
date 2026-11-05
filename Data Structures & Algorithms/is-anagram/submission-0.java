class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> s1 =new HashMap();
        HashMap<Character , Integer> t1 =new HashMap();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            s1.put(c , s1.getOrDefault(c , 0) + 1);
            
        }
         for(int i=0;i<t.length();i++){
            char b = t.charAt(i);
            t1.put(b , t1.getOrDefault(b , 0) + 1);
        }

        if(s1.equals(t1)){
            return true;
        }else{
            return false;
        }




    }
}
