package dao;
import model.Medic;
import java.util.ArrayList;
import java.util.List;
public class MedicDao {

        private List<Medic> listaMedici;

        public MedicDao() {
            listaMedici = new ArrayList<>();
        }

        public void adaugaMedic(Medic medic) {
            listaMedici.add(medic);
        }

        public List<Medic> getListaMedici() {
            return listaMedici;
        }

        public Medic getMedicById(int idMedic) {
            for (Medic medic : listaMedici) {
                if (medic.getId() == idMedic) {
                    return medic;
                }
            }
            return null; // returnează null dacă nu găsește niciun medic cu id-ul dat
        }

        public void actualizeazaMedic(Medic medicActualizat) {
            for (int i = 0; i < listaMedici.size(); i++) {
                if (listaMedici.get(i).getId() == medicActualizat.getId()) {
                    listaMedici.set(i, medicActualizat);
                    break;
                }
            }
        }

        public void stergeMedic(int idMedic) {
            for (int i = 0; i < listaMedici.size(); i++) {
                if (listaMedici.get(i).getId() == idMedic) {
                    listaMedici.remove(i);
                    break;
                }
            }
        }
    }
