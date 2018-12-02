package top.liyang024.table.domain;

public class TUploadres {
    private String cFilename;

    private String cTime;

    private String cMark;

    private String cSufix;

    private String cType;

    public String getcFilename() {
        return cFilename;
    }

    public void setcFilename(String cFilename) {
        this.cFilename = cFilename == null ? null : cFilename.trim();
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime == null ? null : cTime.trim();
    }

    public String getcMark() {
        return cMark;
    }

    public void setcMark(String cMark) {
        this.cMark = cMark == null ? null : cMark.trim();
    }

    public String getcSufix() {
        return cSufix;
    }

    public void setcSufix(String cSufix) {
        this.cSufix = cSufix == null ? null : cSufix.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }
}