package site.iblogs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachmentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNull() {
            addCriterion("AuthorId is null");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNotNull() {
            addCriterion("AuthorId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoridEqualTo(Long value) {
            addCriterion("AuthorId =", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotEqualTo(Long value) {
            addCriterion("AuthorId <>", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThan(Long value) {
            addCriterion("AuthorId >", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThanOrEqualTo(Long value) {
            addCriterion("AuthorId >=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThan(Long value) {
            addCriterion("AuthorId <", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThanOrEqualTo(Long value) {
            addCriterion("AuthorId <=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIn(List<Long> values) {
            addCriterion("AuthorId in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotIn(List<Long> values) {
            addCriterion("AuthorId not in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridBetween(Long value1, Long value2) {
            addCriterion("AuthorId between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotBetween(Long value1, Long value2) {
            addCriterion("AuthorId not between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("FName is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("FName is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("FName =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("FName <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("FName >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("FName >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("FName <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("FName <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("FName like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("FName not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("FName in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("FName not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("FName between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("FName not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("FType is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("FType is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(String value) {
            addCriterion("FType =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(String value) {
            addCriterion("FType <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(String value) {
            addCriterion("FType >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FType >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(String value) {
            addCriterion("FType <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(String value) {
            addCriterion("FType <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLike(String value) {
            addCriterion("FType like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotLike(String value) {
            addCriterion("FType not like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<String> values) {
            addCriterion("FType in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<String> values) {
            addCriterion("FType not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(String value1, String value2) {
            addCriterion("FType between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(String value1, String value2) {
            addCriterion("FType not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFkeyIsNull() {
            addCriterion("FKey is null");
            return (Criteria) this;
        }

        public Criteria andFkeyIsNotNull() {
            addCriterion("FKey is not null");
            return (Criteria) this;
        }

        public Criteria andFkeyEqualTo(String value) {
            addCriterion("FKey =", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotEqualTo(String value) {
            addCriterion("FKey <>", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyGreaterThan(String value) {
            addCriterion("FKey >", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyGreaterThanOrEqualTo(String value) {
            addCriterion("FKey >=", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyLessThan(String value) {
            addCriterion("FKey <", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyLessThanOrEqualTo(String value) {
            addCriterion("FKey <=", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyLike(String value) {
            addCriterion("FKey like", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotLike(String value) {
            addCriterion("FKey not like", value, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyIn(List<String> values) {
            addCriterion("FKey in", values, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotIn(List<String> values) {
            addCriterion("FKey not in", values, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyBetween(String value1, String value2) {
            addCriterion("FKey between", value1, value2, "fkey");
            return (Criteria) this;
        }

        public Criteria andFkeyNotBetween(String value1, String value2) {
            addCriterion("FKey not between", value1, value2, "fkey");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("Created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("Created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("Created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("Created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("Created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("Created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("Created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("Created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("Created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("Created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("Created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("Created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("Deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("Deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("Deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("Deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("Deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("Deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("Deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("Deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted not between", value1, value2, "deleted");
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