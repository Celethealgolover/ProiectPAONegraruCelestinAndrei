package model;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDateTime;
public abstract class Medic extends Angajat {
     private  List<Asistent> la= new ArrayList();///relatie de tip agregare, "weak"
     private Map<LocalDateTime, Pacient> programari = new TreeMap<>();
     private String nume, prenume, email, grad;///gradul poate fi medic specialist sau primar
     private int  numarTelefon, aniExperienta, idMedic;///numarul de telefon este considerat ca incepe cu prefixul +40

    public Medic(String nume, String prenume, String email, String grad, int numarTelefon, int aniExperienta, int salariu) {
        super(salariu);
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.grad = grad;
        this.numarTelefon = numarTelefon;
        this.aniExperienta = aniExperienta;
        idMedic=getIdAngajat();
    }

    public  int getId() {
        return idMedic ;
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

    public String getGrad() {
        return grad;
    }

    public int getNumarTelefon() {
        return numarTelefon;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void setNumarTelefon(int numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }
    public  void adaugaAsistent(Asistent a)
    {
       la.add(a);
    }
    public  void eliminaAsistent(Asistent a)
    {
        la.remove(a);
    }
    public List<Asistent> getLisaAsistenti()
    {
        return this.la;
    }
    public abstract void consultPacient(Pacient p);
}
