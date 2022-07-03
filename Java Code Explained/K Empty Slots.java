class Solution {
    //int[], int
    public int kEmptySlots(int[] flowers, int k) {
        //TreeSet<>
        TreeSet<Integer> set = new TreeSet<>();
        //int
        int day = 0;
        //for condition (int in int[])
        for (int flower : flowers) {
            //incremente
            day++;
            //TreeSet<>.add(int)
            set.add(flower);
            //Integer set to TreeSet<>.lower(int)
            Integer lower = set.lower(flower);
            //Integer set to TreeSet<>.higher(int)
            Integer higher = set.higher(flower);
            //if condition ((int != null && int - int - 1 == k) || (int != null && int-int-1 == int))
            if ((lower != null && flower - lower - 1 == k) || (higher != null && higher - flower - 1 == k)) {
                //return int
                return day;
            }
        }
        return -1;
    }
}
