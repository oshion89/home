package com.hoo.home.dao;

import com.hoo.home.dto.MainMenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMenuDAO {

    List<MainMenuDTO> selectMainMenu();

}
