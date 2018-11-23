package top.liyang024.table.domain;

import java.util.List;

public class TUrl {
    private String cId;

    private String cUrl;

    private String cParentid;

    private String cTitle;

    private String cName;

    private String cIcon;

    private Integer cIndex;

    private List<TUrl>subMenu;
    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl == null ? null : cUrl.trim();
    }

    public String getcParentid() {
        return cParentid;
    }

    public void setcParentid(String cParentid) {
        this.cParentid = cParentid == null ? null : cParentid.trim();
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle == null ? null : cTitle.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcIcon() {
        return cIcon;
    }

    public void setcIcon(String cIcon) {
        this.cIcon = cIcon == null ? null : cIcon.trim();
    }

    public Integer getcIndex() {
        return cIndex;
    }

    public void setcIndex(Integer cIndex) {
        this.cIndex = cIndex;
    }

	public List<TUrl> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<TUrl> subMenu) {
		this.subMenu = subMenu;
	}
    
}