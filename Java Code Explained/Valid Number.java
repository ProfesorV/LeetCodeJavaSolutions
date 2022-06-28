//Ingredients: String, char, 4 bools, int (control flow)
class Solution {
    //String S
    public boolean isNumber(String S) {
        //bool x4 set to
        boolean num = false, exp = false, sign = false, dec = false;
        //for(int < string.length) for condition
        for (int i = 0; i < S.length(); i++) {
            //char set to apply function
            char c = S.charAt(i);
            //if(char && char) if condition set to
            if (c >= '0' && c <= '9') num = true ;    
            //else if(char and char) if condition
            else if (c == 'e' || c == 'E')
                //if(bool || !bool) if condition
                if (exp || !num) return false;
                else {
                    //bools set to
                    exp = true;
                    sign = false;
                    num = false;
                    dec = false;
                }
            //else if(char || char) if condition
            else if (c == '+' || c == '-')
                //if(bool || bool || bool) if condition return
                if (sign || num || dec) return false;
                // else bool if condition set to
                else sign = true;
            //else if (bool) if condition
            else if (c == '.')
                //if(bool || bool) if condition return
                if (dec || exp) return false;
                //else bool if condition set to
                else dec = true;
            //if condition return
            else return false;
        }
        //return bool
        return num;
    }
}
