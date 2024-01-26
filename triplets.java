package PS6;

public class triplets {
    public static void Triplets(int nums[]) {
        int n=nums.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(i!=j && i!=k && i!=k) {
                        if(nums[i]+nums[j]+nums[k]==0) {
                            System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        Triplets(nums);
    }
}
