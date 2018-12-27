package top.liyang024.table.domain;

public class TUploadres {
    private String cFilename;

    private String cTime;

    private String cMark;

    private String cSufix;

    private String cType;

    private String cTypename;

    private String cFilepath;

    private Integer cFilesize;

    private String cDate;

    private String cFiletype;

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

    public String getcTypename() {
        return cTypename;
    }

    public void setcTypename(String cTypename) {
        this.cTypename = cTypename == null ? null : cTypename.trim();
    }

    public String getcFilepath() {
        return cFilepath;
    }

    public void setcFilepath(String cFilepath) {
        this.cFilepath = cFilepath == null ? null : cFilepath.trim();
    }

    public Integer getcFilesize() {
        return cFilesize;
    }

    public void setcFilesize(Integer cFilesize) {
        this.cFilesize = cFilesize;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate == null ? null : cDate.trim();
    }

    public String getcFiletype() {
        return cFiletype;
    }

    public void setcFiletype(String cFiletype) {
        this.cFiletype = cFiletype == null ? null : cFiletype.trim();
    }
}