package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKOpiskEnnakko;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TKOpiskEnnakkoRepositoryTest extends BaseRepositoryTest<TKOpiskEnnakko> {

    @Autowired
    private TKOpiskEnnakkoRepository repository;

    @Test
    public void testStreamAll() throws Exception {
          assertStreamResults(Arrays.asList(
		  
				createEntity( 1L,"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a",1,1,"a","a","a","a","a","a",1,1,"a",1,1,"a","a",1,1,1,1,1,1,1,1,1,1,1,"a","a","a","a","a","a","a","a","a" ),
				createEntity( 2L,"b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b",2,2,"b","b","b","b","b","b",2,2,"b",2,2,"b","b",2,2,2,2,2,2,2,2,2,2,2,"b","b","b","b","b","b","b","b","b" )
				
						),
						repository.streamAll()
										);
    }

    private TKOpiskEnnakko createEntity( long id,	
										 String aikielir1x ,
										 String aineisto ,
										 String allk ,
										 String alvv ,
										 String alvvkk ,
										 String alvvkklasna ,
										 String alvvkksek ,
										 String alvvkkseklasna ,
										 String alvvopa ,
										 String alvvopalasna ,
										 String alvvsek ,
										 String alvvseklasna ,
										 String avo ,
										 String ensisop ,
										 String fte ,
										 String fuksi ,
										 String jarj ,
										 String kansalr2 ,
										 String kirtu1k ,
										 String kirtu1v ,
										 String kk ,
										 String kkieli ,
										 String kkun ,
										 String koulk ,
										 String koultyp ,
										 String lahde ,
										 int lasnalk ,
										 int lkm ,
										 String ltop ,
										 String luontipvm ,
										 String olosyys ,
										 String olotamm ,
										 String om ,
										 String op55 ,
										 int opek ,
										 int opes ,
										 String opkelp ,
										 int opker ,
										 int oplaaj ,
										 String opmopa ,
										 String opoikv ,
										 int opyht0 ,
										 int opyht104 ,
										 int opyht119 ,
										 int opyht120 ,
										 int opyht14 ,
										 int opyht29 ,
										 int opyht44 ,
										 int opyht59 ,
										 int opyht74 ,
										 int opyht89 ,
										 int poissalk ,
										 String rahlahde ,
										 String sp ,
										 String syntv ,
										 String tilmaa ,
										 String tilv ,
										 String tilvaskun ,
										 String tilvaskun2x ,
										 String tilvaskunx ,
										 String tunn  
											 )
														
														{

		TKOpiskEnnakko entity = new TKOpiskEnnakko();

					entity.setId(id);
					entity.setAikielir1x(aikielir1x);
					entity.setAineisto(aineisto);
					entity.setAllk(allk);
					entity.setAlvv(alvv);
					entity.setAlvvkk(alvvkk);
					entity.setAlvvkklasna(alvvkklasna);
					entity.setAlvvkksek(alvvkksek);
					entity.setAlvvkkseklasna(alvvkkseklasna);
					entity.setAlvvopa(alvvopa);
					entity.setAlvvopalasna(alvvopalasna);
					entity.setAlvvsek(alvvsek);
					entity.setAlvvseklasna(alvvseklasna);
					entity.setAvo(avo);
					entity.setEnsisop(ensisop);
					entity.setFte(fte);
					entity.setFuksi(fuksi);
					entity.setJarj(jarj);
					entity.setKansalr2(kansalr2);
					entity.setKirtu1k(kirtu1k);
					entity.setKirtu1v(kirtu1v);
					entity.setKk(kk);
					entity.setKkieli(kkieli);
					entity.setKkun(kkun);
					entity.setKoulk(koulk);
					entity.setKoultyp(koultyp);
					entity.setLahde(lahde);
					entity.setLasnalk(lasnalk);
					entity.setLkm(lkm);
					entity.setLtop(ltop);
					entity.setLuontipvm(luontipvm);
					entity.setOlosyys(olosyys);
					entity.setOlotamm(olotamm);
					entity.setOm(om);
					entity.setOp55(op55);
					entity.setOpek(opek);
					entity.setOpes(opes);
					entity.setOpkelp(opkelp);
					entity.setOpker(opker);
					entity.setOplaaj(oplaaj);
					entity.setOpmopa(opmopa);
					entity.setOpoikv(opoikv);
					entity.setOpyht0(opyht0);
					entity.setOpyht104(opyht104);
					entity.setOpyht119(opyht119);
					entity.setOpyht120(opyht120);
					entity.setOpyht14(opyht14);
					entity.setOpyht29(opyht29);
					entity.setOpyht44(opyht44);
					entity.setOpyht59(opyht59);
					entity.setOpyht74(opyht74);
					entity.setOpyht89(opyht89);
					entity.setPoissalk(poissalk);
					entity.setRahlahde(rahlahde);
					entity.setSp(sp);
					entity.setSyntv(syntv);
					entity.setTilmaa(tilmaa);
					entity.setTilv(tilv);
					entity.setTilvaskun(tilvaskun);
					entity.setTilvaskun2x(tilvaskun2x);
					entity.setTilvaskunx(tilvaskunx);
					entity.setTunn(tunn);
					
        em.persist(entity);
        return entity;
    }
}
