package arquivos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
	    SeparandoString separandoString = new SeparandoString();
	    String text = "Gremio--e--o--melhor--time--!!";
	    String[] texts = separandoString.split(text);
        System.out.println(separandoString);

        System.out.println("Qual é o seu time?\nResp.: ");
        LerTextoDigitadoConsole.readfromConsole();
    }
}
