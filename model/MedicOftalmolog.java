package model;

public class MedicOftalmolog extends Medic{
    private static ServiciuPret[] listaServiciiOftalmo;
    static{
            listaServiciiOftalmo = new ServiciuPret[3];
            listaServiciiOftalmo[0] = new ServiciuPret("pretConsultatie",300);
            listaServiciiOftalmo[1] = new ServiciuPret("pretExamenOcular",600);
            listaServiciiOftalmo[2] = new ServiciuPret("pretMasurareTensiuneOculara",400);

    }
    public MedicOftalmolog(String nume, String prenume, String email, String grad, int numarTelefon, int aniExperienta, int salariu)
    {
        super(nume,prenume,email,grad,numarTelefon,aniExperienta, salariu);
    }
    public void consultPacient(Pacient p)
    {
        System.out.println("Clientul " + p.getNume() + " " + p.getPrenume() + " a fost consultat de medicul oftalmolog " + this.getNume() + "!");
        p.adaugaReteta("Pacientul " + p.getNume() + " " + p.getPrenume() + " " + " ,cu CNP-ul " + p.getCnp() + " , primeste tratament pentru tensiune oculara!");
    }
    public void examenOcularPacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat un examen ocular la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void masurareTensiuneOcularaPacient(Pacient p)
    {
        System.out.println("Pacientul " + p.getNume() + " " + p.getPrenume() + " a efectuat o masurare a tensiunii oculare la medicul " + this.getGrad() + " " + this.getNume() + " " + this.getPrenume());
    }
    public void afisareListaServiciiOftalmo()
    {
        if(this.getGrad().equals("specialist")) {
            System.out.println("Servicii medic specialist:");
            for (ServiciuPret i : listaServiciiOftalmo) {
                System.out.println(i.getServiciuMedical() + " " + i.getPret());
            }
        }
        else{
            System.out.println("Servicii medic primar:");
            for(ServiciuPret i : listaServiciiOftalmo)
            {
                int aux=i.getPret()+100;
                System.out.println(i.getServiciuMedical() + " " + aux);
            }
        }
    }
}
