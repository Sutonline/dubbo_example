/*
 * $Id: Activity.java,v 1.15 2016/09/04 07:13:18 张润 Exp $
 */
package com.skyon.pms.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动
 * @author Hibernate Synchronizer, Li Jiafei
 * @version $Revision: 1.15 $
 */
@Repository("activity")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String REF = "Activity";
	public static String PROP_ACTIVITY_CODE = "activityCode";
	public static String PROP_ACTIVITY_TYPE = "activityType";
	public static String PROP_ACTIVITY_NAME = "activityName";
	public static String PROP_ORGAN_ID = "organId";
	public static String PROP_REACH_COUNT_YN = "reachCountYn";
	public static String PROP_CUST_CHECK_YN = "custCheckYn";
	public static String PROP_NEED_REGISTER = "needRegister";
	public static String PROP_PUBLIC_YN = "publicYn";
	public static String PROP_START_DATE = "startDate";
	public static String PROP_END_DATE = "endDate";
	public static String PROP_DESC = "desc";
	public static String PROP_STATUS = "status";
	public static String PROP_CUST_FREQ = "custFreq";
	public static String PROP_CUST_CYCLE = "custCycle";
	public static String PROP_CUST_CYCLE_UNIT = "custCycleUnit";
	public static String PROP_CUST_CYCLE_VALUE = "custCycleValue";
	public static String PROP_CAMPING_TYPE = "campingType";
	public static String PROP_REACH_COUNT_CYCLE = "reachCountCycle";
	public static String PROP_REACH_CYCLE_UNIT = "reachCycleUnit";
	public static String PROP_REACH_CYCLE_VALUE = "reachCycleValue";
	public static String PROP_REACH_CUSTS = "reachCusts";
	public static String PROP_SEGMENT_RULE_ID = "segmentRuleId";
	public static String PROP_STANDARD_RULE_ID = "standardRuleId";
	public static String PROP_CHANNEL_TYPE = "channelType";
	public static String PROP_CREATE_BY = "createBy";
	public static String PROP_CREATE_DATE = "createDate";
	public static String PROP_PLAN = "plan";
	public static String PROP_MARKETING_PRODUCT = "marketingProduct";
	public static String PROP_ATTACH_MENT = "attachMent";
	public static String PROP_ACTIVITY_ID = "activityId";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long activityId;

	// fields
	private java.lang.String activityCode;
	private java.lang.String activityType;
	private java.lang.String activityName;
	private java.lang.String organId;
	private java.lang.String reachCountYn;
	private java.lang.String custCheckYn;
	private java.lang.String needRegister;
	private java.lang.String publicYn;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private java.lang.String desc;
	private java.lang.String status;
	private java.lang.String custFreq;
	private java.lang.String custCycle;
	private java.lang.String custCycleUnit;
	private java.lang.String custCycleValue;
	private java.lang.String campingType;
	private java.lang.String reachCountCycle;
	private java.lang.String reachCycleUnit;
	private java.lang.String reachCycleValue;
	private java.lang.Long segmentRuleId;
	private java.lang.Long standardRuleId;
	private java.lang.String channelType;
	private java.lang.String createBy;
	private java.util.Date createDate;

	//展示属性
	private String campingCustNum;//营销客户数
	private String reachCustNum;//达标客户数
	private String successNum;//营销成功人数
	private String reachRate;//达标率
	private String orgReachRate;//当前机构的达标率
	private String broMaxReachRate;//同级最高达标率

	private String segmentRuleFlag;//复制活动时利用：判断该细分规则是否是新增
	private String standardRuleFlag;//复制活动时利用：判断该达标规则是否是新增

	/**
	 * Defualt constructor.
	 */
	public Activity() {
	}

	/**
	 * Constructor for primary property.
	 */
	public Activity(java.lang.Long activityId) {
		this.setActivityId(activityId);
	}


	/**
	 * Return the unique identifier of this class
	 * @hibernate.id
	 *  generator-class="org.hibernate.id.MultipleHiLoPerTableGenerator"
	 *  column="activity_Id"
	 */
	public java.lang.Long getActivityId() {
		return activityId;
	}

	/**
	 * Set the unique identifier of this class
	 * @param activityId the new ID
	 */
	public void setActivityId(java.lang.Long activityId) {
		this.activityId = activityId;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * 活动编号
	 */
	public java.lang.String getActivityCode() {
		return activityCode;
	}

	/**
	 * Set the value related to the column: activity_Code
	 * @param activityCode the activity_Code value
	 */
	public void setActivityCode(java.lang.String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getOrganId() {
		return organId;
	}

	public void setOrganId(String organId) {
		this.organId = organId;
	}

	public String getReachCountYn() {
		return reachCountYn;
	}

	public void setReachCountYn(String reachCountYn) {
		this.reachCountYn = reachCountYn;
	}

	public String getCustCheckYn() {
		return custCheckYn;
	}

	public void setCustCheckYn(String custCheckYn) {
		this.custCheckYn = custCheckYn;
	}

	public String getNeedRegister() {
		return needRegister;
	}

	public void setNeedRegister(String needRegister) {
		this.needRegister = needRegister;
	}

	public String getPublicYn() {
		return publicYn;
	}

	public void setPublicYn(String publicYn) {
		this.publicYn = publicYn;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustFreq() {
		return custFreq;
	}

	public void setCustFreq(String custFreq) {
		this.custFreq = custFreq;
	}

	public String getCustCycle() {
		return custCycle;
	}

	public void setCustCycle(String custCycle) {
		this.custCycle = custCycle;
	}

	public String getCustCycleUnit() {
		return custCycleUnit;
	}

	public void setCustCycleUnit(String custCycleUnit) {
		this.custCycleUnit = custCycleUnit;
	}

	public String getCustCycleValue() {
		return custCycleValue;
	}

	public void setCustCycleValue(String custCycleValue) {
		this.custCycleValue = custCycleValue;
	}

	public String getCampingType() {
		return campingType;
	}

	public void setCampingType(String campingType) {
		this.campingType = campingType;
	}

	public String getReachCountCycle() {
		return reachCountCycle;
	}

	public void setReachCountCycle(String reachCountCycle) {
		this.reachCountCycle = reachCountCycle;
	}

	public String getReachCycleUnit() {
		return reachCycleUnit;
	}

	public void setReachCycleUnit(String reachCycleUnit) {
		this.reachCycleUnit = reachCycleUnit;
	}

	public String getReachCycleValue() {
		return reachCycleValue;
	}

	public void setReachCycleValue(String reachCycleValue) {
		this.reachCycleValue = reachCycleValue;
	}

	public Long getSegmentRuleId() {
		return segmentRuleId;
	}

	public void setSegmentRuleId(Long segmentRuleId) {
		this.segmentRuleId = segmentRuleId;
	}

	public Long getStandardRuleId() {
		return standardRuleId;
	}

	public void setStandardRuleId(Long standardRuleId) {
		this.standardRuleId = standardRuleId;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCampingCustNum() {
		return campingCustNum;
	}

	public void setCampingCustNum(String campingCustNum) {
		this.campingCustNum = campingCustNum;
	}

	public String getReachCustNum() {
		return reachCustNum;
	}

	public void setReachCustNum(String reachCustNum) {
		this.reachCustNum = reachCustNum;
	}

	public String getSuccessNum() {
		return successNum;
	}

	public void setSuccessNum(String successNum) {
		this.successNum = successNum;
	}

	public String getReachRate() {
		return reachRate;
	}

	public void setReachRate(String reachRate) {
		this.reachRate = reachRate;
	}

	public String getOrgReachRate() {
		return orgReachRate;
	}

	public void setOrgReachRate(String orgReachRate) {
		this.orgReachRate = orgReachRate;
	}

	public String getBroMaxReachRate() {
		return broMaxReachRate;
	}

	public void setBroMaxReachRate(String broMaxReachRate) {
		this.broMaxReachRate = broMaxReachRate;
	}

	public String getSegmentRuleFlag() {
		return segmentRuleFlag;
	}

	public void setSegmentRuleFlag(String segmentRuleFlag) {
		this.segmentRuleFlag = segmentRuleFlag;
	}

	public String getStandardRuleFlag() {
		return standardRuleFlag;
	}

	public void setStandardRuleFlag(String standardRuleFlag) {
		this.standardRuleFlag = standardRuleFlag;
	}

	/*[CUSTOM CONTENT MARKER BEGIN]*/
/*[CUSTOM CONTENT MARKER END]*/
}