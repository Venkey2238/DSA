import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneElementGreaterThanItself {
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
            int count = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<max)
                {
                    count++;
                }
            }
            System.out.println("count of atleast one element greater than itself :" + count);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
