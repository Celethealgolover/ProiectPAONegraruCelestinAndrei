package model;
import analiza.*;
public class Farmacist extends Angajat{
    private String nume, prenume, email;
    private int nrTelefon, aniExperienta;

    public Farmacist(int salariu, String nume, String prenume, String email, int nrTelefon, int aniExperienta) {
        super(salariu);
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.nrTelefon = nrTelefon;
        this.aniExperienta = aniExperienta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getEmail() {
        return email;
    }

    public int getNrTelefon() {
        return nrTelefon;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNrTelefon(int nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }
    public boolean valideazaRetetaClientului(Pacient p, AnalizaReteta a)
    {
        return a.validareReteta(p.getUltimaReteta());
    }
}
