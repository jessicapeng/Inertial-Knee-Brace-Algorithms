import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class ReadingFiles
{

    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
            new FileReader( "readingfiles.in" ) );
        PrintWriter pw = new PrintWriter(
            new BufferedWriter( new FileWriter( "readingfiles.out" ) ) );

        // read # of entries of matrix
        int n = Integer.parseInt( br.readLine() );
        System.out.println( "The number of entries is: " + n );
        System.out.println( Double.parseDouble( "hi" ) );

        double[] compArray = new double[n];

        for ( int i = 0; i < n; i++ )
        {
            StringTokenizer st = new StringTokenizer( br.readLine() );
            double num = Double.parseDouble( st.nextToken() );
            // System.out.println( num );
            compArray[i] = num;
        }

        double maxDiff = -1000;
        double diff = 0;
        int index = 0;
        double value = 0;
        for ( int j = 1; j < n; j++ )
        {
            diff = Math.abs( compArray[0] - compArray[j] ); 
           // System.out.println( diff + " " + maxDiff );
            if ( diff > maxDiff )
            {
                maxDiff = diff;
                index = j;
                value = compArray[j];

            }
        }
        System.out.println( "The maxDiff is " + maxDiff + " and the index is "
            + index + " and the value at the index is " + value );
        
        pw.close();
    }
}