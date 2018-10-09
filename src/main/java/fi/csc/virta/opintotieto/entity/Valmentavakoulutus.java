package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "valmentavaan_koulutukseen_osallistuneet")
@JsonPropertyOrder(alphabetic = true)
public class Valmentavakoulutus  {

    @Id
	private Long id;	
	private Integer atunniste = 0;
	private Integer ika = 0;
	private Integer sukupuoli = 0;
	private String tkk = "";
	private String tkoulutuskoodi= "";	
	private Date tooalkamispaivamaara;
	private Date toopaattymispaivamaara;	
	private Integer tootyyppi = 0;	
	private String toppilaitosnro = "";	
 
	private Date ttutkintosuorituspvm;
	private String vkk = "";	
	private Date vooalkamispaivamaara;
	private Date voopaattymispaivamaara;	
	private Integer vootyyppi = 0;
	private String voppilaitosnro = "";	
	private Integer xvuosi = 0;
	
    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }	
	
	public Integer getAtunniste() {
        return atunniste;
    }
	
    public void setAtunniste(Integer atunniste) {
        this.atunniste = atunniste;
    }	

    public Integer getIka() {
        return ika;
    }

    public void setIka(Integer ika) {
        this.ika = ika;
    }
	
    public Integer getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }		
	
	public String getTkk() {
        return tkk;
    }

    public void setTkk(String tkk) {
        this.tkk = tkk;
    }

	public String getTkoulutuskoodi() {
        return tkoulutuskoodi;
    }

    public void setTkoulutuskoodi(String tkoulutuskoodi) {
        this.tkoulutuskoodi = tkoulutuskoodi;
    }	
	
	
	public Date getTooalkamispaivamaara() {
        return tooalkamispaivamaara;
    }

    public void setTooalkamispaivamaara(Date tooalkamispaivamaara) {
        this.tooalkamispaivamaara = tooalkamispaivamaara;
    }

	
	public Date getToopaattymispaivamaara() {
        return toopaattymispaivamaara;
    }

    public void setToopaattymispaivamaara(Date toopaattymispaivamaara) {
        this.toopaattymispaivamaara = toopaattymispaivamaara;
    }
	
	
	public Integer getTootyyppi() {
        return  tootyyppi;
    }

    public void setTootyyppi(Integer tootyyppi) {
        this.tootyyppi = tootyyppi;
    }

	public String getToppilaitosnro() {
        return toppilaitosnro;
    }

    public void setToppilaitosnro(String toppilaitosnro) {
        this.toppilaitosnro = toppilaitosnro;
    }	
	
    public Date getTtutkinnonsuorituspvm() {
        return ttutkintosuorituspvm;
    }

    public void setTtutkinnonsuorituspvm(Date ttutkintosuorituspvm) {
        this.ttutkintosuorituspvm = ttutkintosuorituspvm;
    }
			
	public String getVkk() {
        return vkk;
    }

    public void setVkk(String vkk) {
        this.vkk = vkk;
    }	
	
	public Date getVooalkamispaivamaara() {
        return vooalkamispaivamaara;
    }

    public void setVooalkamispaivamaara(Date vooalkamispaivamaara) {
        this.vooalkamispaivamaara = vooalkamispaivamaara;
    }
	
	public Date getVoopaattymispaivamaara() {
        return voopaattymispaivamaara;
    }

    public void setVoopaattymispaivamaara(Date voopaattymispaivamaara) {
        this.voopaattymispaivamaara = voopaattymispaivamaara;
    }	
	
	public Integer getVootyyppi() {
        return  vootyyppi;
    }

    public void setVootyyppi(Integer vootyyppi) {
        this.vootyyppi = vootyyppi;
    }	
	
	public String getVoppilaitosnro() {
        return voppilaitosnro;
    }

    public void setVoppilaitosnro(String voppilaitosnro) {
        this.voppilaitosnro = voppilaitosnro;
    }	
	
	public Integer getXvuosi() {
        return  xvuosi;
    }

    public void setXvuosi(Integer xvuosi) {
        this.xvuosi = xvuosi;
    }	
	
	
}
