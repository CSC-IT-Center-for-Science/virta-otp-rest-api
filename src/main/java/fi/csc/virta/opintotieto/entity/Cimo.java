package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@JsonPropertyOrder(alphabetic = true)
public abstract class Cimo {

    @Id
    private Long id;
    private String hetu;
    private Date jaksoAlkupvm;
    private Date jaksoLoppupvm;
    private String kesto;
    private String koultyp;
    private String koulutusala;
    private String koulutuskoodi;
    private Integer liikkuvuusjaksoId;
    private String liikkuvuusjaksoavain;
    private String luoja;
    private Date luontipaivamaara;
    private String opintoaste;
    private Integer opiskelijaId;
    private String opiskelijaavain;
    private Integer opiskeluoikeusId;
    private String opiskeluoikeusavain;
    private String oppilaitos;
    private String sp;
    private String tyyppi;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public String getHetu() {
        return hetu;
    }

    public void setHetu(String hetu) {
        this.hetu = hetu;
    }

    public Date getJaksoAlkupvm() {
        return jaksoAlkupvm;
    }

    public void setJaksoAlkupvm(Date jaksoAlkupvm) {
        this.jaksoAlkupvm = jaksoAlkupvm;
    }

    public Date getJaksoLoppupvm() {
        return jaksoLoppupvm;
    }

    public void setJaksoLoppupvm(Date jaksoLoppupvm) {
        this.jaksoLoppupvm = jaksoLoppupvm;
    }

    public String getKesto() {
        return kesto;
    }

    public void setKesto(String kesto) {
        this.kesto = kesto;
    }

    public String getKoultyp() {
        return koultyp;
    }

    public void setKoultyp(String koultyp) {
        this.koultyp = koultyp;
    }

    public String getKoulutusala() {
        return koulutusala;
    }

    public void setKoulutusala(String koulutusala) {
        this.koulutusala = koulutusala;
    }

    public String getKoulutuskoodi() {
        return koulutuskoodi;
    }

    public void setKoulutuskoodi(String koulutuskoodi) {
        this.koulutuskoodi = koulutuskoodi;
    }

    public Integer getLiikkuvuusjaksoId() {
        return liikkuvuusjaksoId;
    }

    public void setLiikkuvuusjaksoId(Integer liikkuvuusjaksoId) {
        this.liikkuvuusjaksoId = liikkuvuusjaksoId;
    }

    public String getLiikkuvuusjaksoavain() {
        return liikkuvuusjaksoavain;
    }

    public void setLiikkuvuusjaksoavain(String liikkuvuusjaksoavain) {
        this.liikkuvuusjaksoavain = liikkuvuusjaksoavain;
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

    public String getOpintoaste() {
        return opintoaste;
    }

    public void setOpintoaste(String opintoaste) {
        this.opintoaste = opintoaste;
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

    public String getOppilaitos() {
        return oppilaitos;
    }

    public void setOppilaitos(String oppilaitos) {
        this.oppilaitos = oppilaitos;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }
}
