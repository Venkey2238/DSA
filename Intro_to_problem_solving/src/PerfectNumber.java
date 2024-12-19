import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int sum = 0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum += i;
                }
            }
            if(sum == n)
            {
                System.out.println("it is a perfect number");
            }
            else
            {
                System.out.println("It is not a perfect number");
            }
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
