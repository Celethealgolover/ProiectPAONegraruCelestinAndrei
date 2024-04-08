package model;

import java.util.ArrayList;
import java.util.List;

public class MedicGastroenterolog extends Medic{
    private static  ServiciuPret[] listaServiciiGastro;
    static{
        listaServiciiGastro = new ServiciuPret[4];
        listaServiciiGastro[0] = new ServiciuPret("pretConsultatie",200);
        listaServiciiGastro[1] = new ServiciuPret("pretEcografie",300);
        listaServiciiGastro[2] = new ServiciuPret("pretEndoscopie",350);
        listaServiciiGastro[3] = new ServiciuPret("pretColonoscopie",500);
    }
    public MedicGastroenterolog(String nume, String prenume, String email, String grad, int numarTelefon, int aniExperienta,int salariu)
    {
        super(nume,prenume,email,grad,numarTelefon,aniExperienta,salariu);
    }

    public void consultPacient(Pacient p)
    {
        System.out.println("Clientul " + p.getNume() + " " + p.getPrenume() + " a fost consultat de medicul gastroenterolor " + this.getNume() + "!");
        p.adaugaReteta("Pacientul " + p.getNume() + " " + p.getPrenume() + " " + " ,cu CNP-ul " + p.getCnp() + " , primeste tratament pentru balonare!");
    }
    public void ecografiePacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat o ecografie abdominala la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void endoscopiePacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat o endoscopie digestiva la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void colonoscopiePacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat o colonoscopie la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public  void afisareListaServiciiGastro()
    {
        if(this.getGrad().equals("specialist")) {
            System.out.println("Servicii medic specialist:");
            for (ServiciuPret i : listaServiciiGastro) {
                System.out.println(i.getServiciuMedical() + " " + i.getPret());
            }
        }
        else{
            System.out.println("Servicii medic primar:");
            for(ServiciuPret i : listaServiciiGastro)
            {
                int aux=i.getPret()+100;
                System.out.println(i.getServiciuMedical() + " " + aux);
            }
        }
    }

}
