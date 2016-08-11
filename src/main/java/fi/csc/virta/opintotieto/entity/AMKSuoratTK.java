package fi.csc.virta.opintotieto.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class AMKSuoratTK {
    @EmbeddedId
    private AMKSuoratTKId id;
    private Integer miehia = 0;
    private Integer naisia = 0;

    @Transient
    public String getOrganisaatiokoodi() {
        return id.getOrganisaatiokoodi();
    }

    @Transient
    public void setOrganisaatiokoodi(String organisaatiokoodi) {
        id.setOrganisaatiokoodi(organisaatiokoodi);
    }

    @Transient
    public Integer getVuosi() {
        return id.getVuosi();
    }

    @Transient
    public void setVuosi(Integer vuosi) {
        id.setVuosi(vuosi);
    }

    @Transient
    public void setKoulutusala(Integer koulutusala) {
        id.setKoulutusala(koulutusala);
    }

    @Transient
    public Integer getKoulutusala() {
        return id.getKoulutusala();
    }

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
}
