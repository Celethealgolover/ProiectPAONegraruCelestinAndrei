package dao;

import model.Pacient;
import java.util.ArrayList;
import java.util.List;

public class PacientDao {
    private List<Pacient> listaPacienti;

    public PacientDao() {
        listaPacienti = new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    public List<Pacient> getListaPacienti() {
        return listaPacienti;
    }

    public Pacient getPacientByCNP(long cnp) {
        for (Pacient pacient : listaPacienti) {
            if (pacient.getCnp() == cnp) {
                return pacient;
            }
        }
        return null; // returnează null dacă nu găsește niciun pacient cu CNP-ul dat
    }

    public void actualizeazaPacient(Pacient pacientActualizat) {
        for (int i = 0; i < listaPacienti.size(); i++) {
            if (listaPacienti.get(i).getCnp() == pacientActualizat.getCnp()) {
                listaPacienti.set(i, pacientActualizat);
                break;
            }
        }
    }

    public void stergePacient(long cnp) {
        for (int i = 0; i < listaPacienti.size(); i++) {
            if (listaPacienti.get(i).getCnp() == cnp) {
                listaPacienti.remove(i);
                break;
            }
        }
    }
}