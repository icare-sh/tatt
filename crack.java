// affiche hello world en java
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.math.BigInteger;

// import random
import java.util.Random;
public class crack {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BigInteger p, B,g, key,A;
       
        p =  new BigInteger("72549841864194078899726837116892585496955575260843302046062234899404431414511");
        B = new BigInteger("67719364237964147928448271440910028696447582883369228814004216914317779605772");
        g = new BigInteger("58759714624708089702199189818787533437405834872094654299502596364496752316901");
        A = new BigInteger("71559523660568269188776671270040587101782920281998883402616283230525149718057");
        for (int i = 0; i < 1000000000; i++) {
            GregorianCalendar gc1 = new GregorianCalendar(2015,11,13,14,40,22);
            long l1=gc1.getTimeInMillis();
            gc1.setTimeZone(TimeZone.getTimeZone("GMT"));
            l1 = l1 + i;
            gc1.setTimeInMillis(l1);
            BigInteger rand = new BigInteger(256, new Random(l1));
            BigInteger check = g.modPow(rand, p);
            if (check.equals(B)) {
                System.out.println(" ");
                System.out.println("/*************************************/");
                System.out.println("Found it");
                System.out.println("Random number: " + rand);
                System.out.println("Seed: " + l1);
                System.out.println(gc1.getTime());
                System.out.println("/*************************************/");
                System.out.println(" ");

                key = A.modPow(rand, p);

                System.out.println("Key: " + key.toString());
                break;
            }
            else if (i % 10000 == 0) {
                System.out.println("Not found yet");
                System.out.println("Seed: " + l1);
            }
        
        }

        
        
    }
}