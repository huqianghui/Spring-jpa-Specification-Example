package com.example.hu.restrepository.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**   
 * @Title: ProfileBak 
 * @Package ProfileBak.java 
 * @Description: ${新版profile}
 * @author yxg
 * @date 2019/1/11 
 * @version V1.0   
 */
@Document(collection = "user_profile")
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserProfile implements Serializable {


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Id
    @JsonIgnore
    private ObjectId id;

    public String getMergeSaicId() {
        return mergeSaicId;
    }

    public void setMergeSaicId(String mergeSaicId) {
        this.mergeSaicId = mergeSaicId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getMarriageCode() {
        return marriageCode;
    }

    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
    }

    public String getMarriageName() {
        return marriageName;
    }

    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getRealNameLevelCode() {
        return realNameLevelCode;
    }

    public void setRealNameLevelCode(String realNameLevelCode) {
        this.realNameLevelCode = realNameLevelCode;
    }

    public String getRealNameLevelName() {
        return realNameLevelName;
    }

    public void setRealNameLevelName(String realNameLevelName) {
        this.realNameLevelName = realNameLevelName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Integer getChildrenRaised() {
        return childrenRaised;
    }

    public void setChildrenRaised(Integer childrenRaised) {
        this.childrenRaised = childrenRaised;
    }

    public Integer getPersonalIncome() {
        return personalIncome;
    }

    public void setPersonalIncome(Integer personalIncome) {
        this.personalIncome = personalIncome;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getIsMerged() {
        return isMerged;
    }

    public void setIsMerged(String isMerged) {
        this.isMerged = isMerged;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    /** 上汽合并Id */
    @Field(value = "merge_saic_id")
    private  String  mergeSaicId;

    /** 用户真实姓，用于发送通知时写Title */
    @Field(value = "first_name")
    private String firstName;

    /** 用户姓名中间名 */
    @Field(value = "mid_name")
    private String midName;

    /** 用户姓名的名 */
    @Field(value = "last_name")
    private String lastName;

    /** 用户全名 */
    @Field(value = "full_name")
    private String fullName;

    /** 用户所在行业编码 */
    @Field(value = "industry_code")
    private String industryCode;
    /** 用户所在行业编码名称 */
    @Transient
    private String industryName;

    /** 用户工作职位 */
    @Field(value = "job_code")
    private String jobCode;

    /** 教育背景编码 */
    @Field(value = "education_code")
    private String educationCode;
    /** 教育背景编码名称 */
    @Transient
    private String educationName;

    /** 用户婚姻状况编码 */
    @Field(value = "marriage_code")
    private String marriageCode;
    /** 用户婚姻状况编码名称 */
    @Transient
    private String marriageName;

    /** 用户性别编码 */
    @Field(value = "gender_code")
    private String genderCode;
    /** 用户性别编码名称 */
    @Transient
    private String genderName;

    /** 用户国际编码 */
    @Field(value = "nationality_code")
    private String nationalityCode;

    /** 实名认证等级 */
    @Field(value = "real_name_level_code")
    private String realNameLevelCode;
    /** 实名认证等级名称 */
    @Transient
    private String realNameLevelName;

    /**      * 出生日期     */
    @Field(value = "birthday")
    private String birthday;

    /**     * 出生地     */
    @Field(value = "birthplace")
    private String birthplace;

    /**   * 子女个数    */
    @Field(value = "children_raised")
    private Integer childrenRaised;

    /**   * 个人月收入    */
    @Field(value = "personal_income")
    private Integer personalIncome;

    /** 是否有效 */
    @Field(value = "is_active")
    private String isActive;

    /** 是否合并 */
    @Field(value = "is_merged")
    private String isMerged;

    /** 注册时间 */
    @Field(value = "register_time")
    private Date registerTime;

    /** 信息是否有效 1:删除, 0:未删除 */
    @Field(value = "is_deleted")
    private String isDeleted;

    /** 创建时间 */
    @Field(value = "create_time")
    private Date createTime;

    /** 最后修改时间 */
    @Field(value = "last_modify_time")
    private Date lastModifyTime;

    /** 创建人，业态应用ID */
    @Field(value = "create_by")
    private String createBy;

    /** 修改人，业态应用ID */
    @Field(value = "last_modify_by")
    private String lastModifyBy;
}
