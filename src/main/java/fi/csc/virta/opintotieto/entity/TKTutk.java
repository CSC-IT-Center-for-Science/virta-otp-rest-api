package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@JsonPropertyOrder(alphabetic = true)
public abstract class TKTutk {

    @Id
    private Long id;
    private String enimi;
    private String ht;
    private String kkun;
    private String luoja;
    private Date luontipaivamaara;
    private Integer opintosuoritusId;
    private String opintosuoritusavain;
    private Integer opiskelijaId;
    private String opiskelijaavain;
    private Integer opiskeluoikeusId;
    private String opiskeluoikeusavain;
    private String opmuu;
    private String optutk;
    private String opulk;
    private String opyht;
    private String snimi;
    private String sp;
    private Date suorituspaivamaara;
    private String suorpvm;

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

    public String getOpmuu() {
        return opmuu;
    }

    public void setOpmuu(String opmuu) {
        this.opmuu = opmuu;
    }

    public String getOptutk() {
        return optutk;
    }

    public void setOptutk(String optutk) {
        this.optutk = optutk;
    }

    public String getOpulk() {
        return opulk;
    }

    public void setOpulk(String opulk) {
        this.opulk = opulk;
    }

    public String getOpyht() {
        return opyht;
    }

    public void setOpyht(String opyht) {
        this.opyht = opyht;
    }

    public String getSnimi() {
        return snimi;
    }

    public void setSnimi(String snimi) {
        this.snimi = snimi;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public Date getSuorituspaivamaara() {
        return suorituspaivamaara;
    }

    public void setSuorituspaivamaara(Date suorituspaivamaara) {
        this.suorituspaivamaara = suorituspaivamaara;
    }

    public String getSuorpvm() {
        return suorpvm;
    }

    public void setSuorpvm(String suorpvm) {
        this.suorpvm = suorpvm;
    }
}
