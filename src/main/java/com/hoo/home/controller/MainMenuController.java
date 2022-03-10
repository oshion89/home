package com.hoo.home.controller;


import com.hoo.home.common.response.DefaultRes;
import com.hoo.home.service.MainMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mainmenu")  //루트 URL
public class MainMenuController {

    private final MainMenuService mainMenuService;

    @GetMapping("/get")
    public DefaultRes getMainMenu(){
//        log.debug(api_path + " : getLogin" );

        return mainMenuService.getMainMenu();
    }

}
