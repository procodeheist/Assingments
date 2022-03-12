package Day8.WeProb;

public class BinarySqrt {
    public static void main(String[] args) {
        long x = 2147395599;
        long start = 0;
        long end = x;

        while(start<=end){
            long mid = start+ (long)Math.floor((end-start)/2);
            long sqrMid = mid*mid;
            if(sqrMid == x){
                System.out.println(mid);
            }
            else if(sqrMid > x){
                end = mid-1;
            }
            else if(sqrMid < x){
                start = mid+1;
            }
        }

        System.out.println(end);
    }
}
