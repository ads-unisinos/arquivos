package arquivos;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PropriedadeDeArquivos
{
    private final File file;

    public PropriedadeDeArquivos( String pathname)
    {
        this.file = new File(pathname);
    }

    public String fileName () { return file.getName(); }

    public String path () { return file.getPath();}

    public String absolutePath () { return file.getAbsolutePath() ;}

    public String parentDirectory () { return file.getParent(); }

    public String isFileExists () { return file.exists() ? "exist" : "not exist"; }

    public String isFileWritable () { return file.canWrite() ? "can write it" : "can not write it"; }

    public String isDirectory () { return file.isDirectory() ? "is directory" : "is not a directory"; }

    public long fileLength () { return file.length(); }

    public String getLastModification ()
    {
        String pattern = "dd/MM/aaaa";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = new Date(file.lastModified());

        return dateFormat.format(date);
    }

    public String isFileReadable() { return file.canRead() ? "can be read" : "can not be read"; }
}
