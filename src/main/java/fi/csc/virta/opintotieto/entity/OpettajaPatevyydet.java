package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "opettaja_patevyydet")
@JsonPropertyOrder(alphabetic = true)
public class OpettajaPatevyydet {

    @Id
    private Long id;
    private String db;
    private Integer henkiloID;
    private String henkilotunnus;
    private Double laajuus;
    private String opintosuoritusAvain;
    private Integer opintosuorituslaji;
    private String opiskelijaAvain;
    private String oppilaitostyyppiKoodi;
    private String organisaatiokoodi;
    private Date paivamaara;
    private String patevyysKoodi;
    private String patevyysNimi;
    private Date regDatum;
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

    public Integer getHenkiloID() {
        return henkiloID;
    }

    public void setHenkiloID(Integer henkiloID) {
        this.henkiloID = henkiloID;
    }

    public String getHenkilotunnus() {
        return henkilotunnus;
    }

    public void setHenkilotunnus(String henkilotunnus) {
        this.henkilotunnus = henkilotunnus;
    }

    public Double getLaajuus() {
        return laajuus;
    }

    public void setLaajuus(Double laajuus) {
        this.laajuus = laajuus;
    }

    public String getOpintosuoritusAvain() {
        return opintosuoritusAvain;
    }

    public void setOpintosuoritusAvain(String opintosuoritusAvain) {
        this.opintosuoritusAvain = opintosuoritusAvain;
    }

    public Integer getOpintosuorituslaji() {
        return opintosuorituslaji;
    }

    public void setOpintosuorituslaji(Integer opintosuoritusLaji) {
        this.opintosuorituslaji = opintosuoritusLaji;
    }

    public String getOpiskelijaAvain() {
        return opiskelijaAvain;
    }

    public void setOpiskelijaAvain(String opiskelijaAvain) {
        this.opiskelijaAvain = opiskelijaAvain;
    }

    public String getOppilaitostyyppiKoodi() {
        return oppilaitostyyppiKoodi;
    }

    public void setOppilaitostyyppiKoodi(String oppilaitostyyppiKoodi) {
        this.oppilaitostyyppiKoodi = oppilaitostyyppiKoodi;
    }

    public String getOrganisaatiokoodi() {
        return organisaatiokoodi;
    }

    public void setOrganisaatiokoodi(String organisaatiokoodi) {
        this.organisaatiokoodi = organisaatiokoodi;
    }

    public Date getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(Date paivamaara) {
        this.paivamaara = paivamaara;
    }

    public String getPatevyysKoodi() {
        return patevyysKoodi;
    }

    public void setPatevyysKoodi(String patevyysKoodi) {
        this.patevyysKoodi = patevyysKoodi;
    }

    public String getPatevyysNimi() {
        return patevyysNimi;
    }

    public void setPatevyysNimi(String patevyysNimi) {
        this.patevyysNimi = patevyysNimi;
    }

    public Date getRegDatum() {
        return regDatum;
    }

    public void setRegDatum(Date regDatum) {
        this.regDatum = regDatum;
    }

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }
}
