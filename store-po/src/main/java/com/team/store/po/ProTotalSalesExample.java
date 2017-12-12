package com.team.store.po;

import java.util.ArrayList;
import java.util.List;

public class ProTotalSalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProTotalSalesExample() {
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

        public Criteria andPsIdIsNull() {
            addCriterion("PS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("PS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(Integer value) {
            addCriterion("PS_ID =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(Integer value) {
            addCriterion("PS_ID <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(Integer value) {
            addCriterion("PS_ID >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_ID >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(Integer value) {
            addCriterion("PS_ID <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(Integer value) {
            addCriterion("PS_ID <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<Integer> values) {
            addCriterion("PS_ID in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<Integer> values) {
            addCriterion("PS_ID not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(Integer value1, Integer value2) {
            addCriterion("PS_ID between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_ID not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsNumIsNull() {
            addCriterion("PS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPsNumIsNotNull() {
            addCriterion("PS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPsNumEqualTo(Integer value) {
            addCriterion("PS_NUM =", value, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumNotEqualTo(Integer value) {
            addCriterion("PS_NUM <>", value, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumGreaterThan(Integer value) {
            addCriterion("PS_NUM >", value, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_NUM >=", value, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumLessThan(Integer value) {
            addCriterion("PS_NUM <", value, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumLessThanOrEqualTo(Integer value) {
            addCriterion("PS_NUM <=", value, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumIn(List<Integer> values) {
            addCriterion("PS_NUM in", values, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumNotIn(List<Integer> values) {
            addCriterion("PS_NUM not in", values, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumBetween(Integer value1, Integer value2) {
            addCriterion("PS_NUM between", value1, value2, "psNum");
            return (Criteria) this;
        }

        public Criteria andPsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_NUM not between", value1, value2, "psNum");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
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