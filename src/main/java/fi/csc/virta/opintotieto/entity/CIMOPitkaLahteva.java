package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CIMO_pitka_lahteva")
public class CIMOPitkaLahteva extends Cimo {

    private String kohdemaa;
    private String liikkuvuusohjelma;

    public String getKohdemaa() {
        return kohdemaa;
    }

    public void setKohdemaa(String kohdemaa) {
        this.kohdemaa = kohdemaa;
    }

    public String getLiikkuvuusohjelma() {
        return liikkuvuusohjelma;
    }

    public void setLiikkuvuusohjelma(String liikkuvuusohjelma) {
        this.liikkuvuusohjelma = liikkuvuusohjelma;
    }
}
