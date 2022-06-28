//Ingredients: int[], Stack <Integer>, 3 ints
class Solution {
    //int []
    public int trap(int[] A) {
        //Stack <Integer> set to create new
        Stack<Integer> stack = new Stack<Integer>();
        //int set to
        int i = 0;
        //int set to
        int maxWater = 0;
        //while (int < int[]) while condition
        while (i < A.length){
            //if Stack<Integer> isEmpty() || int[int] <= int[Stack<Integer>.peek()]
            //if condition
            if (stack.isEmpty() || A[i] <= A[stack.peek()]){
                //Stack<Integer>.push(int++) apply function increment
                stack.push(i++);
            }
            else {
                //int = Stack<Integer>.pop() set to apply function
                int bot = stack.pop();
                //int += Stack<Integer>.isEmpty() ? 0 : augment by
                maxWater += stack.isEmpty() ? 0 :
                //Math.min(int[Stack<Integer>.peek()], int[int])-int[int]) * (int-Stack<Integer>.peek()-1)
                    (Math.min(A[stack.peek()], A[i]) - A[bot]) * (i - stack.peek() - 1);
            }
        }
        //int rrturn
        return maxWater;
    }
}
