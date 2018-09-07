package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "lukuvuosimaksuvelvolliset")
@JsonPropertyOrder(alphabetic = true)
public class Lukuvuosimaksuvelvolliset  {
    
    @Id
    private Long id; 	
	private String  henkilo = "";		 
	private Integer ika = 0;	 	
	private String  kansalaisuus = "";
	private String  koulutuskoodi = "";
	private String  oppilaitos = "";
	private Integer sukupuoli = 0;
	private Integer vuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public String getHenkilo() {
        return henkilo;
    }

    public void setHenkilo(String henkilo) {
        this.henkilo = henkilo;
    }

	public Integer getIka() {
        return ika;
    }

    public void setIka(Integer ika) {
        this.ika = ika;
    }
	
	public String getKansalaisuus() {
        return kansalaisuus;
    }

    public void setKansalaisuus(String kansalaisuus) {
        this.kansalaisuus = kansalaisuus;
    }	
	
	
	public String getKoulutuskoodi() {
        return koulutuskoodi;
    }

    public void setKoulutuskoodi(String koulutuskoodi) {
        this.koulutuskoodi = koulutuskoodi;
    }
		
	public String getOppilaitos() {
        return oppilaitos;
    }

    public void setOppilaitos(String oppilaitos) {
        this.oppilaitos = oppilaitos;
    }
		
	public Integer getSukupuoli() {
        return  sukupuoli;
    }

    public void setSukupuoli(Integer sukupuoli) {
        this.sukupuoli = sukupuoli;
    }	
	
	public Integer getVuosi() {
        return  vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }	
}
