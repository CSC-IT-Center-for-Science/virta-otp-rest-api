package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "opintopiste_pvm_yo")
public class OpintopistePvmYO extends OpintopistePvm {

    private Integer erillinenOpintoOpettaja;

    public Integer getErillinenOpintoOpettaja() {
        return erillinenOpintoOpettaja;
    }

    public void setErillinenOpintoOpettaja(Integer erillinenOpintoOpettaja) {
        this.erillinenOpintoOpettaja = erillinenOpintoOpettaja;
    }
}
