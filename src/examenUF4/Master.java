package examenUF4;

import java.util.ArrayList;

public class Master {

    private String idMaster;
    private String nom;
    private Double preuMaster;

    private ArrayList <String> llistaModuls = new ArrayList<>();
    // private ArrayList <Modul> llistaModuls = new ArrayList<>();


    public Master(String idMaster, String nom, Double preuMaster, ArrayList <String> llistaModuls) {
        this.idMaster = idMaster;
        this.nom = nom;
        this.preuMaster = preuMaster;
        this.llistaModuls = llistaModuls;

    }

    public String getIdMaster() {
        return idMaster;
    }

    public void setIdMaster(String idMaster) {
        this.idMaster = idMaster;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPreuMaster() {
        return preuMaster;
    }

    public void setPreuMaster(Double preuMaster) {
        this.preuMaster = preuMaster;
    }

    // Falten mètodes que omplin LlistaModuls segon idMaster.




}
