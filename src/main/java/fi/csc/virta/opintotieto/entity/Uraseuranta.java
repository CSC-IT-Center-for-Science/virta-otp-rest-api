package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Uraseuranta")
@JsonPropertyOrder(alphabetic = true)
public class Uraseuranta {

    @Id
    private Long id;
    private String aidinkieli;
    private String aine;
    private String arvosana;
    private String asteikko;
    private String asuinkuntaKoodi;
    private String asuinkuntaNimi;
    private String etunimet;
    private String henkilotunnus;
    private Integer ikaValmistuessa;
    private String kansalaisuus;
    private Integer kirjoillaOloKuukausia;
    private String kk;
    private String koulutusala;
    private String koulutusalakoodi;
    private Integer laajuus;
    private Integer lasnaoloLukukausia;
    private String opiskelijatunnus;
    private String opiskelupaikkakuntaKoodi;
    private String opiskelupaikkakuntaNimi;
    private Date regDatum;
    private String sukunimi;
    private Integer sukupuoli;
    private Integer tutkinnonTaso;
    private String tutkintoKoulutuskoodi;
    private String tutkintoNimi;
    private Date valintavuosi;
    private Date valmistumisajankohta;
    private Integer valmistumisvuosi;
    private String yliopistoNimi;
    private String yliopistoOppilaitoskoodi;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

    public String getAidinkieli() {
        return aidinkieli;
    }

    public void setAidinkieli(String aidinkieli) {
        this.aidinkieli = aidinkieli;
    }

    public String getAine() {
        return aine;
    }

    public void setAine(String aine) {
        this.aine = aine;
    }

    public String getArvosana() {
        return arvosana;
    }

    public void setArvosana(String arvosana) {
        this.arvosana = arvosana;
    }

    public String getAsteikko() {
        return asteikko;
    }

    public void setAsteikko(String asteikko) {
        this.asteikko = asteikko;
    }

    public String getAsuinkuntaKoodi() {
        return asuinkuntaKoodi;
    }

    public void setAsuinkuntaKoodi(String asuinkuntaKoodi) {
        this.asuinkuntaKoodi = asuinkuntaKoodi;
    }

    public String getAsuinkuntaNimi() {
        return asuinkuntaNimi;
    }

    public void setAsuinkuntaNimi(String asuinkuntaNimi) {
        this.asuinkuntaNimi = asuinkuntaNimi;
    }

    public String getEtunimet() {
        return etunimet;
    }

    public void setEtunimet(String etunimet) {
        this.etunimet = etunimet;
    }

    public String getHenkilotunnus() {
        return henkilotunnus;
    }

    public void setHenkilotunnus(String henkilotunnus) {
        this.henkilotunnus = henkilotunnus;
    }

    public Integer getIkaValmistuessa() {
        return ikaValmistuessa;
    }

    public void setIkaValmistuessa(Integer ikaValmistuessa) {
        this.ikaValmistuessa = ikaValmistuessa;
    }

    public String getKansalaisuus() {
        return kansalaisuus;
    }

    public void setKansalaisuus(String kansalaisuus) {
        this.kansalaisuus = kansalaisuus;
    }

    public Integer getKirjoillaOloKuukausia() {
        return kirjoillaOloKuukausia;
    }

    public void setKirjoillaOloKuukausia(Integer kirjoillaOloKuukausia) {
        this.kirjoillaOloKuukausia = kirjoillaOloKuukausia;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    public String getKoulutusala() {
        return koulutusala;
    }

    public void setKoulutusala(String koulutusala) {
        this.koulutusala = koulutusala;
    }

    public String getKoulutusalakoodi() {
        return koulutusalakoodi;
    }

    public void setKoulutusalakoodi(String koulutusalakoodi) {
        this.koulutusalakoodi = koulutusalakoodi;
    }

    public Integer getLaajuus() {
        return laajuus;
    }

    public void setLaajuus(Integer laajuus) {
        this.laajuus = laajuus;
    }

    public Integer getLasnaoloLukukausia() {
        return lasnaoloLukukausia;
    }

    public void setLasnaoloLukukausia(Integer lasnaoloLukukausia) {
        this.lasnaoloLukukausia = lasnaoloLukukausia;
    }

    public String getOpiskelijatunnus() {
        return opiskelijatunnus;
    }

    public void setOpiskelijatunnus(String opiskelijatunnus) {
        this.opiskelijatunnus = opiskelijatunnus;
    }

    public String getOpiskelupaikkakuntaKoodi() {
        return opiskelupaikkakuntaKoodi;
    }

    public void setOpiskelupaikkakuntaKoodi(String opiskelupaikkakuntaKoodi) {
        this.opiskelupaikkakuntaKoodi = opiskelupaikkakuntaKoodi;
    }

    public String getOpiskelupaikkakuntaNimi() {
        return opiskelupaikkakuntaNimi;
    }

    public void setOpiskelupaikkakuntaNimi(String opiskelupaikkakuntaNimi) {
        this.opiskelupaikkakuntaNimi = opiskelupaikkakuntaNimi;
    }

    public Date getRegDatum() {
        return regDatum;
    }

    public void setRegDatum(Date regDatum) {
        this.regDatum = regDatum;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public Integer getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public Integer getTutkinnonTaso() {
        return tutkinnonTaso;
    }

    public void setTutkinnonTaso(Integer tutkinnonTaso) {
        this.tutkinnonTaso = tutkinnonTaso;
    }

    public String getTutkintoKoulutuskoodi() {
        return tutkintoKoulutuskoodi;
    }

    public void setTutkintoKoulutuskoodi(String tutkintoKoulutuskoodi) {
        this.tutkintoKoulutuskoodi = tutkintoKoulutuskoodi;
    }

    public String getTutkintoNimi() {
        return tutkintoNimi;
    }

    public void setTutkintoNimi(String tutkintoNimi) {
        this.tutkintoNimi = tutkintoNimi;
    }

    public Date getValintavuosi() {
        return valintavuosi;
    }

    public void setValintavuosi(Date valintavuosi) {
        this.valintavuosi = valintavuosi;
    }

    public Date getValmistumisajankohta() {
        return valmistumisajankohta;
    }

    public void setValmistumisajankohta(Date valmistumisajankohta) {
        this.valmistumisajankohta = valmistumisajankohta;
    }

    public Integer getValmistumisvuosi() {
        return valmistumisvuosi;
    }

    public void setValmistumisvuosi(Integer valmistumisvuosi) {
        this.valmistumisvuosi = valmistumisvuosi;
    }

    public String getYliopistoNimi() {
        return yliopistoNimi;
    }

    public void setYliopistoNimi(String yliopistoNimi) {
        this.yliopistoNimi = yliopistoNimi;
    }

    public String getYliopistoOppilaitoskoodi() {
        return yliopistoOppilaitoskoodi;
    }

    public void setYliopistoOppilaitoskoodi(String yliopistoOppilaitoskoodi) {
        this.yliopistoOppilaitoskoodi = yliopistoOppilaitoskoodi;
    }
}
