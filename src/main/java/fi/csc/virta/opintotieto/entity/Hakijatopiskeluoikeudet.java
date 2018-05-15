package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "korkeakouluhaut_hakijat_opiskeluoikeudet")
@JsonPropertyOrder(alphabetic = true)
public class Hakijatopiskeluoikeudet  {
    
    @Id
    private Long 	id; 
	
	private Date 	alkamispaivamaara;	
	private String 	korkeakoulu = "";	
	private String 	oid = "";
	private Date 	paattymispaivamaara;		
	private String 	tavoitetutkinto = "";;
		 

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public Date getAlkamispaivamaara() {
        return alkamispaivamaara;
    }

    public void setAlkamispaivamaara(Date alkamispaivamaara) {
        this.alkamispaivamaara = alkamispaivamaara;
    }
		
    public String getKorkeakoulu() {
        return korkeakoulu;
    }

    public void setKorkeakoulu(String korkeakoulu) {
        this.korkeakoulu = korkeakoulu;
    }   
   
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
		
    public Date getPaattymispaivamaara() {
        return paattymispaivamaara;
    }

    public void setPaattymispaivamaara(Date paattymispaivamaara) {
        this.paattymispaivamaara = paattymispaivamaara;
    }
		
	public String getTavoitetutkinto() {
        return tavoitetutkinto;
    }

    public void setTavoitetutkinto(String tavoitetutkinto) {
        this.tavoitetutkinto = tavoitetutkinto;
    }
	
}
