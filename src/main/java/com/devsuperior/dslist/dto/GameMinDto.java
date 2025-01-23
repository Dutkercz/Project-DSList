package com.devsuperior.dslist.dto;



import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

import java.io.Serial;
import java.io.Serializable;

public class GameMinDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -6698884165491056621L;

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
    public GameMinDto(GameMinProjection entityProjection) {
        id = entityProjection.getId();
        title = entityProjection.getTitle();
        year = entityProjection.getYear();
        imgUrl = entityProjection.getImgUrl();
        shortDescription = entityProjection.getShortDescription();
    }

    /// CLasses Dto só precisam de getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
