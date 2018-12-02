package top.liyang024.table.domain;

import java.util.ArrayList;
import java.util.List;

public class TUploadresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUploadresExample() {
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

        public Criteria andCFilenameIsNull() {
            addCriterion("c_filename is null");
            return (Criteria) this;
        }

        public Criteria andCFilenameIsNotNull() {
            addCriterion("c_filename is not null");
            return (Criteria) this;
        }

        public Criteria andCFilenameEqualTo(String value) {
            addCriterion("c_filename =", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameNotEqualTo(String value) {
            addCriterion("c_filename <>", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameGreaterThan(String value) {
            addCriterion("c_filename >", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("c_filename >=", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameLessThan(String value) {
            addCriterion("c_filename <", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameLessThanOrEqualTo(String value) {
            addCriterion("c_filename <=", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameLike(String value) {
            addCriterion("c_filename like", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameNotLike(String value) {
            addCriterion("c_filename not like", value, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameIn(List<String> values) {
            addCriterion("c_filename in", values, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameNotIn(List<String> values) {
            addCriterion("c_filename not in", values, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameBetween(String value1, String value2) {
            addCriterion("c_filename between", value1, value2, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCFilenameNotBetween(String value1, String value2) {
            addCriterion("c_filename not between", value1, value2, "cFilename");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(String value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(String value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(String value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(String value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(String value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(String value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLike(String value) {
            addCriterion("c_time like", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotLike(String value) {
            addCriterion("c_time not like", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<String> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<String> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(String value1, String value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(String value1, String value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
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

        public Criteria andCSufixIsNull() {
            addCriterion("c_sufix is null");
            return (Criteria) this;
        }

        public Criteria andCSufixIsNotNull() {
            addCriterion("c_sufix is not null");
            return (Criteria) this;
        }

        public Criteria andCSufixEqualTo(String value) {
            addCriterion("c_sufix =", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixNotEqualTo(String value) {
            addCriterion("c_sufix <>", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixGreaterThan(String value) {
            addCriterion("c_sufix >", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixGreaterThanOrEqualTo(String value) {
            addCriterion("c_sufix >=", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixLessThan(String value) {
            addCriterion("c_sufix <", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixLessThanOrEqualTo(String value) {
            addCriterion("c_sufix <=", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixLike(String value) {
            addCriterion("c_sufix like", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixNotLike(String value) {
            addCriterion("c_sufix not like", value, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixIn(List<String> values) {
            addCriterion("c_sufix in", values, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixNotIn(List<String> values) {
            addCriterion("c_sufix not in", values, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixBetween(String value1, String value2) {
            addCriterion("c_sufix between", value1, value2, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCSufixNotBetween(String value1, String value2) {
            addCriterion("c_sufix not between", value1, value2, "cSufix");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("c_type is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("c_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("c_type =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("c_type <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("c_type >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_type >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("c_type <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("c_type <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("c_type like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("c_type not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("c_type in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("c_type not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("c_type between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("c_type not between", value1, value2, "cType");
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