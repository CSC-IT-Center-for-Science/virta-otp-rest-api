package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "OKM_Aloittaneet_Opintopisteet_YO")
@JsonPropertyOrder(alphabetic = true)
public class OKMAloittaneetOpintopisteetYO {

    @Id
    private Long id;
    private String kk;
    private String fuksi;
    private String olosyys;
    private String kirtu;
    private String opoik;
    private String koulk;
    private Integer opsyksy;
    private String opiskelijaavain;
    private String opiskeluoikeusavain;
    private Integer opiskelijaId;
    private Integer opiskeluoikeusId;
    private String luoja;
    private Date luontipaivamaara;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    public String getFuksi() {
        return fuksi;
    }

    public void setFuksi(String fuksi) {
        this.fuksi = fuksi;
    }

    public String getOlosyys() {
        return olosyys;
    }

    public void setOlosyys(String olosyys) {
        this.olosyys = olosyys;
    }

    public String getKirtu() {
        return kirtu;
    }

    public void setKirtu(String kirtu) {
        this.kirtu = kirtu;
    }

    public String getOpoik() {
        return opoik;
    }

    public void setOpoik(String opoik) {
        this.opoik = opoik;
    }

    public String getKoulk() {
        return koulk;
    }

    public void setKoulk(String koulk) {
        this.koulk = koulk;
    }

    public Integer getOpsyksy() {
        return opsyksy;
    }

    public void setOpsyksy(Integer opsyksy) {
        this.opsyksy = opsyksy;
    }

    public String getOpiskelijaavain() {
        return opiskelijaavain;
    }

    public void setOpiskelijaavain(String opiskelijaavain) {
        this.opiskelijaavain = opiskelijaavain;
    }

    public String getOpiskeluoikeusavain() {
        return opiskeluoikeusavain;
    }

    public void setOpiskeluoikeusavain(String opiskeluoikeusavain) {
        this.opiskeluoikeusavain = opiskeluoikeusavain;
    }

    public Integer getOpiskelijaId() {
        return opiskelijaId;
    }

    public void setOpiskelijaId(Integer opiskelijaId) {
        this.opiskelijaId = opiskelijaId;
    }

    public Integer getOpiskeluoikeusId() {
        return opiskeluoikeusId;
    }

    public void setOpiskeluoikeusId(Integer opiskeluoikeusId) {
        this.opiskeluoikeusId = opiskeluoikeusId;
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
