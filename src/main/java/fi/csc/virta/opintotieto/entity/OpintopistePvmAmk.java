package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Opintopiste_pvm_AMK")
@JsonPropertyOrder(alphabetic = true)
public class OpintopistePvmAMK {

    @Id
    private Long id;
    private Integer vuosi = 0;
    private Date suorituspaiva;
    private String koodi;
    private String kuvaus;
    private Integer lukumaara;
    private Integer perustutkOpiskelijat;
    private Integer vieraskSuoritukset;
    private Integer kansainvVaihto;
    private Integer kkYhteistyo;
    @Column(name = "avoin_kk")
    private Integer avoinKK;
    private Integer erillinenOpintoOikeus;
    private Integer ulkomailtaHyvLuet;
    private Integer maahanmValKoulutus;
    private String koulutustyyppi = "";
    private Integer tkiToiminnanLaajuus;
    private Integer tkiMuutLaajuus;
    private Integer tkiHarjoittelunLaajuus;
    private String db;
    private String oppilaitostunnus;
    private String luoja = "";
    private Date luontipaivamaara = new Date();

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }

    public Date getSuorituspaiva() {
        return suorituspaiva;
    }

    public void setSuorituspaiva(Date suorituspaiva) {
        this.suorituspaiva = suorituspaiva;
    }

    public String getKoodi() {
        return koodi;
    }

    public void setKoodi(String koodi) {
        this.koodi = koodi;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public Integer getLukumaara() {
        return lukumaara;
    }

    public void setLukumaara(Integer lukumaara) {
        this.lukumaara = lukumaara;
    }

    public Integer getPerustutkOpiskelijat() {
        return perustutkOpiskelijat;
    }

    public void setPerustutkOpiskelijat(Integer perustutkOpiskelijat) {
        this.perustutkOpiskelijat = perustutkOpiskelijat;
    }

    public Integer getVieraskSuoritukset() {
        return vieraskSuoritukset;
    }

    public void setVieraskSuoritukset(Integer vieraskSuoritukset) {
        this.vieraskSuoritukset = vieraskSuoritukset;
    }

    public Integer getKansainvVaihto() {
        return kansainvVaihto;
    }

    public void setKansainvVaihto(Integer kansainvVaihto) {
        this.kansainvVaihto = kansainvVaihto;
    }

    public Integer getKkYhteistyo() {
        return kkYhteistyo;
    }

    public void setKkYhteistyo(Integer kkYhteistyo) {
        this.kkYhteistyo = kkYhteistyo;
    }

    public Integer getAvoinKK() {
        return avoinKK;
    }

    public void setAvoinKK(Integer avoinKK) {
        this.avoinKK = avoinKK;
    }

    public Integer getErillinenOpintoOikeus() {
        return erillinenOpintoOikeus;
    }

    public void setErillinenOpintoOikeus(Integer erillinenOpintoOikeus) {
        this.erillinenOpintoOikeus = erillinenOpintoOikeus;
    }

    public Integer getUlkomailtaHyvLuet() {
        return ulkomailtaHyvLuet;
    }

    public void setUlkomailtaHyvLuet(Integer ulkomailtaHyvLuet) {
        this.ulkomailtaHyvLuet = ulkomailtaHyvLuet;
    }

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

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getOppilaitostunnus() {
        return oppilaitostunnus;
    }

    public void setOppilaitostunnus(String oppilaitostunnus) {
        this.oppilaitostunnus = oppilaitostunnus;
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
}
