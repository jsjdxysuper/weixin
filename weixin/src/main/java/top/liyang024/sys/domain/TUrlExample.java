package top.liyang024.sys.domain;

import java.util.ArrayList;
import java.util.List;

public class TUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUrlExample() {
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

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCUrlIsNull() {
            addCriterion("c_url is null");
            return (Criteria) this;
        }

        public Criteria andCUrlIsNotNull() {
            addCriterion("c_url is not null");
            return (Criteria) this;
        }

        public Criteria andCUrlEqualTo(String value) {
            addCriterion("c_url =", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotEqualTo(String value) {
            addCriterion("c_url <>", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlGreaterThan(String value) {
            addCriterion("c_url >", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlGreaterThanOrEqualTo(String value) {
            addCriterion("c_url >=", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLessThan(String value) {
            addCriterion("c_url <", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLessThanOrEqualTo(String value) {
            addCriterion("c_url <=", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlLike(String value) {
            addCriterion("c_url like", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotLike(String value) {
            addCriterion("c_url not like", value, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlIn(List<String> values) {
            addCriterion("c_url in", values, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotIn(List<String> values) {
            addCriterion("c_url not in", values, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlBetween(String value1, String value2) {
            addCriterion("c_url between", value1, value2, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCUrlNotBetween(String value1, String value2) {
            addCriterion("c_url not between", value1, value2, "cUrl");
            return (Criteria) this;
        }

        public Criteria andCParentidIsNull() {
            addCriterion("c_parentid is null");
            return (Criteria) this;
        }

        public Criteria andCParentidIsNotNull() {
            addCriterion("c_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andCParentidEqualTo(String value) {
            addCriterion("c_parentid =", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotEqualTo(String value) {
            addCriterion("c_parentid <>", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidGreaterThan(String value) {
            addCriterion("c_parentid >", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidGreaterThanOrEqualTo(String value) {
            addCriterion("c_parentid >=", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLessThan(String value) {
            addCriterion("c_parentid <", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLessThanOrEqualTo(String value) {
            addCriterion("c_parentid <=", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidLike(String value) {
            addCriterion("c_parentid like", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotLike(String value) {
            addCriterion("c_parentid not like", value, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidIn(List<String> values) {
            addCriterion("c_parentid in", values, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotIn(List<String> values) {
            addCriterion("c_parentid not in", values, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidBetween(String value1, String value2) {
            addCriterion("c_parentid between", value1, value2, "cParentid");
            return (Criteria) this;
        }

        public Criteria andCParentidNotBetween(String value1, String value2) {
            addCriterion("c_parentid not between", value1, value2, "cParentid");
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

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCIconIsNull() {
            addCriterion("c_icon is null");
            return (Criteria) this;
        }

        public Criteria andCIconIsNotNull() {
            addCriterion("c_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCIconEqualTo(String value) {
            addCriterion("c_icon =", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotEqualTo(String value) {
            addCriterion("c_icon <>", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconGreaterThan(String value) {
            addCriterion("c_icon >", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconGreaterThanOrEqualTo(String value) {
            addCriterion("c_icon >=", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconLessThan(String value) {
            addCriterion("c_icon <", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconLessThanOrEqualTo(String value) {
            addCriterion("c_icon <=", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconLike(String value) {
            addCriterion("c_icon like", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotLike(String value) {
            addCriterion("c_icon not like", value, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconIn(List<String> values) {
            addCriterion("c_icon in", values, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotIn(List<String> values) {
            addCriterion("c_icon not in", values, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconBetween(String value1, String value2) {
            addCriterion("c_icon between", value1, value2, "cIcon");
            return (Criteria) this;
        }

        public Criteria andCIconNotBetween(String value1, String value2) {
            addCriterion("c_icon not between", value1, value2, "cIcon");
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

        public Criteria andCIndexEqualTo(Integer value) {
            addCriterion("c_index =", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotEqualTo(Integer value) {
            addCriterion("c_index <>", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexGreaterThan(Integer value) {
            addCriterion("c_index >", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_index >=", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexLessThan(Integer value) {
            addCriterion("c_index <", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexLessThanOrEqualTo(Integer value) {
            addCriterion("c_index <=", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexIn(List<Integer> values) {
            addCriterion("c_index in", values, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotIn(List<Integer> values) {
            addCriterion("c_index not in", values, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexBetween(Integer value1, Integer value2) {
            addCriterion("c_index between", value1, value2, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotBetween(Integer value1, Integer value2) {
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