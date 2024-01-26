package PS8;

public class search {
    public static void Search(int array[][], int target) {
        int count=0;
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[0].length;j++) { //array[0].length use for columns
                if(array[i][j]==target) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        int array[][]={{4,7,8},{8,8,7}};
        Search(array,7);
    }
}
