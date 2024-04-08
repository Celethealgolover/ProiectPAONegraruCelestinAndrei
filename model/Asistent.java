package model;

public class Asistent extends Angajat{
    private String nume, prenume, email;
    private int nr_telefon, id_asistent;

    public Asistent(int salariu, String nume, String prenume, String email, int nr_telefon) {
        super(salariu);
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.nr_telefon = nr_telefon;
        id_asistent=getIdAngajat();
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

    public int getNr_telefon() {
        return nr_telefon;
    }

    public int getId_asistent() {
        return id_asistent;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNr_telefon(int nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    public void setId_asistent(int id_asistent) {
        this.id_asistent = id_asistent;
    }
}
