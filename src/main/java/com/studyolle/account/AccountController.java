package com.studyolle.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String singUpForm(Model model) {
        // model.addAttribute("signUpForm", new SignUpForm());
        // 생략시 , 객체의 camelCase대로 attribute를 전달한다
        model.addAttribute( new SignUpForm());
        return "account/sign-up";
    }


}
