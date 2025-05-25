class Solution {
    public int romanToInt(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        int ans = 0;

        for(int i=0;i<s.length();){
            System.out.println(i);
            if((s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') && ((i+1)<s.length()) && isNext(s.charAt(i), s.charAt(i+1))){
                ans+=map.get(s.charAt(i+1));
                ans-=map.get(s.charAt(i));
                i+=2;

            }else{
                ans+=map.get(s.charAt(i));
                i++;
            }
            
        }

        return ans;

        
    }

    public boolean isNext(char curr , char i){

        if(curr == 'I' && (i=='V' || i=='X')){
            return true;
        }else if(curr == 'X' && (i=='L' || i=='C')){
            return true;
        }else if(curr == 'C' && (i=='D' || i=='M')){
            return true;
        }
        return false;
    }
}