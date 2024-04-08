package analiza;

public class AnalizaRetetaPsihoactive implements AnalizaReteta{
    public boolean validareReteta(String reteta) {
        String regexRetetaSpeciala=".*\\bPacientul\\b.*\\b[1256]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(0[1-9]|[1-4][0-9]|5[012])\\d{3}[0-9]\\b.*\\bprimeste tratament\\b.*(?:\\b(?:benzodiazepine|opioide)\\b).*";
        return reteta.matches(regexRetetaSpeciala);
    }
}
