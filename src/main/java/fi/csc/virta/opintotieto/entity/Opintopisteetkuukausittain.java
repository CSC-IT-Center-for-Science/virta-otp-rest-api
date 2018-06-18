package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Opintopisteet_kuukausi_vuosittain")
@JsonPropertyOrder(alphabetic = true)
public class Opintopisteetkuukausittain  {
    
    @Id
    private Long id; 
	private String  hkoodi = "";
	private String  kk = "";
	private Integer kuukausi;	
	private double  laajuus = 0.0;	
	private Integer ohjausalakoodi;
	private String  oppilaitos  = "";
	private Integer osluokittelukoodi;	
	private Integer vuosi = 0;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }	
	
	public String getHkoodi() {
        return hkoodi;
    }

    public void setHkoodi(String hkoodi) {
        this.hkoodi = hkoodi;
    }	
	
	public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }	

    public void setKuukausi(Integer kuukausi) {
        this.kuukausi = kuukausi;
    }
		
    public Integer getKuukausi() {
        return kuukausi;
    }

	public double  getLaajuus() {
        return laajuus;
    }

    public void setLaajuus(double  laajuus) {
        this.laajuus = laajuus;
    }   
	
    public void setOhjausalakoodi(Integer ohjausalakoodi) {
        this.ohjausalakoodi = ohjausalakoodi;
    }
	
	public Integer getOhjausalakoodi() {
        return ohjausalakoodi;
    }
	
	public String getOppilaitos() {
        return oppilaitos;
    }

    public void setOppilaitos(String oppilaitos) {
        this.kk = oppilaitos;
    }		
	
	public Integer getOsluokittelukoodi() {
        return  osluokittelukoodi;
    }

    public void setOsluokittelukoodi(Integer osluokittelukoodi) {
        this.osluokittelukoodi = osluokittelukoodi;
    }		
	
    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }   	
}
