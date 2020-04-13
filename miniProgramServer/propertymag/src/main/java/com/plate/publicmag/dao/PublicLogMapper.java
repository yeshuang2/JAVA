package com.plate.publicmag.dao;

import com.plate.publicmag.model.PublicLog;
import com.plate.publicmag.model.PublicLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int countByExample(PublicLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int deleteByExample(PublicLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int insert(PublicLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int insertSelective(PublicLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    List<PublicLog> selectByExample(PublicLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    PublicLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PublicLog record, @Param("example") PublicLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PublicLog record, @Param("example") PublicLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PublicLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PublicLog record);
}