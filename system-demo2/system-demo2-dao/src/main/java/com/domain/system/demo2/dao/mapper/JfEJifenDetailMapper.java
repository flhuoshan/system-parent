package com.domain.system.demo2.dao.mapper;


import com.domain.system.demo2.pojo.po.JfEJifenDetail;

public interface JfEJifenDetailMapper {
    /**
     *  根据主键删除数据库的记录,jf_e_jifen_detail
     *
     * @param sWaterNo
     */
    int deleteByPrimaryKey(String sWaterNo);

    /**
     *  新写入数据库记录,jf_e_jifen_detail
     *
     * @param record
     */
    int insert(JfEJifenDetail record);

    /**
     *  动态字段,写入数据库记录,jf_e_jifen_detail
     *
     * @param record
     */
    int insertSelective(JfEJifenDetail record);

    /**
     *  根据指定主键获取一条数据库记录,jf_e_jifen_detail
     *
     * @param sWaterNo
     */
    JfEJifenDetail selectByPrimaryKey(String sWaterNo);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,jf_e_jifen_detail
     *
     * @param record
     */
    int updateByPrimaryKeySelective(JfEJifenDetail record);

    /**
     *  根据主键来更新符合条件的数据库记录,jf_e_jifen_detail
     *
     * @param record
     */
    int updateByPrimaryKey(JfEJifenDetail record);
}