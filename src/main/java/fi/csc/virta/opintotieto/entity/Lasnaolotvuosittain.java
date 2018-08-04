package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Lasnaolot_vuosittain")
@JsonPropertyOrder(alphabetic = true)
public class Lasnaolotvuosittain  {
    
    @Id
    private Long id; 
	private String  hkoodi = "";
	private String  kk = "";	
    private Integer lasnakevat = 0;
	private Integer lasnasyys = 0;    
	private String  opiskelijaavain  = "";
    private String  opiskeluoikeusavain  = "";	
    private String  oppilaitos  = "";
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

    public void setLasnakevat(Integer lasnakevat) {
        this.lasnakevat = lasnakevat;
    }	  
	
	public Integer getLasnakevat() {
        return lasnakevat;
    }
	
    public void setLasnasyys(Integer lasnasyys) {
        this.lasnasyys = lasnasyys;
    }
	
	public Integer getLasnasyys() {
        return lasnasyys;
    }
	
	public String getOppilaitos() {
        return oppilaitos;
    }

    public void setOppilaitos(String oppilaitos) {
        this.kk = oppilaitos;
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
   	
    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }   	
}
