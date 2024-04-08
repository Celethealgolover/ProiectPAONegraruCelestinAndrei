package dao;

import model.Farmacist;
import java.util.ArrayList;
import java.util.List;

public class FarmacistDao {
    private List<Farmacist> listaFarmacisti;

    public FarmacistDao() {
        listaFarmacisti = new ArrayList<>();
    }

    public void adaugaFarmacist(Farmacist farmacist) {
        listaFarmacisti.add(farmacist);
    }

    public List<Farmacist> getListaFarmacisti() {
        return listaFarmacisti;
    }

    public Farmacist getFarmacistById(int idFarmacist) {
        for (Farmacist farmacist : listaFarmacisti) {
            if (farmacist.getIdAngajat() == idFarmacist) {
                return farmacist;
            }
        }
        return null; // returnează null dacă nu găsește niciun farmacist cu id-ul dat
    }

    public void actualizeazaFarmacist(Farmacist farmacistActualizat) {
        for (int i = 0; i < listaFarmacisti.size(); i++) {
            if (listaFarmacisti.get(i).getIdAngajat() == farmacistActualizat.getIdAngajat()) {
                listaFarmacisti.set(i, farmacistActualizat);
                break;
            }
        }
    }

    public void stergeFarmacist(int idFarmacist) {
        for (int i = 0; i < listaFarmacisti.size(); i++) {
            if (listaFarmacisti.get(i).getIdAngajat() == idFarmacist) {
                listaFarmacisti.remove(i);
                break;
            }
        }
    }
}