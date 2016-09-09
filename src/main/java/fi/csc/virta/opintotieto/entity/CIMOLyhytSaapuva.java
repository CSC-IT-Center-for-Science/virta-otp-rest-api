package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CIMO_lyhyt_saapuva")
public class CIMOLyhytSaapuva extends Cimo {

    private String lahtomaa;

    public String getLahtomaa() {
        return lahtomaa;
    }

    public void setLahtomaa(String lahtomaa) {
        this.lahtomaa = lahtomaa;
    }
}
