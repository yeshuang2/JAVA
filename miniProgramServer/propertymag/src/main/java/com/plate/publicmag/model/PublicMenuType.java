package com.plate.publicmag.model;

import java.io.Serializable;

public class PublicMenuType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.type_code
     *
     * @mbggenerated
     */
    private String typeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.type_name
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.type_name_short
     *
     * @mbggenerated
     */
    private String typeNameShort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.image_url
     *
     * @mbggenerated
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.sort
     *
     * @mbggenerated
     */
    private String sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_menu_type.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_menu_type
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.id
     *
     * @return the value of public_menu_type.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.id
     *
     * @param id the value for public_menu_type.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.type_code
     *
     * @return the value of public_menu_type.type_code
     *
     * @mbggenerated
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.type_code
     *
     * @param typeCode the value for public_menu_type.type_code
     *
     * @mbggenerated
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.type_name
     *
     * @return the value of public_menu_type.type_name
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.type_name
     *
     * @param typeName the value for public_menu_type.type_name
     *
     * @mbggenerated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.type_name_short
     *
     * @return the value of public_menu_type.type_name_short
     *
     * @mbggenerated
     */
    public String getTypeNameShort() {
        return typeNameShort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.type_name_short
     *
     * @param typeNameShort the value for public_menu_type.type_name_short
     *
     * @mbggenerated
     */
    public void setTypeNameShort(String typeNameShort) {
        this.typeNameShort = typeNameShort == null ? null : typeNameShort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.image_url
     *
     * @return the value of public_menu_type.image_url
     *
     * @mbggenerated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.image_url
     *
     * @param imageUrl the value for public_menu_type.image_url
     *
     * @mbggenerated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.sort
     *
     * @return the value of public_menu_type.sort
     *
     * @mbggenerated
     */
    public String getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.sort
     *
     * @param sort the value for public_menu_type.sort
     *
     * @mbggenerated
     */
    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.remark
     *
     * @return the value of public_menu_type.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.remark
     *
     * @param remark the value for public_menu_type.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_menu_type.status
     *
     * @return the value of public_menu_type.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_menu_type.status
     *
     * @param status the value for public_menu_type.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_menu_type
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", typeName=").append(typeName);
        sb.append(", typeNameShort=").append(typeNameShort);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", sort=").append(sort);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}