package Arrays;

public class maxsubarrayprefixsum {
    public static void maxSubarraySum(int numbers[]) {
        int maxsum=Integer.MIN_VALUE; 
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end=j;
                //int currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                int currsum;
                if(start==0) {
                    currsum=prefix[end];
                }
                else {
                    currsum=prefix[end]-prefix[start-1];
                }
                if(currsum > maxsum) {
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubarraySum(numbers);
    }
}
