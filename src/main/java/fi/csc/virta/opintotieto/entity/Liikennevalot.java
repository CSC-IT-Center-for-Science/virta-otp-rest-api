package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Liikennevalot")
@JsonPropertyOrder(alphabetic = true)
public class Liikennevalot {
    
    @Id
    private Long id; 
	private Integer ensisijaisuusPuuttuu; 
	private String kk; 
	private Integer lasnaolevienTutkintoopiskelijoidenLkm; 
	private Integer liikkuvuusjaksojenLkm; 
	private Integer lukukausiilmoittautumisiaVuosilleLkm; 
	private String luoja; 
	private Date luontipaivamaara;
	
	private Integer	opintosuoritukseltaPuuttuuNimi; 
	
	private Integer	opintosuoritukseltaPuuttuuArvosana; 
	private Integer opintosuoritukseltaPuuttuuKoulutusala; 
	private Integer opintosuorituksenSisaltyvyys; 
	private Integer opintosuoritusIlmanOpintooikeuttaAmk; 
	private Integer opiskelijallaEiOleHetua; 
	private Integer opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta; 
	private Integer opiskelijoidenLkm; 
	private Integer opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa; 
	private Integer opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa; 
	private Integer opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia; 
	private Integer opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi; 
	private String oppilaitostunnus; 
/*	private Integer tietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon;  */

	private Integer tietovarannonTietojenPaivitysLainMukaisellaAikataululla; 
	private Integer tutkintoIlmanKoulutuskoodia; 
	private Integer tutkintoopiskelijoidenLkm; 
	
	
    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	public void setEnsisijaisuusPuuttuu( Integer ensisijaisuusPuuttuu ) { this.ensisijaisuusPuuttuu = ensisijaisuusPuuttuu; }
	public	Integer	getEnsisijaisuusPuuttuu() { return ensisijaisuusPuuttuu; }
	
	public void setKk( String kk ) { this.kk = kk; }
	public	String	getKk() { return kk; }
	
	public void setLasnaolevienTutkintoopiskelijoidenLkm( Integer lasnaolevienTutkintoopiskelijoidenLkm ) { this.lasnaolevienTutkintoopiskelijoidenLkm = lasnaolevienTutkintoopiskelijoidenLkm; }
	public	Integer	getLasnaolevienTutkintoopiskelijoidenLkm() { return lasnaolevienTutkintoopiskelijoidenLkm; }
	
	public void setLiikkuvuusjaksojenLkm( Integer liikkuvuusjaksojenLkm ) { this.liikkuvuusjaksojenLkm = liikkuvuusjaksojenLkm; }
	public	Integer	getLiikkuvuusjaksojenLkm() { return liikkuvuusjaksojenLkm; }
	
	public void setLukukausiilmoittautumisiaVuosilleLkm( Integer lukukausiilmoittautumisiaVuosilleLkm ) { this.lukukausiilmoittautumisiaVuosilleLkm = lukukausiilmoittautumisiaVuosilleLkm; }
	public	Integer	getLukukausiilmoittautumisiaVuosilleLkm() { return lukukausiilmoittautumisiaVuosilleLkm; }
	
	public void setLuoja( String luoja ) { this.luoja = luoja; }
	public	String	getLuoja() { return luoja; }
	
	public void setLuontipaivamaara	( Date luontipaivamaara ) { this.luontipaivamaara = luontipaivamaara; }
	public	Date getLuontipaivamaara() { return luontipaivamaara; }
	
	public void setOpintosuoritukseltaPuuttuuArvosana( Integer opintosuoritukseltaPuuttuuArvosana ) { this.opintosuoritukseltaPuuttuuArvosana = opintosuoritukseltaPuuttuuArvosana; }
	public	Integer	getOpintosuoritukseltaPuuttuuArvosana() { return opintosuoritukseltaPuuttuuArvosana; }
	
	public void setOpintosuoritukseltaPuuttuuKoulutusala( Integer opintosuoritukseltaPuuttuuKoulutusala ) { this.opintosuoritukseltaPuuttuuKoulutusala = opintosuoritukseltaPuuttuuKoulutusala; }
	public	Integer	getOpintosuoritukseltaPuuttuuKoulutusala() { return opintosuoritukseltaPuuttuuKoulutusala; }
	
	public void setOpintosuoritukseltaPuuttuuNimi( Integer opintosuoritukseltaPuuttuuNimi ) { this.opintosuoritukseltaPuuttuuNimi = opintosuoritukseltaPuuttuuNimi; }
	public	Integer	getOpintosuoritukseltaPuuttuuNimi() { return opintosuoritukseltaPuuttuuNimi; }
		
	public void setOpintosuorituksenSisaltyvyys( Integer opintosuorituksenSisaltyvyys ) { this.opintosuorituksenSisaltyvyys = opintosuorituksenSisaltyvyys; }
	public	Integer	getOpintosuorituksenSisaltyvyys() { return opintosuorituksenSisaltyvyys; }
	
	public void setOpintosuoritusIlmanOpintooikeuttaAmk( Integer opintosuoritusIlmanOpintooikeuttaAmk ) { this.opintosuoritusIlmanOpintooikeuttaAmk = opintosuoritusIlmanOpintooikeuttaAmk; }
	public	Integer	getOpintosuoritusIlmanOpintooikeuttaAmk() { return opintosuoritusIlmanOpintooikeuttaAmk; }
	
	public void setOpiskelijallaEiOleHetua( Integer opiskelijallaEiOleHetua ) { this.opiskelijallaEiOleHetua = opiskelijallaEiOleHetua; }
	public	Integer	getOpiskelijallaEiOleHetua() { return opiskelijallaEiOleHetua; }
	
	public void setOpiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta( Integer opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta ) { this.opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta = opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta; }
	public	Integer	getOpiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta() { return opiskelijallaEiOleOpiskeluoikeuttaLukukausiilmoittautumistaTaiOpintosuoritusta; }
	
	public void setOpiskelijoidenLkm( Integer opiskelijoidenLkm ) { this.opiskelijoidenLkm = opiskelijoidenLkm; }
	public	Integer	getOpiskelijoidenLkm() { return opiskelijoidenLkm; }
	
	public void setOpiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa( Integer opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa ) { this.opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa = opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa; }
	public	Integer	getOpiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa() { return opiskeluoikeudenOpiskeluoikeusjaksoEiMuodostaEheaaAikajaksoa; }
	
	public void setOpiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa( Integer opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa ) { this.opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa = opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa; }
	public	Integer	getOpiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa() { return opiskeluoikeudenTilaEiMuodostaEheaaAikajaksoa; }
	
	public void setOpiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia( Integer opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia ) { this.opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia = opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia; }
	public	Integer	getOpiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia() { return opiskeluoikeuksienEnsisijaisuuksissaPaallekkaisyyksia; }
	
	public void setOpiskeluoikeusjaksoltaPuuttuuKoulutuskoodi( Integer opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi ) { this.opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi = opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi; }
	public	Integer	getOpiskeluoikeusjaksoltaPuuttuuKoulutuskoodi() { return opiskeluoikeusjaksoltaPuuttuuKoulutuskoodi; }
	
	public void setOppilaitostunnus( String oppilaitostunnus ) { this.oppilaitostunnus = oppilaitostunnus; }
	public	String	getOppilaitostunnus() { return oppilaitostunnus; }
	
/*	public void setTietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon( Integer tietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon ) { this.tietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon = tietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon; }
	public	Integer	getTietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon() { return tietovarannonOpintopistedataneroavaisuusvipusentietosisaltoon; }
*/
	
	public void setTietovarannonTietojenPaivitysLainMukaisellaAikataululla( Integer tietovarannonTietojenPaivitysLainMukaisellaAikataululla ) { this.tietovarannonTietojenPaivitysLainMukaisellaAikataululla = tietovarannonTietojenPaivitysLainMukaisellaAikataululla; }
	public	Integer	getTietovarannonTietojenPaivitysLainMukaisellaAikataululla() { return tietovarannonTietojenPaivitysLainMukaisellaAikataululla; }
	
	public void setTutkintoIlmanKoulutuskoodia( Integer tutkintoIlmanKoulutuskoodia ) { this.tutkintoIlmanKoulutuskoodia = tutkintoIlmanKoulutuskoodia; }
	public	Integer	getTutkintoIlmanKoulutuskoodia() { return tutkintoIlmanKoulutuskoodia; }
	
	public void setTutkintoopiskelijoidenLkm( Integer tutkintoopiskelijoidenLkm ) { this.tutkintoopiskelijoidenLkm = tutkintoopiskelijoidenLkm; }
	public	Integer	getTutkintoopiskelijoidenLkm() { return tutkintoopiskelijoidenLkm; }
	
}
