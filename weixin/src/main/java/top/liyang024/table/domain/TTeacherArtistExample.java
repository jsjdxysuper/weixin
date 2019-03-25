package top.liyang024.table.domain;

import java.util.ArrayList;
import java.util.List;

public class TTeacherArtistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeacherArtistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCParentIdIsNull() {
            addCriterion("c_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCParentIdIsNotNull() {
            addCriterion("c_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCParentIdEqualTo(Integer value) {
            addCriterion("c_parent_id =", value, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdNotEqualTo(Integer value) {
            addCriterion("c_parent_id <>", value, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdGreaterThan(Integer value) {
            addCriterion("c_parent_id >", value, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_parent_id >=", value, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdLessThan(Integer value) {
            addCriterion("c_parent_id <", value, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_parent_id <=", value, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdIn(List<Integer> values) {
            addCriterion("c_parent_id in", values, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdNotIn(List<Integer> values) {
            addCriterion("c_parent_id not in", values, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdBetween(Integer value1, Integer value2) {
            addCriterion("c_parent_id between", value1, value2, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_parent_id not between", value1, value2, "cParentId");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNull() {
            addCriterion("c_title is null");
            return (Criteria) this;
        }

        public Criteria andCTitleIsNotNull() {
            addCriterion("c_title is not null");
            return (Criteria) this;
        }

        public Criteria andCTitleEqualTo(String value) {
            addCriterion("c_title =", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotEqualTo(String value) {
            addCriterion("c_title <>", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThan(String value) {
            addCriterion("c_title >", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_title >=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThan(String value) {
            addCriterion("c_title <", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLessThanOrEqualTo(String value) {
            addCriterion("c_title <=", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleLike(String value) {
            addCriterion("c_title like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotLike(String value) {
            addCriterion("c_title not like", value, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleIn(List<String> values) {
            addCriterion("c_title in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotIn(List<String> values) {
            addCriterion("c_title not in", values, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleBetween(String value1, String value2) {
            addCriterion("c_title between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCTitleNotBetween(String value1, String value2) {
            addCriterion("c_title not between", value1, value2, "cTitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleIsNull() {
            addCriterion("c_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andCSubtitleIsNotNull() {
            addCriterion("c_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andCSubtitleEqualTo(String value) {
            addCriterion("c_subtitle =", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleNotEqualTo(String value) {
            addCriterion("c_subtitle <>", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleGreaterThan(String value) {
            addCriterion("c_subtitle >", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_subtitle >=", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleLessThan(String value) {
            addCriterion("c_subtitle <", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleLessThanOrEqualTo(String value) {
            addCriterion("c_subtitle <=", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleLike(String value) {
            addCriterion("c_subtitle like", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleNotLike(String value) {
            addCriterion("c_subtitle not like", value, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleIn(List<String> values) {
            addCriterion("c_subtitle in", values, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleNotIn(List<String> values) {
            addCriterion("c_subtitle not in", values, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleBetween(String value1, String value2) {
            addCriterion("c_subtitle between", value1, value2, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCSubtitleNotBetween(String value1, String value2) {
            addCriterion("c_subtitle not between", value1, value2, "cSubtitle");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitIsNull() {
            addCriterion("c_headportrait is null");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitIsNotNull() {
            addCriterion("c_headportrait is not null");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitEqualTo(String value) {
            addCriterion("c_headportrait =", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitNotEqualTo(String value) {
            addCriterion("c_headportrait <>", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitGreaterThan(String value) {
            addCriterion("c_headportrait >", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("c_headportrait >=", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitLessThan(String value) {
            addCriterion("c_headportrait <", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitLessThanOrEqualTo(String value) {
            addCriterion("c_headportrait <=", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitLike(String value) {
            addCriterion("c_headportrait like", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitNotLike(String value) {
            addCriterion("c_headportrait not like", value, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitIn(List<String> values) {
            addCriterion("c_headportrait in", values, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitNotIn(List<String> values) {
            addCriterion("c_headportrait not in", values, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitBetween(String value1, String value2) {
            addCriterion("c_headportrait between", value1, value2, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCHeadportraitNotBetween(String value1, String value2) {
            addCriterion("c_headportrait not between", value1, value2, "cHeadportrait");
            return (Criteria) this;
        }

        public Criteria andCIndexIsNull() {
            addCriterion("c_index is null");
            return (Criteria) this;
        }

        public Criteria andCIndexIsNotNull() {
            addCriterion("c_index is not null");
            return (Criteria) this;
        }

        public Criteria andCIndexEqualTo(Float value) {
            addCriterion("c_index =", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotEqualTo(Float value) {
            addCriterion("c_index <>", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexGreaterThan(Float value) {
            addCriterion("c_index >", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexGreaterThanOrEqualTo(Float value) {
            addCriterion("c_index >=", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexLessThan(Float value) {
            addCriterion("c_index <", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexLessThanOrEqualTo(Float value) {
            addCriterion("c_index <=", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexIn(List<Float> values) {
            addCriterion("c_index in", values, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotIn(List<Float> values) {
            addCriterion("c_index not in", values, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexBetween(Float value1, Float value2) {
            addCriterion("c_index between", value1, value2, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotBetween(Float value1, Float value2) {
            addCriterion("c_index not between", value1, value2, "cIndex");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}