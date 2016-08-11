package fi.csc.virta.opintotieto.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AMKSuoratTKId implements Serializable {

    private String organisaatiokoodi;
    private Integer vuosi;
    private Integer koulutusala;

    public String getOrganisaatiokoodi() {
        return organisaatiokoodi;
    }

    public void setOrganisaatiokoodi(String organisaatiokoodi) {
        this.organisaatiokoodi = organisaatiokoodi;
    }

    public Integer getVuosi() {
        return vuosi;
    }

    public void setVuosi(Integer vuosi) {
        this.vuosi = vuosi;
    }

    public Integer getKoulutusala() {
        return koulutusala;
    }

    public void setKoulutusala(Integer koulutusala) {
        this.koulutusala = koulutusala;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AMKSuoratTKId that = (AMKSuoratTKId) o;

        if (organisaatiokoodi != null ? !organisaatiokoodi.equals(that.organisaatiokoodi) : that.organisaatiokoodi != null)
            return false;
        if (vuosi != null ? !vuosi.equals(that.vuosi) : that.vuosi != null) return false;
        return !(koulutusala != null ? !koulutusala.equals(that.koulutusala) : that.koulutusala != null);

    }

    @Override
    public int hashCode() {
        int result = organisaatiokoodi != null ? organisaatiokoodi.hashCode() : 0;
        result = 31 * result + (vuosi != null ? vuosi.hashCode() : 0);
        result = 31 * result + (koulutusala != null ? koulutusala.hashCode() : 0);
        return result;
    }
}
