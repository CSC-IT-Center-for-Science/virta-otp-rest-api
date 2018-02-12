package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "opinnaytetyot")
@JsonPropertyOrder(alphabetic = true)
public class Opinnaytetyot  {
    
    @Id
    private Long id; 
	private Integer eihankeistettuja;
	private Integer hankeistettuja;
	private String kk = "";	
	private Integer koulutustyyppi;
	private Integer ohjausala;	 	
	private String organisaatio = "";
	private Integer vuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public Integer getEiHankeistettuja() {
        return eihankeistettuja;
    }

    public void setEiHankeistettuja(Integer eihankeistettuja) {
        this.eihankeistettuja = eihankeistettuja;
    }
		
    public Integer getHankeistettuja() {
        return hankeistettuja;
    }

    public void setHankeistettuja(Integer hankeistettuja) {
        this.hankeistettuja = hankeistettuja;
    }   
   
    public Integer getKoulutustyyppi() {
        return koulutustyyppi;
    }

    public void setKoulutustyyppi(Integer koulutustyyppi) {
        this.koulutustyyppi = koulutustyyppi;
    }
		
    public Integer getOhjausala() {
        return ohjausala;
    }

    public void setOhjausala(Integer ohjausala) {
        this.ohjausala = ohjausala;
    }
	
	 public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }
	
	public String getOrganisaatio() {
        return organisaatio;
    }

    public void setOrganisaatio(String organisaatio) {
        this.kk = organisaatio;
    }	
	
	public Integer getVuosi() {
        return  vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }		
	
}
