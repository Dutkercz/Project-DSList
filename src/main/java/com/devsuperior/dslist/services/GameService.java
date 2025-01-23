package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRespository gameRespository;

    public List<GameMinDto> findAll() {
        List<Game> list = gameRespository.findAll();
        return list.stream().map(GameMinDto::new).toList();
    }

}
