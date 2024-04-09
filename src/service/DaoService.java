package src.service;


import src.model.*;
import src.dao.MedicDao;
import src.dao.AsistentDao;
import src.dao.FarmacistDao;

public class DaoService {
    private MedicDao medicDAO;
    private AsistentDao asistentDAO;
    private FarmacistDao farmacistDAO;

    public DaoService() {
        medicDAO = new MedicDao();
        asistentDAO = new AsistentDao();
        farmacistDAO = new FarmacistDao();
    }

    // Metode specifice pentru medici
    public void adaugaMedic(Medic medic) {
        medicDAO.adaugaMedic(medic);
    }

    public Medic getMedicById(int idMedic) {
        return medicDAO.getMedicById(idMedic);
    }

    public void actualizeazaMedic(Medic medicActualizat) {
        medicDAO.actualizeazaMedic(medicActualizat);
    }

    public void stergeMedic(int idMedic) {
        medicDAO.stergeMedic(idMedic);
    }

    // Metode specifice pentru asistenti
    public void adaugaAsistent(Asistent asistent) {
        asistentDAO.adaugaAsistent(asistent);
    }

    public Asistent getAsistentById(int idAsistent) {
        return asistentDAO.getAsistentById(idAsistent);
    }

    public void actualizeazaAsistent(Asistent asistentActualizat) {
        asistentDAO.actualizeazaAsistent(asistentActualizat);
    }

    public void stergeAsistent(int idAsistent) {
        asistentDAO.stergeAsistent(idAsistent);
    }

    // Metode specifice pentru farmacisti
    public void adaugaFarmacist(Farmacist farmacist) {
        farmacistDAO.adaugaFarmacist(farmacist);
    }

    public Farmacist getFarmacistById(int idFarmacist) {
        return farmacistDAO.getFarmacistById(idFarmacist);
    }

    public void actualizeazaFarmacist(Farmacist farmacistActualizat) {
        farmacistDAO.actualizeazaFarmacist(farmacistActualizat);
    }

    public void stergeFarmacist(int idFarmacist) {
        farmacistDAO.stergeFarmacist(idFarmacist);
    }
}
