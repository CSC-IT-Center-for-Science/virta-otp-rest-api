package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Amk_Avoimenopintopisteet_Jarj")
public class AMKAvoimenOpintopisteetJarj {

    @Id
    private Long id;
    private String db;
    private String koodi;
    private String kuvaus;
    private String Luoja;
    private Date luontipaivamaara;
    private Integer opintopisteet;
    private String oppilaitostyyppi;
    private String paivittaja;
    private Date paivityspaivamaara;
    private Integer vuosi;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
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

    public String getLuoja() {
        return Luoja;
    }

    public void setLuoja(String luoja) {
        Luoja = luoja;
    }

    public Date getLuontipaivamaara() {
        return luontipaivamaara;
    }

    public void setLuontipaivamaara(Date luontipaivamaara) {
        this.luontipaivamaara = luontipaivamaara;
    }

    public Integer getOpintopisteet() {
        return opintopisteet;
    }

    public void setOpintopisteet(Integer opintopisteet) {
        this.opintopisteet = opintopisteet;
    }

    public String getOppilaitostyyppi() {
        return oppilaitostyyppi;
    }

    public void setOppilaitostyyppi(String oppilaitostyyppi) {
        this.oppilaitostyyppi = oppilaitostyyppi;
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

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }
}
