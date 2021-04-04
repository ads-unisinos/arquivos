package arquivos;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/* a classe File utilizada para obter informações de arquivo e de diretório
 */
public class FileDemonstration
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file or directory name: ");
        analyzePath( input.nextLine());
    }

    private static String getLastModification ( File file)
    {
        DateFormat df = new SimpleDateFormat( "dd/MM/aaaa");
        return df.format(
                    new Date( file.lastModified() )
                );
    }

    private static void analyzePath(String path)
    {
        File file = new File( path );

        if( file.exists())
        {
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    file.getName(), "Existis",
                    (file.isFile()) ? "is a file" : "is not a file",
                    file.isDirectory() ? "is a directory" : "is not a directory",
                    file.isAbsolute() ? "is absolute path" : "is not absolute path",
                    "Last modified: ", getLastModification(file),
                    "Length: ", file.length(),
                    "Path: ", file.getPath(),
                    "Absolute path: ", file.getAbsolutePath(),
                    "Parent: ", file.getParent()
            );

            if( file.isDirectory())
            {
                String[] directory = file.list();
                System.out.println("\n\nDirectory contents:\n");

                if (directory != null)
                {
                    for ( String directoryName : directory) {
                        if (!directoryName.endsWith(".txt"))
                        {
                            System.out.println(directoryName);
                        }
                    }
                }

            }

        }
        else{
            System.out.printf("%s %s" , path, "does not exist");
        }


    }
}
