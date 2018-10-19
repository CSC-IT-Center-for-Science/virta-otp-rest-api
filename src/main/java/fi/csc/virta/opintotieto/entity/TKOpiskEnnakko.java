package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tk_opisk_ennakko")
@JsonPropertyOrder(alphabetic = true)
public class TKOpiskEnnakko  {

    @Id
	private Long id;
	private String aikielir1x  = "";
	private String aineisto  = "";
	private String allk  = "";
	private String alvv  = "";
	private String alvvkk  = "";
	private String alvvkklasna  = "";
	private String alvvkksek  = "";
	private String alvvkkseklasna  = "";
	private String alvvopa  = "";
	private String alvvopalasna  = "";
	private String alvvsek  = "";
	private String alvvseklasna  = "";
	private String avo  = "";
	private String ensisop  = "";
	private String fte  = "";
	private String fuksi  = "";
	private String jarj  = "";
	private String kansalr2  = "";
	private String kirtu1k  = "";
	private String kirtu1v  = "";
	private String kk  = "";
	private String kkieli  = "";
	private String kkun  = "";
	private String koulk  = "";
	private String koultyp  = "";
	private String lahde  = "";
	private Integer lasnalk  = 0;
	private Integer lkm  = 0;
	private String ltop  = "";
	private String luontipvm  = "";
	private String olosyys  = "";
	private String olotamm  = "";
	private String om  = "";
	private String op55  = "";
	private Integer opek  = 0;
	private Integer opes  = 0;
	private String opkelp  = "";
	private Integer opker  = 0;
	private Integer oplaaj  = 0;
	private String opmopa  = "";
	private String opoikv  = "";
	private Integer opyht0  = 0;
	private Integer opyht104  = 0;
	private Integer opyht119  = 0;
	private Integer opyht120  = 0;
	private Integer opyht14  = 0;
	private Integer opyht29  = 0;
	private Integer opyht44  = 0;
	private Integer opyht59  = 0;
	private Integer opyht74  = 0;
	private Integer opyht89  = 0;
	private Integer poissalk  = 0;
	private String rahlahde  = "";
	private String sp  = "";
	private String syntv  = "";
	private String tilmaa  = "";
	private String tilv  = "";
	private String tilvaskun  = "";
	private String tilvaskun2x  = "";
	private String tilvaskunx  = "";
	private String tunn  = "";

	
    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }	

	public String getAikielir1x() { return aikielir1x;} 
	public String getAineisto() { return aineisto;} 
	public String getAllk() { return allk;} 
	public String getAlvv() { return alvv;} 
	public String getAlvvkk() { return alvvkk;} 
	public String getAlvvkklasna() { return alvvkklasna;} 
	public String getAlvvkksek() { return alvvkksek;} 
	public String getAlvvkkseklasna() { return alvvkkseklasna;} 
	public String getAlvvopa() { return alvvopa;} 
	public String getAlvvopalasna() { return alvvopalasna;} 
	public String getAlvvsek() { return alvvsek;} 
	public String getAlvvseklasna() { return alvvseklasna;} 
	public String getAvo() { return avo;} 
	public String getEnsisop() { return ensisop;} 
	public String getFte() { return fte;} 
	public String getFuksi() { return fuksi;} 
	public String getJarj() { return jarj;} 
	public String getKansalr2() { return kansalr2;} 
	public String getKirtu1k() { return kirtu1k;} 
	public String getKirtu1v() { return kirtu1v;} 
	public String getKk() { return kk;} 
	public String getKkieli() { return kkieli;} 
	public String getKkun() { return kkun;} 
	public String getKoulk() { return koulk;} 
	public String getKoultyp() { return koultyp;} 
	public String getLahde() { return lahde;} 
	public Integer getLasnalk() { return lasnalk;} 
	public Integer getLkm() { return lkm;} 
	public String getLtop() { return ltop;} 
	public String getLuontipvm() { return luontipvm;} 
	public String getOlosyys() { return olosyys;} 
	public String getOlotamm() { return olotamm;} 
	public String getOm() { return om;} 
	public String getOp55() { return op55;} 
	public Integer getOpek() { return opek;} 
	public Integer getOpes() { return opes;} 
	public String getOpkelp() { return opkelp;} 
	public Integer getOpker() { return opker;} 
	public Integer getOplaaj() { return oplaaj;} 
	public String getOpmopa() { return opmopa;} 
	public String getOpoikv() { return opoikv;} 
	public Integer getOpyht0() { return opyht0;} 
	public Integer getOpyht104() { return opyht104;} 
	public Integer getOpyht119() { return opyht119;} 
	public Integer getOpyht120() { return opyht120;} 
	public Integer getOpyht14() { return opyht14;} 
	public Integer getOpyht29() { return opyht29;} 
	public Integer getOpyht44() { return opyht44;} 
	public Integer getOpyht59() { return opyht59;} 
	public Integer getOpyht74() { return opyht74;} 
	public Integer getOpyht89() { return opyht89;} 
	public Integer getPoissalk() { return poissalk;} 
	public String getRahlahde() { return rahlahde;} 
	public String getSp() { return sp;} 
	public String getSyntv() { return syntv;} 
	public String getTilmaa() { return tilmaa;} 
	public String getTilv() { return tilv;} 
	public String getTilvaskun() { return tilvaskun;} 
	public String getTilvaskun2x() { return tilvaskun2x;} 
	public String getTilvaskunx() { return tilvaskunx;} 
	public String getTunn() { return tunn;} 

	public void setAikielir1x( String aikielir1x ) { this.aikielir1x = aikielir1x;} 
	public void setAineisto( String aineisto ) { this.aineisto = aineisto;} 
	public void setAllk( String allk ) { this.allk = allk;} 
	public void setAlvv( String alvv ) { this.alvv = alvv;} 
	public void setAlvvkk( String alvvkk ) { this.alvvkk = alvvkk;} 
	public void setAlvvkklasna( String alvvkklasna ) { this.alvvkklasna = alvvkklasna;} 
	public void setAlvvkksek( String alvvkksek ) { this.alvvkksek = alvvkksek;} 
	public void setAlvvkkseklasna( String alvvkkseklasna ) { this.alvvkkseklasna = alvvkkseklasna;} 
	public void setAlvvopa( String alvvopa ) { this.alvvopa = alvvopa;} 
	public void setAlvvopalasna( String alvvopalasna ) { this.alvvopalasna = alvvopalasna;} 
	public void setAlvvsek( String alvvsek ) { this.alvvsek = alvvsek;} 
	public void setAlvvseklasna( String alvvseklasna ) { this.alvvseklasna = alvvseklasna;} 
	public void setAvo( String avo ) { this.avo = avo;} 
	public void setEnsisop( String ensisop ) { this.ensisop = ensisop;} 
	public void setFte( String fte ) { this.fte = fte;} 
	public void setFuksi( String fuksi ) { this.fuksi = fuksi;} 
	public void setJarj( String jarj ) { this.jarj = jarj;} 
	public void setKansalr2( String kansalr2 ) { this.kansalr2 = kansalr2;} 
	public void setKirtu1k( String kirtu1k ) { this.kirtu1k = kirtu1k;} 
	public void setKirtu1v( String kirtu1v ) { this.kirtu1v = kirtu1v;} 
	public void setKk( String kk ) { this.kk = kk;} 
	public void setKkieli( String kkieli ) { this.kkieli = kkieli;} 
	public void setKkun( String kkun ) { this.kkun = kkun;} 
	public void setKoulk( String koulk ) { this.koulk = koulk;} 
	public void setKoultyp( String koultyp ) { this.koultyp = koultyp;} 
	public void setLahde( String lahde ) { this.lahde = lahde;} 
	public void setLasnalk( Integer lasnalk ) { this.lasnalk = lasnalk;} 
	public void setLkm( Integer lkm ) { this.lkm = lkm;} 
	public void setLtop( String ltop ) { this.ltop = ltop;} 
	public void setLuontipvm( String luontipvm ) { this.luontipvm = luontipvm;} 
	public void setOlosyys( String olosyys ) { this.olosyys = olosyys;} 
	public void setOlotamm( String olotamm ) { this.olotamm = olotamm;} 
	public void setOm( String om ) { this.om = om;} 
	public void setOp55( String op55 ) { this.op55 = op55;} 
	public void setOpek( Integer opek ) { this.opek = opek;} 
	public void setOpes( Integer opes ) { this.opes = opes;} 
	public void setOpkelp( String opkelp ) { this.opkelp = opkelp;} 
	public void setOpker( Integer opker ) { this.opker = opker;} 
	public void setOplaaj( Integer oplaaj ) { this.oplaaj = oplaaj;} 
	public void setOpmopa( String opmopa ) { this.opmopa = opmopa;} 
	public void setOpoikv( String opoikv ) { this.opoikv = opoikv;} 
	public void setOpyht0( Integer opyht0 ) { this.opyht0 = opyht0;} 
	public void setOpyht104( Integer opyht104 ) { this.opyht104 = opyht104;} 
	public void setOpyht119( Integer opyht119 ) { this.opyht119 = opyht119;} 
	public void setOpyht120( Integer opyht120 ) { this.opyht120 = opyht120;} 
	public void setOpyht14( Integer opyht14 ) { this.opyht14 = opyht14;} 
	public void setOpyht29( Integer opyht29 ) { this.opyht29 = opyht29;} 
	public void setOpyht44( Integer opyht44 ) { this.opyht44 = opyht44;} 
	public void setOpyht59( Integer opyht59 ) { this.opyht59 = opyht59;} 
	public void setOpyht74( Integer opyht74 ) { this.opyht74 = opyht74;} 
	public void setOpyht89( Integer opyht89 ) { this.opyht89 = opyht89;} 
	public void setPoissalk( Integer poissalk ) { this.poissalk = poissalk;} 
	public void setRahlahde( String rahlahde ) { this.rahlahde = rahlahde;} 
	public void setSp( String sp ) { this.sp = sp;} 
	public void setSyntv( String syntv ) { this.syntv = syntv;} 
	public void setTilmaa( String tilmaa ) { this.tilmaa = tilmaa;} 
	public void setTilv( String tilv ) { this.tilv = tilv;} 
	public void setTilvaskun( String tilvaskun ) { this.tilvaskun = tilvaskun;} 
	public void setTilvaskun2x( String tilvaskun2x ) { this.tilvaskun2x = tilvaskun2x;} 
	public void setTilvaskunx( String tilvaskunx ) { this.tilvaskunx = tilvaskunx;} 
	public void setTunn( String tunn ) { this.tunn = tunn;} 

	
}
