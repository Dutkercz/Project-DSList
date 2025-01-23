package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Embeddable //explica que estamos encapsulando 2 classes em 1. Ele ira representar essas 2 classes em outra.
public class BelongingPK {
    /// Classe Auxiliar, para representar uma chave primaria dupla. Pois temos o modelo de repositories,que não aceita 2 Ids.

    @ManyToOne
    @JoinColumn(name = "game_id") //nome da chave estrangeira
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
