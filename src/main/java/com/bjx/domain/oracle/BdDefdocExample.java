package com.bjx.domain.oracle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BdDefdocExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public BdDefdocExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
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

        public Criteria andPkDefdocIsNull() {
            addCriterion("PK_DEFDOC is null");
            return (Criteria) this;
        }

        public Criteria andPkDefdocIsNotNull() {
            addCriterion("PK_DEFDOC is not null");
            return (Criteria) this;
        }

        public Criteria andPkDefdocEqualTo(String value) {
            addCriterion("PK_DEFDOC =", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocNotEqualTo(String value) {
            addCriterion("PK_DEFDOC <>", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocGreaterThan(String value) {
            addCriterion("PK_DEFDOC >", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocGreaterThanOrEqualTo(String value) {
            addCriterion("PK_DEFDOC >=", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocLessThan(String value) {
            addCriterion("PK_DEFDOC <", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocLessThanOrEqualTo(String value) {
            addCriterion("PK_DEFDOC <=", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocLike(String value) {
            addCriterion("PK_DEFDOC like", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocNotLike(String value) {
            addCriterion("PK_DEFDOC not like", value, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocIn(List<String> values) {
            addCriterion("PK_DEFDOC in", values, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocNotIn(List<String> values) {
            addCriterion("PK_DEFDOC not in", values, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocBetween(String value1, String value2) {
            addCriterion("PK_DEFDOC between", value1, value2, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andPkDefdocNotBetween(String value1, String value2) {
            addCriterion("PK_DEFDOC not between", value1, value2, "pkDefdoc");
            return (Criteria) this;
        }

        public Criteria andDoccodeIsNull() {
            addCriterion("DOCCODE is null");
            return (Criteria) this;
        }

        public Criteria andDoccodeIsNotNull() {
            addCriterion("DOCCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDoccodeEqualTo(String value) {
            addCriterion("DOCCODE =", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeNotEqualTo(String value) {
            addCriterion("DOCCODE <>", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeGreaterThan(String value) {
            addCriterion("DOCCODE >", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCCODE >=", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeLessThan(String value) {
            addCriterion("DOCCODE <", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeLessThanOrEqualTo(String value) {
            addCriterion("DOCCODE <=", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeLike(String value) {
            addCriterion("DOCCODE like", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeNotLike(String value) {
            addCriterion("DOCCODE not like", value, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeIn(List<String> values) {
            addCriterion("DOCCODE in", values, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeNotIn(List<String> values) {
            addCriterion("DOCCODE not in", values, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeBetween(String value1, String value2) {
            addCriterion("DOCCODE between", value1, value2, "doccode");
            return (Criteria) this;
        }

        public Criteria andDoccodeNotBetween(String value1, String value2) {
            addCriterion("DOCCODE not between", value1, value2, "doccode");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNull() {
            addCriterion("DOCNAME is null");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNotNull() {
            addCriterion("DOCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDocnameEqualTo(String value) {
            addCriterion("DOCNAME =", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotEqualTo(String value) {
            addCriterion("DOCNAME <>", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThan(String value) {
            addCriterion("DOCNAME >", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCNAME >=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThan(String value) {
            addCriterion("DOCNAME <", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThanOrEqualTo(String value) {
            addCriterion("DOCNAME <=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLike(String value) {
            addCriterion("DOCNAME like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotLike(String value) {
            addCriterion("DOCNAME not like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameIn(List<String> values) {
            addCriterion("DOCNAME in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotIn(List<String> values) {
            addCriterion("DOCNAME not in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameBetween(String value1, String value2) {
            addCriterion("DOCNAME between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotBetween(String value1, String value2) {
            addCriterion("DOCNAME not between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocsystypeIsNull() {
            addCriterion("DOCSYSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDocsystypeIsNotNull() {
            addCriterion("DOCSYSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDocsystypeEqualTo(BigDecimal value) {
            addCriterion("DOCSYSTYPE =", value, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeNotEqualTo(BigDecimal value) {
            addCriterion("DOCSYSTYPE <>", value, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeGreaterThan(BigDecimal value) {
            addCriterion("DOCSYSTYPE >", value, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOCSYSTYPE >=", value, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeLessThan(BigDecimal value) {
            addCriterion("DOCSYSTYPE <", value, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOCSYSTYPE <=", value, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeIn(List<BigDecimal> values) {
            addCriterion("DOCSYSTYPE in", values, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeNotIn(List<BigDecimal> values) {
            addCriterion("DOCSYSTYPE not in", values, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOCSYSTYPE between", value1, value2, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDocsystypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOCSYSTYPE not between", value1, value2, "docsystype");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("DR is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("DR is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Long value) {
            addCriterion("DR =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Long value) {
            addCriterion("DR <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Long value) {
            addCriterion("DR >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Long value) {
            addCriterion("DR >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Long value) {
            addCriterion("DR <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Long value) {
            addCriterion("DR <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Long> values) {
            addCriterion("DR in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Long> values) {
            addCriterion("DR not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Long value1, Long value2) {
            addCriterion("DR between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Long value1, Long value2) {
            addCriterion("DR not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPkCorpIsNull() {
            addCriterion("PK_CORP is null");
            return (Criteria) this;
        }

        public Criteria andPkCorpIsNotNull() {
            addCriterion("PK_CORP is not null");
            return (Criteria) this;
        }

        public Criteria andPkCorpEqualTo(String value) {
            addCriterion("PK_CORP =", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotEqualTo(String value) {
            addCriterion("PK_CORP <>", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpGreaterThan(String value) {
            addCriterion("PK_CORP >", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CORP >=", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLessThan(String value) {
            addCriterion("PK_CORP <", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLessThanOrEqualTo(String value) {
            addCriterion("PK_CORP <=", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLike(String value) {
            addCriterion("PK_CORP like", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotLike(String value) {
            addCriterion("PK_CORP not like", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpIn(List<String> values) {
            addCriterion("PK_CORP in", values, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotIn(List<String> values) {
            addCriterion("PK_CORP not in", values, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpBetween(String value1, String value2) {
            addCriterion("PK_CORP between", value1, value2, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotBetween(String value1, String value2) {
            addCriterion("PK_CORP not between", value1, value2, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1IsNull() {
            addCriterion("PK_DEFDOC1 is null");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1IsNotNull() {
            addCriterion("PK_DEFDOC1 is not null");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1EqualTo(String value) {
            addCriterion("PK_DEFDOC1 =", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1NotEqualTo(String value) {
            addCriterion("PK_DEFDOC1 <>", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1GreaterThan(String value) {
            addCriterion("PK_DEFDOC1 >", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1GreaterThanOrEqualTo(String value) {
            addCriterion("PK_DEFDOC1 >=", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1LessThan(String value) {
            addCriterion("PK_DEFDOC1 <", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1LessThanOrEqualTo(String value) {
            addCriterion("PK_DEFDOC1 <=", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1Like(String value) {
            addCriterion("PK_DEFDOC1 like", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1NotLike(String value) {
            addCriterion("PK_DEFDOC1 not like", value, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1In(List<String> values) {
            addCriterion("PK_DEFDOC1 in", values, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1NotIn(List<String> values) {
            addCriterion("PK_DEFDOC1 not in", values, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1Between(String value1, String value2) {
            addCriterion("PK_DEFDOC1 between", value1, value2, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoc1NotBetween(String value1, String value2) {
            addCriterion("PK_DEFDOC1 not between", value1, value2, "pkDefdoc1");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistIsNull() {
            addCriterion("PK_DEFDOCLIST is null");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistIsNotNull() {
            addCriterion("PK_DEFDOCLIST is not null");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistEqualTo(String value) {
            addCriterion("PK_DEFDOCLIST =", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistNotEqualTo(String value) {
            addCriterion("PK_DEFDOCLIST <>", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistGreaterThan(String value) {
            addCriterion("PK_DEFDOCLIST >", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistGreaterThanOrEqualTo(String value) {
            addCriterion("PK_DEFDOCLIST >=", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistLessThan(String value) {
            addCriterion("PK_DEFDOCLIST <", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistLessThanOrEqualTo(String value) {
            addCriterion("PK_DEFDOCLIST <=", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistLike(String value) {
            addCriterion("PK_DEFDOCLIST like", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistNotLike(String value) {
            addCriterion("PK_DEFDOCLIST not like", value, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistIn(List<String> values) {
            addCriterion("PK_DEFDOCLIST in", values, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistNotIn(List<String> values) {
            addCriterion("PK_DEFDOCLIST not in", values, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistBetween(String value1, String value2) {
            addCriterion("PK_DEFDOCLIST between", value1, value2, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andPkDefdoclistNotBetween(String value1, String value2) {
            addCriterion("PK_DEFDOCLIST not between", value1, value2, "pkDefdoclist");
            return (Criteria) this;
        }

        public Criteria andSealflagIsNull() {
            addCriterion("SEALFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSealflagIsNotNull() {
            addCriterion("SEALFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSealflagEqualTo(String value) {
            addCriterion("SEALFLAG =", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagNotEqualTo(String value) {
            addCriterion("SEALFLAG <>", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagGreaterThan(String value) {
            addCriterion("SEALFLAG >", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagGreaterThanOrEqualTo(String value) {
            addCriterion("SEALFLAG >=", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagLessThan(String value) {
            addCriterion("SEALFLAG <", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagLessThanOrEqualTo(String value) {
            addCriterion("SEALFLAG <=", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagLike(String value) {
            addCriterion("SEALFLAG like", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagNotLike(String value) {
            addCriterion("SEALFLAG not like", value, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagIn(List<String> values) {
            addCriterion("SEALFLAG in", values, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagNotIn(List<String> values) {
            addCriterion("SEALFLAG not in", values, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagBetween(String value1, String value2) {
            addCriterion("SEALFLAG between", value1, value2, "sealflag");
            return (Criteria) this;
        }

        public Criteria andSealflagNotBetween(String value1, String value2) {
            addCriterion("SEALFLAG not between", value1, value2, "sealflag");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(String value) {
            addCriterion("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(String value) {
            addCriterion("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(String value) {
            addCriterion("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(String value) {
            addCriterion("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(String value) {
            addCriterion("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(String value) {
            addCriterion("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLike(String value) {
            addCriterion("TS like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotLike(String value) {
            addCriterion("TS not like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<String> values) {
            addCriterion("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<String> values) {
            addCriterion("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(String value1, String value2) {
            addCriterion("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(String value1, String value2) {
            addCriterion("TS not between", value1, value2, "ts");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table THNC.BD_DEFDOC
     *
     * @mbg.generated
     */
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