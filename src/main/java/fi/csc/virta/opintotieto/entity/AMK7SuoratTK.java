package fi.csc.virta.opintotieto.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "amk7_suorat_tk")
public class AMK7SuoratTK {

    @EmbeddedId
    private AMK7SuoratTKId id;
    private Integer miehia = 0;
    private Integer naisia = 0;

    public Integer getMiehia() {
        return miehia;
    }

    public void setMiehia(Integer miehia) {
        this.miehia = miehia;
    }

    public Integer getNaisia() {
        return naisia;
    }

    public void setNaisia(Integer naisia) {
        this.naisia = naisia;
    }

    @Transient
    public String getOrganisaatiokoodi() {
        return id.getOrganisaatiokoodi();
    }

    @Transient
    public void setKoulutusala(Integer koulutusala) {
        id.setKoulutusala(koulutusala);
    }

    @Transient
    public Integer getVuosi() {
        return id.getVuosi();
    }

    @Transient
    public void setOrganisaatiokoodi(String organisaatiokoodi) {
        id.setOrganisaatiokoodi(organisaatiokoodi);
    }

    @Transient
    public Integer getKoulutusala() {
        return id.getKoulutusala();
    }

    @Transient
    public void setVuosi(Integer vuosi) {
        id.setVuosi(vuosi);
    }
}
