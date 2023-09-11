
import java.util.*;
public class ArrayPractice{
    public static void main(String[] args) {


        int arr1[] = new int[20];//give it length
        int arr2[] = {1,6,0,4,5,7,5,4,9,2};//or initialise
        int arr3[] = {1,6,0,4,5,7,5,4,9,2};//with an inserted new value
       


        String S = "hello";//array of characters appended by null

        String arrS1[] = new String[5];
        String arrS2[] = {"One", "Two", "Three"};
        Person P[] = new Person[5];
        
      //  System.out.println("Sorted"); 
        for (int i = 0; i < P.length; i++) {
               P[i] = new Person();
               System.out.println(P[i]);
                }
        
     //SumAvg(arr2);
    // int[] IncArray = Increment(arr2);
   // SqCu(arr2);

    }

    //method to add all elements of an array and cal their average

    public static void SumAvg(int arr[])
    {
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("sum = " + sum +" Average =" + sum/arr.length);
    }
   
public static int[] Increment(int arr[])
{ 
    for(int i = 0; i<arr.length;i++)
    {
        arr[i] = arr[i]+1;//++ doesnt work for integer arrays
        System.out.println(i + " = " + arr[i]);
    }

    return arr;
}

public static void SqCu(int arr[])
{
    int squar[] = new int[arr.length];
    int cube[] = new int[arr.length];
    for(int i = 0; i<arr.length;i++)
    {
        squar[i] = arr[i]*arr[i];
        cube[i] = arr[i]*arr[i]*arr[i];
        System.out.println(arr[i]+"\t\t"+squar[i]+"\t\t"+cube[i]);
    }


}

}