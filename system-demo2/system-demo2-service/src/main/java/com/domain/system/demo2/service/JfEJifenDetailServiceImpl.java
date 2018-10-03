package com.domain.system.demo2.service;

import com.domain.system.demo2.dao.mapper.JfCustomMapper;
import com.domain.system.demo2.pojo.dto.JifenDetailDTO;
import com.domain.system.demo2.pojo.po.JfEJifenDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author <a href="mailto:caolei@gznb.com">cl</a>
 * @version 1.0 & 2017/10/12
 * @since 1.0
 * To change this template use File | Settings | Editor | File and Code Templates
 * Description:
 */
@Service
public class JfEJifenDetailServiceImpl implements IJfEJifenDetailService{


    @Autowired
    private JfCustomMapper jfCustomMapper;

    @Override
    public List<JfEJifenDetail> listJfEJifenDetail(JifenDetailDTO jifenDetailDTO){

        if(StringUtils.isEmpty(jifenDetailDTO)){
            throw new IllegalArgumentException("参数：jifenDetailDto不能为空");
        }

        JfEJifenDetail jfEJifenDetail = new JfEJifenDetail();
        jfEJifenDetail.setAccountNo(jifenDetailDTO.getAccountNo());
        jfEJifenDetail.setProccessStatus(jifenDetailDTO.getProcessStatus());
        return jfCustomMapper.listJfEDetail(jfEJifenDetail);
    }
}