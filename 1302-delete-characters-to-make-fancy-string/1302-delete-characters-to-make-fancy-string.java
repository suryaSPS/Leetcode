class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        /*for(int i = 1;i<ch.length -1;i++){
            if(ch[i-1] == ch[i] && ch[i+1] == ch[i]){
                res.append(ch[i-1]);
            }
        }
        */
        int count = 1;

        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == res.charAt(res.length()-1)){
                count++;
            if(count < 3){
                res.append(s.charAt(i));
            }
            }else{
                count = 1;
                res.append(s.charAt(i));
            }
        }


        return res.toString();
    }
}