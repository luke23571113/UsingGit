import java.util.*;
import java.io.*;

public class IO 
{
    public static void writeToFile (String s) throws IOException
    {
        String fileName = "out.txt";

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        pw.print(s);
        pw.close();
    }

    public static String readFromFile () throws IOException
    {
        String fileName = "in.txt";

        BufferedReader br = new BufferedReader (new FileReader(fileName));
        String s = br.readLine();
        br.close();
        return s;
    }
}