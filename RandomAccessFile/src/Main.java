import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        var in = new RandomAccessFile("wyniki.txt", "rw");
        long nbytes = in.length();
        System.out.println(nbytes);
    }
}