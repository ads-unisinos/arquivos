package arquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerTextoDigitadoConsole
{
    private static final InputStream in = System.in;
    private static final InputStreamReader is = new InputStreamReader(in);
    private static final BufferedReader console = new BufferedReader(is);

    public static void readfromConsole ()
    {
        String time = null;
        try {
            time = console.readLine();
        } catch (IOException e)
        {
            time = "<" + e + ">";
        }

        if ( time.contains("inter"))
        {
            System.out.println("Time invalido");
        }
        else{
            System.out.println("Seu time é: " + time);
        }
    }

}
