import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArrayToRight {
    public static int[] reverse(int[] a, int b, int c)
    {
        while(b<c)
        {
            int temp = a[b];
            a[b] = a[c];
            a[c] = temp;
            b++;
            c--;
        }
        return a;
    }
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
            b = b%n;
            reverse(arr,0, n-1);
            reverse(arr, 0, b-1);
            reverse(arr, b, n-1);
            System.out.println(Arrays.toString(arr));
        }
        catch (IOException e)
        {
            System.out.println("IOException ");
        }
    }
}
