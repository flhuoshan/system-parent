package com.domain.system.demo2.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class JfEJifenDetail {
    /**
     * 系统业务流水号
     * 表字段：jf_e_jifen_detail.s_water_no
     */
    private String sWaterNo;

    /**
     * 账户号
     * 表字段：jf_e_jifen_detail.account_no
     */
    private String accountNo;

    /**
     * 交易金额
     * 表字段：jf_e_jifen_detail.trade_amount
     */
    private BigDecimal tradeAmount;

    /**
     * 交易积分
     * 表字段：jf_e_jifen_detail.trade_jifen
     */
    private Long tradeJifen;

    /**
     * 交易时间
     * 表字段：jf_e_jifen_detail.trade_time
     */
    private Date tradeTime;

    /**
     * 到账天数 0 立即到账；n n天后到账
     * 表字段：jf_e_jifen_detail.effected_days
     */
    private Long effectedDays;

    /**
     * 到账时间
     * 表字段：jf_e_jifen_detail.effected_time
     */
    private Date effectedTime;

    /**
     * 数据来源 0 消费流水产生的积分流水；1 积分累计产生的流水
     * 表字段：jf_e_jifen_detail.channel_type
     */
    private String channelType;

    /**
     * 处理状态 0 未处理；1 已处理
     * 表字段：jf_e_jifen_detail.proccess_status
     */
    private String proccessStatus;

    /**
     * 生成时间
     * 表字段：jf_e_jifen_detail.create_time
     */
    private Date createTime;

    /**
     * 原业务流水号
     * 表字段：jf_e_jifen_detail.old_water_no
     */
    private String oldWaterNo;

    /**
     * 获取 系统业务流水号 字段：jf_e_jifen_detail.s_water_no
     *
     * @return jf_e_jifen_detail.s_water_no, 系统业务流水号
     */
    public String getsWaterNo() {
        return sWaterNo;
    }

    /**
     * 设置 系统业务流水号 字段:jf_e_jifen_detail.s_water_no
     *
     * @param sWaterNo the value for jf_e_jifen_detail.s_water_no, 系统业务流水号
     */
    public void setsWaterNo(String sWaterNo) {
        this.sWaterNo = sWaterNo == null ? null : sWaterNo.trim();
    }

    /**
     * 获取 账户号 字段：jf_e_jifen_detail.account_no
     *
     * @return jf_e_jifen_detail.account_no, 账户号
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置 账户号 字段:jf_e_jifen_detail.account_no
     *
     * @param accountNo the value for jf_e_jifen_detail.account_no, 账户号
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * 获取 交易金额 字段：jf_e_jifen_detail.trade_amount
     *
     * @return jf_e_jifen_detail.trade_amount, 交易金额
     */
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * 设置 交易金额 字段:jf_e_jifen_detail.trade_amount
     *
     * @param tradeAmount the value for jf_e_jifen_detail.trade_amount, 交易金额
     */
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * 获取 交易积分 字段：jf_e_jifen_detail.trade_jifen
     *
     * @return jf_e_jifen_detail.trade_jifen, 交易积分
     */
    public Long getTradeJifen() {
        return tradeJifen;
    }

    /**
     * 设置 交易积分 字段:jf_e_jifen_detail.trade_jifen
     *
     * @param tradeJifen the value for jf_e_jifen_detail.trade_jifen, 交易积分
     */
    public void setTradeJifen(Long tradeJifen) {
        this.tradeJifen = tradeJifen;
    }

    /**
     * 获取 交易时间 字段：jf_e_jifen_detail.trade_time
     *
     * @return jf_e_jifen_detail.trade_time, 交易时间
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * 设置 交易时间 字段:jf_e_jifen_detail.trade_time
     *
     * @param tradeTime the value for jf_e_jifen_detail.trade_time, 交易时间
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * 获取 到账天数 0 立即到账；n n天后到账 字段：jf_e_jifen_detail.effected_days
     *
     * @return jf_e_jifen_detail.effected_days, 到账天数 0 立即到账；n n天后到账
     */
    public Long getEffectedDays() {
        return effectedDays;
    }

    /**
     * 设置 到账天数 0 立即到账；n n天后到账 字段:jf_e_jifen_detail.effected_days
     *
     * @param effectedDays the value for jf_e_jifen_detail.effected_days, 到账天数 0 立即到账；n n天后到账
     */
    public void setEffectedDays(Long effectedDays) {
        this.effectedDays = effectedDays;
    }

    /**
     * 获取 到账时间 字段：jf_e_jifen_detail.effected_time
     *
     * @return jf_e_jifen_detail.effected_time, 到账时间
     */
    public Date getEffectedTime() {
        return effectedTime;
    }

    /**
     * 设置 到账时间 字段:jf_e_jifen_detail.effected_time
     *
     * @param effectedTime the value for jf_e_jifen_detail.effected_time, 到账时间
     */
    public void setEffectedTime(Date effectedTime) {
        this.effectedTime = effectedTime;
    }

    /**
     * 获取 数据来源 0 消费流水产生的积分流水；1 积分累计产生的流水 字段：jf_e_jifen_detail.channel_type
     *
     * @return jf_e_jifen_detail.channel_type, 数据来源 0 消费流水产生的积分流水；1 积分累计产生的流水
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置 数据来源 0 消费流水产生的积分流水；1 积分累计产生的流水 字段:jf_e_jifen_detail.channel_type
     *
     * @param channelType the value for jf_e_jifen_detail.channel_type, 数据来源 0 消费流水产生的积分流水；1 积分累计产生的流水
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * 获取 处理状态 0 未处理；1 已处理 字段：jf_e_jifen_detail.proccess_status
     *
     * @return jf_e_jifen_detail.proccess_status, 处理状态 0 未处理；1 已处理
     */
    public String getProccessStatus() {
        return proccessStatus;
    }

    /**
     * 设置 处理状态 0 未处理；1 已处理 字段:jf_e_jifen_detail.proccess_status
     *
     * @param proccessStatus the value for jf_e_jifen_detail.proccess_status, 处理状态 0 未处理；1 已处理
     */
    public void setProccessStatus(String proccessStatus) {
        this.proccessStatus = proccessStatus == null ? null : proccessStatus.trim();
    }

    /**
     * 获取 生成时间 字段：jf_e_jifen_detail.create_time
     *
     * @return jf_e_jifen_detail.create_time, 生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 生成时间 字段:jf_e_jifen_detail.create_time
     *
     * @param createTime the value for jf_e_jifen_detail.create_time, 生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 原业务流水号 字段：jf_e_jifen_detail.old_water_no
     *
     * @return jf_e_jifen_detail.old_water_no, 原业务流水号
     */
    public String getOldWaterNo() {
        return oldWaterNo;
    }

    /**
     * 设置 原业务流水号 字段:jf_e_jifen_detail.old_water_no
     *
     * @param oldWaterNo the value for jf_e_jifen_detail.old_water_no, 原业务流水号
     */
    public void setOldWaterNo(String oldWaterNo) {
        this.oldWaterNo = oldWaterNo == null ? null : oldWaterNo.trim();
    }
}