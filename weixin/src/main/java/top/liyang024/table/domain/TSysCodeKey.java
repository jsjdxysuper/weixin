package top.liyang024.table.domain;

public class TSysCodeKey {
    private String cTypeid;

    private String cId;

    public String getcTypeid() {
        return cTypeid;
    }

    public void setcTypeid(String cTypeid) {
        this.cTypeid = cTypeid == null ? null : cTypeid.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }
}