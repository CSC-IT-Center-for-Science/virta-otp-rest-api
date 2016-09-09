package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CIMO_pitka_saapuva")
public class CIMOPitkaSaapuva extends Cimo {

    private String lahtomaa;
    private String kansalaisuus;
    private String liikkuvuusohjelma;

    public String getLahtomaa() {
        return lahtomaa;
    }

    public void setLahtomaa(String lahtomaa) {
        this.lahtomaa = lahtomaa;
    }

    public String getKansalaisuus() {
        return kansalaisuus;
    }

    public void setKansalaisuus(String kansalaisuus) {
        this.kansalaisuus = kansalaisuus;
    }

    public String getLiikkuvuusohjelma() {
        return liikkuvuusohjelma;
    }

    public void setLiikkuvuusohjelma(String liikkuvuusohjelma) {
        this.liikkuvuusohjelma = liikkuvuusohjelma;
    }
}
