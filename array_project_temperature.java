package dsa;
import java.util.*;

public class array_project_temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days? Temperature :");
        int numday = sc.nextInt();
        double[] temp = new double[numday];   
        int sum =0;
        for (int i = 0; i < numday; i++) {
            System.out.print("max temperature of "+(i+1)+" day :");
            temp[i] = sc.nextDouble();
            sum+=temp[i];
        }
        double average = sum/numday;
        int next =0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>average)
            {
                next++;
            }
        }
        System.out.println("Average temperature is : "+average);
        System.out.println(next + " days are above the average temperature");
    }
}
