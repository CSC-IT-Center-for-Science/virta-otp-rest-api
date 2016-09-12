package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Opintopiste_pvm_AMK")
public class OpintopistePvmAMK extends OpintopistePvm {

    private Integer maahanmValKoulutus;
    private String koulutustyyppi = "";
    private Integer tkiToiminnanLaajuus;
    private Integer tkiMuutLaajuus;
    private Integer tkiHarjoittelunLaajuus;

    public Integer getMaahanmValKoulutus() {
        return maahanmValKoulutus;
    }

    public void setMaahanmValKoulutus(Integer maahanmValKoulutus) {
        this.maahanmValKoulutus = maahanmValKoulutus;
    }

    public String getKoulutustyyppi() {
        return koulutustyyppi;
    }

    public void setKoulutustyyppi(String koulutustyyppi) {
        this.koulutustyyppi = koulutustyyppi;
    }

    public Integer getTkiToiminnanLaajuus() {
        return tkiToiminnanLaajuus;
    }

    public void setTkiToiminnanLaajuus(Integer tkiToiminnanLaajuus) {
        this.tkiToiminnanLaajuus = tkiToiminnanLaajuus;
    }

    public Integer getTkiMuutLaajuus() {
        return tkiMuutLaajuus;
    }

    public void setTkiMuutLaajuus(Integer tkiMuutLaajuus) {
        this.tkiMuutLaajuus = tkiMuutLaajuus;
    }

    public Integer getTkiHarjoittelunLaajuus() {
        return tkiHarjoittelunLaajuus;
    }

    public void setTkiHarjoittelunLaajuus(Integer tkiHarjoittelunLaajuus) {
        this.tkiHarjoittelunLaajuus = tkiHarjoittelunLaajuus;
    }

}
