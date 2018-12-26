package top.liyang024.table.domain;

import java.util.ArrayList;
import java.util.List;

public class TCatagorytreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCatagorytreeExample() {
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

        public Criteria andCUidIsNull() {
            addCriterion("c_uid is null");
            return (Criteria) this;
        }

        public Criteria andCUidIsNotNull() {
            addCriterion("c_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCUidEqualTo(String value) {
            addCriterion("c_uid =", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotEqualTo(String value) {
            addCriterion("c_uid <>", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThan(String value) {
            addCriterion("c_uid >", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThanOrEqualTo(String value) {
            addCriterion("c_uid >=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThan(String value) {
            addCriterion("c_uid <", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThanOrEqualTo(String value) {
            addCriterion("c_uid <=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLike(String value) {
            addCriterion("c_uid like", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotLike(String value) {
            addCriterion("c_uid not like", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidIn(List<String> values) {
            addCriterion("c_uid in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotIn(List<String> values) {
            addCriterion("c_uid not in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidBetween(String value1, String value2) {
            addCriterion("c_uid between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotBetween(String value1, String value2) {
            addCriterion("c_uid not between", value1, value2, "cUid");
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

        public Criteria andCMark1IsNull() {
            addCriterion("c_mark1 is null");
            return (Criteria) this;
        }

        public Criteria andCMark1IsNotNull() {
            addCriterion("c_mark1 is not null");
            return (Criteria) this;
        }

        public Criteria andCMark1EqualTo(String value) {
            addCriterion("c_mark1 =", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1NotEqualTo(String value) {
            addCriterion("c_mark1 <>", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1GreaterThan(String value) {
            addCriterion("c_mark1 >", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1GreaterThanOrEqualTo(String value) {
            addCriterion("c_mark1 >=", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1LessThan(String value) {
            addCriterion("c_mark1 <", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1LessThanOrEqualTo(String value) {
            addCriterion("c_mark1 <=", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1Like(String value) {
            addCriterion("c_mark1 like", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1NotLike(String value) {
            addCriterion("c_mark1 not like", value, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1In(List<String> values) {
            addCriterion("c_mark1 in", values, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1NotIn(List<String> values) {
            addCriterion("c_mark1 not in", values, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1Between(String value1, String value2) {
            addCriterion("c_mark1 between", value1, value2, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark1NotBetween(String value1, String value2) {
            addCriterion("c_mark1 not between", value1, value2, "cMark1");
            return (Criteria) this;
        }

        public Criteria andCMark2IsNull() {
            addCriterion("c_mark2 is null");
            return (Criteria) this;
        }

        public Criteria andCMark2IsNotNull() {
            addCriterion("c_mark2 is not null");
            return (Criteria) this;
        }

        public Criteria andCMark2EqualTo(String value) {
            addCriterion("c_mark2 =", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2NotEqualTo(String value) {
            addCriterion("c_mark2 <>", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2GreaterThan(String value) {
            addCriterion("c_mark2 >", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2GreaterThanOrEqualTo(String value) {
            addCriterion("c_mark2 >=", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2LessThan(String value) {
            addCriterion("c_mark2 <", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2LessThanOrEqualTo(String value) {
            addCriterion("c_mark2 <=", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2Like(String value) {
            addCriterion("c_mark2 like", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2NotLike(String value) {
            addCriterion("c_mark2 not like", value, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2In(List<String> values) {
            addCriterion("c_mark2 in", values, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2NotIn(List<String> values) {
            addCriterion("c_mark2 not in", values, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2Between(String value1, String value2) {
            addCriterion("c_mark2 between", value1, value2, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark2NotBetween(String value1, String value2) {
            addCriterion("c_mark2 not between", value1, value2, "cMark2");
            return (Criteria) this;
        }

        public Criteria andCMark3IsNull() {
            addCriterion("c_mark3 is null");
            return (Criteria) this;
        }

        public Criteria andCMark3IsNotNull() {
            addCriterion("c_mark3 is not null");
            return (Criteria) this;
        }

        public Criteria andCMark3EqualTo(String value) {
            addCriterion("c_mark3 =", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3NotEqualTo(String value) {
            addCriterion("c_mark3 <>", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3GreaterThan(String value) {
            addCriterion("c_mark3 >", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3GreaterThanOrEqualTo(String value) {
            addCriterion("c_mark3 >=", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3LessThan(String value) {
            addCriterion("c_mark3 <", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3LessThanOrEqualTo(String value) {
            addCriterion("c_mark3 <=", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3Like(String value) {
            addCriterion("c_mark3 like", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3NotLike(String value) {
            addCriterion("c_mark3 not like", value, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3In(List<String> values) {
            addCriterion("c_mark3 in", values, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3NotIn(List<String> values) {
            addCriterion("c_mark3 not in", values, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3Between(String value1, String value2) {
            addCriterion("c_mark3 between", value1, value2, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCMark3NotBetween(String value1, String value2) {
            addCriterion("c_mark3 not between", value1, value2, "cMark3");
            return (Criteria) this;
        }

        public Criteria andCImageIsNull() {
            addCriterion("c_image is null");
            return (Criteria) this;
        }

        public Criteria andCImageIsNotNull() {
            addCriterion("c_image is not null");
            return (Criteria) this;
        }

        public Criteria andCImageEqualTo(String value) {
            addCriterion("c_image =", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotEqualTo(String value) {
            addCriterion("c_image <>", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageGreaterThan(String value) {
            addCriterion("c_image >", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageGreaterThanOrEqualTo(String value) {
            addCriterion("c_image >=", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLessThan(String value) {
            addCriterion("c_image <", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLessThanOrEqualTo(String value) {
            addCriterion("c_image <=", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageLike(String value) {
            addCriterion("c_image like", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotLike(String value) {
            addCriterion("c_image not like", value, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageIn(List<String> values) {
            addCriterion("c_image in", values, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotIn(List<String> values) {
            addCriterion("c_image not in", values, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageBetween(String value1, String value2) {
            addCriterion("c_image between", value1, value2, "cImage");
            return (Criteria) this;
        }

        public Criteria andCImageNotBetween(String value1, String value2) {
            addCriterion("c_image not between", value1, value2, "cImage");
            return (Criteria) this;
        }

        public Criteria andCLayernameIsNull() {
            addCriterion("c_layername is null");
            return (Criteria) this;
        }

        public Criteria andCLayernameIsNotNull() {
            addCriterion("c_layername is not null");
            return (Criteria) this;
        }

        public Criteria andCLayernameEqualTo(String value) {
            addCriterion("c_layername =", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameNotEqualTo(String value) {
            addCriterion("c_layername <>", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameGreaterThan(String value) {
            addCriterion("c_layername >", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameGreaterThanOrEqualTo(String value) {
            addCriterion("c_layername >=", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameLessThan(String value) {
            addCriterion("c_layername <", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameLessThanOrEqualTo(String value) {
            addCriterion("c_layername <=", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameLike(String value) {
            addCriterion("c_layername like", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameNotLike(String value) {
            addCriterion("c_layername not like", value, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameIn(List<String> values) {
            addCriterion("c_layername in", values, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameNotIn(List<String> values) {
            addCriterion("c_layername not in", values, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameBetween(String value1, String value2) {
            addCriterion("c_layername between", value1, value2, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayernameNotBetween(String value1, String value2) {
            addCriterion("c_layername not between", value1, value2, "cLayername");
            return (Criteria) this;
        }

        public Criteria andCLayeridIsNull() {
            addCriterion("c_layerid is null");
            return (Criteria) this;
        }

        public Criteria andCLayeridIsNotNull() {
            addCriterion("c_layerid is not null");
            return (Criteria) this;
        }

        public Criteria andCLayeridEqualTo(String value) {
            addCriterion("c_layerid =", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridNotEqualTo(String value) {
            addCriterion("c_layerid <>", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridGreaterThan(String value) {
            addCriterion("c_layerid >", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridGreaterThanOrEqualTo(String value) {
            addCriterion("c_layerid >=", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridLessThan(String value) {
            addCriterion("c_layerid <", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridLessThanOrEqualTo(String value) {
            addCriterion("c_layerid <=", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridLike(String value) {
            addCriterion("c_layerid like", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridNotLike(String value) {
            addCriterion("c_layerid not like", value, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridIn(List<String> values) {
            addCriterion("c_layerid in", values, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridNotIn(List<String> values) {
            addCriterion("c_layerid not in", values, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridBetween(String value1, String value2) {
            addCriterion("c_layerid between", value1, value2, "cLayerid");
            return (Criteria) this;
        }

        public Criteria andCLayeridNotBetween(String value1, String value2) {
            addCriterion("c_layerid not between", value1, value2, "cLayerid");
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