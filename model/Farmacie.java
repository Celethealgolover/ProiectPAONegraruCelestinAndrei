package model;
import java.util.List;
import java.util.ArrayList;

public class Farmacie {///clasa de tipul singleton
    private static Farmacie farmacie;
    private List<Farmacist> lf = new ArrayList<>();
    private Farmacie(){}
    public static Farmacie creareFarmacie()
    {
        if(farmacie==null)
        {
            farmacie=new Farmacie();
        }
        return farmacie;
    }
    public List<Farmacist> getListaFarmacisti()
    {
        return lf;
    }
    public void addFarmacist(Farmacist f)
    {
        lf.add(f);
    }
}
