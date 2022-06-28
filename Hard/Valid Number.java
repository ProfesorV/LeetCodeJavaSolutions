//Ingredients: String, char, 4 bools, int (control flow)
class Solution {
    //String S
    public boolean isNumber(String S) {
        //bool x4
        boolean num = false, exp = false, sign = false, dec = false;
        //int
        for (int i = 0; i < S.length(); i++) {
            //char
            char c = S.charAt(i);
            //if(char && char)
            if (c >= '0' && c <= '9') num = true ;    
            //else if(char and char)
            else if (c == 'e' || c == 'E')
                //if(bool || !bool)
                if (exp || !num) return false;
                else {
                    //bools
                    exp = true;
                    sign = false;
                    num = false;
                    dec = false;
                }
            //else if(char || char)
            else if (c == '+' || c == '-')
                //if(bool || bool || bool)
                if (sign || num || dec) return false;
                // else bool
                else sign = true;
            //else if (bool)
            else if (c == '.')
                //if(bool || bool)
                if (dec || exp) return false;
                //else bool
                else dec = true;
            else return false;
        }
        return num;
    }
}