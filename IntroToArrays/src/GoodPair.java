import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodPair {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int b = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];
            int count = 0;
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(i!=j && arr[i]+arr[j]==b)
                    {
                        count ++;
                    }
                }
            }
            if(count > 0)
            {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
