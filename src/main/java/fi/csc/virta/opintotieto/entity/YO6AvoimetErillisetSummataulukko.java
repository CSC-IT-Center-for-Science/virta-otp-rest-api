package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "YO6AvoimetErillisetSummataulukko")
@JsonPropertyOrder(alphabetic = true)
public class YO6AvoimetErillisetSummataulukko {

    @Id
    private Long id; 
    private String kk;
	private Integer vuosi;
	private Integer avoTutkintoMiehet;
	private Integer avoTutkintoNaiset;
	private Integer avoMiehet;
	private Integer avoNaiset;
	private Integer erillisetOikeudet;
	private Integer erillisetOpettajat;

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

	public Integer getVuosi() {
        return  vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }
		
   
    public Integer getAvoTutkintoMiehet() {
        return avoTutkintoMiehet;
    }

    public void setAvoTutkintoMiehet(Integer avoTutkintoMiehet) {
        this.avoTutkintoMiehet = avoTutkintoMiehet;
    }
		
    public Integer getAvoTutkintoNaiset() {
        return avoTutkintoNaiset;
    }

    public void setAvoTutkintoNaiset(Integer avoTutkintoNaiset) {
        this.avoTutkintoNaiset = avoTutkintoNaiset;
    }
	
	    public Integer getAvoMiehet() {
        return avoMiehet;
    }

    public void setAvoMiehet(Integer avoMiehet) {
        this.avoMiehet = avoMiehet;
    }
		
    public Integer getAvoNaiset() {
        return avoNaiset;
    }

    public void setAvoNaiset(Integer avoNaiset) {
        this.avoNaiset = avoNaiset;
    }
	
	 
    public Integer getErillisetOikeudet() {
        return erillisetOikeudet;
    }

    public void setErillisetOikeudet(Integer erillisetOikeudet) {
        this.erillisetOikeudet = erillisetOikeudet;
    }
		
    public Integer getErillisetOpettajat() {
        return erillisetOpettajat;
    }

    public void setErillisetOpettajat(Integer erillisetOpettajat) {
        this.erillisetOpettajat = erillisetOpettajat;
    }
	

    
}
