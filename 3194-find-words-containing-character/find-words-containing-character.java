class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();
        int count;
        String xx = x+"";
        for(int i=0;i<words.length;i++){
            if(words[i].contains(xx)){
                arr.add(i);
            }

        }
        return arr;
        
    }
}