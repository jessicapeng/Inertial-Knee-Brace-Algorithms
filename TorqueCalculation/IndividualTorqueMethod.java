
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class IndividualTorqueMethod
{

    public static double findTorque(double tangential) throws IOException
    {
        final double pi = 3.14159265359;
        BufferedReader br = new BufferedReader( new FileReader( "torqueStem.in" ) );
        PrintWriter pw = new PrintWriter(
            new BufferedWriter( new FileWriter( "torqueStem.out" ) ) );

        // information they must enter: length of leg, mass of leg, radius of
        // knee (ish)

        double length = 0.0;
        double radius = 0.0;
        double mass = 0.0;
        for ( int j = 0; j < 3; j++ )
        {
            StringTokenizer st = new StringTokenizer( br.readLine() );
            if ( j == 0 )
            {
                length = Double.parseDouble( br.readLine() );
                System.out.println( "length " + length );
            }
            // int side = Integer.parseInt(st.nextToken());
            else if ( j == 1 )
            {
                // assume mass is in pounds, calculate 10% of pounds and then
                // convert to kilograms
                mass = Double.parseDouble( st.nextToken() );
                System.out.println( "mass1 (weight) " + mass );
                mass = mass * 0.453592;
                System.out
                    .println( "mass2 (10% of weight convert to kg) " + mass );

            }
            else if ( j == 2 )
            {
                radius = Double.parseDouble( st.nextToken() );
                radius = radius / (2*pi);
                System.out.println( "radius " + radius );

            }
        }

        // calculates halfway of leg
        double halfway = length / 2;
        System.out.println( "halfway " + halfway );
         double inertiaCOM = 0.25 * mass * radius * radius
            + (double)( 1 / 12.0 ) * mass * length * length;
        System.out.println( "inertiaCOM " + inertiaCOM );
        double inertia = inertiaCOM + mass * halfway * halfway;
        System.out.println( "mass moment of inertia " + inertia );
            
        // calculate angular velocity
        // change this later
       
        // angular = tangential / radius
        double angular = tangential / radius;

        System.out.println( "angular accleration: " + angular );// recieved this
                                                                // from data
                                                                // from saumya
        double torque = inertia * angular * 15 ;

        pw.println( "torque: " + torque );
        

        pw.close();
        return torque;
      
    }
}
