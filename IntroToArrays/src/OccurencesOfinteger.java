import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OccurencesOfinteger {
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
            int b = Integer.parseInt(reader.readLine());
            int count = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==b)
                {
                    count++;
                }
            }
            System.out.println("Count of occurences of B: " + count);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
