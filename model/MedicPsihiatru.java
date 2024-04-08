package model;

public class MedicPsihiatru extends Medic {
    private static  ServiciuPret[] listaServiciiPsihiatrie;
    static{
        listaServiciiPsihiatrie = new ServiciuPret[2];
        listaServiciiPsihiatrie[0] = new ServiciuPret("pretConsultatie",300);
        listaServiciiPsihiatrie[1] = new ServiciuPret("pretReferatMedical",200);
    }
    public MedicPsihiatru(String nume, String prenume, String email, String grad, int numarTelefon, int aniExperienta,int salariu)
    {
        super(nume,prenume,email,grad,numarTelefon,aniExperienta,salariu);
    }

    public void consultPacient(Pacient p)
    {
        System.out.println("Clientul " + p.getNume() + " " + p.getPrenume() + " a fost consultat de medicul psihiatru " + this.getNume() + "!");
        p.adaugaReteta("Pacientul " + p.getNume() + " " + p.getPrenume() + " " + " ,cu CNP-ul " + p.getCnp() + " , primeste tratament cu benzodiazepine!");
    }
    public void referatMedicalPacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat un referat medical la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void afisareListaServiciiPsihiatrie()
    {
        if(this.getGrad().equals("specialist")) {
            System.out.println("Servicii medic specialist:");
            for (ServiciuPret i : listaServiciiPsihiatrie) {
                System.out.println(i.getServiciuMedical() + " " + i.getPret());
            }
        }
        else{
            System.out.println("Servicii medic primar:");
            for(ServiciuPret i : listaServiciiPsihiatrie)
            {
                int aux=i.getPret()+100;
                System.out.println(i.getServiciuMedical() + " " + aux);
            }
        }
    }
}
