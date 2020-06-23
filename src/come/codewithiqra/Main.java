package come.codewithiqra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	int a[] = {
	        9,5,7,4,2,6,3,8,1};
        System.out.println("Odd Numbers:");

        for (int i =0; i<a.length; i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }

        }

        System.out.println("Even Number");
        for (int i = 0; i<a.length; i++)
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
    }

}
