package top.liyang024.table.domain;

import java.util.ArrayList;
import java.util.List;

public class TSysCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysCodeExample() {
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

        public Criteria andCTypeidIsNull() {
            addCriterion("c_typeid is null");
            return (Criteria) this;
        }

        public Criteria andCTypeidIsNotNull() {
            addCriterion("c_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeidEqualTo(String value) {
            addCriterion("c_typeid =", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidNotEqualTo(String value) {
            addCriterion("c_typeid <>", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidGreaterThan(String value) {
            addCriterion("c_typeid >", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("c_typeid >=", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidLessThan(String value) {
            addCriterion("c_typeid <", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidLessThanOrEqualTo(String value) {
            addCriterion("c_typeid <=", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidLike(String value) {
            addCriterion("c_typeid like", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidNotLike(String value) {
            addCriterion("c_typeid not like", value, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidIn(List<String> values) {
            addCriterion("c_typeid in", values, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidNotIn(List<String> values) {
            addCriterion("c_typeid not in", values, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidBetween(String value1, String value2) {
            addCriterion("c_typeid between", value1, value2, "cTypeid");
            return (Criteria) this;
        }

        public Criteria andCTypeidNotBetween(String value1, String value2) {
            addCriterion("c_typeid not between", value1, value2, "cTypeid");
            return (Criteria) this;
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

        public Criteria andCTypenameIsNull() {
            addCriterion("c_typename is null");
            return (Criteria) this;
        }

        public Criteria andCTypenameIsNotNull() {
            addCriterion("c_typename is not null");
            return (Criteria) this;
        }

        public Criteria andCTypenameEqualTo(String value) {
            addCriterion("c_typename =", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameNotEqualTo(String value) {
            addCriterion("c_typename <>", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameGreaterThan(String value) {
            addCriterion("c_typename >", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("c_typename >=", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameLessThan(String value) {
            addCriterion("c_typename <", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameLessThanOrEqualTo(String value) {
            addCriterion("c_typename <=", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameLike(String value) {
            addCriterion("c_typename like", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameNotLike(String value) {
            addCriterion("c_typename not like", value, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameIn(List<String> values) {
            addCriterion("c_typename in", values, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameNotIn(List<String> values) {
            addCriterion("c_typename not in", values, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameBetween(String value1, String value2) {
            addCriterion("c_typename between", value1, value2, "cTypename");
            return (Criteria) this;
        }

        public Criteria andCTypenameNotBetween(String value1, String value2) {
            addCriterion("c_typename not between", value1, value2, "cTypename");
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

        public Criteria andCValIsNull() {
            addCriterion("c_val is null");
            return (Criteria) this;
        }

        public Criteria andCValIsNotNull() {
            addCriterion("c_val is not null");
            return (Criteria) this;
        }

        public Criteria andCValEqualTo(String value) {
            addCriterion("c_val =", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValNotEqualTo(String value) {
            addCriterion("c_val <>", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValGreaterThan(String value) {
            addCriterion("c_val >", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValGreaterThanOrEqualTo(String value) {
            addCriterion("c_val >=", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValLessThan(String value) {
            addCriterion("c_val <", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValLessThanOrEqualTo(String value) {
            addCriterion("c_val <=", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValLike(String value) {
            addCriterion("c_val like", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValNotLike(String value) {
            addCriterion("c_val not like", value, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValIn(List<String> values) {
            addCriterion("c_val in", values, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValNotIn(List<String> values) {
            addCriterion("c_val not in", values, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValBetween(String value1, String value2) {
            addCriterion("c_val between", value1, value2, "cVal");
            return (Criteria) this;
        }

        public Criteria andCValNotBetween(String value1, String value2) {
            addCriterion("c_val not between", value1, value2, "cVal");
            return (Criteria) this;
        }

        public Criteria andCMarkIsNull() {
            addCriterion("c_mark is null");
            return (Criteria) this;
        }

        public Criteria andCMarkIsNotNull() {
            addCriterion("c_mark is not null");
            return (Criteria) this;
        }

        public Criteria andCMarkEqualTo(String value) {
            addCriterion("c_mark =", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkNotEqualTo(String value) {
            addCriterion("c_mark <>", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkGreaterThan(String value) {
            addCriterion("c_mark >", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkGreaterThanOrEqualTo(String value) {
            addCriterion("c_mark >=", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkLessThan(String value) {
            addCriterion("c_mark <", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkLessThanOrEqualTo(String value) {
            addCriterion("c_mark <=", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkLike(String value) {
            addCriterion("c_mark like", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkNotLike(String value) {
            addCriterion("c_mark not like", value, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkIn(List<String> values) {
            addCriterion("c_mark in", values, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkNotIn(List<String> values) {
            addCriterion("c_mark not in", values, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkBetween(String value1, String value2) {
            addCriterion("c_mark between", value1, value2, "cMark");
            return (Criteria) this;
        }

        public Criteria andCMarkNotBetween(String value1, String value2) {
            addCriterion("c_mark not between", value1, value2, "cMark");
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

        public Criteria andCIndexEqualTo(Byte value) {
            addCriterion("c_index =", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotEqualTo(Byte value) {
            addCriterion("c_index <>", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexGreaterThan(Byte value) {
            addCriterion("c_index >", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("c_index >=", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexLessThan(Byte value) {
            addCriterion("c_index <", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexLessThanOrEqualTo(Byte value) {
            addCriterion("c_index <=", value, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexIn(List<Byte> values) {
            addCriterion("c_index in", values, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotIn(List<Byte> values) {
            addCriterion("c_index not in", values, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexBetween(Byte value1, Byte value2) {
            addCriterion("c_index between", value1, value2, "cIndex");
            return (Criteria) this;
        }

        public Criteria andCIndexNotBetween(Byte value1, Byte value2) {
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