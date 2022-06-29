class Solution {
    //int
    public int binaryGap(int N) {
        //set to .toBinaryString(int).toCharArray()
        char[] binValues = Integer.toBinaryString(N).toCharArray();
        //int
        int oneIndex = -1;
        //int
        int maxDistance = 0;
        //for condition (int < char[].Length)
        for (int i=0; i<binValues.length; i++) {
            //if condition (char[int]=='1')
            if (binValues[i] == '1') {
                //if condition (int == -1)
                if (oneIndex == -1) {
                    //int = int
                    oneIndex = i;
                }
                //else condition
                else {
                    //int = .max(int - int, int)
                    maxDistance = Math.max(i - oneIndex, maxDistance);
                    //int = int
                    oneIndex = i;
                }
            }
        }
        //return
        return maxDistance;
    }
}
