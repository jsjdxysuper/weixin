package top.liyang024.table.domain;

public class TSysCodeKey {
    private Byte cIndex;

    private String cId;

    private String cTypeid;

    public Byte getcIndex() {
        return cIndex;
    }

    public void setcIndex(Byte cIndex) {
        this.cIndex = cIndex;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcTypeid() {
        return cTypeid;
    }

    public void setcTypeid(String cTypeid) {
        this.cTypeid = cTypeid == null ? null : cTypeid.trim();
    }
}