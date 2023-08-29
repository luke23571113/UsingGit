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

    public static String readFromFile (String sFilePath) throws IOException
    {

        BufferedReader br = new BufferedReader (new FileReader(sFilePath));
        String s = br.readLine();
        br.close();
        return s;
    }

    public static int characterCount(String sFilePath)
    {
        String sData = readFromFile(sFilePath);
        return sData.length();
    }
}
