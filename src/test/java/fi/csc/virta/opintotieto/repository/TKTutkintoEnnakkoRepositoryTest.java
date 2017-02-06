package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.TKTutkintoEnnakko;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;

public class TKTutkintoEnnakkoRepositoryTest extends BaseRepositoryTest<TKTutkintoEnnakko> {

    @Autowired
    private TKTutkintoEnnakkoRepository repository;

    @Test
    public void testStreamAll() throws Exception {       
          assertStreamResults(Arrays.asList(						
                        createEntity( 1L, "fi", "a", "a", "1", "1", "1", "1", "1", "1", "1", "1", "aa", "1", "1", "1", "a", "1", "1", "1", "a", "a", 1, 1, "a", "1", "1", 1, 1, "a", 1, 1, "1", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"),
                        createEntity( 2L, "sv", "b", "b", "2", "2", "2", "2", "2", "2", "2", "2", "bb", "2", "2", "2", "b", "2", "2", "2", "b", "b", 2, 2, "b", "2", "2", 2, 2, "b", 2, 2, "2", 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, "2", "2", "2", "2", "2", "2", "2", "2", "2", "2"),
						createEntity( 3L, "fi", "c", "c", "3", "3", "3", "3", "3", "3", "3", "3", "cc", "3", "3", "3", "c", "3", "3", "3", "c", "c", 3, 3, "c", "3", "3", 3, 3, "c", 3, 3, "3", 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, "3", "3", "3", "3", "3", "3", "3", "3", "3", "3")
						),						
						repository.streamAll()
										);
    }

    private TKTutkintoEnnakko createEntity( long id, String aikielir1x, String aineisto, String allk, String alvv, String alvvkk, String alvvkklasna,  String alvvkksek, String alvvkkseklasna, String alvvopa, String alvvopalasna, String alvvsek, String alvvseklasna, String jarj, String kansalr2, String kirtu1k, String kirtu1v, String kkieli, String kkun, String koulk, String koultyp, String lahde, int lasnalk, int lkm, String ltop, String luontipvm , String om , Integer opamkyo,Integer opaylio ,String opkelp, Integer oplaaj,Integer opmamk ,String opmopa, Integer opmuuamk, Integer opmuuyo, int opmylio, int opoamk, int opoylio, int opulkomamk, int opulkyo, int opyhtamk, int opyhtyo, int opylamamk, int opyliopamk, int poissalk, String rahlahde, String sp, String suorlk ,String suorv, String syntv, String tilmaa, String tilv, String tilvaskun, String tilvaskunx, String tunn ) {
        		
		TKTutkintoEnnakko entity = new TKTutkintoEnnakko();
		
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
		entity.setJarj(jarj);
		entity.setKansalr2(kansalr2);
		entity.setKirtu1k(kirtu1k);
		entity.setKirtu1v(kirtu1v);
		entity.setKkieli(kkieli);
		entity.setKkun(kkun);
		entity.setKoulk(koulk);
		entity.setKoultyp(koultyp);
		entity.setLahde(lahde);
		entity.setLasnalk(lasnalk);
		entity.setLkm(lkm);
		entity.setLtop(ltop);
		entity.setLuontipvm(luontipvm);
		entity.setOm(om);
		entity.setOpamkyo(opamkyo);
		entity.setOpaylio(opaylio);
		entity.setOpkelp(opkelp);
		entity.setOplaaj(oplaaj);
		entity.setOpmamk(opmamk);
		entity.setOpmopa(opmopa);
		entity.setOpmuuamk(opmuuamk);
		entity.setOpmuuyo(opmuuyo);
		entity.setOpmylio(opmylio);
		entity.setOpoamk(opoamk);
		entity.setOpoylio(opoylio);
		entity.setOpulkomamk(opulkomamk);
		entity.setOpulkyo(opulkyo);
		entity.setOpyhtamk(opyhtamk);
		entity.setOpyhtyo(opyhtyo);
		entity.setOpylamamk(opylamamk);
		entity.setOpyliopamk(opyliopamk);
		entity.setPoissalk(poissalk);
		entity.setRahlahde(rahlahde);
		entity.setSp(sp);
		entity.setSuorlk(suorlk);
		entity.setSuorv(suorv);
		entity.setSyntv(syntv);
		entity.setTilmaa(tilmaa);
		entity.setTilv(tilv);
		entity.setTilvaskun(tilvaskun);
		entity.setTilvaskunx(tilvaskunx);
		entity.setTunn(tunn);		
        em.persist(entity);
		
        return entity;
    }
}