package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;


    public List<GameListDto> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }

}
