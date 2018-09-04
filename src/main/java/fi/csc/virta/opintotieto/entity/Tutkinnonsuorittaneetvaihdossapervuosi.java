package fi.csc.virta.opintotieto.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tutkinnonsuorittaneetvaihdossapervuosi")
@JsonPropertyOrder(alphabetic = true)
public class Tutkinnonsuorittaneetvaihdossapervuosi  {
    
    @Id
    private Long id; 
	private Integer ika = 0;
	private String kohdemaakoodi= "";
	private String lahtomaakoodi= "";
	private Integer liikkuvuudenkesto = 0;
	private Integer liikkuvuudenkestoalle3kklkm = 0;
	private Integer liikkuvuudenkestoyli3kklkm = 0;
	private String liikkuvuudensuuntakoodi= "";
	private String liikkuvuudentyyppikoodi= "";
	private String liikkuvuusohjelmakoodi= "";
	private String ohjauksenalakoodi= "";
	private String opiskelijaavain= "";
	private String opiskeluoikeudentyyppikoodi= "";
	private String oppilaitoskoodi= "";
	private String sukupuolikoodi= "";
	private Integer tutkinnonsuoritusvuosi= 0;
	private Date tutkinnonsuorituspaivamaara;
	private String tutkintokoodi= "";


    /*getId funktio   */
    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.id = id;
    }
	
	
	/*getIka*/
	public Integer getIka() {
        return ika;}
		
		
	   /*setIka*/
    public void setIka(Integer ika) {
	this.ika = ika;}
	
	
	
	
	/* getKohdemaakoodi */
	public String getKohdemaakoodi() {
        return kohdemaakoodi;
    }
	
	    /*setKohdemaakoodi*/
    public void setKohdemaakoodi(String kohdemaakoodi) {
        this.kohdemaakoodi = kohdemaakoodi;
    }	

	
	  /* getLahtomaakoodi */
	public String getLahtomaakoodi() {
        return lahtomaakoodi;
    }
	
	    /*setLahtomaakoodi*/
    public void setLahtomaakoodi(String lahtomaakoodi) {
        this.lahtomaakoodi = lahtomaakoodi;
    }	
	
	
	
	
	/*getLiikkuvuudenkesto*/
	public Integer getLiikkuvuudenkesto() {
        return liikkuvuudenkesto;}
		
		
	   /*setLiikkuvuudeenkesto*/
    public void setLiikkuvuudenkesto(Integer liikkuvuudenkesto) {
        this.liikkuvuudenkesto = liikkuvuudenkesto;
    }	
	
	
	
	/*getLiikkuvuudenkestoalle3kklkm*/
	public Integer getLiikkuvuudenkestoalle3kklkm() {
        return liikkuvuudenkestoalle3kklkm;}
		
		
	   /*setLiikkuvuudeenkestoalle3kklkm*/
    public void setLiikkuvuudenkestoalle3kklkm(Integer liikkuvuudenkestoalle3kklkm) {
        this.liikkuvuudenkestoalle3kklkm = liikkuvuudenkestoalle3kklkm;
    }	
	
		/*getLiikkuvuudenkestoalle3kklkm*/
	public Integer getLiikkuvuudenkestoyli3kklkm() {
        return liikkuvuudenkestoyli3kklkm;}
		
		
	   /*setLiikkuvuudeenkestoalle3kklkm*/
    public void setLiikkuvuudenkestoyli3kklkm(Integer liikkuvuudenkestoyli3kklkm) {
        this.liikkuvuudenkestoyli3kklkm = liikkuvuudenkestoyli3kklkm;
    }	
	
	
			/*getLiikkuvuudensuuntakoodi*/
	public String getLiikkuvuudensuuntakoodi() {
        return liikkuvuudensuuntakoodi;}
		
		
	   /*setLiikkuvuudeensuuntakoodi*/
    public void setLiikkuvuudensuuntakoodi(String liikkuvuudensuuntakoodi) {
        this.liikkuvuudensuuntakoodi = liikkuvuudensuuntakoodi;
    }	
	
				/*getLiikkuvuudentyyppikoodi*/
	public String getLiikkuvuudentyyppikoodi() {
        return liikkuvuudentyyppikoodi;}
		
		
	  /*setLiikkuvuudeentyyppikoodi*/
    public void setLiikkuvuudentyyppikoodi(String liikkuvuudentyyppikoodi) {
        this.liikkuvuudentyyppikoodi = liikkuvuudentyyppikoodi;
    }	
	
	
	/*getLiikkuvuusohjelmakoodi*/
	public String getLiikkuvuusohjelmakoodi() {
        return liikkuvuusohjelmakoodi;}
		
		
	   /*setLiikkuvuusohjelmakoodi*/
    public void setLiikkuvuusohjelmakoodi(String liikkuvuusohjelmakoodi) {
        this.liikkuvuusohjelmakoodi = liikkuvuusohjelmakoodi;
    }	
	
	
/* getOhjauksenalakoodi */
	public String getOhjauksenalakoodi() {
       return ohjauksenalakoodi;
    }
	
	
	    /*setOhjauksenalakoodi*/
    public void setOhjauksenalakoodi(String ohjauksenalakoodi) {
        this.ohjauksenalakoodi = ohjauksenalakoodi;
    }	
	
		/*getOpiskelijaAvain*/
	public String getOpiskelijaavain() {
        return opiskelijaavain;}
		
		
	   /*setOpiskelijaAvain*/
    public void setOpiskelijaavain(String opiskelijaavain) {
        this.opiskelijaavain = opiskelijaavain;
    }	
	
			/*getOpiskeluoikeudentyyppikoodi*/
	public String getOpiskeluoikeudentyyppikoodi() {
        return opiskeluoikeudentyyppikoodi;}
		
		
	   /*setOpiskeluoikeudentyyppikoodi*/
    public void setOpiskeluoikeudentyyppikoodi(String opiskeluoikeudentyyppikoodi) {
        this.opiskeluoikeudentyyppikoodi = opiskeluoikeudentyyppikoodi;
    }	
	
				/*getOppilaitoskoodi*/
	public String getOppilaitoskoodi() {
        return oppilaitoskoodi;}
		
		
	   /*setOppilaitoskoodi*/
    public void setOppilaitoskoodi(String oppilaitoskoodi) {
        this.oppilaitoskoodi = oppilaitoskoodi;
    }	
	
	
					/*getSukupuolikoodi*/
	public String getSukupuolikoodi() {
        return sukupuolikoodi;}
		
		
	   /*setSukupuolikoodi*/
    public void setSukupuolikoodi(String sukupuolikoodi) {
        this.sukupuolikoodi = sukupuolikoodi;
    }	
	
	
			/*getTutkinnonsuoritusvuosi*/
	public Integer getTutkinnonsuoritusvuosi() {
        return tutkinnonsuoritusvuosi;}
		
		
	   /*setTutkinnonsuoritusvuosi*/
    public void setTutkinnonsuoritusvuosi(Integer tutkinnonsuoritusvuosi) {
	this.tutkinnonsuoritusvuosi = tutkinnonsuoritusvuosi;}
	

		/*getTutkinnonsuorituspaivamaara*/	
    public Date getTutkinnonsuorituspaivamaara() {
        return tutkinnonsuorituspaivamaara;
    }
    /*setTutkinnonsuorituspaivamaara*/
    public void setTutkinnonsuorituspaivamaara(Date tutkinnonsuorituspaivamaara) {
        this.tutkinnonsuorituspaivamaara = tutkinnonsuorituspaivamaara;
    }   
	
	
	/*getTutkintokoodi*/
	public String getTutkintokoodi() {
        return tutkintokoodi;}
		
		
	   /*setTutkintokoodi*/
    public void setTutkintokoodi(String tutkintokoodi) {
        this.tutkintokoodi = tutkintokoodi;
    }	
	
	

   
		
}
