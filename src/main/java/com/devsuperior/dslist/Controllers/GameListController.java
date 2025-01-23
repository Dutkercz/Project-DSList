package com.devsuperior.dslist.Controllers;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDto> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findAllByList (@PathVariable Long listId){
        return gameService.findAllByList(listId);
    }
}
