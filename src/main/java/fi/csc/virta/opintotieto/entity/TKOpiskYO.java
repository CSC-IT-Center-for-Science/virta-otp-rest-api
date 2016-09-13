package fi.csc.virta.opintotieto.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TK_opisk_YO")
public class TKOpiskYO extends TKOpisk {

    private String aikieliy;
    private String askuntay;
    private String avo;
    private String fuksi;
    private String kansaly;
    private String kirtu;
    private String kk;
    private String lkmmt;
    private String om;
    private String opoik;
    private String sv;

    public String getAikieliy() {
        return aikieliy;
    }

    public void setAikieliy(String aikieliy) {
        this.aikieliy = aikieliy;
    }

    public String getAskuntay() {
        return askuntay;
    }

    public void setAskuntay(String askuntay) {
        this.askuntay = askuntay;
    }

    public String getAvo() {
        return avo;
    }

    public void setAvo(String avo) {
        this.avo = avo;
    }

    public String getFuksi() {
        return fuksi;
    }

    public void setFuksi(String fuksi) {
        this.fuksi = fuksi;
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

    public String getOpoik() {
        return opoik;
    }

    public void setOpoik(String opoik) {
        this.opoik = opoik;
    }

    public String getSv() {
        return sv;
    }

    public void setSv(String sv) {
        this.sv = sv;
    }
}
