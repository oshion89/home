package com.hoo.home.service;

import com.hoo.home.common.response.DefaultRes;
import com.hoo.home.common.response.ResponseMessage;
import com.hoo.home.common.response.StatusCode;
import com.hoo.home.dao.MainMenuDAO;
import com.hoo.home.dto.MainMenuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainMenuServiceImpl implements MainMenuService{

    private final MainMenuDAO mainMenuDAO;

    @Override
    public DefaultRes getMainMenu() {
        final List<MainMenuDTO> list = mainMenuDAO.selectMainMenu();
        if (list.isEmpty() || list.size() == 0)
            return DefaultRes.res(StatusCode.FAIL, ResponseMessage.FAIL_GET);
        return DefaultRes.res(StatusCode.SUCC, ResponseMessage.SUCC_GET, list);
    }
}
