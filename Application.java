import model.*;
import service.*;
import dao.*;
import analiza.*;
public class Application {
    public static void main(String[] args) {
        Medic medic1 = new MedicGastroenterolog("Popa", "Marian", "pmarian@gmail.com", "specialist", 123456789, 10, 12000);
        Asistent asistent1 = new Asistent(6000, "Neagu", "Elena", "nelena@gmail.com",123546789);
        Asistent asistent2 = new Asistent(7500, "Cretu", "Daniel", "cdaniel@gmail.com",123549989);
        DaoService repoService = new DaoService();
        repoService.adaugaMedic(medic1);
        repoService.adaugaAsistent(asistent1);
        repoService.adaugaAsistent(asistent2);
        Medic medicObtinut = repoService.getMedicById(medic1.getIdAngajat());
        if (medicObtinut != null) {
            System.out.println("Medic găsit: " + medicObtinut.getNume());
            medicObtinut.adaugaAsistent(asistent1);
            medicObtinut.adaugaAsistent(asistent2);
            System.out.println("Lista de asistenți a medicului:");
            for (Asistent asistent : medicObtinut.getLisaAsistenti()) {
                System.out.println(asistent.getNume());
            }
        } else {
            System.out.println("Medicul nu a fost găsit!");
        }
    }
}