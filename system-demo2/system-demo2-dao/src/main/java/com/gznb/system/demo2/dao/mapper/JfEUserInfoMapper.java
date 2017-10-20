package com.gznb.system.demo2.dao.mapper;

import com.gznb.system.demo2.pojo.po.JfEUserInfo;

public interface JfEUserInfoMapper {
    /**
     *  根据主键删除数据库的记录,jf_e_user_info
     *
     * @param userUuid
     */
    int deleteByPrimaryKey(String userUuid);

    /**
     *  新写入数据库记录,jf_e_user_info
     *
     * @param record
     */
    int insert(JfEUserInfo record);

    /**
     *  动态字段,写入数据库记录,jf_e_user_info
     *
     * @param record
     */
    int insertSelective(JfEUserInfo record);

    /**
     *  根据指定主键获取一条数据库记录,jf_e_user_info
     *
     * @param userUuid
     */
    JfEUserInfo selectByPrimaryKey(String userUuid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,jf_e_user_info
     *
     * @param record
     */
    int updateByPrimaryKeySelective(JfEUserInfo record);

    /**
     *  根据主键来更新符合条件的数据库记录,jf_e_user_info
     *
     * @param record
     */
    int updateByPrimaryKey(JfEUserInfo record);
}