package com.domain.system.demo2.pojo.po;

import java.util.Date;

public class JfEUserInfo {
    /**
     * 用户uuid
     * 表字段：jf_e_user_info.user_uuid
     */
    private String userUuid;

    /**
     * 生成时间
     * 表字段：jf_e_user_info.create_time
     */
    private Date createTime;

    /**
     * 获取 用户uuid 字段：jf_e_user_info.user_uuid
     *
     * @return jf_e_user_info.user_uuid, 用户uuid
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * 设置 用户uuid 字段:jf_e_user_info.user_uuid
     *
     * @param userUuid the value for jf_e_user_info.user_uuid, 用户uuid
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    /**
     * 获取 生成时间 字段：jf_e_user_info.create_time
     *
     * @return jf_e_user_info.create_time, 生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 生成时间 字段:jf_e_user_info.create_time
     *
     * @param createTime the value for jf_e_user_info.create_time, 生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}