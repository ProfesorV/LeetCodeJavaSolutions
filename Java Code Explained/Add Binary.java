class Solution {
  //string, string
  public String addBinary(String a, String b) {
    //int
    int carry = 0;
    //StringBuilder
    StringBuilder sb = new StringBuilder();
    //int
    int idxA = a.length() - 1;
    //int
    int idxB = b.length() - 1;
    //while condition (int >= || int>= || int >)
    while (idxA >= 0 || idxB >= 0 || carry > 0) {
      //int
      int temp = (
        //(int >= ? .getNemericValue( .charAt(int--))) +
        (idxA >= 0 ? Character.getNumericValue(a.charAt(idxA--)) : 0) + 
        (idxB >= 0 ? Character.getNumericValue(b.charAt(idxB--)) : 0) + 
        carry
      );
      //set to calculate
      carry = temp > 1 ? 1 : 0;
      //set to calculate
      temp = temp > 1 ? (temp == 2 ? 0 : 1) : temp;
      //.append(int)
      sb.append(temp);
    }
    //return .reverse().toString()
    return sb.reverse().toString();
  }
}
