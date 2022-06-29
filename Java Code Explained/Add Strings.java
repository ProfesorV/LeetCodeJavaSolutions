class Solution {
  //string, string
  public String addStrings(String num1, String num2) {
    //int
    int carry = 0;
    //StringBuilder
    StringBuilder sb = new StringBuilder();
    //int
    int idxOne = num1.length() - 1;
    //int
    int idxTwo = num2.length() - 1;
    //while condition (int >= || >= || int >)
    while (idxOne >= 0 || idxTwo >= 0 || carry > 0) {
      //if condition (int >= && int >=)
      if (idxOne >= 0 && idxTwo >= 0) {
        //augment by .getNumericValue() + .getNumericValue()
        carry += Character.getNumericValue(num1.charAt(idxOne--)) + Character.getNumericValue(num2.charAt(idxTwo--));
        //else if condition (>= && <)
      } else if (idxOne >= 0 && idxTwo < 0) {
        //augment by .getNumericValue
        carry += Character.getNumericValue(num1.charAt(idxOne--));
        //else if condition (< && >=)
      } else if (idxOne < 0 && idxTwo >= 0) {
        //augment by .getNumericValue
        carry += Character.getNumericValue(num2.charAt(idxTwo--));
      }
      //.append(int %)
      sb.append(carry % 10);
      //set to
      carry = carry > 9 ? carry / 10 : 0;
    }
    //return .reverse().toString()
    return sb.reverse().toString();
  }
}