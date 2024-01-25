package Arrays;

public class secondlargest {
    public static int secondLargest(int numbers[]) {
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] > largest) {
                secondlargest = largest;
                largest = numbers[i];
            } 
            else if (numbers[i] > secondlargest && numbers[i] < largest) {
                secondlargest = numbers[i];
            }
        }
        return secondlargest;
    }
    
    public static void main(String[] args) {
    int numbers[]={1,2,6,10,5};   
    System.out.println("Second largest value is : " + secondLargest(numbers));
    }
}
