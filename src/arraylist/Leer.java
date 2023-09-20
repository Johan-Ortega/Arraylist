package arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {
    public static String dato () 
   { 
      String x = ""; 
      try
      { 
         InputStreamReader isr = new InputStreamReader (System.in); 
         BufferedReader in = new BufferedReader (isr); 
         x = in.readLine (); 
      } 
      catch (IOException e) 
      { 
         System.err.print ("Error: " + e.getMessage ()); 
      } 
      return x; 
   } 
   public static short datoShort()
   {
        try 
        {
            return Short.parseShort(dato());
        }
        catch (NumberFormatException e)
        {
            return Short.MIN_VALUE;
        }
    }
   public static int datoInt () 
   { 
      try
      { 
         return Integer.parseInt (dato ()); 
      } 
      catch (NumberFormatException e) 
      { 
         return 0; 
      } 
   } 
   public static float datoLong () 
   { 
      try
      { 
         return Long.parseLong (dato ()); 
      } 
      catch (NumberFormatException e) 
      { 
         return 0l; 
      } 
   } 
   public static float datoFloat () 
   { 
      try
      { 
         return (new Float (dato ())).floatValue (); 
      } 
      catch (NumberFormatException e) 
      { 
         return Float.NaN; 
      } 
   } 
   public static double datoDouble () 
   { 
      try
      { 
         return (new Double (dato ())).doubleValue (); 
      } 
      catch (Exception e) 
      { 
         return Double.NaN; 
      } 
   }

   public static String datoString () 
   { 
    
      return(dato());
   }
}
