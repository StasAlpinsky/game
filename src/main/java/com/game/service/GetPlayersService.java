package com.game.service;

import com.game.controller.PlayerOrder;
import com.game.entity.PlayerInfo;
import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.List;


public interface GetPlayersService {

    List<PlayerInfo> getPlayers(String name,
                                String title,
                                Race race,
                                Profession profession,
                                Long after,
                                Long before,
                                Boolean banned,
                                Integer minExperience,
                                Integer maxExperience,
                                Integer minLevel,
                                Integer maxLevel,
                                PlayerOrder order,
                                Integer pageNumber,
                                Integer pageSize);
}
