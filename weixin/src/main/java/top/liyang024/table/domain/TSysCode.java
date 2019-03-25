package top.liyang024.table.domain;

public class TSysCode extends TSysCodeKey {
    private String cTypename;

    private String cName;

    private String cVal;

    private String cMark;

    public String getcTypename() {
        return cTypename;
    }

    public void setcTypename(String cTypename) {
        this.cTypename = cTypename == null ? null : cTypename.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcVal() {
        return cVal;
    }

    public void setcVal(String cVal) {
        this.cVal = cVal == null ? null : cVal.trim();
    }

    public String getcMark() {
        return cMark;
    }

    public void setcMark(String cMark) {
        this.cMark = cMark == null ? null : cMark.trim();
    }
}