package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tk_opisk_amk")
public class TKOpiskAMK extends TKOpisk {

    private String aikieli;
    private String askunta;
    private String kansal;
    private String kiel;
    private String kirtu1pv;
    private String kirtupv;
    private String koultyp;
    private String laajuus;
    private String lasnalk;
    private String lastu;
    private Date oikeusAlkamispaivamaara;
    private Date oikeusPaattymispaivamaara;
    private Date oikeusSiirtopaivamaara;
    private String poissalk;
    private String rahlahde;
    private String tunn;

    public String getAikieli() {
        return aikieli;
    }

    public void setAikieli(String aikieli) {
        this.aikieli = aikieli;
    }

    public String getAskunta() {
        return askunta;
    }

    public void setAskunta(String askunta) {
        this.askunta = askunta;
    }

    public String getKansal() {
        return kansal;
    }

    public void setKansal(String kansal) {
        this.kansal = kansal;
    }

    public String getKiel() {
        return kiel;
    }

    public void setKiel(String kiel) {
        this.kiel = kiel;
    }

    public String getKirtu1pv() {
        return kirtu1pv;
    }

    public void setKirtu1pv(String kirtu1pv) {
        this.kirtu1pv = kirtu1pv;
    }

    public String getKirtupv() {
        return kirtupv;
    }

    public void setKirtupv(String kirtupv) {
        this.kirtupv = kirtupv;
    }

    public String getKoultyp() {
        return koultyp;
    }

    public void setKoultyp(String koultyp) {
        this.koultyp = koultyp;
    }

    public String getLaajuus() {
        return laajuus;
    }

    public void setLaajuus(String laajuus) {
        this.laajuus = laajuus;
    }

    public String getLasnalk() {
        return lasnalk;
    }

    public void setLasnalk(String lasnalk) {
        this.lasnalk = lasnalk;
    }

    public String getLastu() {
        return lastu;
    }

    public void setLastu(String lastu) {
        this.lastu = lastu;
    }

    public Date getOikeusAlkamispaivamaara() {
        return oikeusAlkamispaivamaara;
    }

    public void setOikeusAlkamispaivamaara(Date oikeusAlkamispaivamaara) {
        this.oikeusAlkamispaivamaara = oikeusAlkamispaivamaara;
    }

    public Date getOikeusPaattymispaivamaara() {
        return oikeusPaattymispaivamaara;
    }

    public void setOikeusPaattymispaivamaara(Date oikeusPaattymispaivamaara) {
        this.oikeusPaattymispaivamaara = oikeusPaattymispaivamaara;
    }

    public Date getOikeusSiirtopaivamaara() {
        return oikeusSiirtopaivamaara;
    }

    public void setOikeusSiirtopaivamaara(Date oikeusSiirtopaivamaara) {
        this.oikeusSiirtopaivamaara = oikeusSiirtopaivamaara;
    }

    public String getPoissalk() {
        return poissalk;
    }

    public void setPoissalk(String poissalk) {
        this.poissalk = poissalk;
    }

    public String getRahlahde() {
        return rahlahde;
    }

    public void setRahlahde(String rahlahde) {
        this.rahlahde = rahlahde;
    }

    public String getTunn() {
        return tunn;
    }

    public void setTunn(String tunn) {
        this.tunn = tunn;
    }
}
