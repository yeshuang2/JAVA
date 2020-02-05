package com.greenplatform.model;

import java.io.Serializable;
import java.util.Date;

public class PlateUserRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.c_role
     *
     * @mbggenerated
     */
    private String cRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.c_rolename
     *
     * @mbggenerated
     */
    private String cRolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.c_zt
     *
     * @mbggenerated
     */
    private String cZt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.c_cjuser
     *
     * @mbggenerated
     */
    private String cCjuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.d_cjsj
     *
     * @mbggenerated
     */
    private Date dCjsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.c_xguser
     *
     * @mbggenerated
     */
    private String cXguser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column plate_user_role.d_xgsj
     *
     * @mbggenerated
     */
    private Date dXgsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.c_role
     *
     * @return the value of plate_user_role.c_role
     *
     * @mbggenerated
     */
    public String getcRole() {
        return cRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.c_role
     *
     * @param cRole the value for plate_user_role.c_role
     *
     * @mbggenerated
     */
    public void setcRole(String cRole) {
        this.cRole = cRole == null ? null : cRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.c_rolename
     *
     * @return the value of plate_user_role.c_rolename
     *
     * @mbggenerated
     */
    public String getcRolename() {
        return cRolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.c_rolename
     *
     * @param cRolename the value for plate_user_role.c_rolename
     *
     * @mbggenerated
     */
    public void setcRolename(String cRolename) {
        this.cRolename = cRolename == null ? null : cRolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.c_zt
     *
     * @return the value of plate_user_role.c_zt
     *
     * @mbggenerated
     */
    public String getcZt() {
        return cZt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.c_zt
     *
     * @param cZt the value for plate_user_role.c_zt
     *
     * @mbggenerated
     */
    public void setcZt(String cZt) {
        this.cZt = cZt == null ? null : cZt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.c_cjuser
     *
     * @return the value of plate_user_role.c_cjuser
     *
     * @mbggenerated
     */
    public String getcCjuser() {
        return cCjuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.c_cjuser
     *
     * @param cCjuser the value for plate_user_role.c_cjuser
     *
     * @mbggenerated
     */
    public void setcCjuser(String cCjuser) {
        this.cCjuser = cCjuser == null ? null : cCjuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.d_cjsj
     *
     * @return the value of plate_user_role.d_cjsj
     *
     * @mbggenerated
     */
    public Date getdCjsj() {
        return dCjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.d_cjsj
     *
     * @param dCjsj the value for plate_user_role.d_cjsj
     *
     * @mbggenerated
     */
    public void setdCjsj(Date dCjsj) {
        this.dCjsj = dCjsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.c_xguser
     *
     * @return the value of plate_user_role.c_xguser
     *
     * @mbggenerated
     */
    public String getcXguser() {
        return cXguser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.c_xguser
     *
     * @param cXguser the value for plate_user_role.c_xguser
     *
     * @mbggenerated
     */
    public void setcXguser(String cXguser) {
        this.cXguser = cXguser == null ? null : cXguser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column plate_user_role.d_xgsj
     *
     * @return the value of plate_user_role.d_xgsj
     *
     * @mbggenerated
     */
    public Date getdXgsj() {
        return dXgsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column plate_user_role.d_xgsj
     *
     * @param dXgsj the value for plate_user_role.d_xgsj
     *
     * @mbggenerated
     */
    public void setdXgsj(Date dXgsj) {
        this.dXgsj = dXgsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_role
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cRole=").append(cRole);
        sb.append(", cRolename=").append(cRolename);
        sb.append(", cZt=").append(cZt);
        sb.append(", cCjuser=").append(cCjuser);
        sb.append(", dCjsj=").append(dCjsj);
        sb.append(", cXguser=").append(cXguser);
        sb.append(", dXgsj=").append(dXgsj);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}