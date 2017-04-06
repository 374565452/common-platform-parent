package com.common.platform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblModuleExample() {
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

        public Criteria andModuleKeyIsNull() {
            addCriterion("module_key is null");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIsNotNull() {
            addCriterion("module_key is not null");
            return (Criteria) this;
        }

        public Criteria andModuleKeyEqualTo(String value) {
            addCriterion("module_key =", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotEqualTo(String value) {
            addCriterion("module_key <>", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyGreaterThan(String value) {
            addCriterion("module_key >", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("module_key >=", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLessThan(String value) {
            addCriterion("module_key <", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLessThanOrEqualTo(String value) {
            addCriterion("module_key <=", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLike(String value) {
            addCriterion("module_key like", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotLike(String value) {
            addCriterion("module_key not like", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIn(List<String> values) {
            addCriterion("module_key in", values, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotIn(List<String> values) {
            addCriterion("module_key not in", values, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyBetween(String value1, String value2) {
            addCriterion("module_key between", value1, value2, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotBetween(String value1, String value2) {
            addCriterion("module_key not between", value1, value2, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNull() {
            addCriterion("module_url is null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNotNull() {
            addCriterion("module_url is not null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlEqualTo(String value) {
            addCriterion("module_url =", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotEqualTo(String value) {
            addCriterion("module_url <>", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThan(String value) {
            addCriterion("module_url >", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("module_url >=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThan(String value) {
            addCriterion("module_url <", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThanOrEqualTo(String value) {
            addCriterion("module_url <=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLike(String value) {
            addCriterion("module_url like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotLike(String value) {
            addCriterion("module_url not like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIn(List<String> values) {
            addCriterion("module_url in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotIn(List<String> values) {
            addCriterion("module_url not in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlBetween(String value1, String value2) {
            addCriterion("module_url between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotBetween(String value1, String value2) {
            addCriterion("module_url not between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleIconIsNull() {
            addCriterion("module_icon is null");
            return (Criteria) this;
        }

        public Criteria andModuleIconIsNotNull() {
            addCriterion("module_icon is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIconEqualTo(String value) {
            addCriterion("module_icon =", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotEqualTo(String value) {
            addCriterion("module_icon <>", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconGreaterThan(String value) {
            addCriterion("module_icon >", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconGreaterThanOrEqualTo(String value) {
            addCriterion("module_icon >=", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconLessThan(String value) {
            addCriterion("module_icon <", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconLessThanOrEqualTo(String value) {
            addCriterion("module_icon <=", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconLike(String value) {
            addCriterion("module_icon like", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotLike(String value) {
            addCriterion("module_icon not like", value, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconIn(List<String> values) {
            addCriterion("module_icon in", values, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotIn(List<String> values) {
            addCriterion("module_icon not in", values, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconBetween(String value1, String value2) {
            addCriterion("module_icon between", value1, value2, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andModuleIconNotBetween(String value1, String value2) {
            addCriterion("module_icon not between", value1, value2, "moduleIcon");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyIsNull() {
            addCriterion("check_usb_key is null");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyIsNotNull() {
            addCriterion("check_usb_key is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyEqualTo(Integer value) {
            addCriterion("check_usb_key =", value, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyNotEqualTo(Integer value) {
            addCriterion("check_usb_key <>", value, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyGreaterThan(Integer value) {
            addCriterion("check_usb_key >", value, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_usb_key >=", value, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyLessThan(Integer value) {
            addCriterion("check_usb_key <", value, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyLessThanOrEqualTo(Integer value) {
            addCriterion("check_usb_key <=", value, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyIn(List<Integer> values) {
            addCriterion("check_usb_key in", values, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyNotIn(List<Integer> values) {
            addCriterion("check_usb_key not in", values, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyBetween(Integer value1, Integer value2) {
            addCriterion("check_usb_key between", value1, value2, "checkUsbKey");
            return (Criteria) this;
        }

        public Criteria andCheckUsbKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("check_usb_key not between", value1, value2, "checkUsbKey");
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

        public Criteria andOnlyForRoleIdIsNull() {
            addCriterion("only_for_role_id is null");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdIsNotNull() {
            addCriterion("only_for_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdEqualTo(Long value) {
            addCriterion("only_for_role_id =", value, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdNotEqualTo(Long value) {
            addCriterion("only_for_role_id <>", value, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdGreaterThan(Long value) {
            addCriterion("only_for_role_id >", value, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("only_for_role_id >=", value, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdLessThan(Long value) {
            addCriterion("only_for_role_id <", value, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("only_for_role_id <=", value, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdIn(List<Long> values) {
            addCriterion("only_for_role_id in", values, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdNotIn(List<Long> values) {
            addCriterion("only_for_role_id not in", values, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdBetween(Long value1, Long value2) {
            addCriterion("only_for_role_id between", value1, value2, "onlyForRoleId");
            return (Criteria) this;
        }

        public Criteria andOnlyForRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("only_for_role_id not between", value1, value2, "onlyForRoleId");
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

        public Criteria andDefaultMouleIsNull() {
            addCriterion("default_moule is null");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleIsNotNull() {
            addCriterion("default_moule is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleEqualTo(Integer value) {
            addCriterion("default_moule =", value, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleNotEqualTo(Integer value) {
            addCriterion("default_moule <>", value, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleGreaterThan(Integer value) {
            addCriterion("default_moule >", value, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_moule >=", value, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleLessThan(Integer value) {
            addCriterion("default_moule <", value, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleLessThanOrEqualTo(Integer value) {
            addCriterion("default_moule <=", value, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleIn(List<Integer> values) {
            addCriterion("default_moule in", values, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleNotIn(List<Integer> values) {
            addCriterion("default_moule not in", values, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleBetween(Integer value1, Integer value2) {
            addCriterion("default_moule between", value1, value2, "defaultMoule");
            return (Criteria) this;
        }

        public Criteria andDefaultMouleNotBetween(Integer value1, Integer value2) {
            addCriterion("default_moule not between", value1, value2, "defaultMoule");
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