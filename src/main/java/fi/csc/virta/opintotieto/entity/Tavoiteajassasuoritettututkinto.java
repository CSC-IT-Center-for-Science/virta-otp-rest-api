package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tavoiteajassasuoritettututkinto")
@JsonPropertyOrder(alphabetic = true)
public class Tavoiteajassasuoritettututkinto  {

    @Id
    private Long id;
	private Date alkamispvm;
	private Integer aloitusvuosi = 0;
	private Integer ika = 0;
	private Integer kaytetytlukukaudet ;

	private Integer kaytetytpoissakoodi2kaudet = 0;
	private Integer kaytetytpoissakoodi2paivia = 0;
	private Integer kaytetytpoissakoodi3kaudet = 0;
	private Integer kaytetytpoissakoodi3paivia = 0;
	private String  kk = "";
	
	private Integer lasnaololukukaudet = 0;
	
	private Integer onaiempitutkinto = 0;
	private String opintosuoritusavain = "";
	private String opiskelijaavain = "";
	private String opiskeluoikeusavain = "";
	private String oppilaitosnro = "";
	private Integer paivia = 0;
	private Integer sukupuoli = 0;
	
	private double  tavoiteaikavuosia = 0.0;
		
	private Integer tavoiteajassavalmistunut = 0;
	private Integer tavoitelukukaudet = 0;
	private Date  tutkinnonsuorituspvm;	
	
	private double  tutkintokerroin = 0.0;
	
	private String tutkintokoodi = "";
	private Integer tutkintovuosi = 0;
	private Integer vaadittuop = 0;
	private double  vuosia = 0.0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

	public Date getAlkamispvm() {
        return alkamispvm;
    }

    public void setAlkamispvm(Date alkamispvm) {
        this.alkamispvm = alkamispvm;
    }

	public Integer getAloitusvuosi() {
        return aloitusvuosi;
    }

    public void setAloitusvuosi(Integer aloitusvuosi) {
        this.aloitusvuosi = aloitusvuosi;
    }

    public Integer getIka() {
        return ika;
    }

    public void setIka(Integer ika) {
        this.ika = ika;
    }

    public Integer getKaytetytlukukaudet() {
        return kaytetytlukukaudet;
    }

    public void setKaytetytlukukaudet(Integer kaytetytlukukaudet) {
        this.kaytetytlukukaudet = kaytetytlukukaudet;
    }

    public Integer getKaytetytpoissakoodi2kaudet() {
        return kaytetytpoissakoodi2kaudet;
    }

    public void setKaytetytpoissakoodi2kaudet(Integer kaytetytpoissakoodi2kaudet) {
        this.kaytetytpoissakoodi2kaudet = kaytetytpoissakoodi2kaudet;
    }

    public Integer getKaytetytpoissakoodi2paivia() {
        return kaytetytpoissakoodi2paivia;
    }

    public void setKaytetytpoissakoodi2paivia(Integer kaytetytpoissakoodi2paivia) {
        this.kaytetytpoissakoodi2paivia = kaytetytpoissakoodi2paivia;
    }

    public Integer getKaytetytpoissakoodi3kaudet() {
        return kaytetytpoissakoodi3kaudet;
    }

    public void setKaytetytpoissakoodi3kaudet(Integer kaytetytpoissakoodi3kaudet) {
        this.kaytetytpoissakoodi3kaudet = kaytetytpoissakoodi3kaudet;
    }
    
    public Integer getKaytetytpoissakoodi3paivia() {
        return kaytetytpoissakoodi3paivia;
    }

    public void setKaytetytpoissakoodi3paivia(Integer kaytetytpoissakoodi3paivia) {
        this.kaytetytpoissakoodi3paivia = kaytetytpoissakoodi3paivia;
    }

    public Integer getOnaiempitutkinto() {
        return onaiempitutkinto;
    }

    public void setOnaiempitutkinto(Integer onaiempitutkinto) {
        this.onaiempitutkinto = onaiempitutkinto;
    }

	public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }
	
	public Integer getLasnaololukukaudet() {
        return lasnaololukukaudet;
    }

    public void setLasnaololukukaudet(Integer lasnaololukukaudet) {
        this.lasnaololukukaudet = lasnaololukukaudet;
    }		
	
	public String getOpintosuoritusavain() {
        return opintosuoritusavain;
    }

    public void setOpintosuoritusavain(String opintosuoritusavain) {
        this.opintosuoritusavain = opintosuoritusavain;
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

	public String getOppilaitosnro() {
        return oppilaitosnro;
    }

    public void setOppilaitosnro(String oppilaitosnro) {
        this.kk = oppilaitosnro;
    }

	public Integer getPaivia() {
        return  paivia;
    }

    public void setPaivia(Integer paivia) {
        this.paivia = paivia;
    }

    public Integer getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }
	
	public double  getTavoiteaikavuosia() {
        return tavoiteaikavuosia;
    }

    public void setTavoiteaikavuosia(double  tavoiteaikavuosia) {
        this.tavoiteaikavuosia = tavoiteaikavuosia;
    }
	
    public Integer getTavoiteajassavalmistunut() {
        return tavoiteajassavalmistunut;
    }

    public void setTavoiteajassavalmistunut(Integer tavoiteajassavalmistunut) {
        this.tavoiteajassavalmistunut = tavoiteajassavalmistunut;
    }

    public Integer getTavoitelukukaudet() {
        return tavoitelukukaudet;
    }

    public void setTavoitelukukaudet(Integer tavoitelukukaudet) {
        this.tavoitelukukaudet = tavoitelukukaudet;
    }

    public Date getTutkinnonsuorituspvm() {
        return tutkinnonsuorituspvm;
    }

    public void setTutkinnonsuorituspvm(Date tutkinnonsuorituspvm) {
        this.tutkinnonsuorituspvm = tutkinnonsuorituspvm;
    }

    public double getTutkintokerroin() {
        return tutkintokerroin;
    }

    public void setTutkintokerroin(double tutkintokerroin) {
        this.tutkintokerroin = tutkintokerroin;
    }
	
	public String getTutkintokoodi() {
        return tutkintokoodi;
    }

    public void setTutkintokoodi(String tutkintokoodi) {
        this.tutkintokoodi = tutkintokoodi;
    }

    public Integer getTutkintovuosi() {
        return tutkintovuosi;
    }

    public void setTutkintovuosi(Integer tutkintovuosi) {
        this.tutkintovuosi = tutkintovuosi;
    }

    public Integer getVaadittuop() {
        return vaadittuop;
    }

    public void setVaadittuop(Integer vaadittuop) {
        this.vaadittuop = vaadittuop;
    }

    public double getVuosia() {
        return vuosia;
    }

    public void setVuosia(double vuosia) {
        this.vuosia = vuosia;
    }
		

}
