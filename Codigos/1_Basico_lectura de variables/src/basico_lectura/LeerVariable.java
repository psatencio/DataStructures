package basico_lectura;

import java.io.*;
public abstract class LeerVariable
{
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    //M�todo para leer cadenas de texto
    public static String leerTexto(String mensaje)
    {
        String texto = "";
        try
        {
                System.out.print(mensaje);
                texto = br.readLine();
        }
        catch (Exception e)
        {
                System.out.println("Error " + e);
        }
        return texto;
    }

    //M�todo para leer n�meros enteros
    public static int leerEntero(String mensaje)
    {
        int num = 0;
        try
        {
                System.out.print(mensaje);
                num = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
                System.out.println("Error " + e);
        }
        return num;
    }

    //M�todo para leer n�meros reales
    public static double leerReal(String mensaje)
    {
        double num = 0;
        try
        {
                System.out.print(mensaje);
                num = Double.parseDouble(br.readLine());
                //Double d = new Double(br.readLine());
                //num = d.doubleValue();
        }
        catch (Exception e)
        {
                System.out.println("Error " + e);
        }
        return num;
    }

}
