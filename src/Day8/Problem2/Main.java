package Day8.Problem2;

public class Main{
    public boolean checkPrime(int num){
        if(num == 0 || num == 1)
            return false;

        for(int i=2; i<=Math.floor(num/2); i++){
            if(num%i == 0)
                return false;
        }

        return true;
    }
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int[] resultArr = new int[inputArray.length];
        int arrSize = 0;

        for(int i=0; i<inputArray.length; i++){
            if(checkPrime(inputArray[i])){
                resultArr[arrSize] = (inputArray[i]);
                arrSize++;
            }
        }

        return resultArr;
    }
    public static void main(String[] args){
        int[] arr = {10,12,6,50,18,14,15};
        boolean flag=true;

        Main mainObj = new Main();
        int[] res = mainObj.findAndReturnPrimeNumbers(arr);

        if(res.length != 0){
            for(int item:res){
                if(item != 0){
                    flag = false;
                    System.out.print(item+" ");
                }
            }
        }
        else if(flag);
            System.out.println("Prime number not found in the supplied Array");
    }
}