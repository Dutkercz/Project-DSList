package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> list = gameRepository.findAll();
        return list.stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById (Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
        /// devera ser feito um tratamento de exceções
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAllByList (Long listId){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        return list.stream().map(GameMinDto::new).toList();
    }

}
