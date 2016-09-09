package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CIMO_lyhyt_lahteva")
public class CIMOLyhytLahteva extends Cimo {

    private String kohdemaa;

    public String getKohdemaa() {
        return kohdemaa;
    }

    public void setKohdemaa(String kohdemaa) {
        this.kohdemaa = kohdemaa;
    }
}
