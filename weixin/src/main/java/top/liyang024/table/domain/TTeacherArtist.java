package top.liyang024.table.domain;

public class TTeacherArtist {
    private Integer cId;

    private Integer cParentId;

    private String cTitle;

    private String cSubtitle;

    private String cHeadportrait;

    private Float cIndex;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcParentId() {
        return cParentId;
    }

    public void setcParentId(Integer cParentId) {
        this.cParentId = cParentId;
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle == null ? null : cTitle.trim();
    }

    public String getcSubtitle() {
        return cSubtitle;
    }

    public void setcSubtitle(String cSubtitle) {
        this.cSubtitle = cSubtitle == null ? null : cSubtitle.trim();
    }

    public String getcHeadportrait() {
        return cHeadportrait;
    }

    public void setcHeadportrait(String cHeadportrait) {
        this.cHeadportrait = cHeadportrait == null ? null : cHeadportrait.trim();
    }

    public Float getcIndex() {
        return cIndex;
    }

    public void setcIndex(Float cIndex) {
        this.cIndex = cIndex;
    }
}