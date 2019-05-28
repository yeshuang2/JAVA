package com.greenplatform.dao;

import com.greenplatform.model.PlateCodeDmz;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlateCodeDmzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("cDm") String cDm, @Param("cDmlb") String cDmlb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int insert(PlateCodeDmz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    PlateCodeDmz selectByPrimaryKey(@Param("cDm") String cDm, @Param("cDmlb") String cDmlb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    List<PlateCodeDmz> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlateCodeDmz record);
}