package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TK_tutk_YO")
public class TKTutkYO extends TKTutk {

    private String aikieliy;
    private String kansaly;
    private String kirtu;
    private String kk;
    private String koulky;
    private String lkmmt;
    private String om;
    private String opamk;
    private String opaylio;
    private String opmylio;
    private String opoik;
    private String opoylio;
    private String sv;

    public String getAikieliy() {
        return aikieliy;
    }

    public void setAikieliy(String aikieliy) {
        this.aikieliy = aikieliy;
    }

    public String getKansaly() {
        return kansaly;
    }

    public void setKansaly(String kansaly) {
        this.kansaly = kansaly;
    }

    public String getKirtu() {
        return kirtu;
    }

    public void setKirtu(String kirtu) {
        this.kirtu = kirtu;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    public String getKoulky() {
        return koulky;
    }

    public void setKoulky(String koulky) {
        this.koulky = koulky;
    }

    public String getLkmmt() {
        return lkmmt;
    }

    public void setLkmmt(String lkmmt) {
        this.lkmmt = lkmmt;
    }

    public String getOm() {
        return om;
    }

    public void setOm(String om) {
        this.om = om;
    }

    public String getOpamk() {
        return opamk;
    }

    public void setOpamk(String opamk) {
        this.opamk = opamk;
    }

    public String getOpaylio() {
        return opaylio;
    }

    public void setOpaylio(String opaylio) {
        this.opaylio = opaylio;
    }

    public String getOpmylio() {
        return opmylio;
    }

    public void setOpmylio(String opmylio) {
        this.opmylio = opmylio;
    }

    public String getOpoik() {
        return opoik;
    }

    public void setOpoik(String opoik) {
        this.opoik = opoik;
    }

    public String getOpoylio() {
        return opoylio;
    }

    public void setOpoylio(String opoylio) {
        this.opoylio = opoylio;
    }

    public String getSv() {
        return sv;
    }

    public void setSv(String sv) {
        this.sv = sv;
    }
}
