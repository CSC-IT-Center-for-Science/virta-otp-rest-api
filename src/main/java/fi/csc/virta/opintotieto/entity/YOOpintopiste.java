package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "YO_Opintopiste")
public class YOOpintopiste extends Opintopiste {

    private Double erillinenopettaja;

    public Double getErillinenopettaja() {
        return erillinenopettaja;
    }

    public void setErillinenopettaja(Double erillinenopettaja) {
        this.erillinenopettaja = erillinenopettaja;
    }
}
