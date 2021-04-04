package arquivos.data;

import java.io.*;

public class Lendo
{
    private final String fileName ;

    public Lendo(String fileName)
    {
        this.fileName = fileName;
    }

    public void readFile () {

        try {

            FileReader fr = new FileReader(fileName);
            BufferedReader in = new BufferedReader(fr);

            String line = in.readLine();

            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("Arquivo " + fileName + " não existe. ");
        } catch (IOException e)
        {
            System.out.println("Erro na leitura de " + fileName+ ".");
            e.printStackTrace();
        }

    }

}
