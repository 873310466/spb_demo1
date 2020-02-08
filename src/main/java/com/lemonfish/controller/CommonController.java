package com.lemonfish.controller;

import com.lemonfish.pojo.dto.AccessTokenDTO;
import com.lemonfish.pojo.dto.GithubUser;
import com.lemonfish.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Masics 张超
 * @date 2020/2/5 23:26
 */
@Controller
public class CommonController {
    @Autowired
    private GithubProvider githubProvider;

    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.redirect.uri}")
    private String redirectUri;


    @RequestMapping("/toLogin")
    public String toLogin() {

        return "login";
    }

    @RequestMapping("/toMain")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }


    @RequestMapping("/toCommon")
    public String toCommon(@RequestParam("test") String test, Model model) {
        model.addAttribute("test", test);
        return "common";
    }

    @RequestMapping("/callback")
    public String callback(@RequestParam("code") String code,
                           @RequestParam("state") String state) {

        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);

        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());

        return "main";
    }


}




