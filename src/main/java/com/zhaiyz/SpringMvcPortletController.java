package com.zhaiyz;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * SpringMvcPortletController
 * 
 * @author zhaiyz
 */
@Controller
@RequestMapping(value = "VIEW")
public class SpringMvcPortletController {

    @RenderMapping
    public String showForm(RenderRequest request, RenderResponse response) throws Exception {
        return "view";
    }
}
