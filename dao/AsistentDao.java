package dao;
import model.Asistent;
import java.util.ArrayList;
import java.util.List;

public class AsistentDao {
    private List<Asistent> listaAsistenti;

    public AsistentDao() {
        listaAsistenti = new ArrayList<>();
    }

    public void adaugaAsistent(Asistent asistent) {
        listaAsistenti.add(asistent);
    }

    public List<Asistent> getListaAsistenti() {
        return listaAsistenti;
    }

    public Asistent getAsistentById(int idAsistent) {
        for (Asistent asistent : listaAsistenti) {
            if (asistent.getId_asistent() == idAsistent) {
                return asistent;
            }
        }
        return null; // returnează null dacă nu găsește niciun asistent cu id-ul dat
    }

    public void actualizeazaAsistent(Asistent asistentActualizat) {
        for (int i = 0; i < listaAsistenti.size(); i++) {
            if (listaAsistenti.get(i).getId_asistent() == asistentActualizat.getId_asistent()) {
                listaAsistenti.set(i, asistentActualizat);
                break;
            }
        }
    }

    public void stergeAsistent(int idAsistent) {
        for (int i = 0; i < listaAsistenti.size(); i++) {
            if (listaAsistenti.get(i).getId_asistent() == idAsistent) {
                listaAsistenti.remove(i);
                break;
            }
        }
    }
}