package top.liyang024.table.domain;

import java.util.List;

public class TCatagorytree {
    private String cUid;
    private String cName;
    private String cMark1;
    private String cMark2;
    private String cMark3;
    private String cImage;
    private String cLayername;
    private String cLayerid;
    private String cParentid;
    private Byte cIndex;
    private String cType;
    private List<TCatagorytree>subTree;
    
    public String getcUid() {
        return cUid;
    }

    public void setcUid(String cUid) {
        this.cUid = cUid == null ? null : cUid.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcMark1() {
        return cMark1;
    }

    public void setcMark1(String cMark1) {
        this.cMark1 = cMark1 == null ? null : cMark1.trim();
    }

    public String getcMark2() {
        return cMark2;
    }

    public void setcMark2(String cMark2) {
        this.cMark2 = cMark2 == null ? null : cMark2.trim();
    }

    public String getcMark3() {
        return cMark3;
    }

    public void setcMark3(String cMark3) {
        this.cMark3 = cMark3 == null ? null : cMark3.trim();
    }

    public String getcImage() {
        return cImage;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage == null ? null : cImage.trim();
    }

    public String getcLayername() {
        return cLayername;
    }

    public void setcLayername(String cLayername) {
        this.cLayername = cLayername == null ? null : cLayername.trim();
    }

    public String getcLayerid() {
        return cLayerid;
    }

    public void setcLayerid(String cLayerid) {
        this.cLayerid = cLayerid == null ? null : cLayerid.trim();
    }

    public String getcParentid() {
        return cParentid;
    }

    public void setcParentid(String cParentid) {
        this.cParentid = cParentid == null ? null : cParentid.trim();
    }

    public Byte getcIndex() {
        return cIndex;
    }

    public void setcIndex(Byte cIndex) {
        this.cIndex = cIndex;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

	public List<TCatagorytree> getSubTree() {
		return subTree;
	}

	public void setSubTree(List<TCatagorytree> subTree) {
		this.subTree = subTree;
	}
    
}