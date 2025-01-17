import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfMaxAndMin {
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
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }
            sum = max + min;
            System.out.println("sum : " + sum);
        }
        catch(IOException e)
        {
            System.out.println("IOException e");
        }
    }
}
