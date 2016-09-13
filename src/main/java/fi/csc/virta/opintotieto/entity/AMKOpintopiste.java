package fi.csc.virta.opintotieto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Amk_Opintopiste")
public class AMKOpintopiste extends Opintopiste {

    private String koulutustyyppi = "";
    private Double tkiToiminnanLaajuus;
    private Double tkiMuutLaajuus;
    private Double tkiHarjoittelunLaajuus;
    @Column(name = "MValko")
    private Double mValKo;

    public Double getTkiToiminnanLaajuus() {
        return tkiToiminnanLaajuus;
    }

    public void setTkiToiminnanLaajuus(Double tkiToiminnanLaajuus) {
        this.tkiToiminnanLaajuus = tkiToiminnanLaajuus;
    }

    public Double getTkiMuutLaajuus() {
        return tkiMuutLaajuus;
    }

    public void setTkiMuutLaajuus(Double tkiMuutLaajuus) {
        this.tkiMuutLaajuus = tkiMuutLaajuus;
    }

    public Double getTkiHarjoittelunLaajuus() {
        return tkiHarjoittelunLaajuus;
    }

    public void setTkiHarjoittelunLaajuus(Double tkiHarjoittelunLaajuus) {
        this.tkiHarjoittelunLaajuus = tkiHarjoittelunLaajuus;
    }

    public Double getmValKo() {
        return mValKo;
    }

    public void setmValKo(Double mValKo) {
        this.mValKo = mValKo;
    }

    public String getKoulutustyyppi() {
        return koulutustyyppi;
    }

    public void setKoulutustyyppi(String koulutustyyppi) {
        this.koulutustyyppi = koulutustyyppi;
    }
}
