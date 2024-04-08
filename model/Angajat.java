package model;

public class Angajat {
    private static int id_angajat=0;
    private int salariu;
    public Angajat(int salariu)///de fiecare data cand se insereaza un nou angajat, fie el medic, farmacist, asistent sau receptioner m id ul se va incrementa automat, garantandu se unicitatea
    {
        id_angajat++;
        this.salariu=salariu;
    }
    public static int getIdAngajat()
    {
        return id_angajat;
    }
    public int getSalariu()
    {
        return this.salariu;
    }
}
