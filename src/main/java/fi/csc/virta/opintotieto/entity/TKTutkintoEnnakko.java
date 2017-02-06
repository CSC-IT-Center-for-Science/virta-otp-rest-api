package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TK_Tutk_Ennakko")
@JsonPropertyOrder(alphabetic = true)
public class TKTutkintoEnnakko {
    
    @Id
    private Long id; 
	private String aikielir1x;
	private String aineisto;
	private String allk;
	private String alvv;
	private String alvvkk;
	private String alvvkklasna;
	private String alvvkksek;
	private String alvvkkseklasna;
	private String alvvopa;
	private String alvvopalasna;
	private String alvvsek;
	private String alvvseklasna;
	private String jarj;
	private String kansalr2;
	private String kirtu1k;
	private String kirtu1v;
	private String kkieli;
	private String kkun;
	private String koulk;
	private String koultyp;
	private String lahde;
	private Integer lasnalk;
	private Integer lkm;
	private String ltop;
	private String luontipvm;
	private String om;
	private Integer opamkyo;
	private Integer opaylio;
	private String opkelp;
	private Integer oplaaj;
	private Integer opmamk;
	private String opmopa;
	private Integer opmuuamk;
	private Integer opmuuyo;
	private Integer opmylio;
	private Integer opoamk;
	private Integer opoylio;
	private Integer opulkomamk;
	private Integer opulkyo;
	private Integer opyhtamk;
	private Integer opyhtyo;
	private Integer opylamamk;
	private Integer opyliopamk;
	private Integer poissalk;
	private String rahlahde;
	private String sp;
	private String suorlk;
	private String suorv;
	private String syntv;
	private String tilmaa;
	private String tilv;
	private String tilvaskun;
	private String tilvaskunx;
	private String tunn;


    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }

	public void setAikielir1x ( String aikielir1x ) { this.aikielir1x = aikielir1x; }
	public String getAikielir1x() {  return  aikielir1x; }

	public void setAineisto ( String aineisto ) { this.aineisto = aineisto; }
	public String getAineisto() {  return  aineisto; }

	public void setAllk ( String allk ) { this.allk = allk; }
	public String getAllk() {  return  allk; }
	
	public void setAlvv ( String alvv ) { this.alvv = alvv; }
	public String getAlvv() {  return  alvv; }
	
	public void setAlvvkk ( String alvvkk ) { this.alvvkk = alvvkk; }
	public String getAlvvkk() {  return  alvvkk; }
	
	public void setAlvvkklasna ( String alvvkklasna ) { this.alvvkklasna = alvvkklasna; }
	public String getAlvvkklasna() {  return  alvvkklasna; }
	
	public void setAlvvkksek ( String alvvkksek ) { this.alvvkksek = alvvkksek; }
	public String getAlvvkksek() {  return  alvvkksek; }
	
	public void setAlvvkkseklasna ( String alvvkkseklasna ) { this.alvvkkseklasna = alvvkkseklasna; }
	public String getAlvvkkseklasna() {  return  alvvkkseklasna; }
	
	public void setAlvvopa ( String alvvopa ) { this.alvvopa = alvvopa; }
	public String getAlvvopa() {  return  alvvopa; }
	
	public void setAlvvopalasna ( String alvvopalasna ) { this.alvvopalasna = alvvopalasna; }
	public String getAlvvopalasna() {  return  alvvopalasna; }
	
	public void setAlvvsek ( String alvvsek ) { this.alvvsek = alvvsek; }
	public String getAlvvsek() {  return  alvvsek; }
	
	public void setAlvvseklasna ( String alvvseklasna ) { this.alvvseklasna = alvvseklasna; }
	public String getAlvvseklasna() {  return  alvvseklasna; }
	
	public void setJarj ( String jarj ) { this.jarj = jarj; }
	public String getJarj() {  return  jarj; }
	
	public void setKansalr2 ( String kansalr2 ) { this.kansalr2 = kansalr2; }
	public String getKansalr2() {  return  kansalr2; }
	
	public void setKirtu1k ( String kirtu1k ) { this.kirtu1k = kirtu1k; }
	public String getKirtu1k() {  return  kirtu1k; }
	
	public void setKirtu1v ( String kirtu1v ) { this.kirtu1v = kirtu1v; }
	public String getKirtu1v() {  return  kirtu1v; }
	
	public void setKkieli ( String kkieli ) { this.kkieli = kkieli; }
	public String getKkieli() {  return  kkieli; }
	
	public void setKkun ( String kkun ) { this.kkun = kkun; }
	public String getKkun() {  return  kkun; }
	
	public void setKoulk ( String koulk ) { this.koulk = koulk; }
	public String getKoulk() {  return  koulk; }
	
	public void setKoultyp ( String koultyp ) { this.koultyp = koultyp; }
	public String getKoultyp() {  return  koultyp; }
	
	public void setLahde ( String lahde ) { this.lahde = lahde; }
	public String getLahde() {  return  lahde; }
	
	public void setLasnalk ( Integer lasnalk ) { this.lasnalk = lasnalk; }
	public Integer getLasnalk() {  return  lasnalk; }
	
	public void setLkm ( Integer lkm ) { this.lkm = lkm; }
	public Integer getLkm() {  return  lkm; }
	
	public void setLtop ( String ltop ) { this.ltop = ltop; }
	public String getLtop() {  return  ltop; }
	
	public void setLuontipvm ( String luontipvm ) { this.luontipvm = luontipvm; }
	public String getLuontipvm() {  return  luontipvm; }
	
	public void setOm ( String om ) { this.om = om; }
	public String getOm() {  return  om; }
	
	public void setOpamkyo ( Integer opamkyo ) { this.opamkyo = opamkyo; }
	public Integer getOpamkyo() {  return  opamkyo; }
	
	public void setOpaylio ( Integer opaylio ) { this.opaylio = opaylio; }
	public Integer getOpaylio() {  return  opaylio; }
	
	public void setOpkelp ( String opkelp ) { this.opkelp = opkelp; }
	public String getOpkelp() {  return  opkelp; }
	
	public void setOplaaj ( Integer oplaaj ) { this.oplaaj = oplaaj; }
	public Integer getOplaaj() {  return  oplaaj; }
	
	public void setOpmamk ( Integer opmamk ) { this.opmamk = opmamk; }
	public Integer getOpmamk() {  return  opmamk; }
	
	public void setOpmopa ( String opmopa ) { this.opmopa = opmopa; }
	public String getOpmopa() {  return  opmopa; }
	
	public void setOpmuuamk ( Integer opmuuamk ) { this.opmuuamk = opmuuamk; }
	public Integer getOpmuuamk() {  return  opmuuamk; }
	
	public void setOpmuuyo ( Integer opmuuyo ) { this.opmuuyo = opmuuyo; }
	public Integer getOpmuuyo() {  return  opmuuyo; }
	
	public void setOpmylio ( Integer opmylio ) { this.opmylio = opmylio; }
	public Integer getOpmylio() {  return  opmylio; }
	
	public void setOpoamk ( Integer opoamk ) { this.opoamk = opoamk; }
	public Integer getOpoamk() {  return  opoamk; }
	
	public void setOpoylio ( Integer opoylio ) { this.opoylio = opoylio; }
	public Integer getOpoylio() {  return  opoylio; }
	
	public void setOpulkomamk ( Integer opulkomamk ) { this.opulkomamk = opulkomamk; }
	public Integer getOpulkomamk() {  return  opulkomamk; }
	
	public void setOpulkyo ( Integer opulkyo ) { this.opulkyo = opulkyo; }
	public Integer getOpulkyo() {  return  opulkyo; }
	
	public void setOpyhtamk ( Integer opyhtamk ) { this.opyhtamk = opyhtamk; }
	public Integer getOpyhtamk() {  return  opyhtamk; }
	
	public void setOpyhtyo ( Integer opyhtyo ) { this.opyhtyo = opyhtyo; }
	public Integer getOpyhtyo() {  return  opyhtyo; }
	
	public void setOpylamamk ( Integer opylamamk ) { this.opylamamk = opylamamk; }
	public Integer getOpylamamk() {  return  opylamamk; }
	
	public void setOpyliopamk ( Integer opyliopamk ) { this.opyliopamk = opyliopamk; }
	public Integer getOpyliopamk() {  return  opyliopamk; }
	
	public void setPoissalk ( Integer poissalk ) { this.poissalk = poissalk; }
	public Integer getPoissalk() {  return  poissalk; }
	
	public void setRahlahde ( String rahlahde ) { this.rahlahde = rahlahde; }
	public String getRahlahde() {  return  rahlahde; }
	
	public void setSp ( String sp ) { this.sp = sp; }
	public String getSp() {  return  sp; }
	
	public void setSuorlk ( String suorlk ) { this.suorlk = suorlk; }
	public String getSuorlk() {  return  suorlk; }
	
	public void setSuorv ( String suorv ) { this.suorv = suorv; }
	public String getSuorv() {  return  suorv; }
	
	public void setSyntv ( String syntv ) { this.syntv = syntv; }
	public String getSyntv() {  return  syntv; }
	
	public void setTilmaa ( String tilmaa ) { this.tilmaa = tilmaa; }
	public String getTilmaa() {  return  tilmaa; }
	
	public void setTilv ( String tilv ) { this.tilv = tilv; }
	public String getTilv() {  return  tilv; }
	
	public void setTilvaskun ( String tilvaskun ) { this.tilvaskun = tilvaskun; }
	public String getTilvaskun() {  return  tilvaskun; }
	
	public void setTilvaskunx ( String tilvaskunx ) { this.tilvaskunx = tilvaskunx; }
	public String getTilvaskunx() {  return  tilvaskunx; }
	
	public void setTunn ( String tunn ) { this.tunn = tunn; }
	public String getTunn() {  return  tunn; }
	
	
}
