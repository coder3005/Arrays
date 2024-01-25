package Arrays;
import java.util.*;

public class inputoutput {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner r=new Scanner(System.in);
        marks[0]=r.nextInt();
        marks[1]=r.nextInt();
        marks[2]=r.nextInt();
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);
        marks[2]=100;
        marks[1]=marks[1]+1;
        System.out.println("maths : " + marks[2]);
        System.out.println("chem : " + marks[1]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = " + percentage + "%");
        System.out.println("length of array = " + marks.length);
        r.close();
    }
}
