package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@JsonPropertyOrder(alphabetic = true)
public abstract class Opintopiste {

    @Id
    private Long id;
    private Integer vuosi = 0;
    private String koodi;
    private String db = "";
    private String kuvaus;
    private Double perustutkinto;
    private Double vieraskielinen;
    private Double avoinKK;
    private Double erillinenOO;
    private Double joo;
    @Column(name = "KVVaihto")
    private Double kvVaihto;
    private Double erikoistumisopinnot;
    private Double hyvaksiluetut;
    private String luoja;
    private Date luontipaivamaara;
    private String paivittaja;
    private Date paivityspaivamaara;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
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

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }

    public String getKoodi() {
        return koodi;
    }

    public void setKoodi(String koodi) {
        this.koodi = koodi;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
