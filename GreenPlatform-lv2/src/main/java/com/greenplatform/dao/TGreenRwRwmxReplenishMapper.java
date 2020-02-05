package com.greenplatform.dao;

import com.greenplatform.model.TGreenRwRwmxReplenish;
import com.greenplatform.model.TGreenRwRwmxReplenishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGreenRwRwmxReplenishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int countByExample(TGreenRwRwmxReplenishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int deleteByExample(TGreenRwRwmxReplenishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("cUserid") String cUserid, @Param("cBcday") String cBcday);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int insert(TGreenRwRwmxReplenish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int insertSelective(TGreenRwRwmxReplenish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    List<TGreenRwRwmxReplenish> selectByExample(TGreenRwRwmxReplenishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    TGreenRwRwmxReplenish selectByPrimaryKey(@Param("cUserid") String cUserid, @Param("cBcday") String cBcday);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TGreenRwRwmxReplenish record, @Param("example") TGreenRwRwmxReplenishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TGreenRwRwmxReplenish record, @Param("example") TGreenRwRwmxReplenishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TGreenRwRwmxReplenish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_rw_rwmx_replenish
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenRwRwmxReplenish record);
}