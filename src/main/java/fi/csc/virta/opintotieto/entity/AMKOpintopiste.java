package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name = "Amk_Opintopiste")
@JsonPropertyOrder(alphabetic = true)
public class AMKOpintopiste {

    @EmbeddedId
    private AMKOpintopisteId id;
    private String kuvaus;
    private Double perustutkinto;
    private Double tkiToiminnanLaajuus;
    private Double tkiMuutLaajuus;
    private Double tkiHarjoittelunLaajuus;
    private Double vieraskielinen;
    private Double avoinKK;
    private Double erillinenOO;
    private Double joo;
    @Column(name = "KVVaihto")
    private Double kvVaihto;
    @Column(name = "MValko")
    private Double mValKo;
    private Double erikoistumisopinnot;
    private Double hyvaksiluetut;
    private String luoja;
    private Date luontipaivamaara;
    private String paivittaja;
    private Date paivityspaivamaara;

    public AMKOpintopiste() {
        id = new AMKOpintopisteId();
    }

    @JsonIgnore
    public AMKOpintopisteId getId() {
        return id;
    }

    @JsonIgnore
    public void setId(AMKOpintopisteId id) {
        this.id = id;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Double getPerustutkinto() {
        return perustutkinto;
    }

    public void setPerustutkinto(Double perustutkinto) {
        this.perustutkinto = perustutkinto;
    }

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

    public Double getVieraskielinen() {
        return vieraskielinen;
    }

    public void setVieraskielinen(Double vieraskielinen) {
        this.vieraskielinen = vieraskielinen;
    }

    public Double getAvoinKK() {
        return avoinKK;
    }

    public void setAvoinKK(Double avoinKK) {
        this.avoinKK = avoinKK;
    }

    public Double getErillinenOO() {
        return erillinenOO;
    }

    public void setErillinenOO(Double erillinenOO) {
        this.erillinenOO = erillinenOO;
    }

    public Double getJoo() {
        return joo;
    }

    public void setJoo(Double joo) {
        this.joo = joo;
    }

    public Double getKvVaihto() {
        return kvVaihto;
    }

    public void setKvVaihto(Double kvVaihto) {
        this.kvVaihto = kvVaihto;
    }

    public Double getmValKo() {
        return mValKo;
    }

    public void setmValKo(Double mValKo) {
        this.mValKo = mValKo;
    }

    public Double getErikoistumisopinnot() {
        return erikoistumisopinnot;
    }

    public void setErikoistumisopinnot(Double erikoistumisopinnot) {
        this.erikoistumisopinnot = erikoistumisopinnot;
    }

    public Double getHyvaksiluetut() {
        return hyvaksiluetut;
    }

    public void setHyvaksiluetut(Double hyvaksiluetut) {
        this.hyvaksiluetut = hyvaksiluetut;
    }

    public String getLuoja() {
        return luoja;
    }

    public void setLuoja(String luoja) {
        this.luoja = luoja;
    }

    public Date getLuontipaivamaara() {
        return luontipaivamaara;
    }

    public void setLuontipaivamaara(Date luontipaivamaara) {
        this.luontipaivamaara = luontipaivamaara;
    }

    public String getPaivittaja() {
        return paivittaja;
    }

    public void setPaivittaja(String paivittaja) {
        this.paivittaja = paivittaja;
    }

    public Date getPaivityspaivamaara() {
        return paivityspaivamaara;
    }

    public void setPaivityspaivamaara(Date paivityspaivamaara) {
        this.paivityspaivamaara = paivityspaivamaara;
    }

    @Transient
    public Integer getVuosi() {
        return id.getVuosi();
    }

    @Transient
    public String getKoulutustyyppi() {
        return id.getKoulutustyyppi();
    }

    @Transient
    public void setKoodi(String koodi) {
        id.setKoodi(koodi);
    }

    @Transient
    public String getDb() {
        return id.getDb();
    }

    @Transient
    public String getKoodi() {
        return id.getKoodi();
    }

    @Transient
    public void setVuosi(Integer vuosi) {
        id.setVuosi(vuosi);
    }

    @Transient
    public void setDb(String db) {
        id.setDb(db);
    }

    @Transient
    public void setKoulutustyyppi(String koulutustyyppi) {
        id.setKoulutustyyppi(koulutustyyppi);
    }
}
