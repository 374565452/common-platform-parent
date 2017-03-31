package com.common.platform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblDistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblDistrictExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNull() {
            addCriterion("dis_name is null");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNotNull() {
            addCriterion("dis_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisNameEqualTo(String value) {
            addCriterion("dis_name =", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotEqualTo(String value) {
            addCriterion("dis_name <>", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThan(String value) {
            addCriterion("dis_name >", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThanOrEqualTo(String value) {
            addCriterion("dis_name >=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThan(String value) {
            addCriterion("dis_name <", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThanOrEqualTo(String value) {
            addCriterion("dis_name <=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLike(String value) {
            addCriterion("dis_name like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotLike(String value) {
            addCriterion("dis_name not like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameIn(List<String> values) {
            addCriterion("dis_name in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotIn(List<String> values) {
            addCriterion("dis_name not in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameBetween(String value1, String value2) {
            addCriterion("dis_name between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotBetween(String value1, String value2) {
            addCriterion("dis_name not between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andDisCodeIsNull() {
            addCriterion("dis_code is null");
            return (Criteria) this;
        }

        public Criteria andDisCodeIsNotNull() {
            addCriterion("dis_code is not null");
            return (Criteria) this;
        }

        public Criteria andDisCodeEqualTo(String value) {
            addCriterion("dis_code =", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeNotEqualTo(String value) {
            addCriterion("dis_code <>", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeGreaterThan(String value) {
            addCriterion("dis_code >", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dis_code >=", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeLessThan(String value) {
            addCriterion("dis_code <", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeLessThanOrEqualTo(String value) {
            addCriterion("dis_code <=", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeLike(String value) {
            addCriterion("dis_code like", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeNotLike(String value) {
            addCriterion("dis_code not like", value, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeIn(List<String> values) {
            addCriterion("dis_code in", values, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeNotIn(List<String> values) {
            addCriterion("dis_code not in", values, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeBetween(String value1, String value2) {
            addCriterion("dis_code between", value1, value2, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisCodeNotBetween(String value1, String value2) {
            addCriterion("dis_code not between", value1, value2, "disCode");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressIsNull() {
            addCriterion("dis_logic_address is null");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressIsNotNull() {
            addCriterion("dis_logic_address is not null");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressEqualTo(String value) {
            addCriterion("dis_logic_address =", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressNotEqualTo(String value) {
            addCriterion("dis_logic_address <>", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressGreaterThan(String value) {
            addCriterion("dis_logic_address >", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dis_logic_address >=", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressLessThan(String value) {
            addCriterion("dis_logic_address <", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressLessThanOrEqualTo(String value) {
            addCriterion("dis_logic_address <=", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressLike(String value) {
            addCriterion("dis_logic_address like", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressNotLike(String value) {
            addCriterion("dis_logic_address not like", value, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressIn(List<String> values) {
            addCriterion("dis_logic_address in", values, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressNotIn(List<String> values) {
            addCriterion("dis_logic_address not in", values, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressBetween(String value1, String value2) {
            addCriterion("dis_logic_address between", value1, value2, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andDisLogicAddressNotBetween(String value1, String value2) {
            addCriterion("dis_logic_address not between", value1, value2, "disLogicAddress");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdIsNull() {
            addCriterion("area_level_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdIsNotNull() {
            addCriterion("area_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdEqualTo(Long value) {
            addCriterion("area_level_id =", value, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdNotEqualTo(Long value) {
            addCriterion("area_level_id <>", value, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdGreaterThan(Long value) {
            addCriterion("area_level_id >", value, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_level_id >=", value, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdLessThan(Long value) {
            addCriterion("area_level_id <", value, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdLessThanOrEqualTo(Long value) {
            addCriterion("area_level_id <=", value, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdIn(List<Long> values) {
            addCriterion("area_level_id in", values, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdNotIn(List<Long> values) {
            addCriterion("area_level_id not in", values, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdBetween(Long value1, Long value2) {
            addCriterion("area_level_id between", value1, value2, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIdNotBetween(Long value1, Long value2) {
            addCriterion("area_level_id not between", value1, value2, "areaLevelId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updated_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterion("updated_date =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterion("updated_date <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterion("updated_date >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_date >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterion("updated_date <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("updated_date <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterion("updated_date in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterion("updated_date not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("updated_date between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("updated_date not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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