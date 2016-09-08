package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class AMKOpiskelijat {

    @Id
    private Long id;
    private String kk;
    private Integer koulutusalakoodi;
    private String opiskelijaAvain;
    private Date opiskeluOikeudenAlku;
    private Date opiskeluOikeudenPaattymispvm;
    private String opiskeluOikeusAvain;
    private String opiskeluoikeudenKohteenaOlevanKoulutuksenTunniste;
    private String organisaatiokoodi;
    private Integer sukupuoli;
    private Integer vuosi;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    public Integer getKoulutusalakoodi() {
        return koulutusalakoodi;
    }

    public void setKoulutusalakoodi(Integer koulutusalakoodi) {
        this.koulutusalakoodi = koulutusalakoodi;
    }

    public String getOpiskelijaAvain() {
        return opiskelijaAvain;
    }

    public void setOpiskelijaAvain(String opiskelijaAvain) {
        this.opiskelijaAvain = opiskelijaAvain;
    }

    public Date getOpiskeluOikeudenAlku() {
        return opiskeluOikeudenAlku;
    }

    public void setOpiskeluOikeudenAlku(Date opiskeluOikeudenAlku) {
        this.opiskeluOikeudenAlku = opiskeluOikeudenAlku;
    }

    public Date getOpiskeluOikeudenPaattymispvm() {
        return opiskeluOikeudenPaattymispvm;
    }

    public void setOpiskeluOikeudenPaattymispvm(Date opiskeluOikeudenPaattymispvm) {
        this.opiskeluOikeudenPaattymispvm = opiskeluOikeudenPaattymispvm;
    }

    public String getOpiskeluOikeusAvain() {
        return opiskeluOikeusAvain;
    }

    public void setOpiskeluOikeusAvain(String opiskeluOikeusAvain) {
        this.opiskeluOikeusAvain = opiskeluOikeusAvain;
    }

    public String getOpiskeluoikeudenKohteenaOlevanKoulutuksenTunniste() {
        return opiskeluoikeudenKohteenaOlevanKoulutuksenTunniste;
    }

    public void setOpiskeluoikeudenKohteenaOlevanKoulutuksenTunniste(String opiskeluoikeudenKohteenaOlevanKoulutuksenTunniste) {
        this.opiskeluoikeudenKohteenaOlevanKoulutuksenTunniste = opiskeluoikeudenKohteenaOlevanKoulutuksenTunniste;
    }

    public String getOrganisaatiokoodi() {
        return organisaatiokoodi;
    }

    public void setOrganisaatiokoodi(String organisaatiokoodi) {
        this.organisaatiokoodi = organisaatiokoodi;
    }

    public Integer getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }
}
