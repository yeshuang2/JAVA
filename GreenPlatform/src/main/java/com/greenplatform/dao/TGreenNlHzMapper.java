package com.greenplatform.dao;

import com.greenplatform.model.TGreenNlHz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TGreenNlHzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_hz
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_hz
     *
     * @mbggenerated
     */
    int insert(TGreenNlHz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_hz
     *
     * @mbggenerated
     */
    TGreenNlHz selectByPrimaryKey(String cUserid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_hz
     *
     * @mbggenerated
     */
    List<TGreenNlHz> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_hz
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenNlHz record);

    List selectTGreenNlHz (TGreenNlHz tGreenNlHz);//查询能量汇总
}