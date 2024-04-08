package analiza;

public class AnalizaRetetaNormala implements AnalizaReteta{
    public boolean validareReteta(String reteta)
    {
        String regexRetetaSimpla=".*\\bPacientul\\b.*\\b[1256]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(0[1-9]|[1-4][0-9]|5[012])\\d{3}[0-9]\\b.*\\bprimeste tratament\\b";
        return reteta.matches(regexRetetaSimpla);
    }
}
