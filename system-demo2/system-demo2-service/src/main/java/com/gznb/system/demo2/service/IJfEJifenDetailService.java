package com.gznb.system.demo2.service;


import com.gznb.system.demo2.pojo.dto.JifenDetailDTO;
import com.gznb.system.demo2.pojo.po.JfEJifenDetail;

import java.util.List;

/**
 * @author <a href="mailto:caolei@gznb.com">cl</a>
 * @version 1.0 & 2017/10/20
 * @since 1.0
 */
public interface IJfEJifenDetailService {
    public List<JfEJifenDetail> ListJfEJifenDetail(JifenDetailDTO jifenDetailDTO);
}
