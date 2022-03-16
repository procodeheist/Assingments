package WeekEnd;

import java.util.Arrays;
import java.util.Comparator;

class Activity {
    int start;
    int end;
    public Activity(int start,int end){
        this.start= start;
        this.end = end;
    }
}
class MyCmp implements Comparator<Activity>{

    @Override
    public int compare(Activity o1, Activity o2) {
        return o1.end - o2.end;
    }

}

public class Greedy{
    public static void main(String[] args) {
        Activity[] activities = new Activity[3];
        activities[0] = new Activity(10,11);
        activities[1] = new Activity(5,19);
        activities[2] = new Activity(16,18);
        MyCmp mySort = new MyCmp();
        Arrays.sort(activities,mySort);
        int res=1;
        int prev =0;
        for(int curr=1; curr<activities.length; curr++){
            if(activities[curr].start<=activities[prev].end){
                res++;
                prev = curr;
            }
        }
        System.out.println(res);
    }
}
