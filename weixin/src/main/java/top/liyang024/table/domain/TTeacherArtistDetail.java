package top.liyang024.table.domain;

public class TTeacherArtistDetail {
    private Integer cId;

    private Integer cPersonId;

    private String cType;

    private String cContent;

    private String cDes1;

    private String cDes2;

    private Float cIndex;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcPersonId() {
        return cPersonId;
    }

    public void setcPersonId(Integer cPersonId) {
        this.cPersonId = cPersonId;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getcDes1() {
        return cDes1;
    }

    public void setcDes1(String cDes1) {
        this.cDes1 = cDes1 == null ? null : cDes1.trim();
    }

    public String getcDes2() {
        return cDes2;
    }

    public void setcDes2(String cDes2) {
        this.cDes2 = cDes2 == null ? null : cDes2.trim();
    }

    public Float getcIndex() {
        return cIndex;
    }

    public void setcIndex(Float cIndex) {
        this.cIndex = cIndex;
    }
}