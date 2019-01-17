import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class PrintAllTorques
{
  


    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
            new FileReader( "torqueTestread.in" ) );
        PrintWriter pw = new PrintWriter(
            new BufferedWriter( new FileWriter( "torqueTestread.out" ) ) );

        // read # of entries of matrix
        int n = Integer.parseInt( br.readLine() ) - 1;
        System.out.println( "The number of entries is: " + n );

        double[] XArray = new double[n];
        double[] YArray = new double[n];
        double[] ZArray = new double[n];
        double [] torqueArray = new double [n];

        //read in first one to compare with others
        StringTokenizer st = new StringTokenizer( br.readLine() );
        double x1 = Double.parseDouble( st.nextToken() );
        double y1 = Double.parseDouble( st.nextToken() );
        double z1 = Double.parseDouble( st.nextToken() );
        XArray[0] = x1;
        YArray[0] = y1;
        ZArray[0] = z1;
        torqueArray[0] = 0; torqueArray[1] = 0; torqueArray[2] = 0;
        
        for ( int i = 1; i < n; i++ )
        {
            StringTokenizer stLoop = new StringTokenizer( br.readLine() );
            double x = Double.parseDouble( stLoop.nextToken() );
            double y = Double.parseDouble( stLoop.nextToken() );
            double z = Double.parseDouble( stLoop.nextToken() );
            XArray[i] = x;
            YArray[i] = y;
            ZArray[i] = z;
            double xDiff = Math.abs( XArray[0] - XArray[i]);
            double yDiff = Math.abs( YArray[0] - YArray[i]);
            double zDiff = Math.abs( ZArray[0] - ZArray[i]);
            double tangential = Math.sqrt( xDiff / 9.80665 * xDiff / 9.80665
               
                + zDiff / 9.80665 * zDiff / 9.80665 );
            torqueArray[i] = IndividualTorqueMethod.findTorque(tangential) * n/150;
            
        }

     for(int i = 0; i < n; i++)
     {
         pw.println(torqueArray[i]);
         System.err.println( torqueArray[i] );
     }

        
        pw.close();
       
    }
}