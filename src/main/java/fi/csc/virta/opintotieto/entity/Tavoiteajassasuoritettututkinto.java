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

	
	private String xkoulutuskieli  = "";
	private String xkoulutuskunta  = "";
	private Integer xonenintaan12kk = 0;
	private Integer xonryhmaa = 0;
	private Integer xonryhmab = 0;
	private Integer xonryhmac = 0;
	private Integer xonyli12kk = 0;

	/* 2019-02-03*/
	private Integer xxalasnaololukukaudet = 0;
	private Integer xxblasnaolokuukaudet = 0;
	private Integer xxcpoissaololukukaudet = 0;
	private Integer xxdpoissaolokuukaudet = 0;
	private Integer xxetavoiteaikakuukausia = 0;
	private Integer xxfkaytettyaikakk = 0;
	private Integer xxgkokonaisaikakk = 0;
	private String  xxhaiempitutkintokoodi = "";
	private Date    xxiaiempitutkintosuorituspvm;
	private String  xxjaiempikk = "";
	private Integer xxksiirtoopiskelija = 0;
	private Integer xxlavoimenvayla = 0;
    
    private Integer xxlkoulutustyyppi = 0;
	private String xxltutkintoryhma = "";
    
    /* 2020-04-09 */
    private Integer xxmikatutkinnonaloitusajankohtana = 0;
    private Integer xxmrahoituslahde = 0;

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

	
    public Integer getXonenintaan12kk() {
        return xonenintaan12kk;
    }

    public void setXonenintaan12kk(Integer xonenintaan12kk) {
        this.xonenintaan12kk = xonenintaan12kk;
    }		
	
    public String getXkoulutuskieli() {
        return xkoulutuskieli;
    }

    public void setXkoulutuskieli(String xkoulutuskieli) {
        this.xkoulutuskieli = xkoulutuskieli;
    }
	
	public String getXkoulutuskunta() {
        return xkoulutuskunta;
    }

    public void setXkoulutuskunta(String xkoulutuskunta) {
        this.xkoulutuskunta = xkoulutuskunta;
    }
	
    public Integer getXonryhmaa() {
        return xonryhmaa;
    }

    public void setXonryhmaa(Integer xonryhmaa) {
        this.xonryhmaa = xonryhmaa;
    }
	
		
    public Integer getXonryhmab() {
        return xonryhmab;
    }

    public void setXonryhmab(Integer xonryhmab) {
        this.xonryhmab = xonryhmab;
    }
		
		
    public Integer getXonryhmac() {
        return xonryhmac;
    }

    public void setXonryhmac(Integer xonryhmac) {
        this.xonryhmac = xonryhmac;
    }
		
    public Integer getXonyli12kk() {
        return xonyli12kk;
    }

    public void setXonyli12kk(Integer xonyli12kk) {
        this.xonyli12kk = xonyli12kk;
    }
	
	/* 2019-02-03 */	
	public Integer getXxalasnaololukukaudet() {
        return xxalasnaololukukaudet;
    }

    public void setXxalasnaololukukaudet(Integer xxalasnaololukukaudet) {
        this.xxalasnaololukukaudet = xxalasnaololukukaudet;
    }
		
	public Integer getXxblasnaolokuukaudet() {
        return xxblasnaolokuukaudet;
    }

    public void setXxblasnaolokuukaudet(Integer xxblasnaolokuukaudet) {
        this.xxblasnaolokuukaudet = xxblasnaolokuukaudet;
    }
	
	public Integer getXxcpoissaololukukaudet() {
        return xxcpoissaololukukaudet;
    }

    public void setXxcpoissaololukukaudet(Integer xxcpoissaololukukaudet) {
        this.xxcpoissaololukukaudet = xxcpoissaololukukaudet;
    }
		
	public Integer getXxdpoissaolokuukaudet() {
        return xxdpoissaolokuukaudet;
    }

    public void setXxdpoissaolokuukaudet(Integer xxdpoissaolokuukaudet) {
        this.xxdpoissaolokuukaudet = xxdpoissaolokuukaudet;
    }
			
	public Integer getXxetavoiteaikakuukausia() {
        return xxetavoiteaikakuukausia;
    }

    public void setXxetavoiteaikakuukausia(Integer xxetavoiteaikakuukausia) {
        this.xxetavoiteaikakuukausia = xxetavoiteaikakuukausia;
    }
		
	public Integer getXxfkaytettyaikakk() {
        return xxfkaytettyaikakk;
    }

    public void setXxfkaytettyaikakk(Integer xxfkaytettyaikakk) {
        this.xxfkaytettyaikakk = xxfkaytettyaikakk;
    }

	public Integer getXxgkokonaisaikakk() {
        return xxgkokonaisaikakk;
    }

    public void setXxgkokonaisaikakk(Integer xxgkokonaisaikakk) {
        this.xxgkokonaisaikakk = xxgkokonaisaikakk;
    }
		
	public String getXxhaiempitutkintokoodi() {
        return xxhaiempitutkintokoodi;
    }

    public void setXxhaiempitutkintokoodi(String xxhaiempitutkintokoodi) {
        this.xxhaiempitutkintokoodi = xxhaiempitutkintokoodi;
    }

	public Date getXxiaiempitutkintosuorituspvm() {
        return xxiaiempitutkintosuorituspvm;
    }

    public void setXxiaiempitutkintosuorituspvm(Date xxiaiempitutkintosuorituspvm) {
        this.xxiaiempitutkintosuorituspvm = xxiaiempitutkintosuorituspvm;
    }	
	
	public String getXxjaiempikk() {
        return xxjaiempikk;
    }

    public void setXxjaiempikk(String xxjaiempikk) {
        this.xxjaiempikk = xxjaiempikk;
    }	
	
	public Integer getXxksiirtoopiskelija() {
        return xxksiirtoopiskelija;
    }

    public void setXxksiirtoopiskelija(Integer xxksiirtoopiskelija) {
        this.xxksiirtoopiskelija = xxksiirtoopiskelija;
    }

	public Integer getXxlavoimenvayla() {
        return xxlavoimenvayla;
    }

    public void setXxlavoimenvayla(Integer xxlavoimenvayla) {
        this.xxlavoimenvayla = xxlavoimenvayla;
    }	
      
    public Integer getXxlkoulutustyyppi() {
        return xxlkoulutustyyppi;
    }

    public void setXxlkoulutustyyppi(Integer xxlkoulutustyyppi) {
        this.xxlkoulutustyyppi = xxlkoulutustyyppi;
    }	

    public String getXxltutkintoryhma() {
        return xxltutkintoryhma;
    }

    public void setXxltutkintoryhma(String xxltutkintoryhma) {
        this.xxltutkintoryhma = xxltutkintoryhma;
    }	

    /* 2020-04-09 */
    public Integer getXxmikatutkinnonaloitusajankohtana() {
        return xxmikatutkinnonaloitusajankohtana;
    }

    public void setXxmikatutkinnonaloitusajankohtana(Integer xxmikatutkinnonaloitusajankohtana) {
        this.xxmikatutkinnonaloitusajankohtana = xxmikatutkinnonaloitusajankohtana;
    }
		
    public Integer getXxmrahoituslahde() {
        return xxmrahoituslahde;
    }

    public void setXxmrahoituslahde(Integer xxmrahoituslahde) {
        this.xxmrahoituslahde = xxmrahoituslahde;
    }		    

    
	
}
