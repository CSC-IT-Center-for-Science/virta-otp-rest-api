package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.Cimo;

import java.util.Date;

public abstract class CIMORepositoryTest<T extends Cimo> extends BaseRepositoryTest<T> {

    protected T createEntity(Class<T> tClass, Long id) throws IllegalAccessException, InstantiationException {
        T entity = tClass.newInstance();
        entity.setHetu("hetu" + id);
        entity.setId(id);
        entity.setJaksoAlkupvm(new Date());
        entity.setJaksoLoppupvm(new Date());
        entity.setKesto("kesto" + id);
        entity.setKoultyp("koultyp" + id);
        entity.setKoulutusala("koulutusala" + id);
        entity.setKoulutuskoodi("koulutuskoodi" + id);
        entity.setLiikkuvuusjaksoavain("liikkuvuusjaksoavain" + id);
        entity.setLiikkuvuusjaksoId(id.intValue());
        entity.setLuoja("luoja" + id);
        entity.setLuontipaivamaara(new Date());
        entity.setOpintoaste("opintoaste" + id);
        entity.setOpiskelijaId(id.intValue());
        entity.setOpiskelijaavain("opiskelijaavain" + id);
        entity.setOpiskeluoikeusId(id.intValue());
        entity.setOpiskeluoikeusavain("opiskeluoikeusavain" + id);
        entity.setOppilaitos("oppilaitos" + id);
        entity.setSp("sp" + id);
        entity.setTyyppi("tyyppi" + id);	
		entity.setXIka(id.intValue());
        em.persist(entity);
        return entity;
    }
}
