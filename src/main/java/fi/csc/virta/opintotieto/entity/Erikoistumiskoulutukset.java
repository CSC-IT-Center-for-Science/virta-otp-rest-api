package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "erikoistumiskoulutukset")
@JsonPropertyOrder(alphabetic = true)
public class Erikoistumiskoulutukset  {
    
    @Id
    private Long id; 
	private String erikoistumiskoulutuskoodi;
	private Integer ika;
	private String ohjauksenalakoodi;	
	private Date opiskeluoikeudenalkamispaivamaara;
	private String oppilaitoskoodi;	 	
	private String sukupuolikoodi;

    /*getId funktio   */
    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	
	/* getErikoistumiskoulutusket */
	public String getErikoistumiskoulutuskoodi() {
        return erikoistumiskoulutuskoodi;
    }
    /*setErikoistumiskoulutuskoodi*/
    public void setErikoistumiskoulutuskoodi(String erikoistumiskoulutuskoodi) {
        this.erikoistumiskoulutuskoodi = erikoistumiskoulutuskoodi;
    }
	
	
	
	/*getIka*/
	public Integer getIka() {
        return ika;
    }
    /*setIka*/
    public void setIka(Integer ika) {
        this.ika = ika;
    }
	
	
	
	/*getOhjauksenalakoodi*/
	public String getOhjauksenalakoodi() {
        return ohjauksenalakoodi;
    }
    /*setOhjauksenalakoodi*/
    public void setOhjauksenalakoodi(String ohjauksenalakoodi) {
        this.ohjauksenalakoodi = ohjauksenalakoodi;
    }	
	
	
	
	/*getOpiskeluoikeudenalkamispaivamaara*/	
    public Date getOpiskeluoikeudenalkamispaivamaara() {
        return opiskeluoikeudenalkamispaivamaara;
    }
    /*setOpiskeluoikeudenalkamispaivamaara*/
    public void setOpiskeluoikeudenalkamispaivamaara(Date opiskeluoikeudenalkamispaivamaara) {
        this.opiskeluoikeudenalkamispaivamaara = opiskeluoikeudenalkamispaivamaara;
    }   
   
   
   
    /*getOppilaitoskoodi*/
	public String getOppilaitoskoodi() {
        return oppilaitoskoodi;
    }
    /*setOppilaitoskoodi*/
    public void setOppilaitoskoodi(String oppilaitoskoodi) {
        this.oppilaitoskoodi = oppilaitoskoodi;
    }	
   
   
    /*getSukupuolikoodi*/
	public String getSukupuolikoodi() {
        return sukupuolikoodi;
    }
    /*setSukupuolikoodi*/
    public void setSukupuolikoodi(String sukupuolikoodi) {
        this.sukupuolikoodi = sukupuolikoodi;
    }	
   
		
}
