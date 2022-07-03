class Solution {
    //String[]
    private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return makeString(num);
    }
    //int
    private String makeString(int num) {
        //String
        String result;
        //if condition (int < 10)
        if (num < 10) {
            //set to String[int]
            result = belowTen[num];
        }
        //if condition (int < 20)
        else if (num < 20) {
              //set to String[int-10]
            result = belowTwenty[num - 10];
        }
        //if condition (int < 100)
        else if (num < 100) {
              //set to String[int] + "" + makeString(int % 10)
            result = belowHundred[num / 10] + " " + makeString(num % 10);
        }
        //if condition (int < 1000)
        else if (num < 1000) {
            //set to makeString(int % 100) + "" + makeString(int % 100)
             result = makeString(num / 100) + " Hundred " + makeString(num % 100);
        }
        //if condition (int < 1000000)
        else if (num < 1000000) {
            //set to makeString(int % 1000) + "" + makeString(int % 1000)
            result = makeString(num / 1000) + " Thousand " + makeString(num % 1000);
        }
        //if condition (int < 1000000000)
        else if (num < 1000000000) {
            //set to makeString(int % 1000000) + "" + makeString(int % 1000000)
            result = makeString(num / 1000000) + " Million " + makeString(num % 1000000);
        }
        else {
            //set to makeString(int % 1000000000) + "" + makeString(int % 1000000000)
            result = makeString(num/1000000000) + " Billion " + makeString(num % 1000000000);
        }
        //return
        return result.trim();
    }
}
