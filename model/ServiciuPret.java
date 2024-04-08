package model;
public class ServiciuPret {
    private String serviciuMedical;
    private int pret;
    public ServiciuPret(String serviciuMedical, int pret) {
        this.serviciuMedical = serviciuMedical;
        this.pret = pret;
    }

    public String getServiciuMedical() {
        return serviciuMedical;
    }

    public int getPret() {
        return pret;
    }

    public void setServiciuMedical(String serviciuMedical) {
        this.serviciuMedical = serviciuMedical;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
