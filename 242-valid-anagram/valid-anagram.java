class Solution {
    public boolean isAnagram(String s, String t) {
        if((s.length()) != t.length())
        {
            return false;
        }
        HashMap<Character , Integer> sCharactedAndCount=new HashMap<>();
        HashMap<Character , Integer> tCharactedAndCount=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            sCharactedAndCount.put(s.charAt(i) , sCharactedAndCount.getOrDefault(s.charAt(i) , 0)+1);
            tCharactedAndCount.put(t.charAt(i) , tCharactedAndCount.getOrDefault(t.charAt(i) , 0)+1);
        }
        for(char i : sCharactedAndCount.keySet())
        {
            System.out.println( i +"   "+tCharactedAndCount.getOrDefault(i , 0) +"   "+ sCharactedAndCount.getOrDefault(i , 0 ));
            if(tCharactedAndCount.getOrDefault(i , 0) < sCharactedAndCount.getOrDefault(i , 0 ))
            {
                return false;
            }
        }
        return true;
    }
}