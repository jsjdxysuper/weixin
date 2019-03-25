package top.liyang024.table.domain;

import java.util.ArrayList;
import java.util.List;

public class TTeacherArtistDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeacherArtistDetailExample() {
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

        public Criteria andCPersonIdIsNull() {
            addCriterion("c_person_id is null");
            return (Criteria) this;
        }

        public Criteria andCPersonIdIsNotNull() {
            addCriterion("c_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andCPersonIdEqualTo(Integer value) {
            addCriterion("c_person_id =", value, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdNotEqualTo(Integer value) {
            addCriterion("c_person_id <>", value, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdGreaterThan(Integer value) {
            addCriterion("c_person_id >", value, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_person_id >=", value, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdLessThan(Integer value) {
            addCriterion("c_person_id <", value, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_person_id <=", value, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdIn(List<Integer> values) {
            addCriterion("c_person_id in", values, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdNotIn(List<Integer> values) {
            addCriterion("c_person_id not in", values, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("c_person_id between", value1, value2, "cPersonId");
            return (Criteria) this;
        }

        public Criteria andCPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_person_id not between", value1, value2, "cPersonId");
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

        public Criteria andCContentIsNull() {
            addCriterion("c_content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("c_content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("c_content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("c_content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("c_content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("c_content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("c_content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("c_content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("c_content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("c_content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("c_content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("c_content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("c_content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCDes1IsNull() {
            addCriterion("c_des1 is null");
            return (Criteria) this;
        }

        public Criteria andCDes1IsNotNull() {
            addCriterion("c_des1 is not null");
            return (Criteria) this;
        }

        public Criteria andCDes1EqualTo(String value) {
            addCriterion("c_des1 =", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1NotEqualTo(String value) {
            addCriterion("c_des1 <>", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1GreaterThan(String value) {
            addCriterion("c_des1 >", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1GreaterThanOrEqualTo(String value) {
            addCriterion("c_des1 >=", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1LessThan(String value) {
            addCriterion("c_des1 <", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1LessThanOrEqualTo(String value) {
            addCriterion("c_des1 <=", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1Like(String value) {
            addCriterion("c_des1 like", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1NotLike(String value) {
            addCriterion("c_des1 not like", value, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1In(List<String> values) {
            addCriterion("c_des1 in", values, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1NotIn(List<String> values) {
            addCriterion("c_des1 not in", values, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1Between(String value1, String value2) {
            addCriterion("c_des1 between", value1, value2, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes1NotBetween(String value1, String value2) {
            addCriterion("c_des1 not between", value1, value2, "cDes1");
            return (Criteria) this;
        }

        public Criteria andCDes2IsNull() {
            addCriterion("c_des2 is null");
            return (Criteria) this;
        }

        public Criteria andCDes2IsNotNull() {
            addCriterion("c_des2 is not null");
            return (Criteria) this;
        }

        public Criteria andCDes2EqualTo(String value) {
            addCriterion("c_des2 =", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2NotEqualTo(String value) {
            addCriterion("c_des2 <>", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2GreaterThan(String value) {
            addCriterion("c_des2 >", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2GreaterThanOrEqualTo(String value) {
            addCriterion("c_des2 >=", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2LessThan(String value) {
            addCriterion("c_des2 <", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2LessThanOrEqualTo(String value) {
            addCriterion("c_des2 <=", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2Like(String value) {
            addCriterion("c_des2 like", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2NotLike(String value) {
            addCriterion("c_des2 not like", value, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2In(List<String> values) {
            addCriterion("c_des2 in", values, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2NotIn(List<String> values) {
            addCriterion("c_des2 not in", values, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2Between(String value1, String value2) {
            addCriterion("c_des2 between", value1, value2, "cDes2");
            return (Criteria) this;
        }

        public Criteria andCDes2NotBetween(String value1, String value2) {
            addCriterion("c_des2 not between", value1, value2, "cDes2");
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