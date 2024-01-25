package Arrays;

public class maxsubarraybruteforce {
    public static void maxSubarraySum(int numbers[]) {
        int maxsum=Integer.MIN_VALUE; 
        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++) {  
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
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
