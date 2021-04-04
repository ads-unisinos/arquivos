package arquivos;

import java.util.Arrays;

public class SeparandoString
{
    private String[] regexResult;

    public String[] split (String text)
    {
        String regex = "--";
        regexResult = text.split(regex);
        return regexResult;
    }

    @Override
    public String toString() {
        return "SeparandoString{" +
                "regexResult=" + Arrays.toString(regexResult) +
                '}';
    }
}
