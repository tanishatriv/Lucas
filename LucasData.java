import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class LucasData
{
	public static void main(String[] args)
	{
		File name = new File("Lucas.txt");
		ArrayList<String> numbers = new ArrayList<String>();
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(name));
			String text,output="";
			while((text=input.readLine())!= null)
			{
				numbers.add(text);
			}
			ArrayList<Integer> integers = new ArrayList<Integer>();
			for(int i = 0; i < numbers.size(); i++)
			{
				String s = numbers.get(i);
				int str = Integer.valueOf(s);
				integers.add(str);
			}

			for(int i = 0; i < integers.size(); i++)
			{
				System.out.println(lucas(integers.get(i)));
			}
		}
		catch (IOException io)
		{
			System.err.println("Error reading file => "+io);
		}

	}

	public static BigInteger lucas(int n)
	{
		BigInteger a = new BigInteger("2");
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ZERO;
		if (n == 0)
            return a;
		for (int i = 2; i <= n; i++)
		{
			c = a.add(b);
		    a = b;
		   	b = c;
        }
        return b;
    }
}



