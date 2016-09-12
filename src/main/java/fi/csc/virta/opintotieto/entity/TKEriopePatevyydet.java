package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TK_eriope_patevyydet")
@JsonPropertyOrder(alphabetic = true)
public class TKEriopePatevyydet {
    
    @Id
    private Long id;
    private String db;
    private String erillisetOpettajanOpinnot;
    private String etunimet;
    private String henkilonNimi;
    private String henkilotunnus;
    private String koulutuksenSijaintikunta;
    private String kunta;
    private String opintosuorituksenAvain;
    private String opiskelijaAvain;
    private String oppilaitosnimi;
    private String oppilaitostunnus;
    private Date paivityspvm;
    private String patevyysSelite;
    private String sukunimi;
    private Date suorituspvm;
    private String suoritusvuosiJaKuukausi;

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

    public String getErillisetOpettajanOpinnot() {
        return erillisetOpettajanOpinnot;
    }

    public void setErillisetOpettajanOpinnot(String erillisetOpettajanOpinnot) {
        this.erillisetOpettajanOpinnot = erillisetOpettajanOpinnot;
    }

    public String getEtunimet() {
        return etunimet;
    }

    public void setEtunimet(String etunimet) {
        this.etunimet = etunimet;
    }

    public String getHenkilonNimi() {
        return henkilonNimi;
    }

    public void setHenkilonNimi(String henkilonNimi) {
        this.henkilonNimi = henkilonNimi;
    }

    public String getHenkilotunnus() {
        return henkilotunnus;
    }

    public void setHenkilotunnus(String henkilotunnus) {
        this.henkilotunnus = henkilotunnus;
    }

    public String getKoulutuksenSijaintikunta() {
        return koulutuksenSijaintikunta;
    }

    public void setKoulutuksenSijaintikunta(String koulutuksenSijaintikunta) {
        this.koulutuksenSijaintikunta = koulutuksenSijaintikunta;
    }

    public String getKunta() {
        return kunta;
    }

    public void setKunta(String kunta) {
        this.kunta = kunta;
    }

    public String getOpintosuorituksenAvain() {
        return opintosuorituksenAvain;
    }

    public void setOpintosuorituksenAvain(String opintosuorituksenAvain) {
        this.opintosuorituksenAvain = opintosuorituksenAvain;
    }

    public String getOpiskelijaAvain() {
        return opiskelijaAvain;
    }

    public void setOpiskelijaAvain(String opiskelijaAvain) {
        this.opiskelijaAvain = opiskelijaAvain;
    }

    public String getOppilaitosnimi() {
        return oppilaitosnimi;
    }

    public void setOppilaitosnimi(String oppilaitosnimi) {
        this.oppilaitosnimi = oppilaitosnimi;
    }

    public String getOppilaitostunnus() {
        return oppilaitostunnus;
    }

    public void setOppilaitostunnus(String oppilaitostunnus) {
        this.oppilaitostunnus = oppilaitostunnus;
    }

    public Date getPaivityspvm() {
        return paivityspvm;
    }

    public void setPaivityspvm(Date paivityspvm) {
        this.paivityspvm = paivityspvm;
    }

    public String getPatevyysSelite() {
        return patevyysSelite;
    }

    public void setPatevyysSelite(String patevyysSelite) {
        this.patevyysSelite = patevyysSelite;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public Date getSuorituspvm() {
        return suorituspvm;
    }

    public void setSuorituspvm(Date suorituspvm) {
        this.suorituspvm = suorituspvm;
    }

    public String getSuoritusvuosiJaKuukausi() {
        return suoritusvuosiJaKuukausi;
    }

    public void setSuoritusvuosiJaKuukausi(String suoritusvuosiJaKuukausi) {
        this.suoritusvuosiJaKuukausi = suoritusvuosiJaKuukausi;
    }
}
