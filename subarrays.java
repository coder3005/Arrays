package Arrays;

public class subarrays {
    public static void printSubarrays(int numbers[]) {
        int ts=0;
        int l=Integer.MIN_VALUE,m=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++) { //print
                    System.out.print(numbers[k]+" "); //subarray
                    sum+=numbers[k];
                }
                System.out.print(" -> " + sum);
                if(sum>l) {
                    l=sum;
                }
                if(sum<m) {
                    m=sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + ts);
        System.out.println("largest is : " + l);
        System.out.println("smallest is : " + m);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}
