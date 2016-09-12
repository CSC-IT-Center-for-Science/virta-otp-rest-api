package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@JsonPropertyOrder(alphabetic = true)
public class TKOpisk {

    @Id
    private Long id;
    private String enimi;
    private String ht;
    private String kkun;
    private String koulk;
    private String luoja;
    private Date luontipaivamaara;
    private String olosyys;
    private String olotamm;
    private String opek;
    private String opes;
    private Integer opiskelijaId;
    private String opiskelijaavain;
    private Integer opiskeluoikeusId;
    private String opiskeluoikeusavain;
    private String snimi;
    private String opker;
    private String sp;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public String getEnimi() {
        return enimi;
    }

    public void setEnimi(String enimi) {
        this.enimi = enimi;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getKkun() {
        return kkun;
    }

    public void setKkun(String kkun) {
        this.kkun = kkun;
    }

    public String getKoulk() {
        return koulk;
    }

    public void setKoulk(String koulk) {
        this.koulk = koulk;
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

    public String getOlosyys() {
        return olosyys;
    }

    public void setOlosyys(String olosyys) {
        this.olosyys = olosyys;
    }

    public String getOlotamm() {
        return olotamm;
    }

    public void setOlotamm(String olotamm) {
        this.olotamm = olotamm;
    }

    public String getOpek() {
        return opek;
    }

    public void setOpek(String opek) {
        this.opek = opek;
    }

    public String getOpes() {
        return opes;
    }

    public void setOpes(String opes) {
        this.opes = opes;
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

    public String getSnimi() {
        return snimi;
    }

    public void setSnimi(String snimi) {
        this.snimi = snimi;
    }

    public String getOpker() {
        return opker;
    }

    public void setOpker(String opker) {
        this.opker = opker;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }
}
