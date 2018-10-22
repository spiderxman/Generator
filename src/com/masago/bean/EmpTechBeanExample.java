package com.masago.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmpTechBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpTechBeanExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("NO like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("NO not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("EMP_ID like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("EMP_ID not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andDosIsNull() {
            addCriterion("DOS is null");
            return (Criteria) this;
        }

        public Criteria andDosIsNotNull() {
            addCriterion("DOS is not null");
            return (Criteria) this;
        }

        public Criteria andDosEqualTo(String value) {
            addCriterion("DOS =", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosNotEqualTo(String value) {
            addCriterion("DOS <>", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosGreaterThan(String value) {
            addCriterion("DOS >", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosGreaterThanOrEqualTo(String value) {
            addCriterion("DOS >=", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosLessThan(String value) {
            addCriterion("DOS <", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosLessThanOrEqualTo(String value) {
            addCriterion("DOS <=", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosLike(String value) {
            addCriterion("DOS like", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosNotLike(String value) {
            addCriterion("DOS not like", value, "dos");
            return (Criteria) this;
        }

        public Criteria andDosIn(List<String> values) {
            addCriterion("DOS in", values, "dos");
            return (Criteria) this;
        }

        public Criteria andDosNotIn(List<String> values) {
            addCriterion("DOS not in", values, "dos");
            return (Criteria) this;
        }

        public Criteria andDosBetween(String value1, String value2) {
            addCriterion("DOS between", value1, value2, "dos");
            return (Criteria) this;
        }

        public Criteria andDosNotBetween(String value1, String value2) {
            addCriterion("DOS not between", value1, value2, "dos");
            return (Criteria) this;
        }

        public Criteria andWindowsIsNull() {
            addCriterion("WINDOWS is null");
            return (Criteria) this;
        }

        public Criteria andWindowsIsNotNull() {
            addCriterion("WINDOWS is not null");
            return (Criteria) this;
        }

        public Criteria andWindowsEqualTo(String value) {
            addCriterion("WINDOWS =", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotEqualTo(String value) {
            addCriterion("WINDOWS <>", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsGreaterThan(String value) {
            addCriterion("WINDOWS >", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOWS >=", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsLessThan(String value) {
            addCriterion("WINDOWS <", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsLessThanOrEqualTo(String value) {
            addCriterion("WINDOWS <=", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsLike(String value) {
            addCriterion("WINDOWS like", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotLike(String value) {
            addCriterion("WINDOWS not like", value, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsIn(List<String> values) {
            addCriterion("WINDOWS in", values, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotIn(List<String> values) {
            addCriterion("WINDOWS not in", values, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsBetween(String value1, String value2) {
            addCriterion("WINDOWS between", value1, value2, "windows");
            return (Criteria) this;
        }

        public Criteria andWindowsNotBetween(String value1, String value2) {
            addCriterion("WINDOWS not between", value1, value2, "windows");
            return (Criteria) this;
        }

        public Criteria andUnixIsNull() {
            addCriterion("UNIX is null");
            return (Criteria) this;
        }

        public Criteria andUnixIsNotNull() {
            addCriterion("UNIX is not null");
            return (Criteria) this;
        }

        public Criteria andUnixEqualTo(String value) {
            addCriterion("UNIX =", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixNotEqualTo(String value) {
            addCriterion("UNIX <>", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixGreaterThan(String value) {
            addCriterion("UNIX >", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixGreaterThanOrEqualTo(String value) {
            addCriterion("UNIX >=", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixLessThan(String value) {
            addCriterion("UNIX <", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixLessThanOrEqualTo(String value) {
            addCriterion("UNIX <=", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixLike(String value) {
            addCriterion("UNIX like", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixNotLike(String value) {
            addCriterion("UNIX not like", value, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixIn(List<String> values) {
            addCriterion("UNIX in", values, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixNotIn(List<String> values) {
            addCriterion("UNIX not in", values, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixBetween(String value1, String value2) {
            addCriterion("UNIX between", value1, value2, "unix");
            return (Criteria) this;
        }

        public Criteria andUnixNotBetween(String value1, String value2) {
            addCriterion("UNIX not between", value1, value2, "unix");
            return (Criteria) this;
        }

        public Criteria andLinuxIsNull() {
            addCriterion("LINUX is null");
            return (Criteria) this;
        }

        public Criteria andLinuxIsNotNull() {
            addCriterion("LINUX is not null");
            return (Criteria) this;
        }

        public Criteria andLinuxEqualTo(String value) {
            addCriterion("LINUX =", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxNotEqualTo(String value) {
            addCriterion("LINUX <>", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxGreaterThan(String value) {
            addCriterion("LINUX >", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxGreaterThanOrEqualTo(String value) {
            addCriterion("LINUX >=", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxLessThan(String value) {
            addCriterion("LINUX <", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxLessThanOrEqualTo(String value) {
            addCriterion("LINUX <=", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxLike(String value) {
            addCriterion("LINUX like", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxNotLike(String value) {
            addCriterion("LINUX not like", value, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxIn(List<String> values) {
            addCriterion("LINUX in", values, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxNotIn(List<String> values) {
            addCriterion("LINUX not in", values, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxBetween(String value1, String value2) {
            addCriterion("LINUX between", value1, value2, "linux");
            return (Criteria) this;
        }

        public Criteria andLinuxNotBetween(String value1, String value2) {
            addCriterion("LINUX not between", value1, value2, "linux");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNull() {
            addCriterion("ANDROID is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIsNotNull() {
            addCriterion("ANDROID is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidEqualTo(String value) {
            addCriterion("ANDROID =", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotEqualTo(String value) {
            addCriterion("ANDROID <>", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThan(String value) {
            addCriterion("ANDROID >", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidGreaterThanOrEqualTo(String value) {
            addCriterion("ANDROID >=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThan(String value) {
            addCriterion("ANDROID <", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLessThanOrEqualTo(String value) {
            addCriterion("ANDROID <=", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidLike(String value) {
            addCriterion("ANDROID like", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotLike(String value) {
            addCriterion("ANDROID not like", value, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidIn(List<String> values) {
            addCriterion("ANDROID in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotIn(List<String> values) {
            addCriterion("ANDROID not in", values, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidBetween(String value1, String value2) {
            addCriterion("ANDROID between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andAndroidNotBetween(String value1, String value2) {
            addCriterion("ANDROID not between", value1, value2, "android");
            return (Criteria) this;
        }

        public Criteria andIosIsNull() {
            addCriterion("IOS is null");
            return (Criteria) this;
        }

        public Criteria andIosIsNotNull() {
            addCriterion("IOS is not null");
            return (Criteria) this;
        }

        public Criteria andIosEqualTo(String value) {
            addCriterion("IOS =", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotEqualTo(String value) {
            addCriterion("IOS <>", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThan(String value) {
            addCriterion("IOS >", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThanOrEqualTo(String value) {
            addCriterion("IOS >=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThan(String value) {
            addCriterion("IOS <", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThanOrEqualTo(String value) {
            addCriterion("IOS <=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLike(String value) {
            addCriterion("IOS like", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotLike(String value) {
            addCriterion("IOS not like", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosIn(List<String> values) {
            addCriterion("IOS in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotIn(List<String> values) {
            addCriterion("IOS not in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosBetween(String value1, String value2) {
            addCriterion("IOS between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotBetween(String value1, String value2) {
            addCriterion("IOS not between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("MAC =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("MAC <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("MAC >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("MAC <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("MAC like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("MAC not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("MAC in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("MAC not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andWinceIsNull() {
            addCriterion("WINCE is null");
            return (Criteria) this;
        }

        public Criteria andWinceIsNotNull() {
            addCriterion("WINCE is not null");
            return (Criteria) this;
        }

        public Criteria andWinceEqualTo(String value) {
            addCriterion("WINCE =", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceNotEqualTo(String value) {
            addCriterion("WINCE <>", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceGreaterThan(String value) {
            addCriterion("WINCE >", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceGreaterThanOrEqualTo(String value) {
            addCriterion("WINCE >=", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceLessThan(String value) {
            addCriterion("WINCE <", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceLessThanOrEqualTo(String value) {
            addCriterion("WINCE <=", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceLike(String value) {
            addCriterion("WINCE like", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceNotLike(String value) {
            addCriterion("WINCE not like", value, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceIn(List<String> values) {
            addCriterion("WINCE in", values, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceNotIn(List<String> values) {
            addCriterion("WINCE not in", values, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceBetween(String value1, String value2) {
            addCriterion("WINCE between", value1, value2, "wince");
            return (Criteria) this;
        }

        public Criteria andWinceNotBetween(String value1, String value2) {
            addCriterion("WINCE not between", value1, value2, "wince");
            return (Criteria) this;
        }

        public Criteria andOsTronIsNull() {
            addCriterion("OS_TRON is null");
            return (Criteria) this;
        }

        public Criteria andOsTronIsNotNull() {
            addCriterion("OS_TRON is not null");
            return (Criteria) this;
        }

        public Criteria andOsTronEqualTo(String value) {
            addCriterion("OS_TRON =", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronNotEqualTo(String value) {
            addCriterion("OS_TRON <>", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronGreaterThan(String value) {
            addCriterion("OS_TRON >", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronGreaterThanOrEqualTo(String value) {
            addCriterion("OS_TRON >=", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronLessThan(String value) {
            addCriterion("OS_TRON <", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronLessThanOrEqualTo(String value) {
            addCriterion("OS_TRON <=", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronLike(String value) {
            addCriterion("OS_TRON like", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronNotLike(String value) {
            addCriterion("OS_TRON not like", value, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronIn(List<String> values) {
            addCriterion("OS_TRON in", values, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronNotIn(List<String> values) {
            addCriterion("OS_TRON not in", values, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronBetween(String value1, String value2) {
            addCriterion("OS_TRON between", value1, value2, "osTron");
            return (Criteria) this;
        }

        public Criteria andOsTronNotBetween(String value1, String value2) {
            addCriterion("OS_TRON not between", value1, value2, "osTron");
            return (Criteria) this;
        }

        public Criteria andSymbianIsNull() {
            addCriterion("SYMBIAN is null");
            return (Criteria) this;
        }

        public Criteria andSymbianIsNotNull() {
            addCriterion("SYMBIAN is not null");
            return (Criteria) this;
        }

        public Criteria andSymbianEqualTo(String value) {
            addCriterion("SYMBIAN =", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianNotEqualTo(String value) {
            addCriterion("SYMBIAN <>", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianGreaterThan(String value) {
            addCriterion("SYMBIAN >", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianGreaterThanOrEqualTo(String value) {
            addCriterion("SYMBIAN >=", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianLessThan(String value) {
            addCriterion("SYMBIAN <", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianLessThanOrEqualTo(String value) {
            addCriterion("SYMBIAN <=", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianLike(String value) {
            addCriterion("SYMBIAN like", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianNotLike(String value) {
            addCriterion("SYMBIAN not like", value, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianIn(List<String> values) {
            addCriterion("SYMBIAN in", values, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianNotIn(List<String> values) {
            addCriterion("SYMBIAN not in", values, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianBetween(String value1, String value2) {
            addCriterion("SYMBIAN between", value1, value2, "symbian");
            return (Criteria) this;
        }

        public Criteria andSymbianNotBetween(String value1, String value2) {
            addCriterion("SYMBIAN not between", value1, value2, "symbian");
            return (Criteria) this;
        }

        public Criteria andCygwinIsNull() {
            addCriterion("CYGWIN is null");
            return (Criteria) this;
        }

        public Criteria andCygwinIsNotNull() {
            addCriterion("CYGWIN is not null");
            return (Criteria) this;
        }

        public Criteria andCygwinEqualTo(String value) {
            addCriterion("CYGWIN =", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinNotEqualTo(String value) {
            addCriterion("CYGWIN <>", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinGreaterThan(String value) {
            addCriterion("CYGWIN >", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinGreaterThanOrEqualTo(String value) {
            addCriterion("CYGWIN >=", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinLessThan(String value) {
            addCriterion("CYGWIN <", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinLessThanOrEqualTo(String value) {
            addCriterion("CYGWIN <=", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinLike(String value) {
            addCriterion("CYGWIN like", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinNotLike(String value) {
            addCriterion("CYGWIN not like", value, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinIn(List<String> values) {
            addCriterion("CYGWIN in", values, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinNotIn(List<String> values) {
            addCriterion("CYGWIN not in", values, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinBetween(String value1, String value2) {
            addCriterion("CYGWIN between", value1, value2, "cygwin");
            return (Criteria) this;
        }

        public Criteria andCygwinNotBetween(String value1, String value2) {
            addCriterion("CYGWIN not between", value1, value2, "cygwin");
            return (Criteria) this;
        }

        public Criteria andBrewIsNull() {
            addCriterion("BREW is null");
            return (Criteria) this;
        }

        public Criteria andBrewIsNotNull() {
            addCriterion("BREW is not null");
            return (Criteria) this;
        }

        public Criteria andBrewEqualTo(String value) {
            addCriterion("BREW =", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewNotEqualTo(String value) {
            addCriterion("BREW <>", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewGreaterThan(String value) {
            addCriterion("BREW >", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewGreaterThanOrEqualTo(String value) {
            addCriterion("BREW >=", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewLessThan(String value) {
            addCriterion("BREW <", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewLessThanOrEqualTo(String value) {
            addCriterion("BREW <=", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewLike(String value) {
            addCriterion("BREW like", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewNotLike(String value) {
            addCriterion("BREW not like", value, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewIn(List<String> values) {
            addCriterion("BREW in", values, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewNotIn(List<String> values) {
            addCriterion("BREW not in", values, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewBetween(String value1, String value2) {
            addCriterion("BREW between", value1, value2, "brew");
            return (Criteria) this;
        }

        public Criteria andBrewNotBetween(String value1, String value2) {
            addCriterion("BREW not between", value1, value2, "brew");
            return (Criteria) this;
        }

        public Criteria andNetwareIsNull() {
            addCriterion("NETWARE is null");
            return (Criteria) this;
        }

        public Criteria andNetwareIsNotNull() {
            addCriterion("NETWARE is not null");
            return (Criteria) this;
        }

        public Criteria andNetwareEqualTo(String value) {
            addCriterion("NETWARE =", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareNotEqualTo(String value) {
            addCriterion("NETWARE <>", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareGreaterThan(String value) {
            addCriterion("NETWARE >", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareGreaterThanOrEqualTo(String value) {
            addCriterion("NETWARE >=", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareLessThan(String value) {
            addCriterion("NETWARE <", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareLessThanOrEqualTo(String value) {
            addCriterion("NETWARE <=", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareLike(String value) {
            addCriterion("NETWARE like", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareNotLike(String value) {
            addCriterion("NETWARE not like", value, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareIn(List<String> values) {
            addCriterion("NETWARE in", values, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareNotIn(List<String> values) {
            addCriterion("NETWARE not in", values, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareBetween(String value1, String value2) {
            addCriterion("NETWARE between", value1, value2, "netware");
            return (Criteria) this;
        }

        public Criteria andNetwareNotBetween(String value1, String value2) {
            addCriterion("NETWARE not between", value1, value2, "netware");
            return (Criteria) this;
        }

        public Criteria andVbIsNull() {
            addCriterion("VB is null");
            return (Criteria) this;
        }

        public Criteria andVbIsNotNull() {
            addCriterion("VB is not null");
            return (Criteria) this;
        }

        public Criteria andVbEqualTo(String value) {
            addCriterion("VB =", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbNotEqualTo(String value) {
            addCriterion("VB <>", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbGreaterThan(String value) {
            addCriterion("VB >", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbGreaterThanOrEqualTo(String value) {
            addCriterion("VB >=", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbLessThan(String value) {
            addCriterion("VB <", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbLessThanOrEqualTo(String value) {
            addCriterion("VB <=", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbLike(String value) {
            addCriterion("VB like", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbNotLike(String value) {
            addCriterion("VB not like", value, "vb");
            return (Criteria) this;
        }

        public Criteria andVbIn(List<String> values) {
            addCriterion("VB in", values, "vb");
            return (Criteria) this;
        }

        public Criteria andVbNotIn(List<String> values) {
            addCriterion("VB not in", values, "vb");
            return (Criteria) this;
        }

        public Criteria andVbBetween(String value1, String value2) {
            addCriterion("VB between", value1, value2, "vb");
            return (Criteria) this;
        }

        public Criteria andVbNotBetween(String value1, String value2) {
            addCriterion("VB not between", value1, value2, "vb");
            return (Criteria) this;
        }

        public Criteria andVbnetIsNull() {
            addCriterion("VBNET is null");
            return (Criteria) this;
        }

        public Criteria andVbnetIsNotNull() {
            addCriterion("VBNET is not null");
            return (Criteria) this;
        }

        public Criteria andVbnetEqualTo(String value) {
            addCriterion("VBNET =", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetNotEqualTo(String value) {
            addCriterion("VBNET <>", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetGreaterThan(String value) {
            addCriterion("VBNET >", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetGreaterThanOrEqualTo(String value) {
            addCriterion("VBNET >=", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetLessThan(String value) {
            addCriterion("VBNET <", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetLessThanOrEqualTo(String value) {
            addCriterion("VBNET <=", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetLike(String value) {
            addCriterion("VBNET like", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetNotLike(String value) {
            addCriterion("VBNET not like", value, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetIn(List<String> values) {
            addCriterion("VBNET in", values, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetNotIn(List<String> values) {
            addCriterion("VBNET not in", values, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetBetween(String value1, String value2) {
            addCriterion("VBNET between", value1, value2, "vbnet");
            return (Criteria) this;
        }

        public Criteria andVbnetNotBetween(String value1, String value2) {
            addCriterion("VBNET not between", value1, value2, "vbnet");
            return (Criteria) this;
        }

        public Criteria andAspIsNull() {
            addCriterion("ASP is null");
            return (Criteria) this;
        }

        public Criteria andAspIsNotNull() {
            addCriterion("ASP is not null");
            return (Criteria) this;
        }

        public Criteria andAspEqualTo(String value) {
            addCriterion("ASP =", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspNotEqualTo(String value) {
            addCriterion("ASP <>", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspGreaterThan(String value) {
            addCriterion("ASP >", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspGreaterThanOrEqualTo(String value) {
            addCriterion("ASP >=", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspLessThan(String value) {
            addCriterion("ASP <", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspLessThanOrEqualTo(String value) {
            addCriterion("ASP <=", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspLike(String value) {
            addCriterion("ASP like", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspNotLike(String value) {
            addCriterion("ASP not like", value, "asp");
            return (Criteria) this;
        }

        public Criteria andAspIn(List<String> values) {
            addCriterion("ASP in", values, "asp");
            return (Criteria) this;
        }

        public Criteria andAspNotIn(List<String> values) {
            addCriterion("ASP not in", values, "asp");
            return (Criteria) this;
        }

        public Criteria andAspBetween(String value1, String value2) {
            addCriterion("ASP between", value1, value2, "asp");
            return (Criteria) this;
        }

        public Criteria andAspNotBetween(String value1, String value2) {
            addCriterion("ASP not between", value1, value2, "asp");
            return (Criteria) this;
        }

        public Criteria andVcplusIsNull() {
            addCriterion("VCPLUS is null");
            return (Criteria) this;
        }

        public Criteria andVcplusIsNotNull() {
            addCriterion("VCPLUS is not null");
            return (Criteria) this;
        }

        public Criteria andVcplusEqualTo(String value) {
            addCriterion("VCPLUS =", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusNotEqualTo(String value) {
            addCriterion("VCPLUS <>", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusGreaterThan(String value) {
            addCriterion("VCPLUS >", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusGreaterThanOrEqualTo(String value) {
            addCriterion("VCPLUS >=", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusLessThan(String value) {
            addCriterion("VCPLUS <", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusLessThanOrEqualTo(String value) {
            addCriterion("VCPLUS <=", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusLike(String value) {
            addCriterion("VCPLUS like", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusNotLike(String value) {
            addCriterion("VCPLUS not like", value, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusIn(List<String> values) {
            addCriterion("VCPLUS in", values, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusNotIn(List<String> values) {
            addCriterion("VCPLUS not in", values, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusBetween(String value1, String value2) {
            addCriterion("VCPLUS between", value1, value2, "vcplus");
            return (Criteria) this;
        }

        public Criteria andVcplusNotBetween(String value1, String value2) {
            addCriterion("VCPLUS not between", value1, value2, "vcplus");
            return (Criteria) this;
        }

        public Criteria andUmlIsNull() {
            addCriterion("UML is null");
            return (Criteria) this;
        }

        public Criteria andUmlIsNotNull() {
            addCriterion("UML is not null");
            return (Criteria) this;
        }

        public Criteria andUmlEqualTo(String value) {
            addCriterion("UML =", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotEqualTo(String value) {
            addCriterion("UML <>", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlGreaterThan(String value) {
            addCriterion("UML >", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlGreaterThanOrEqualTo(String value) {
            addCriterion("UML >=", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlLessThan(String value) {
            addCriterion("UML <", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlLessThanOrEqualTo(String value) {
            addCriterion("UML <=", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlLike(String value) {
            addCriterion("UML like", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotLike(String value) {
            addCriterion("UML not like", value, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlIn(List<String> values) {
            addCriterion("UML in", values, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotIn(List<String> values) {
            addCriterion("UML not in", values, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlBetween(String value1, String value2) {
            addCriterion("UML between", value1, value2, "uml");
            return (Criteria) this;
        }

        public Criteria andUmlNotBetween(String value1, String value2) {
            addCriterion("UML not between", value1, value2, "uml");
            return (Criteria) this;
        }

        public Criteria andPerlIsNull() {
            addCriterion("PERL is null");
            return (Criteria) this;
        }

        public Criteria andPerlIsNotNull() {
            addCriterion("PERL is not null");
            return (Criteria) this;
        }

        public Criteria andPerlEqualTo(String value) {
            addCriterion("PERL =", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlNotEqualTo(String value) {
            addCriterion("PERL <>", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlGreaterThan(String value) {
            addCriterion("PERL >", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlGreaterThanOrEqualTo(String value) {
            addCriterion("PERL >=", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlLessThan(String value) {
            addCriterion("PERL <", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlLessThanOrEqualTo(String value) {
            addCriterion("PERL <=", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlLike(String value) {
            addCriterion("PERL like", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlNotLike(String value) {
            addCriterion("PERL not like", value, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlIn(List<String> values) {
            addCriterion("PERL in", values, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlNotIn(List<String> values) {
            addCriterion("PERL not in", values, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlBetween(String value1, String value2) {
            addCriterion("PERL between", value1, value2, "perl");
            return (Criteria) this;
        }

        public Criteria andPerlNotBetween(String value1, String value2) {
            addCriterion("PERL not between", value1, value2, "perl");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("C is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("C is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(String value) {
            addCriterion("C =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(String value) {
            addCriterion("C <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(String value) {
            addCriterion("C >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(String value) {
            addCriterion("C >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(String value) {
            addCriterion("C <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(String value) {
            addCriterion("C <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLike(String value) {
            addCriterion("C like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotLike(String value) {
            addCriterion("C not like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<String> values) {
            addCriterion("C in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<String> values) {
            addCriterion("C not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(String value1, String value2) {
            addCriterion("C between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(String value1, String value2) {
            addCriterion("C not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andUnixShellIsNull() {
            addCriterion("UNIX_SHELL is null");
            return (Criteria) this;
        }

        public Criteria andUnixShellIsNotNull() {
            addCriterion("UNIX_SHELL is not null");
            return (Criteria) this;
        }

        public Criteria andUnixShellEqualTo(String value) {
            addCriterion("UNIX_SHELL =", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellNotEqualTo(String value) {
            addCriterion("UNIX_SHELL <>", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellGreaterThan(String value) {
            addCriterion("UNIX_SHELL >", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellGreaterThanOrEqualTo(String value) {
            addCriterion("UNIX_SHELL >=", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellLessThan(String value) {
            addCriterion("UNIX_SHELL <", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellLessThanOrEqualTo(String value) {
            addCriterion("UNIX_SHELL <=", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellLike(String value) {
            addCriterion("UNIX_SHELL like", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellNotLike(String value) {
            addCriterion("UNIX_SHELL not like", value, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellIn(List<String> values) {
            addCriterion("UNIX_SHELL in", values, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellNotIn(List<String> values) {
            addCriterion("UNIX_SHELL not in", values, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellBetween(String value1, String value2) {
            addCriterion("UNIX_SHELL between", value1, value2, "unixShell");
            return (Criteria) this;
        }

        public Criteria andUnixShellNotBetween(String value1, String value2) {
            addCriterion("UNIX_SHELL not between", value1, value2, "unixShell");
            return (Criteria) this;
        }

        public Criteria andPlsqlIsNull() {
            addCriterion("PLSQL is null");
            return (Criteria) this;
        }

        public Criteria andPlsqlIsNotNull() {
            addCriterion("PLSQL is not null");
            return (Criteria) this;
        }

        public Criteria andPlsqlEqualTo(String value) {
            addCriterion("PLSQL =", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlNotEqualTo(String value) {
            addCriterion("PLSQL <>", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlGreaterThan(String value) {
            addCriterion("PLSQL >", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlGreaterThanOrEqualTo(String value) {
            addCriterion("PLSQL >=", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlLessThan(String value) {
            addCriterion("PLSQL <", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlLessThanOrEqualTo(String value) {
            addCriterion("PLSQL <=", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlLike(String value) {
            addCriterion("PLSQL like", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlNotLike(String value) {
            addCriterion("PLSQL not like", value, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlIn(List<String> values) {
            addCriterion("PLSQL in", values, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlNotIn(List<String> values) {
            addCriterion("PLSQL not in", values, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlBetween(String value1, String value2) {
            addCriterion("PLSQL between", value1, value2, "plsql");
            return (Criteria) this;
        }

        public Criteria andPlsqlNotBetween(String value1, String value2) {
            addCriterion("PLSQL not between", value1, value2, "plsql");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderIsNull() {
            addCriterion("POWERBUILDER is null");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderIsNotNull() {
            addCriterion("POWERBUILDER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderEqualTo(String value) {
            addCriterion("POWERBUILDER =", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderNotEqualTo(String value) {
            addCriterion("POWERBUILDER <>", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderGreaterThan(String value) {
            addCriterion("POWERBUILDER >", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderGreaterThanOrEqualTo(String value) {
            addCriterion("POWERBUILDER >=", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderLessThan(String value) {
            addCriterion("POWERBUILDER <", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderLessThanOrEqualTo(String value) {
            addCriterion("POWERBUILDER <=", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderLike(String value) {
            addCriterion("POWERBUILDER like", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderNotLike(String value) {
            addCriterion("POWERBUILDER not like", value, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderIn(List<String> values) {
            addCriterion("POWERBUILDER in", values, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderNotIn(List<String> values) {
            addCriterion("POWERBUILDER not in", values, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderBetween(String value1, String value2) {
            addCriterion("POWERBUILDER between", value1, value2, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andPowerbuilderNotBetween(String value1, String value2) {
            addCriterion("POWERBUILDER not between", value1, value2, "powerbuilder");
            return (Criteria) this;
        }

        public Criteria andDelphiIsNull() {
            addCriterion("DELPHI is null");
            return (Criteria) this;
        }

        public Criteria andDelphiIsNotNull() {
            addCriterion("DELPHI is not null");
            return (Criteria) this;
        }

        public Criteria andDelphiEqualTo(String value) {
            addCriterion("DELPHI =", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiNotEqualTo(String value) {
            addCriterion("DELPHI <>", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiGreaterThan(String value) {
            addCriterion("DELPHI >", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiGreaterThanOrEqualTo(String value) {
            addCriterion("DELPHI >=", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiLessThan(String value) {
            addCriterion("DELPHI <", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiLessThanOrEqualTo(String value) {
            addCriterion("DELPHI <=", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiLike(String value) {
            addCriterion("DELPHI like", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiNotLike(String value) {
            addCriterion("DELPHI not like", value, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiIn(List<String> values) {
            addCriterion("DELPHI in", values, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiNotIn(List<String> values) {
            addCriterion("DELPHI not in", values, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiBetween(String value1, String value2) {
            addCriterion("DELPHI between", value1, value2, "delphi");
            return (Criteria) this;
        }

        public Criteria andDelphiNotBetween(String value1, String value2) {
            addCriterion("DELPHI not between", value1, value2, "delphi");
            return (Criteria) this;
        }

        public Criteria andPythonIsNull() {
            addCriterion("PYTHON is null");
            return (Criteria) this;
        }

        public Criteria andPythonIsNotNull() {
            addCriterion("PYTHON is not null");
            return (Criteria) this;
        }

        public Criteria andPythonEqualTo(String value) {
            addCriterion("PYTHON =", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonNotEqualTo(String value) {
            addCriterion("PYTHON <>", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonGreaterThan(String value) {
            addCriterion("PYTHON >", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonGreaterThanOrEqualTo(String value) {
            addCriterion("PYTHON >=", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonLessThan(String value) {
            addCriterion("PYTHON <", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonLessThanOrEqualTo(String value) {
            addCriterion("PYTHON <=", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonLike(String value) {
            addCriterion("PYTHON like", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonNotLike(String value) {
            addCriterion("PYTHON not like", value, "python");
            return (Criteria) this;
        }

        public Criteria andPythonIn(List<String> values) {
            addCriterion("PYTHON in", values, "python");
            return (Criteria) this;
        }

        public Criteria andPythonNotIn(List<String> values) {
            addCriterion("PYTHON not in", values, "python");
            return (Criteria) this;
        }

        public Criteria andPythonBetween(String value1, String value2) {
            addCriterion("PYTHON between", value1, value2, "python");
            return (Criteria) this;
        }

        public Criteria andPythonNotBetween(String value1, String value2) {
            addCriterion("PYTHON not between", value1, value2, "python");
            return (Criteria) this;
        }

        public Criteria andJavaIsNull() {
            addCriterion("JAVA is null");
            return (Criteria) this;
        }

        public Criteria andJavaIsNotNull() {
            addCriterion("JAVA is not null");
            return (Criteria) this;
        }

        public Criteria andJavaEqualTo(String value) {
            addCriterion("JAVA =", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaNotEqualTo(String value) {
            addCriterion("JAVA <>", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaGreaterThan(String value) {
            addCriterion("JAVA >", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaGreaterThanOrEqualTo(String value) {
            addCriterion("JAVA >=", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaLessThan(String value) {
            addCriterion("JAVA <", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaLessThanOrEqualTo(String value) {
            addCriterion("JAVA <=", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaLike(String value) {
            addCriterion("JAVA like", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaNotLike(String value) {
            addCriterion("JAVA not like", value, "java");
            return (Criteria) this;
        }

        public Criteria andJavaIn(List<String> values) {
            addCriterion("JAVA in", values, "java");
            return (Criteria) this;
        }

        public Criteria andJavaNotIn(List<String> values) {
            addCriterion("JAVA not in", values, "java");
            return (Criteria) this;
        }

        public Criteria andJavaBetween(String value1, String value2) {
            addCriterion("JAVA between", value1, value2, "java");
            return (Criteria) this;
        }

        public Criteria andJavaNotBetween(String value1, String value2) {
            addCriterion("JAVA not between", value1, value2, "java");
            return (Criteria) this;
        }

        public Criteria andServletIsNull() {
            addCriterion("SERVLET is null");
            return (Criteria) this;
        }

        public Criteria andServletIsNotNull() {
            addCriterion("SERVLET is not null");
            return (Criteria) this;
        }

        public Criteria andServletEqualTo(String value) {
            addCriterion("SERVLET =", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletNotEqualTo(String value) {
            addCriterion("SERVLET <>", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletGreaterThan(String value) {
            addCriterion("SERVLET >", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletGreaterThanOrEqualTo(String value) {
            addCriterion("SERVLET >=", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletLessThan(String value) {
            addCriterion("SERVLET <", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletLessThanOrEqualTo(String value) {
            addCriterion("SERVLET <=", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletLike(String value) {
            addCriterion("SERVLET like", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletNotLike(String value) {
            addCriterion("SERVLET not like", value, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletIn(List<String> values) {
            addCriterion("SERVLET in", values, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletNotIn(List<String> values) {
            addCriterion("SERVLET not in", values, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletBetween(String value1, String value2) {
            addCriterion("SERVLET between", value1, value2, "servlet");
            return (Criteria) this;
        }

        public Criteria andServletNotBetween(String value1, String value2) {
            addCriterion("SERVLET not between", value1, value2, "servlet");
            return (Criteria) this;
        }

        public Criteria andJspIsNull() {
            addCriterion("JSP is null");
            return (Criteria) this;
        }

        public Criteria andJspIsNotNull() {
            addCriterion("JSP is not null");
            return (Criteria) this;
        }

        public Criteria andJspEqualTo(String value) {
            addCriterion("JSP =", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspNotEqualTo(String value) {
            addCriterion("JSP <>", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspGreaterThan(String value) {
            addCriterion("JSP >", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspGreaterThanOrEqualTo(String value) {
            addCriterion("JSP >=", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspLessThan(String value) {
            addCriterion("JSP <", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspLessThanOrEqualTo(String value) {
            addCriterion("JSP <=", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspLike(String value) {
            addCriterion("JSP like", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspNotLike(String value) {
            addCriterion("JSP not like", value, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspIn(List<String> values) {
            addCriterion("JSP in", values, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspNotIn(List<String> values) {
            addCriterion("JSP not in", values, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspBetween(String value1, String value2) {
            addCriterion("JSP between", value1, value2, "jsp");
            return (Criteria) this;
        }

        public Criteria andJspNotBetween(String value1, String value2) {
            addCriterion("JSP not between", value1, value2, "jsp");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaIsNull() {
            addCriterion("HIBERNATE_JPA is null");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaIsNotNull() {
            addCriterion("HIBERNATE_JPA is not null");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaEqualTo(String value) {
            addCriterion("HIBERNATE_JPA =", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaNotEqualTo(String value) {
            addCriterion("HIBERNATE_JPA <>", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaGreaterThan(String value) {
            addCriterion("HIBERNATE_JPA >", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaGreaterThanOrEqualTo(String value) {
            addCriterion("HIBERNATE_JPA >=", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaLessThan(String value) {
            addCriterion("HIBERNATE_JPA <", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaLessThanOrEqualTo(String value) {
            addCriterion("HIBERNATE_JPA <=", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaLike(String value) {
            addCriterion("HIBERNATE_JPA like", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaNotLike(String value) {
            addCriterion("HIBERNATE_JPA not like", value, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaIn(List<String> values) {
            addCriterion("HIBERNATE_JPA in", values, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaNotIn(List<String> values) {
            addCriterion("HIBERNATE_JPA not in", values, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaBetween(String value1, String value2) {
            addCriterion("HIBERNATE_JPA between", value1, value2, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andHibernateJpaNotBetween(String value1, String value2) {
            addCriterion("HIBERNATE_JPA not between", value1, value2, "hibernateJpa");
            return (Criteria) this;
        }

        public Criteria andStrutsIsNull() {
            addCriterion("STRUTS is null");
            return (Criteria) this;
        }

        public Criteria andStrutsIsNotNull() {
            addCriterion("STRUTS is not null");
            return (Criteria) this;
        }

        public Criteria andStrutsEqualTo(String value) {
            addCriterion("STRUTS =", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsNotEqualTo(String value) {
            addCriterion("STRUTS <>", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsGreaterThan(String value) {
            addCriterion("STRUTS >", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsGreaterThanOrEqualTo(String value) {
            addCriterion("STRUTS >=", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsLessThan(String value) {
            addCriterion("STRUTS <", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsLessThanOrEqualTo(String value) {
            addCriterion("STRUTS <=", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsLike(String value) {
            addCriterion("STRUTS like", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsNotLike(String value) {
            addCriterion("STRUTS not like", value, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsIn(List<String> values) {
            addCriterion("STRUTS in", values, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsNotIn(List<String> values) {
            addCriterion("STRUTS not in", values, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsBetween(String value1, String value2) {
            addCriterion("STRUTS between", value1, value2, "struts");
            return (Criteria) this;
        }

        public Criteria andStrutsNotBetween(String value1, String value2) {
            addCriterion("STRUTS not between", value1, value2, "struts");
            return (Criteria) this;
        }

        public Criteria andNetframeworkIsNull() {
            addCriterion("NETFRAMEWORK is null");
            return (Criteria) this;
        }

        public Criteria andNetframeworkIsNotNull() {
            addCriterion("NETFRAMEWORK is not null");
            return (Criteria) this;
        }

        public Criteria andNetframeworkEqualTo(String value) {
            addCriterion("NETFRAMEWORK =", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkNotEqualTo(String value) {
            addCriterion("NETFRAMEWORK <>", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkGreaterThan(String value) {
            addCriterion("NETFRAMEWORK >", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkGreaterThanOrEqualTo(String value) {
            addCriterion("NETFRAMEWORK >=", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkLessThan(String value) {
            addCriterion("NETFRAMEWORK <", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkLessThanOrEqualTo(String value) {
            addCriterion("NETFRAMEWORK <=", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkLike(String value) {
            addCriterion("NETFRAMEWORK like", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkNotLike(String value) {
            addCriterion("NETFRAMEWORK not like", value, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkIn(List<String> values) {
            addCriterion("NETFRAMEWORK in", values, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkNotIn(List<String> values) {
            addCriterion("NETFRAMEWORK not in", values, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkBetween(String value1, String value2) {
            addCriterion("NETFRAMEWORK between", value1, value2, "netframework");
            return (Criteria) this;
        }

        public Criteria andNetframeworkNotBetween(String value1, String value2) {
            addCriterion("NETFRAMEWORK not between", value1, value2, "netframework");
            return (Criteria) this;
        }

        public Criteria andCsharpIsNull() {
            addCriterion("CSHARP is null");
            return (Criteria) this;
        }

        public Criteria andCsharpIsNotNull() {
            addCriterion("CSHARP is not null");
            return (Criteria) this;
        }

        public Criteria andCsharpEqualTo(String value) {
            addCriterion("CSHARP =", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpNotEqualTo(String value) {
            addCriterion("CSHARP <>", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpGreaterThan(String value) {
            addCriterion("CSHARP >", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpGreaterThanOrEqualTo(String value) {
            addCriterion("CSHARP >=", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpLessThan(String value) {
            addCriterion("CSHARP <", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpLessThanOrEqualTo(String value) {
            addCriterion("CSHARP <=", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpLike(String value) {
            addCriterion("CSHARP like", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpNotLike(String value) {
            addCriterion("CSHARP not like", value, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpIn(List<String> values) {
            addCriterion("CSHARP in", values, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpNotIn(List<String> values) {
            addCriterion("CSHARP not in", values, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpBetween(String value1, String value2) {
            addCriterion("CSHARP between", value1, value2, "csharp");
            return (Criteria) this;
        }

        public Criteria andCsharpNotBetween(String value1, String value2) {
            addCriterion("CSHARP not between", value1, value2, "csharp");
            return (Criteria) this;
        }

        public Criteria andHtmlIsNull() {
            addCriterion("HTML is null");
            return (Criteria) this;
        }

        public Criteria andHtmlIsNotNull() {
            addCriterion("HTML is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlEqualTo(String value) {
            addCriterion("HTML =", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotEqualTo(String value) {
            addCriterion("HTML <>", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlGreaterThan(String value) {
            addCriterion("HTML >", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("HTML >=", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLessThan(String value) {
            addCriterion("HTML <", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLessThanOrEqualTo(String value) {
            addCriterion("HTML <=", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLike(String value) {
            addCriterion("HTML like", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotLike(String value) {
            addCriterion("HTML not like", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlIn(List<String> values) {
            addCriterion("HTML in", values, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotIn(List<String> values) {
            addCriterion("HTML not in", values, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlBetween(String value1, String value2) {
            addCriterion("HTML between", value1, value2, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotBetween(String value1, String value2) {
            addCriterion("HTML not between", value1, value2, "html");
            return (Criteria) this;
        }

        public Criteria andProcIsNull() {
            addCriterion("PROC is null");
            return (Criteria) this;
        }

        public Criteria andProcIsNotNull() {
            addCriterion("PROC is not null");
            return (Criteria) this;
        }

        public Criteria andProcEqualTo(String value) {
            addCriterion("PROC =", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcNotEqualTo(String value) {
            addCriterion("PROC <>", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcGreaterThan(String value) {
            addCriterion("PROC >", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcGreaterThanOrEqualTo(String value) {
            addCriterion("PROC >=", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcLessThan(String value) {
            addCriterion("PROC <", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcLessThanOrEqualTo(String value) {
            addCriterion("PROC <=", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcLike(String value) {
            addCriterion("PROC like", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcNotLike(String value) {
            addCriterion("PROC not like", value, "proc");
            return (Criteria) this;
        }

        public Criteria andProcIn(List<String> values) {
            addCriterion("PROC in", values, "proc");
            return (Criteria) this;
        }

        public Criteria andProcNotIn(List<String> values) {
            addCriterion("PROC not in", values, "proc");
            return (Criteria) this;
        }

        public Criteria andProcBetween(String value1, String value2) {
            addCriterion("PROC between", value1, value2, "proc");
            return (Criteria) this;
        }

        public Criteria andProcNotBetween(String value1, String value2) {
            addCriterion("PROC not between", value1, value2, "proc");
            return (Criteria) this;
        }

        public Criteria andAjaxIsNull() {
            addCriterion("AJAX is null");
            return (Criteria) this;
        }

        public Criteria andAjaxIsNotNull() {
            addCriterion("AJAX is not null");
            return (Criteria) this;
        }

        public Criteria andAjaxEqualTo(String value) {
            addCriterion("AJAX =", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxNotEqualTo(String value) {
            addCriterion("AJAX <>", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxGreaterThan(String value) {
            addCriterion("AJAX >", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxGreaterThanOrEqualTo(String value) {
            addCriterion("AJAX >=", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxLessThan(String value) {
            addCriterion("AJAX <", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxLessThanOrEqualTo(String value) {
            addCriterion("AJAX <=", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxLike(String value) {
            addCriterion("AJAX like", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxNotLike(String value) {
            addCriterion("AJAX not like", value, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxIn(List<String> values) {
            addCriterion("AJAX in", values, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxNotIn(List<String> values) {
            addCriterion("AJAX not in", values, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxBetween(String value1, String value2) {
            addCriterion("AJAX between", value1, value2, "ajax");
            return (Criteria) this;
        }

        public Criteria andAjaxNotBetween(String value1, String value2) {
            addCriterion("AJAX not between", value1, value2, "ajax");
            return (Criteria) this;
        }

        public Criteria andFlexIsNull() {
            addCriterion("FLEX is null");
            return (Criteria) this;
        }

        public Criteria andFlexIsNotNull() {
            addCriterion("FLEX is not null");
            return (Criteria) this;
        }

        public Criteria andFlexEqualTo(String value) {
            addCriterion("FLEX =", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexNotEqualTo(String value) {
            addCriterion("FLEX <>", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexGreaterThan(String value) {
            addCriterion("FLEX >", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexGreaterThanOrEqualTo(String value) {
            addCriterion("FLEX >=", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexLessThan(String value) {
            addCriterion("FLEX <", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexLessThanOrEqualTo(String value) {
            addCriterion("FLEX <=", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexLike(String value) {
            addCriterion("FLEX like", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexNotLike(String value) {
            addCriterion("FLEX not like", value, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexIn(List<String> values) {
            addCriterion("FLEX in", values, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexNotIn(List<String> values) {
            addCriterion("FLEX not in", values, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexBetween(String value1, String value2) {
            addCriterion("FLEX between", value1, value2, "flex");
            return (Criteria) this;
        }

        public Criteria andFlexNotBetween(String value1, String value2) {
            addCriterion("FLEX not between", value1, value2, "flex");
            return (Criteria) this;
        }

        public Criteria andIntraMartIsNull() {
            addCriterion("INTRA_MART is null");
            return (Criteria) this;
        }

        public Criteria andIntraMartIsNotNull() {
            addCriterion("INTRA_MART is not null");
            return (Criteria) this;
        }

        public Criteria andIntraMartEqualTo(String value) {
            addCriterion("INTRA_MART =", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartNotEqualTo(String value) {
            addCriterion("INTRA_MART <>", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartGreaterThan(String value) {
            addCriterion("INTRA_MART >", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartGreaterThanOrEqualTo(String value) {
            addCriterion("INTRA_MART >=", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartLessThan(String value) {
            addCriterion("INTRA_MART <", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartLessThanOrEqualTo(String value) {
            addCriterion("INTRA_MART <=", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartLike(String value) {
            addCriterion("INTRA_MART like", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartNotLike(String value) {
            addCriterion("INTRA_MART not like", value, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartIn(List<String> values) {
            addCriterion("INTRA_MART in", values, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartNotIn(List<String> values) {
            addCriterion("INTRA_MART not in", values, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartBetween(String value1, String value2) {
            addCriterion("INTRA_MART between", value1, value2, "intraMart");
            return (Criteria) this;
        }

        public Criteria andIntraMartNotBetween(String value1, String value2) {
            addCriterion("INTRA_MART not between", value1, value2, "intraMart");
            return (Criteria) this;
        }

        public Criteria andPhpIsNull() {
            addCriterion("PHP is null");
            return (Criteria) this;
        }

        public Criteria andPhpIsNotNull() {
            addCriterion("PHP is not null");
            return (Criteria) this;
        }

        public Criteria andPhpEqualTo(String value) {
            addCriterion("PHP =", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpNotEqualTo(String value) {
            addCriterion("PHP <>", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpGreaterThan(String value) {
            addCriterion("PHP >", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpGreaterThanOrEqualTo(String value) {
            addCriterion("PHP >=", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpLessThan(String value) {
            addCriterion("PHP <", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpLessThanOrEqualTo(String value) {
            addCriterion("PHP <=", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpLike(String value) {
            addCriterion("PHP like", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpNotLike(String value) {
            addCriterion("PHP not like", value, "php");
            return (Criteria) this;
        }

        public Criteria andPhpIn(List<String> values) {
            addCriterion("PHP in", values, "php");
            return (Criteria) this;
        }

        public Criteria andPhpNotIn(List<String> values) {
            addCriterion("PHP not in", values, "php");
            return (Criteria) this;
        }

        public Criteria andPhpBetween(String value1, String value2) {
            addCriterion("PHP between", value1, value2, "php");
            return (Criteria) this;
        }

        public Criteria andPhpNotBetween(String value1, String value2) {
            addCriterion("PHP not between", value1, value2, "php");
            return (Criteria) this;
        }

        public Criteria andCplusIsNull() {
            addCriterion("CPLUS is null");
            return (Criteria) this;
        }

        public Criteria andCplusIsNotNull() {
            addCriterion("CPLUS is not null");
            return (Criteria) this;
        }

        public Criteria andCplusEqualTo(String value) {
            addCriterion("CPLUS =", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusNotEqualTo(String value) {
            addCriterion("CPLUS <>", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusGreaterThan(String value) {
            addCriterion("CPLUS >", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusGreaterThanOrEqualTo(String value) {
            addCriterion("CPLUS >=", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusLessThan(String value) {
            addCriterion("CPLUS <", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusLessThanOrEqualTo(String value) {
            addCriterion("CPLUS <=", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusLike(String value) {
            addCriterion("CPLUS like", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusNotLike(String value) {
            addCriterion("CPLUS not like", value, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusIn(List<String> values) {
            addCriterion("CPLUS in", values, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusNotIn(List<String> values) {
            addCriterion("CPLUS not in", values, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusBetween(String value1, String value2) {
            addCriterion("CPLUS between", value1, value2, "cplus");
            return (Criteria) this;
        }

        public Criteria andCplusNotBetween(String value1, String value2) {
            addCriterion("CPLUS not between", value1, value2, "cplus");
            return (Criteria) this;
        }

        public Criteria andSqlIsNull() {
            addCriterion("SQL is null");
            return (Criteria) this;
        }

        public Criteria andSqlIsNotNull() {
            addCriterion("SQL is not null");
            return (Criteria) this;
        }

        public Criteria andSqlEqualTo(String value) {
            addCriterion("SQL =", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotEqualTo(String value) {
            addCriterion("SQL <>", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlGreaterThan(String value) {
            addCriterion("SQL >", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlGreaterThanOrEqualTo(String value) {
            addCriterion("SQL >=", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLessThan(String value) {
            addCriterion("SQL <", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLessThanOrEqualTo(String value) {
            addCriterion("SQL <=", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLike(String value) {
            addCriterion("SQL like", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotLike(String value) {
            addCriterion("SQL not like", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlIn(List<String> values) {
            addCriterion("SQL in", values, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotIn(List<String> values) {
            addCriterion("SQL not in", values, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlBetween(String value1, String value2) {
            addCriterion("SQL between", value1, value2, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotBetween(String value1, String value2) {
            addCriterion("SQL not between", value1, value2, "sql");
            return (Criteria) this;
        }

        public Criteria andSapAbapIsNull() {
            addCriterion("SAP_ABAP is null");
            return (Criteria) this;
        }

        public Criteria andSapAbapIsNotNull() {
            addCriterion("SAP_ABAP is not null");
            return (Criteria) this;
        }

        public Criteria andSapAbapEqualTo(String value) {
            addCriterion("SAP_ABAP =", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapNotEqualTo(String value) {
            addCriterion("SAP_ABAP <>", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapGreaterThan(String value) {
            addCriterion("SAP_ABAP >", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_ABAP >=", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapLessThan(String value) {
            addCriterion("SAP_ABAP <", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapLessThanOrEqualTo(String value) {
            addCriterion("SAP_ABAP <=", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapLike(String value) {
            addCriterion("SAP_ABAP like", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapNotLike(String value) {
            addCriterion("SAP_ABAP not like", value, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapIn(List<String> values) {
            addCriterion("SAP_ABAP in", values, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapNotIn(List<String> values) {
            addCriterion("SAP_ABAP not in", values, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapBetween(String value1, String value2) {
            addCriterion("SAP_ABAP between", value1, value2, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andSapAbapNotBetween(String value1, String value2) {
            addCriterion("SAP_ABAP not between", value1, value2, "sapAbap");
            return (Criteria) this;
        }

        public Criteria andMatlabIsNull() {
            addCriterion("MATLAB is null");
            return (Criteria) this;
        }

        public Criteria andMatlabIsNotNull() {
            addCriterion("MATLAB is not null");
            return (Criteria) this;
        }

        public Criteria andMatlabEqualTo(String value) {
            addCriterion("MATLAB =", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabNotEqualTo(String value) {
            addCriterion("MATLAB <>", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabGreaterThan(String value) {
            addCriterion("MATLAB >", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabGreaterThanOrEqualTo(String value) {
            addCriterion("MATLAB >=", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabLessThan(String value) {
            addCriterion("MATLAB <", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabLessThanOrEqualTo(String value) {
            addCriterion("MATLAB <=", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabLike(String value) {
            addCriterion("MATLAB like", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabNotLike(String value) {
            addCriterion("MATLAB not like", value, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabIn(List<String> values) {
            addCriterion("MATLAB in", values, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabNotIn(List<String> values) {
            addCriterion("MATLAB not in", values, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabBetween(String value1, String value2) {
            addCriterion("MATLAB between", value1, value2, "matlab");
            return (Criteria) this;
        }

        public Criteria andMatlabNotBetween(String value1, String value2) {
            addCriterion("MATLAB not between", value1, value2, "matlab");
            return (Criteria) this;
        }

        public Criteria andMathematicaIsNull() {
            addCriterion("MATHEMATICA is null");
            return (Criteria) this;
        }

        public Criteria andMathematicaIsNotNull() {
            addCriterion("MATHEMATICA is not null");
            return (Criteria) this;
        }

        public Criteria andMathematicaEqualTo(String value) {
            addCriterion("MATHEMATICA =", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaNotEqualTo(String value) {
            addCriterion("MATHEMATICA <>", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaGreaterThan(String value) {
            addCriterion("MATHEMATICA >", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaGreaterThanOrEqualTo(String value) {
            addCriterion("MATHEMATICA >=", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaLessThan(String value) {
            addCriterion("MATHEMATICA <", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaLessThanOrEqualTo(String value) {
            addCriterion("MATHEMATICA <=", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaLike(String value) {
            addCriterion("MATHEMATICA like", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaNotLike(String value) {
            addCriterion("MATHEMATICA not like", value, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaIn(List<String> values) {
            addCriterion("MATHEMATICA in", values, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaNotIn(List<String> values) {
            addCriterion("MATHEMATICA not in", values, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaBetween(String value1, String value2) {
            addCriterion("MATHEMATICA between", value1, value2, "mathematica");
            return (Criteria) this;
        }

        public Criteria andMathematicaNotBetween(String value1, String value2) {
            addCriterion("MATHEMATICA not between", value1, value2, "mathematica");
            return (Criteria) this;
        }

        public Criteria andCobolIsNull() {
            addCriterion("COBOL is null");
            return (Criteria) this;
        }

        public Criteria andCobolIsNotNull() {
            addCriterion("COBOL is not null");
            return (Criteria) this;
        }

        public Criteria andCobolEqualTo(String value) {
            addCriterion("COBOL =", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolNotEqualTo(String value) {
            addCriterion("COBOL <>", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolGreaterThan(String value) {
            addCriterion("COBOL >", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolGreaterThanOrEqualTo(String value) {
            addCriterion("COBOL >=", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolLessThan(String value) {
            addCriterion("COBOL <", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolLessThanOrEqualTo(String value) {
            addCriterion("COBOL <=", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolLike(String value) {
            addCriterion("COBOL like", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolNotLike(String value) {
            addCriterion("COBOL not like", value, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolIn(List<String> values) {
            addCriterion("COBOL in", values, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolNotIn(List<String> values) {
            addCriterion("COBOL not in", values, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolBetween(String value1, String value2) {
            addCriterion("COBOL between", value1, value2, "cobol");
            return (Criteria) this;
        }

        public Criteria andCobolNotBetween(String value1, String value2) {
            addCriterion("COBOL not between", value1, value2, "cobol");
            return (Criteria) this;
        }

        public Criteria andJavascriptIsNull() {
            addCriterion("JAVASCRIPT is null");
            return (Criteria) this;
        }

        public Criteria andJavascriptIsNotNull() {
            addCriterion("JAVASCRIPT is not null");
            return (Criteria) this;
        }

        public Criteria andJavascriptEqualTo(String value) {
            addCriterion("JAVASCRIPT =", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptNotEqualTo(String value) {
            addCriterion("JAVASCRIPT <>", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptGreaterThan(String value) {
            addCriterion("JAVASCRIPT >", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptGreaterThanOrEqualTo(String value) {
            addCriterion("JAVASCRIPT >=", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptLessThan(String value) {
            addCriterion("JAVASCRIPT <", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptLessThanOrEqualTo(String value) {
            addCriterion("JAVASCRIPT <=", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptLike(String value) {
            addCriterion("JAVASCRIPT like", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptNotLike(String value) {
            addCriterion("JAVASCRIPT not like", value, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptIn(List<String> values) {
            addCriterion("JAVASCRIPT in", values, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptNotIn(List<String> values) {
            addCriterion("JAVASCRIPT not in", values, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptBetween(String value1, String value2) {
            addCriterion("JAVASCRIPT between", value1, value2, "javascript");
            return (Criteria) this;
        }

        public Criteria andJavascriptNotBetween(String value1, String value2) {
            addCriterion("JAVASCRIPT not between", value1, value2, "javascript");
            return (Criteria) this;
        }

        public Criteria andXmlIsNull() {
            addCriterion("XML is null");
            return (Criteria) this;
        }

        public Criteria andXmlIsNotNull() {
            addCriterion("XML is not null");
            return (Criteria) this;
        }

        public Criteria andXmlEqualTo(String value) {
            addCriterion("XML =", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlNotEqualTo(String value) {
            addCriterion("XML <>", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlGreaterThan(String value) {
            addCriterion("XML >", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlGreaterThanOrEqualTo(String value) {
            addCriterion("XML >=", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlLessThan(String value) {
            addCriterion("XML <", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlLessThanOrEqualTo(String value) {
            addCriterion("XML <=", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlLike(String value) {
            addCriterion("XML like", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlNotLike(String value) {
            addCriterion("XML not like", value, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlIn(List<String> values) {
            addCriterion("XML in", values, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlNotIn(List<String> values) {
            addCriterion("XML not in", values, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlBetween(String value1, String value2) {
            addCriterion("XML between", value1, value2, "xml");
            return (Criteria) this;
        }

        public Criteria andXmlNotBetween(String value1, String value2) {
            addCriterion("XML not between", value1, value2, "xml");
            return (Criteria) this;
        }

        public Criteria andAssemblerIsNull() {
            addCriterion("ASSEMBLER is null");
            return (Criteria) this;
        }

        public Criteria andAssemblerIsNotNull() {
            addCriterion("ASSEMBLER is not null");
            return (Criteria) this;
        }

        public Criteria andAssemblerEqualTo(String value) {
            addCriterion("ASSEMBLER =", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerNotEqualTo(String value) {
            addCriterion("ASSEMBLER <>", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerGreaterThan(String value) {
            addCriterion("ASSEMBLER >", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerGreaterThanOrEqualTo(String value) {
            addCriterion("ASSEMBLER >=", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerLessThan(String value) {
            addCriterion("ASSEMBLER <", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerLessThanOrEqualTo(String value) {
            addCriterion("ASSEMBLER <=", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerLike(String value) {
            addCriterion("ASSEMBLER like", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerNotLike(String value) {
            addCriterion("ASSEMBLER not like", value, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerIn(List<String> values) {
            addCriterion("ASSEMBLER in", values, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerNotIn(List<String> values) {
            addCriterion("ASSEMBLER not in", values, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerBetween(String value1, String value2) {
            addCriterion("ASSEMBLER between", value1, value2, "assembler");
            return (Criteria) this;
        }

        public Criteria andAssemblerNotBetween(String value1, String value2) {
            addCriterion("ASSEMBLER not between", value1, value2, "assembler");
            return (Criteria) this;
        }

        public Criteria andJustwareIsNull() {
            addCriterion("JUSTWARE is null");
            return (Criteria) this;
        }

        public Criteria andJustwareIsNotNull() {
            addCriterion("JUSTWARE is not null");
            return (Criteria) this;
        }

        public Criteria andJustwareEqualTo(String value) {
            addCriterion("JUSTWARE =", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareNotEqualTo(String value) {
            addCriterion("JUSTWARE <>", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareGreaterThan(String value) {
            addCriterion("JUSTWARE >", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareGreaterThanOrEqualTo(String value) {
            addCriterion("JUSTWARE >=", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareLessThan(String value) {
            addCriterion("JUSTWARE <", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareLessThanOrEqualTo(String value) {
            addCriterion("JUSTWARE <=", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareLike(String value) {
            addCriterion("JUSTWARE like", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareNotLike(String value) {
            addCriterion("JUSTWARE not like", value, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareIn(List<String> values) {
            addCriterion("JUSTWARE in", values, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareNotIn(List<String> values) {
            addCriterion("JUSTWARE not in", values, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareBetween(String value1, String value2) {
            addCriterion("JUSTWARE between", value1, value2, "justware");
            return (Criteria) this;
        }

        public Criteria andJustwareNotBetween(String value1, String value2) {
            addCriterion("JUSTWARE not between", value1, value2, "justware");
            return (Criteria) this;
        }

        public Criteria andAccessIsNull() {
            addCriterion("ACCESS is null");
            return (Criteria) this;
        }

        public Criteria andAccessIsNotNull() {
            addCriterion("ACCESS is not null");
            return (Criteria) this;
        }

        public Criteria andAccessEqualTo(String value) {
            addCriterion("ACCESS =", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotEqualTo(String value) {
            addCriterion("ACCESS <>", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThan(String value) {
            addCriterion("ACCESS >", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS >=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThan(String value) {
            addCriterion("ACCESS <", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThanOrEqualTo(String value) {
            addCriterion("ACCESS <=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLike(String value) {
            addCriterion("ACCESS like", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotLike(String value) {
            addCriterion("ACCESS not like", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessIn(List<String> values) {
            addCriterion("ACCESS in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotIn(List<String> values) {
            addCriterion("ACCESS not in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessBetween(String value1, String value2) {
            addCriterion("ACCESS between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotBetween(String value1, String value2) {
            addCriterion("ACCESS not between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andOracleIsNull() {
            addCriterion("ORACLE is null");
            return (Criteria) this;
        }

        public Criteria andOracleIsNotNull() {
            addCriterion("ORACLE is not null");
            return (Criteria) this;
        }

        public Criteria andOracleEqualTo(String value) {
            addCriterion("ORACLE =", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleNotEqualTo(String value) {
            addCriterion("ORACLE <>", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleGreaterThan(String value) {
            addCriterion("ORACLE >", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleGreaterThanOrEqualTo(String value) {
            addCriterion("ORACLE >=", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleLessThan(String value) {
            addCriterion("ORACLE <", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleLessThanOrEqualTo(String value) {
            addCriterion("ORACLE <=", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleLike(String value) {
            addCriterion("ORACLE like", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleNotLike(String value) {
            addCriterion("ORACLE not like", value, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleIn(List<String> values) {
            addCriterion("ORACLE in", values, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleNotIn(List<String> values) {
            addCriterion("ORACLE not in", values, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleBetween(String value1, String value2) {
            addCriterion("ORACLE between", value1, value2, "oracle");
            return (Criteria) this;
        }

        public Criteria andOracleNotBetween(String value1, String value2) {
            addCriterion("ORACLE not between", value1, value2, "oracle");
            return (Criteria) this;
        }

        public Criteria andSqlserverIsNull() {
            addCriterion("SQLSERVER is null");
            return (Criteria) this;
        }

        public Criteria andSqlserverIsNotNull() {
            addCriterion("SQLSERVER is not null");
            return (Criteria) this;
        }

        public Criteria andSqlserverEqualTo(String value) {
            addCriterion("SQLSERVER =", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverNotEqualTo(String value) {
            addCriterion("SQLSERVER <>", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverGreaterThan(String value) {
            addCriterion("SQLSERVER >", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverGreaterThanOrEqualTo(String value) {
            addCriterion("SQLSERVER >=", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverLessThan(String value) {
            addCriterion("SQLSERVER <", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverLessThanOrEqualTo(String value) {
            addCriterion("SQLSERVER <=", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverLike(String value) {
            addCriterion("SQLSERVER like", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverNotLike(String value) {
            addCriterion("SQLSERVER not like", value, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverIn(List<String> values) {
            addCriterion("SQLSERVER in", values, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverNotIn(List<String> values) {
            addCriterion("SQLSERVER not in", values, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverBetween(String value1, String value2) {
            addCriterion("SQLSERVER between", value1, value2, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andSqlserverNotBetween(String value1, String value2) {
            addCriterion("SQLSERVER not between", value1, value2, "sqlserver");
            return (Criteria) this;
        }

        public Criteria andDb2IsNull() {
            addCriterion("DB2 is null");
            return (Criteria) this;
        }

        public Criteria andDb2IsNotNull() {
            addCriterion("DB2 is not null");
            return (Criteria) this;
        }

        public Criteria andDb2EqualTo(String value) {
            addCriterion("DB2 =", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2NotEqualTo(String value) {
            addCriterion("DB2 <>", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2GreaterThan(String value) {
            addCriterion("DB2 >", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2GreaterThanOrEqualTo(String value) {
            addCriterion("DB2 >=", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2LessThan(String value) {
            addCriterion("DB2 <", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2LessThanOrEqualTo(String value) {
            addCriterion("DB2 <=", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2Like(String value) {
            addCriterion("DB2 like", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2NotLike(String value) {
            addCriterion("DB2 not like", value, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2In(List<String> values) {
            addCriterion("DB2 in", values, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2NotIn(List<String> values) {
            addCriterion("DB2 not in", values, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2Between(String value1, String value2) {
            addCriterion("DB2 between", value1, value2, "db2");
            return (Criteria) this;
        }

        public Criteria andDb2NotBetween(String value1, String value2) {
            addCriterion("DB2 not between", value1, value2, "db2");
            return (Criteria) this;
        }

        public Criteria andSybaseIsNull() {
            addCriterion("SYBASE is null");
            return (Criteria) this;
        }

        public Criteria andSybaseIsNotNull() {
            addCriterion("SYBASE is not null");
            return (Criteria) this;
        }

        public Criteria andSybaseEqualTo(String value) {
            addCriterion("SYBASE =", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseNotEqualTo(String value) {
            addCriterion("SYBASE <>", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseGreaterThan(String value) {
            addCriterion("SYBASE >", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseGreaterThanOrEqualTo(String value) {
            addCriterion("SYBASE >=", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseLessThan(String value) {
            addCriterion("SYBASE <", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseLessThanOrEqualTo(String value) {
            addCriterion("SYBASE <=", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseLike(String value) {
            addCriterion("SYBASE like", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseNotLike(String value) {
            addCriterion("SYBASE not like", value, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseIn(List<String> values) {
            addCriterion("SYBASE in", values, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseNotIn(List<String> values) {
            addCriterion("SYBASE not in", values, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseBetween(String value1, String value2) {
            addCriterion("SYBASE between", value1, value2, "sybase");
            return (Criteria) this;
        }

        public Criteria andSybaseNotBetween(String value1, String value2) {
            addCriterion("SYBASE not between", value1, value2, "sybase");
            return (Criteria) this;
        }

        public Criteria andInformixIsNull() {
            addCriterion("INFORMIX is null");
            return (Criteria) this;
        }

        public Criteria andInformixIsNotNull() {
            addCriterion("INFORMIX is not null");
            return (Criteria) this;
        }

        public Criteria andInformixEqualTo(String value) {
            addCriterion("INFORMIX =", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixNotEqualTo(String value) {
            addCriterion("INFORMIX <>", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixGreaterThan(String value) {
            addCriterion("INFORMIX >", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixGreaterThanOrEqualTo(String value) {
            addCriterion("INFORMIX >=", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixLessThan(String value) {
            addCriterion("INFORMIX <", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixLessThanOrEqualTo(String value) {
            addCriterion("INFORMIX <=", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixLike(String value) {
            addCriterion("INFORMIX like", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixNotLike(String value) {
            addCriterion("INFORMIX not like", value, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixIn(List<String> values) {
            addCriterion("INFORMIX in", values, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixNotIn(List<String> values) {
            addCriterion("INFORMIX not in", values, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixBetween(String value1, String value2) {
            addCriterion("INFORMIX between", value1, value2, "informix");
            return (Criteria) this;
        }

        public Criteria andInformixNotBetween(String value1, String value2) {
            addCriterion("INFORMIX not between", value1, value2, "informix");
            return (Criteria) this;
        }

        public Criteria andPostgresqlIsNull() {
            addCriterion("POSTGRESQL is null");
            return (Criteria) this;
        }

        public Criteria andPostgresqlIsNotNull() {
            addCriterion("POSTGRESQL is not null");
            return (Criteria) this;
        }

        public Criteria andPostgresqlEqualTo(String value) {
            addCriterion("POSTGRESQL =", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlNotEqualTo(String value) {
            addCriterion("POSTGRESQL <>", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlGreaterThan(String value) {
            addCriterion("POSTGRESQL >", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlGreaterThanOrEqualTo(String value) {
            addCriterion("POSTGRESQL >=", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlLessThan(String value) {
            addCriterion("POSTGRESQL <", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlLessThanOrEqualTo(String value) {
            addCriterion("POSTGRESQL <=", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlLike(String value) {
            addCriterion("POSTGRESQL like", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlNotLike(String value) {
            addCriterion("POSTGRESQL not like", value, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlIn(List<String> values) {
            addCriterion("POSTGRESQL in", values, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlNotIn(List<String> values) {
            addCriterion("POSTGRESQL not in", values, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlBetween(String value1, String value2) {
            addCriterion("POSTGRESQL between", value1, value2, "postgresql");
            return (Criteria) this;
        }

        public Criteria andPostgresqlNotBetween(String value1, String value2) {
            addCriterion("POSTGRESQL not between", value1, value2, "postgresql");
            return (Criteria) this;
        }

        public Criteria andMysqlIsNull() {
            addCriterion("MYSQL is null");
            return (Criteria) this;
        }

        public Criteria andMysqlIsNotNull() {
            addCriterion("MYSQL is not null");
            return (Criteria) this;
        }

        public Criteria andMysqlEqualTo(String value) {
            addCriterion("MYSQL =", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlNotEqualTo(String value) {
            addCriterion("MYSQL <>", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlGreaterThan(String value) {
            addCriterion("MYSQL >", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlGreaterThanOrEqualTo(String value) {
            addCriterion("MYSQL >=", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlLessThan(String value) {
            addCriterion("MYSQL <", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlLessThanOrEqualTo(String value) {
            addCriterion("MYSQL <=", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlLike(String value) {
            addCriterion("MYSQL like", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlNotLike(String value) {
            addCriterion("MYSQL not like", value, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlIn(List<String> values) {
            addCriterion("MYSQL in", values, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlNotIn(List<String> values) {
            addCriterion("MYSQL not in", values, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlBetween(String value1, String value2) {
            addCriterion("MYSQL between", value1, value2, "mysql");
            return (Criteria) this;
        }

        public Criteria andMysqlNotBetween(String value1, String value2) {
            addCriterion("MYSQL not between", value1, value2, "mysql");
            return (Criteria) this;
        }

        public Criteria andHirdbIsNull() {
            addCriterion("HIRDB is null");
            return (Criteria) this;
        }

        public Criteria andHirdbIsNotNull() {
            addCriterion("HIRDB is not null");
            return (Criteria) this;
        }

        public Criteria andHirdbEqualTo(String value) {
            addCriterion("HIRDB =", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbNotEqualTo(String value) {
            addCriterion("HIRDB <>", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbGreaterThan(String value) {
            addCriterion("HIRDB >", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbGreaterThanOrEqualTo(String value) {
            addCriterion("HIRDB >=", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbLessThan(String value) {
            addCriterion("HIRDB <", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbLessThanOrEqualTo(String value) {
            addCriterion("HIRDB <=", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbLike(String value) {
            addCriterion("HIRDB like", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbNotLike(String value) {
            addCriterion("HIRDB not like", value, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbIn(List<String> values) {
            addCriterion("HIRDB in", values, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbNotIn(List<String> values) {
            addCriterion("HIRDB not in", values, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbBetween(String value1, String value2) {
            addCriterion("HIRDB between", value1, value2, "hirdb");
            return (Criteria) this;
        }

        public Criteria andHirdbNotBetween(String value1, String value2) {
            addCriterion("HIRDB not between", value1, value2, "hirdb");
            return (Criteria) this;
        }

        public Criteria andSymfowareIsNull() {
            addCriterion("SYMFOWARE is null");
            return (Criteria) this;
        }

        public Criteria andSymfowareIsNotNull() {
            addCriterion("SYMFOWARE is not null");
            return (Criteria) this;
        }

        public Criteria andSymfowareEqualTo(String value) {
            addCriterion("SYMFOWARE =", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareNotEqualTo(String value) {
            addCriterion("SYMFOWARE <>", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareGreaterThan(String value) {
            addCriterion("SYMFOWARE >", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareGreaterThanOrEqualTo(String value) {
            addCriterion("SYMFOWARE >=", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareLessThan(String value) {
            addCriterion("SYMFOWARE <", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareLessThanOrEqualTo(String value) {
            addCriterion("SYMFOWARE <=", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareLike(String value) {
            addCriterion("SYMFOWARE like", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareNotLike(String value) {
            addCriterion("SYMFOWARE not like", value, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareIn(List<String> values) {
            addCriterion("SYMFOWARE in", values, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareNotIn(List<String> values) {
            addCriterion("SYMFOWARE not in", values, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareBetween(String value1, String value2) {
            addCriterion("SYMFOWARE between", value1, value2, "symfoware");
            return (Criteria) this;
        }

        public Criteria andSymfowareNotBetween(String value1, String value2) {
            addCriterion("SYMFOWARE not between", value1, value2, "symfoware");
            return (Criteria) this;
        }

        public Criteria andWeblogicIsNull() {
            addCriterion("WEBLOGIC is null");
            return (Criteria) this;
        }

        public Criteria andWeblogicIsNotNull() {
            addCriterion("WEBLOGIC is not null");
            return (Criteria) this;
        }

        public Criteria andWeblogicEqualTo(String value) {
            addCriterion("WEBLOGIC =", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicNotEqualTo(String value) {
            addCriterion("WEBLOGIC <>", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicGreaterThan(String value) {
            addCriterion("WEBLOGIC >", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicGreaterThanOrEqualTo(String value) {
            addCriterion("WEBLOGIC >=", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicLessThan(String value) {
            addCriterion("WEBLOGIC <", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicLessThanOrEqualTo(String value) {
            addCriterion("WEBLOGIC <=", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicLike(String value) {
            addCriterion("WEBLOGIC like", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicNotLike(String value) {
            addCriterion("WEBLOGIC not like", value, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicIn(List<String> values) {
            addCriterion("WEBLOGIC in", values, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicNotIn(List<String> values) {
            addCriterion("WEBLOGIC not in", values, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicBetween(String value1, String value2) {
            addCriterion("WEBLOGIC between", value1, value2, "weblogic");
            return (Criteria) this;
        }

        public Criteria andWeblogicNotBetween(String value1, String value2) {
            addCriterion("WEBLOGIC not between", value1, value2, "weblogic");
            return (Criteria) this;
        }

        public Criteria andApacheIsNull() {
            addCriterion("APACHE is null");
            return (Criteria) this;
        }

        public Criteria andApacheIsNotNull() {
            addCriterion("APACHE is not null");
            return (Criteria) this;
        }

        public Criteria andApacheEqualTo(String value) {
            addCriterion("APACHE =", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheNotEqualTo(String value) {
            addCriterion("APACHE <>", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheGreaterThan(String value) {
            addCriterion("APACHE >", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheGreaterThanOrEqualTo(String value) {
            addCriterion("APACHE >=", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheLessThan(String value) {
            addCriterion("APACHE <", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheLessThanOrEqualTo(String value) {
            addCriterion("APACHE <=", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheLike(String value) {
            addCriterion("APACHE like", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheNotLike(String value) {
            addCriterion("APACHE not like", value, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheIn(List<String> values) {
            addCriterion("APACHE in", values, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheNotIn(List<String> values) {
            addCriterion("APACHE not in", values, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheBetween(String value1, String value2) {
            addCriterion("APACHE between", value1, value2, "apache");
            return (Criteria) this;
        }

        public Criteria andApacheNotBetween(String value1, String value2) {
            addCriterion("APACHE not between", value1, value2, "apache");
            return (Criteria) this;
        }

        public Criteria andTomcatIsNull() {
            addCriterion("TOMCAT is null");
            return (Criteria) this;
        }

        public Criteria andTomcatIsNotNull() {
            addCriterion("TOMCAT is not null");
            return (Criteria) this;
        }

        public Criteria andTomcatEqualTo(String value) {
            addCriterion("TOMCAT =", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatNotEqualTo(String value) {
            addCriterion("TOMCAT <>", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatGreaterThan(String value) {
            addCriterion("TOMCAT >", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatGreaterThanOrEqualTo(String value) {
            addCriterion("TOMCAT >=", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatLessThan(String value) {
            addCriterion("TOMCAT <", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatLessThanOrEqualTo(String value) {
            addCriterion("TOMCAT <=", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatLike(String value) {
            addCriterion("TOMCAT like", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatNotLike(String value) {
            addCriterion("TOMCAT not like", value, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatIn(List<String> values) {
            addCriterion("TOMCAT in", values, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatNotIn(List<String> values) {
            addCriterion("TOMCAT not in", values, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatBetween(String value1, String value2) {
            addCriterion("TOMCAT between", value1, value2, "tomcat");
            return (Criteria) this;
        }

        public Criteria andTomcatNotBetween(String value1, String value2) {
            addCriterion("TOMCAT not between", value1, value2, "tomcat");
            return (Criteria) this;
        }

        public Criteria andVisualStudioIsNull() {
            addCriterion("VISUAL_STUDIO is null");
            return (Criteria) this;
        }

        public Criteria andVisualStudioIsNotNull() {
            addCriterion("VISUAL_STUDIO is not null");
            return (Criteria) this;
        }

        public Criteria andVisualStudioEqualTo(String value) {
            addCriterion("VISUAL_STUDIO =", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioNotEqualTo(String value) {
            addCriterion("VISUAL_STUDIO <>", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioGreaterThan(String value) {
            addCriterion("VISUAL_STUDIO >", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioGreaterThanOrEqualTo(String value) {
            addCriterion("VISUAL_STUDIO >=", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioLessThan(String value) {
            addCriterion("VISUAL_STUDIO <", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioLessThanOrEqualTo(String value) {
            addCriterion("VISUAL_STUDIO <=", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioLike(String value) {
            addCriterion("VISUAL_STUDIO like", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioNotLike(String value) {
            addCriterion("VISUAL_STUDIO not like", value, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioIn(List<String> values) {
            addCriterion("VISUAL_STUDIO in", values, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioNotIn(List<String> values) {
            addCriterion("VISUAL_STUDIO not in", values, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioBetween(String value1, String value2) {
            addCriterion("VISUAL_STUDIO between", value1, value2, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andVisualStudioNotBetween(String value1, String value2) {
            addCriterion("VISUAL_STUDIO not between", value1, value2, "visualStudio");
            return (Criteria) this;
        }

        public Criteria andEclipseIsNull() {
            addCriterion("ECLIPSE is null");
            return (Criteria) this;
        }

        public Criteria andEclipseIsNotNull() {
            addCriterion("ECLIPSE is not null");
            return (Criteria) this;
        }

        public Criteria andEclipseEqualTo(String value) {
            addCriterion("ECLIPSE =", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseNotEqualTo(String value) {
            addCriterion("ECLIPSE <>", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseGreaterThan(String value) {
            addCriterion("ECLIPSE >", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseGreaterThanOrEqualTo(String value) {
            addCriterion("ECLIPSE >=", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseLessThan(String value) {
            addCriterion("ECLIPSE <", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseLessThanOrEqualTo(String value) {
            addCriterion("ECLIPSE <=", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseLike(String value) {
            addCriterion("ECLIPSE like", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseNotLike(String value) {
            addCriterion("ECLIPSE not like", value, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseIn(List<String> values) {
            addCriterion("ECLIPSE in", values, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseNotIn(List<String> values) {
            addCriterion("ECLIPSE not in", values, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseBetween(String value1, String value2) {
            addCriterion("ECLIPSE between", value1, value2, "eclipse");
            return (Criteria) this;
        }

        public Criteria andEclipseNotBetween(String value1, String value2) {
            addCriterion("ECLIPSE not between", value1, value2, "eclipse");
            return (Criteria) this;
        }

        public Criteria andRdIsNull() {
            addCriterion("RD is null");
            return (Criteria) this;
        }

        public Criteria andRdIsNotNull() {
            addCriterion("RD is not null");
            return (Criteria) this;
        }

        public Criteria andRdEqualTo(String value) {
            addCriterion("RD =", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotEqualTo(String value) {
            addCriterion("RD <>", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdGreaterThan(String value) {
            addCriterion("RD >", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdGreaterThanOrEqualTo(String value) {
            addCriterion("RD >=", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdLessThan(String value) {
            addCriterion("RD <", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdLessThanOrEqualTo(String value) {
            addCriterion("RD <=", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdLike(String value) {
            addCriterion("RD like", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotLike(String value) {
            addCriterion("RD not like", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdIn(List<String> values) {
            addCriterion("RD in", values, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotIn(List<String> values) {
            addCriterion("RD not in", values, "rd");
            return (Criteria) this;
        }

        public Criteria andRdBetween(String value1, String value2) {
            addCriterion("RD between", value1, value2, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotBetween(String value1, String value2) {
            addCriterion("RD not between", value1, value2, "rd");
            return (Criteria) this;
        }

        public Criteria andDesignIsNull() {
            addCriterion("DESIGN is null");
            return (Criteria) this;
        }

        public Criteria andDesignIsNotNull() {
            addCriterion("DESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDesignEqualTo(String value) {
            addCriterion("DESIGN =", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotEqualTo(String value) {
            addCriterion("DESIGN <>", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThan(String value) {
            addCriterion("DESIGN >", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN >=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThan(String value) {
            addCriterion("DESIGN <", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThanOrEqualTo(String value) {
            addCriterion("DESIGN <=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLike(String value) {
            addCriterion("DESIGN like", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotLike(String value) {
            addCriterion("DESIGN not like", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignIn(List<String> values) {
            addCriterion("DESIGN in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotIn(List<String> values) {
            addCriterion("DESIGN not in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignBetween(String value1, String value2) {
            addCriterion("DESIGN between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotBetween(String value1, String value2) {
            addCriterion("DESIGN not between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andPgIsNull() {
            addCriterion("PG is null");
            return (Criteria) this;
        }

        public Criteria andPgIsNotNull() {
            addCriterion("PG is not null");
            return (Criteria) this;
        }

        public Criteria andPgEqualTo(String value) {
            addCriterion("PG =", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgNotEqualTo(String value) {
            addCriterion("PG <>", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgGreaterThan(String value) {
            addCriterion("PG >", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgGreaterThanOrEqualTo(String value) {
            addCriterion("PG >=", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgLessThan(String value) {
            addCriterion("PG <", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgLessThanOrEqualTo(String value) {
            addCriterion("PG <=", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgLike(String value) {
            addCriterion("PG like", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgNotLike(String value) {
            addCriterion("PG not like", value, "pg");
            return (Criteria) this;
        }

        public Criteria andPgIn(List<String> values) {
            addCriterion("PG in", values, "pg");
            return (Criteria) this;
        }

        public Criteria andPgNotIn(List<String> values) {
            addCriterion("PG not in", values, "pg");
            return (Criteria) this;
        }

        public Criteria andPgBetween(String value1, String value2) {
            addCriterion("PG between", value1, value2, "pg");
            return (Criteria) this;
        }

        public Criteria andPgNotBetween(String value1, String value2) {
            addCriterion("PG not between", value1, value2, "pg");
            return (Criteria) this;
        }

        public Criteria andBugFixIsNull() {
            addCriterion("BUG_FIX is null");
            return (Criteria) this;
        }

        public Criteria andBugFixIsNotNull() {
            addCriterion("BUG_FIX is not null");
            return (Criteria) this;
        }

        public Criteria andBugFixEqualTo(String value) {
            addCriterion("BUG_FIX =", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixNotEqualTo(String value) {
            addCriterion("BUG_FIX <>", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixGreaterThan(String value) {
            addCriterion("BUG_FIX >", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixGreaterThanOrEqualTo(String value) {
            addCriterion("BUG_FIX >=", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixLessThan(String value) {
            addCriterion("BUG_FIX <", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixLessThanOrEqualTo(String value) {
            addCriterion("BUG_FIX <=", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixLike(String value) {
            addCriterion("BUG_FIX like", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixNotLike(String value) {
            addCriterion("BUG_FIX not like", value, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixIn(List<String> values) {
            addCriterion("BUG_FIX in", values, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixNotIn(List<String> values) {
            addCriterion("BUG_FIX not in", values, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixBetween(String value1, String value2) {
            addCriterion("BUG_FIX between", value1, value2, "bugFix");
            return (Criteria) this;
        }

        public Criteria andBugFixNotBetween(String value1, String value2) {
            addCriterion("BUG_FIX not between", value1, value2, "bugFix");
            return (Criteria) this;
        }

        public Criteria andTestIsNull() {
            addCriterion("TEST is null");
            return (Criteria) this;
        }

        public Criteria andTestIsNotNull() {
            addCriterion("TEST is not null");
            return (Criteria) this;
        }

        public Criteria andTestEqualTo(String value) {
            addCriterion("TEST =", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotEqualTo(String value) {
            addCriterion("TEST <>", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThan(String value) {
            addCriterion("TEST >", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThanOrEqualTo(String value) {
            addCriterion("TEST >=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThan(String value) {
            addCriterion("TEST <", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThanOrEqualTo(String value) {
            addCriterion("TEST <=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLike(String value) {
            addCriterion("TEST like", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotLike(String value) {
            addCriterion("TEST not like", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestIn(List<String> values) {
            addCriterion("TEST in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotIn(List<String> values) {
            addCriterion("TEST not in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestBetween(String value1, String value2) {
            addCriterion("TEST between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotBetween(String value1, String value2) {
            addCriterion("TEST not between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIsNull() {
            addCriterion("MAINTENANCE is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIsNotNull() {
            addCriterion("MAINTENANCE is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceEqualTo(String value) {
            addCriterion("MAINTENANCE =", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNotEqualTo(String value) {
            addCriterion("MAINTENANCE <>", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceGreaterThan(String value) {
            addCriterion("MAINTENANCE >", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTENANCE >=", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceLessThan(String value) {
            addCriterion("MAINTENANCE <", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceLessThanOrEqualTo(String value) {
            addCriterion("MAINTENANCE <=", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceLike(String value) {
            addCriterion("MAINTENANCE like", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNotLike(String value) {
            addCriterion("MAINTENANCE not like", value, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceIn(List<String> values) {
            addCriterion("MAINTENANCE in", values, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNotIn(List<String> values) {
            addCriterion("MAINTENANCE not in", values, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceBetween(String value1, String value2) {
            addCriterion("MAINTENANCE between", value1, value2, "maintenance");
            return (Criteria) this;
        }

        public Criteria andMaintenanceNotBetween(String value1, String value2) {
            addCriterion("MAINTENANCE not between", value1, value2, "maintenance");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
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