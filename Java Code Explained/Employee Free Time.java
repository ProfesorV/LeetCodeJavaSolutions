/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
/*
*/
class Solution {
    //List<List<Interval>>
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        //List<Interval>
        List<Interval> ans = new ArrayList<>();
        //PriorityQueue<>
        PriorityQueue<Interval> pq = new PriorityQueue<>((a,b) -> a.start - b.start);
        //List<List<Interval>> .forEach( -> PRiorityQueue.addAll())
        schedule.forEach(e -> pq.addAll(e));    
        //Interval
        Interval temp = pq.poll();
        //while condition (!PriorityQueue.isEmpty)
        while (!pq.isEmpty()) {
            //if Interval.end < PriorityQueue,peek().start)
            if (temp.end < pq.peek().start) {
                //ArrayList<>.add(new Interval(temp.end,PriorityQueue.peek(),start))
                ans.add(new Interval(temp.end, pq.peek().start));
                //Interval
                temp = pq.poll();
            }
            else {
                //interval = Interval.int < PriorityQueue.peek().end? PriorityQueue.peek() : temp
                temp = temp.end < pq.peek().end ? pq.peek() : temp;
                //.poll()
                pq.poll();
            }
        }
        //return ArrayList<>
        return ans;
    }   
}
