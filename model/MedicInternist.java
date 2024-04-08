package model;

public class MedicInternist extends Medic{
    private static ServiciuPret[] listaServiciiInterne;
    static{
            listaServiciiInterne = new ServiciuPret[3];
            listaServiciiInterne[0] = new ServiciuPret("pretConsultatie",200);
            listaServiciiInterne[1] = new ServiciuPret("pretEcografie",400);
            listaServiciiInterne[2] = new ServiciuPret("pretSetAnalize",1200);
    }
    public MedicInternist(String nume, String prenume, String email, String grad, int numarTelefon, int aniExperienta, int salariu)
    {
        super(nume,prenume,email,grad,numarTelefon,aniExperienta,salariu);
    }
    public void consultPacient(Pacient p)
    {
        System.out.println("Clientul " + p.getNume() + " " + p.getPrenume() + " a fost consultat de medicul internist " + this.getNume() + "!");
        p.adaugaReteta("Pacientul " + p.getNume() + " " + p.getPrenume() + " " + " ,cu CNP-ul " + p.getCnp() + " , primeste tratament cu opioide pentru durerile abdominale severe!");
    }
    public void ecografiePacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat o ecografie abdominala la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void setAnalizePacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat un set de analize la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void afisareListaServiciiInterne()
    {
        if(this.getGrad().equals("specialist")) {
            System.out.println("Servicii medic specialist:");
            for (ServiciuPret i : listaServiciiInterne) {
                System.out.println(i.getServiciuMedical() + " " + i.getPret());
            }
        }
        else{
            System.out.println("Servicii medic primar:");
            for(ServiciuPret i : listaServiciiInterne)
            {
                int aux=i.getPret()+100;
                System.out.println(i.getServiciuMedical() + " " + aux);
            }
        }
    }
}
