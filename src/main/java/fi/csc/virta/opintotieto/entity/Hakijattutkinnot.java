package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "korkeakouluhaut_hakijat_tutkinnot")
@JsonPropertyOrder(alphabetic = true)
public class Hakijattutkinnot  {
    
    @Id
    private Long 	id; 		
	private String 	korkeakoulu = "";	
	private String 	oid = "";
	private Date 	suorituspaivamaara;			
	private String 	tutkinto = "";	 

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
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
		
	public Date getSuorituspaivamaara() {
        return suorituspaivamaara;
    }

    public void setSuorituspaivamaara(Date suorituspaivamaara) {
        this.suorituspaivamaara = suorituspaivamaara;
    }
		
	public String getTutkinto() {
        return tutkinto;
    }

    public void setTutkinto(String tutkinto) {
        this.tutkinto = tutkinto;
    }	
}
