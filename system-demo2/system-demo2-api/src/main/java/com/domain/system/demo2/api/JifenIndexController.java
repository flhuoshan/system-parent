package com.domain.system.demo2.api;

import com.domain.system.demo2.common.Demo2AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:caolei@gznb.com">cl</a>
 * @version 1.0 & 2017/10/12
 * @since 1.0
 * To change this template use File | Settings | Editor | File and Code Templates
 * Description:
 */
@Controller
public class JifenIndexController {

    @Autowired
    private Demo2AppConfig demo2AppConfig;

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("content", "Demo2 application is running in " + demo2AppConfig.getEnv() + " Mode");
        return "welcome";
    }

}