package fi.csc.virta.opintotieto.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AMKOpintopisteId implements Serializable {

    private Integer vuosi = 0;
    private String koodi;
    private String db = "";
    private String koulutustyyppi = "";

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }

    public String getKoodi() {
        return koodi;
    }

    public void setKoodi(String koodi) {
        this.koodi = koodi;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getKoulutustyyppi() {
        return koulutustyyppi;
    }

    public void setKoulutustyyppi(String koulutustyyppi) {
        this.koulutustyyppi = koulutustyyppi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AMKOpintopisteId that = (AMKOpintopisteId) o;

        if (!vuosi.equals(that.vuosi)) return false;
        if (!koodi.equals(that.koodi)) return false;
        if (!db.equals(that.db)) return false;
        return koulutustyyppi.equals(that.koulutustyyppi);

    }

    @Override
    public int hashCode() {
        int result = vuosi.hashCode();
        result = 31 * result + koodi.hashCode();
        result = 31 * result + db.hashCode();
        result = 31 * result + koulutustyyppi.hashCode();
        return result;
    }
}
