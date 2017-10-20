package com.gznb.system.demo2.api;


import com.gznb.system.demo2.pojo.dto.JifenDetailDTO;
import com.gznb.system.demo2.pojo.po.JfEJifenDetail;
import com.gznb.system.demo2.pojo.vo.JifenDetaiForm;
import com.gznb.system.demo2.pojo.vo.result.ResultBean;
import com.gznb.system.demo2.service.IJfEJifenDetailService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author <a href="mailto:caolei@gznb.com">cl</a>
 * @version 1.0 & 2017/10/12
 * @since 1.0
 * To change this template use File | Settings | Editor | File and Code Templates
 * Description:
 */

@Controller
public class JfEJifenDetailController {

    @Autowired
    private IJfEJifenDetailService jfEJifenDetailService;

    @RequestMapping(value = "/demo2/detail", method = RequestMethod.GET)
    @ResponseBody
    public String getJfEJifenDetail(@ModelAttribute JifenDetaiForm form){
        JifenDetailDTO jifenDetailDTO = new JifenDetailDTO();
        if(StringUtils.isNotBlank(form.getAccount_no())){
            jifenDetailDTO.setAccountNo(form.getAccount_no());
        }
        if(StringUtils.isNotBlank(form.getProcess_status())){
            jifenDetailDTO.setProcessStatus(form.getProcess_status());
        }
        List<JfEJifenDetail> jfEJifenDetailList = jfEJifenDetailService.ListJfEJifenDetail(jifenDetailDTO);
        ResultBean resultBean = ResultBean.getOKInstance();
        resultBean.putData(jfEJifenDetailList);
        return resultBean.toJsonString();
    }
    @RequestMapping(value = "/demo2/page/query")
    public String getJfEJifenDetail(ModelMap map){
        return "jifen_query";
    }

}