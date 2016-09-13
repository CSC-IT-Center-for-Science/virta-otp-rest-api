package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TK_tarkistus")
@JsonPropertyOrder(alphabetic = true)
public class TKTarkistus {

    @Id
    private Long id;
    private String arvo;
    private String db;
    private String luoja;
    private Date luontipaivamaara;
    private Integer opintosuoritusId;
    private String opintosuoritusavain;
    private Integer opiskelijaId;
    private String opiskelijaavain;
    private Integer opiskeluoikeusId;
    private String opiskeluoikeusavain;
    private String tiedonkeruu;
    private String virhe;
    private String virhekoodi;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public String getArvo() {
        return arvo;
    }

    public void setArvo(String arvo) {
        this.arvo = arvo;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
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

    public Integer getOpintosuoritusId() {
        return opintosuoritusId;
    }

    public void setOpintosuoritusId(Integer opintosuoritusId) {
        this.opintosuoritusId = opintosuoritusId;
    }

    public String getOpintosuoritusavain() {
        return opintosuoritusavain;
    }

    public void setOpintosuoritusavain(String opintosuoritusavain) {
        this.opintosuoritusavain = opintosuoritusavain;
    }

    public Integer getOpiskelijaId() {
        return opiskelijaId;
    }

    public void setOpiskelijaId(Integer opiskelijaId) {
        this.opiskelijaId = opiskelijaId;
    }

    public String getOpiskelijaavain() {
        return opiskelijaavain;
    }

    public void setOpiskelijaavain(String opiskelijaavain) {
        this.opiskelijaavain = opiskelijaavain;
    }

    public Integer getOpiskeluoikeusId() {
        return opiskeluoikeusId;
    }

    public void setOpiskeluoikeusId(Integer opiskeluoikeusId) {
        this.opiskeluoikeusId = opiskeluoikeusId;
    }

    public String getOpiskeluoikeusavain() {
        return opiskeluoikeusavain;
    }

    public void setOpiskeluoikeusavain(String opiskeluoikeusavain) {
        this.opiskeluoikeusavain = opiskeluoikeusavain;
    }

    public String getTiedonkeruu() {
        return tiedonkeruu;
    }

    public void setTiedonkeruu(String tiedonkeruu) {
        this.tiedonkeruu = tiedonkeruu;
    }

    public String getVirhe() {
        return virhe;
    }

    public void setVirhe(String virhe) {
        this.virhe = virhe;
    }

    public String getVirhekoodi() {
        return virhekoodi;
    }

    public void setVirhekoodi(String virhekoodi) {
        this.virhekoodi = virhekoodi;
    }
}
