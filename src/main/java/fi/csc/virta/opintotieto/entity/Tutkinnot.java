package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "kaikkitutkinnot")
@JsonPropertyOrder(alphabetic = true)
public class Tutkinnot  {

    @Id
    private Long	id	;
	private	String 	alkuperainenorganisaatio = "";
	private	Integer avoinvayla = 0;
	private	Integer ika = 0;
	private	String 	kk = "";
	private	String 	koulutuskieli = "";
	private	String 	koulutuskunta = "";
	private	Integer luokittelu = 0;
	private	String 	opintosuoritusavain = "";
	private	String 	opiskelijaavain = "";
	private	String 	opiskeluoikeusavain = "";
	private	String 	oppilaitosnro = "";
	private	Integer rahoituslahde = 0;
	private	Integer siirtoopiskelija = 0;
	private	Integer sukupuoli = 0;
	private	Integer tkkoulutustyyppi = 0;
	private	Integer tutkinnonlaajuusop = 0;
	private	Date 	tutkinnonsuorituspvm	;
	private	Integer tutkinnonsuoritusvuosi = 0;	
	private	String 	tutkintokoodi = "";

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

	public String getAlkuperainenorganisaatio() { 
		return alkuperainenorganisaatio; 
	}	
	
	public  void setAlkuperainenorganisaatio	( String alkuperainenorganisaatio ) { 
		this.alkuperainenorganisaatio = alkuperainenorganisaatio; 
	}
	
	public Integer getAvoinvayla() { 
		return avoinvayla; 
	}	
	
	public  void setAvoinvayla( Integer avoinvayla ) { 
		this.avoinvayla = avoinvayla; 
	}
	
	public Integer getIka() { 
		return ika; 
	}	
	
	public  void setIka( Integer ika	) { 
		this.ika = ika; 
	}
	
	public String getKk() { 
		return kk; 
	}	
	
	public  void setKk( String kk	) { 
		this.kk = kk; 
	}
	
	public String getKoulutuskieli() { 
		return koulutuskieli; 
	}	
	
	public  void setKoulutuskieli( String koulutuskieli )	{ 
		this.koulutuskieli = koulutuskieli; 
	}
	
	public String getKoulutuskunta() { 
		return koulutuskunta; 
	}	
	
	public  void setKoulutuskunta	( String koulutuskunta ) { 
		this.koulutuskunta = koulutuskunta; 
	}
	
	public Integer getLuokittelu() { 
		return luokittelu; 
	}	
	
	public  void setLuokittelu( Integer luokittelu ) { 
		this.luokittelu = luokittelu; 
	}
	
	public String getOpintosuoritusavain() { 
		return opintosuoritusavain; 
	}	
	
	public  void setOpintosuoritusavain( String opintosuoritusavain ) { 
		this.opintosuoritusavain = opintosuoritusavain; 
	}
	
	public String getOpiskelijaavain() { 
		return opiskelijaavain; 
	}	
	
	public  void setOpiskelijaavain( String opiskelijaavain ) { 
		this.opiskelijaavain = opiskelijaavain; 
	}
	
	public String getOpiskeluoikeusavain() { 
		return opiskeluoikeusavain; 
	}	
	
	public  void setOpiskeluoikeusavain( String opiskeluoikeusavain ) { 
		this.opiskeluoikeusavain = opiskeluoikeusavain; 
	}
	
	public String getOppilaitosnro() { 
		return oppilaitosnro; 
	}	
	
	public  void setOppilaitosnro( String oppilaitosnro ) { 
		this.oppilaitosnro = oppilaitosnro; 
	}
	
	public Integer getRahoituslahde() { 
		return rahoituslahde; 
	}	
	
	public  void setRahoituslahde( Integer rahoituslahde ) { 
		this.rahoituslahde = rahoituslahde; 
	}
	
	public Integer getSiirtoopiskelija() { 
		return siirtoopiskelija; 
	}	
	
	public  void setSiirtoopiskelija( Integer siirtoopiskelija ) { 
		this.siirtoopiskelija = siirtoopiskelija; 
	}
	
	public Integer getSukupuoli() { 
		return sukupuoli; 
	}	
	
	public  void setSukupuoli( Integer sukupuoli ) { 
		this.sukupuoli = sukupuoli; 
	}
	
	public Integer getTkkoulutustyyppi() { 
		return tkkoulutustyyppi; 
	}	
		
	public  void setTkkoulutustyyppi	( Integer tkkoulutustyyppi ) { 
		this.tkkoulutustyyppi = tkkoulutustyyppi; 
	}
	
	public Integer getTutkinnonlaajuusop() { 
		return tutkinnonlaajuusop; 
	}	
	
	public  void setTutkinnonlaajuusop( Integer tutkinnonlaajuusop ) { 
		this.tutkinnonlaajuusop = tutkinnonlaajuusop; 
	}
	
	public Integer getTutkinnonsuoritusvuosi() { 
		return tutkinnonsuoritusvuosi; 
	}	
	
	public  void  setTutkinnonsuoritusvuosi( Integer tutkinnonsuoritusvuosi ) { 
		this.tutkinnonsuoritusvuosi = tutkinnonsuoritusvuosi; 
	}
	
	public Date getTutkinnonsuorituspvm() { 
		return tutkinnonsuorituspvm; 
	}	
	
	public  void setTutkinnonsuorituspvm( Date tutkinnonsuorituspvm ) { 
		this.tutkinnonsuorituspvm = tutkinnonsuorituspvm; 
	}
	
	public String getTutkintokoodi() { 
		return tutkintokoodi; 
	}	
	
	public  void setTutkintokoodi( String tutkintokoodi ) { 
		this.tutkintokoodi =	tutkintokoodi; 
	}
    	
}
