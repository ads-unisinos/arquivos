package arquivos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
//	    SeparandoString separandoString = new SeparandoString();
//	    String text = "Gremio--e--o--melhor--time--!!";
//	    String[] texts = separandoString.split(text);
//        System.out.println(separandoString);
//
//        System.out.println("Qual é o seu time?\nResp.: ");
//        LerTextoDigitadoConsole.readfromConsole();

        String pathname = "D:\\prog2\\teste.txt";
        PropriedadeDeArquivos pa = new PropriedadeDeArquivos(pathname);

        System.out.println("Nome do arquivo: "+ pa.fileName());
        System.out.println("Caminho: "+ pa.path());
        System.out.println("Caminho absoluto: "+ pa.absolutePath());
        System.out.println("Diretório pai: "+ pa.parentDirectory());
        System.out.println("Arquivo existe: "+ pa.isFileExists());
        System.out.println("É de escrita?: "+ pa.isFileWritable());
        System.out.println("É de leitura: "+ pa.isFileReadable());
        System.out.println("É diretorio?: "+ pa.isDirectory());
        System.out.println("Última modificação do arquivo: "+ pa.getLastModification());
        System.out.println("Tamanho do arquivo: "+ pa.fileLength() + " bytes.");

    }
}
