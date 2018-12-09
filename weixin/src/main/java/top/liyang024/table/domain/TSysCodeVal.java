package top.liyang024.table.domain;

public class TSysCodeVal extends TSysCodeValKey {
    private String cValue;

    private Integer cIndex;

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue == null ? null : cValue.trim();
    }

    public Integer getcIndex() {
        return cIndex;
    }

    public void setcIndex(Integer cIndex) {
        this.cIndex = cIndex;
    }
}