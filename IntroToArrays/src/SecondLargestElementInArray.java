import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println(Arrays.toString(arr));
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(max<arr[i])
                {
                    max = arr[i];
                }
            }
            System.out.println("Max element : " + max);
            int secondMax = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(secondMax<arr[i] && arr[i]!=max)
                {
                    secondMax = arr[i];
                }
            }
            System.out.println("Second max element is : " + secondMax);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
