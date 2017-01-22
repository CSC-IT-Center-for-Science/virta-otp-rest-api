package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Avoimet_Erilliset_YO")
@JsonPropertyOrder(alphabetic = true)
public class AvoimetErillisetYO {
    
    @Id
    private Long id; 
	private Integer avomiehet;
	private Integer avonaiset;
	private Integer avotutkintomiehet;
	private Integer avotutkintonaiset;
	private Integer erillisetoikeudet;
	private Integer erillisetopettajat;
	private String kk = "";
	private String organisaatiokoodi = "";
	private Integer vuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public Integer getAvoMiehet() {
        return avomiehet;
    }

    public void setAvoMiehet(Integer avomiehet) {
        this.avomiehet = avomiehet;
    }
		
    public Integer getAvoNaiset() {
        return avonaiset;
    }

    public void setAvoNaiset(Integer avonaiset) {
        this.avonaiset = avonaiset;
    }   
   
    public Integer getAvoTutkintoMiehet() {
        return avotutkintomiehet;
    }

    public void setAvoTutkintoMiehet(Integer avotutkintomiehet) {
        this.avotutkintomiehet = avotutkintomiehet;
    }
		
    public Integer getAvoTutkintoNaiset() {
        return avotutkintonaiset;
    }

    public void setAvoTutkintoNaiset(Integer avotutkintonaiset) {
        this.avotutkintonaiset = avotutkintonaiset;
    }
	
		 
    public Integer getErillisetOikeudet() {
        return erillisetoikeudet;
    }

    public void setErillisetOikeudet(Integer erillisetoikeudet) {
        this.erillisetoikeudet = erillisetoikeudet;
    }
		
    public Integer getErillisetOpettajat() {
        return erillisetopettajat;
    }

    public void setErillisetOpettajat(Integer erillisetopettajat) {
        this.erillisetopettajat = erillisetopettajat;
    }
	
	 public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }
	
	public String getOrganisaatioKoodi() {
        return organisaatiokoodi;
    }

    public void setOrganisaatioKoodi(String organisaatiokoodi) {
        this.kk = organisaatiokoodi;
    }	
	
	public Integer getVuosi() {
        return  vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }		
	
}
