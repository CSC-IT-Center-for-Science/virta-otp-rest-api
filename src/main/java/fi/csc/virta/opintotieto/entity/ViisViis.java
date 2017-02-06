package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "viis_viis")
@JsonPropertyOrder(alphabetic = true)
public class ViisViis {
    
    @Id
    private Long id; 
	private Integer	edellinenSyysolo; 
	private String hetu;
	private Integer kevat; 
	private Date loAloituspvm; 
	private Integer olok; 
	private Integer olos; 
	private Date ooAloituspvm;
	private Integer opSummaKunOtePankista; 
	private String opiskelijaavain;
	private String opiskeluoikeusavain;
	private Integer opiskeluoikeusid; 
	private String oppilaitos;
	private String oppilaitostunnus;
	private Integer pankkiKumuEnnen55; 
	private Integer pankkiSaldo55; 
	private Date regDatum;
	private Integer sukupuoli; 
	private Integer summa; 
	private Integer suorittanut27; 
	private Integer suorittanut55IlmanPankkia; 
	private Integer suorittanut55PankinAvulla; 
	private Integer syys; 
	private String tkoodi; 
	private Integer uusiOpisk; 
	private Integer uusiOpiskKevat; 
	private Integer uuttaPankkiin; 
	private Integer vuosi; 

    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public void setEdellinenSyysolo( Integer edellinenSyysolo ) { this.edellinenSyysolo = edellinenSyysolo; }
	public Integer	getEdellinenSyysolo() { return edellinenSyysolo; }

	public void setHetu( String hetu ) { this.hetu = hetu; }
	public String getHetu() { return hetu; }
	
	public void setKevat( Integer kevat ) { this.kevat = kevat; }
	public Integer getKevat() { return kevat; }
	
	public void setLoAloituspvm( Date loAloituspvm ) { this.loAloituspvm = loAloituspvm; }
	public Date	getLoAloituspvm() { return loAloituspvm; }
	
	public void setOlok( Integer olok ) { this.olok = olok; }
	public Integer getOlok() { return olok; }
	
	public void setOlos( Integer olos ) { this.olos = olos; }
	public Integer getOlos() { return olos; }
	
	public void setOoAloituspvm( Date ooAloituspvm ) { this.ooAloituspvm = ooAloituspvm; }
	public Date	getOoAloituspvm() { return ooAloituspvm; }
	
	public void setOpiskelijaavain( String opiskelijaavain ) { this.opiskelijaavain = opiskelijaavain; }
	public String getOpiskelijaavain() { return opiskelijaavain; }
	
	public void setOpiskeluoikeusavain( String opiskeluoikeusavain ) { this.opiskeluoikeusavain = opiskeluoikeusavain; }
	public String getOpiskeluoikeusavain() { return opiskeluoikeusavain; }
	
	public void setOpiskeluoikeusid( Integer opiskeluoikeusid ) { this.opiskeluoikeusid = opiskeluoikeusid; }
	public Integer getOpiskeluoikeusid() { return opiskeluoikeusid; }
	
	public void setOppilaitos( String oppilaitos ) { this.oppilaitos = oppilaitos; }
	public String getOppilaitos() { return oppilaitos; }
	
	public void setOppilaitostunnus( String oppilaitostunnus ) { this.oppilaitostunnus = oppilaitostunnus; }
	public String getOppilaitostunnus() { return oppilaitostunnus; }
	
	public void setOpSummaKunOtePankista( Integer opSummaKunOtePankista ) { this.opSummaKunOtePankista = opSummaKunOtePankista; }
	public Integer getOpSummaKunOtePankista() { return opSummaKunOtePankista; }
	
	public void setPankkiKumuEnnen55( Integer pankkiKumuEnnen55 ) { this.pankkiKumuEnnen55 = pankkiKumuEnnen55; }
	public Integer getPankkiKumuEnnen55() { return pankkiKumuEnnen55; }
	
	public void setPankkiSaldo55( Integer pankkiSaldo55 ) { this.pankkiSaldo55 = pankkiSaldo55; }
	public Integer getPankkiSaldo55() { return pankkiSaldo55; }
	
	public void setRegDatum( Date regDatum ) { this.regDatum = regDatum; }
	public Date	getRegDatum() { return regDatum; }
	
	public void setSukupuoli( Integer sukupuoli ) { this.sukupuoli = sukupuoli; }
	public Integer getSukupuoli() { return sukupuoli; }
	
	public void setSumma( Integer summa ) { this.summa = summa; }
	public Integer getSumma() { return summa; }
	
	public void setSuorittanut27(  Integer suorittanut27 ) { this.suorittanut27 = suorittanut27; }
	public Integer getSuorittanut27() { return suorittanut27; }
	
	public void setSuorittanut55IlmanPankkia( Integer suorittanut55IlmanPankkia ) { this.suorittanut55IlmanPankkia = suorittanut55IlmanPankkia; }
	public Integer getSuorittanut55IlmanPankkia() { return suorittanut55IlmanPankkia; }
	
	public void setSuorittanut55PankinAvulla( Integer suorittanut55PankinAvulla ) { this.suorittanut55PankinAvulla = suorittanut55PankinAvulla; }
	public Integer getSuorittanut55PankinAvulla() { return suorittanut55PankinAvulla; }
	
	public void setSyys(  Integer syys ) { this.syys = syys; }
	public Integer getSyys() { return syys; }
	
	public void setTkoodi( String tkoodi ) { this.tkoodi = tkoodi; }
	public String getTkoodi() { return tkoodi; }
	
	public void setUusiOpisk( Integer uusiOpisk ) { this.uusiOpisk = uusiOpisk; }
	public Integer getUusiOpisk() { return uusiOpisk; }
	
	public void setUusiOpiskKevat( Integer uusiOpiskKevat ) { this.uusiOpiskKevat = uusiOpiskKevat; }
	public Integer getUusiOpiskKevat() { return uusiOpiskKevat; }
	
	public void setUuttaPankkiin( Integer uuttaPankkiin ) { this.uuttaPankkiin = uuttaPankkiin; }
	public Integer getUuttaPankkiin() { return uuttaPankkiin; }
	
	public void setVuosi( Integer vuosi ) { this.vuosi = vuosi; }
	public Integer getVuosi() { return vuosi; }
	
}
