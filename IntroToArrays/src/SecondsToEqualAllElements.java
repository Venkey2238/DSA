import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondsToEqualAllElements {
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
            int count = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(max<arr[i])
                {
                    max = arr[i];
                }
            }
            int sec = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=max)
                {
                    sec += max - arr[i];
                }
            }
            System.out.println("Seconds to coverts all elements equal : "+sec);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
