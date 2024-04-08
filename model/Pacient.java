package model;

import java.util.ArrayList;
import java.util.List;

public class Pacient {
    private String nume, prenume;
    private long cnp;
    private List<String> listaRetete = new ArrayList<>();

    public Pacient(String nume, String prenume, long cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public long getCnp() {
        return cnp;
    }
    public void adaugaReteta(String reteta)
    {
        listaRetete.add(reteta);
    }
    public String getUltimaReteta()
    {
        return listaRetete.get(listaRetete.size()-1);
    }
}
