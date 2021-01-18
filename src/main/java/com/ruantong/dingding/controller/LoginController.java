package com.ruantong.dingding.controller;


import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiUserGetuserinfoRequest;
import com.dingtalk.api.response.OapiUserGetuserinfoResponse;
import com.ruantong.dingding.config.AccessTokenUtil;
import com.taobao.api.ApiException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *  企业内部应用免登
 * @author openapi@dingtalk
 * 2020-11-3
 */
@RestController
public class LoginController {

    /**
     * 欢迎页面，通过 /welcome 访问，判断后端服务是否启动
     *
     * @return 字符串 welcome
     */
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    /**
     *
     * @param requestAuthCode
     * @return
     * ServiceResult
     * 2020-11-3
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map<String, Object>  login (@RequestParam("authCode") String requestAuthCode) {

        // 获取access_token，注意正式代码要有异常流处理
        String access_token= AccessTokenUtil.getToken();
        // 获取用户信息
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/getuserinfo");
        OapiUserGetuserinfoRequest request = new OapiUserGetuserinfoRequest();
        request.setCode(requestAuthCode);
        request.setHttpMethod("GET");
        OapiUserGetuserinfoResponse response;
        try {
            response = client.execute(request, access_token);
        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        // 查询得到当前用户的userId
        // 获得到userId之后应用应该处理应用自身的登录会话管理（session）,避免后续的业务交互（前端到应用服务端）每次都要重新获取用户身份，提升用户体验
        String userId = response.getUserid();
        Map<String, Object> returnMap = new HashMap<String,Object>();
        returnMap.put("userId", userId);
//        return ServiceResult.success(returnMap);
        return returnMap;
    }
}