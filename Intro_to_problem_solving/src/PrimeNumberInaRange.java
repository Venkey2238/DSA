import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberInaRange {
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int PrimeCount =0;
            for(int i=2;i<=n;i++)
            {
                int count = 0;
                for(int j=1;j<=i/j;j++)
                {
                    if(i%j==0)
                    {
                        if(j<i/j)
                        {
                            count += 2;
                        }
                        else if(j==i/j)
                        {
                            count++;
                        }
                    }
                }
                if(count == 2)
                {
                    PrimeCount++;
                }
            }
            System.out.println(PrimeCount);
        }
        catch (IOException e)
        {
            System.out.println("IOException");
        }
    }
}
