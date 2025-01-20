package com.devsuperior.dslist.dto;



import com.devsuperior.dslist.entities.Game;

import java.io.Serial;

public class GameMinDto {
    @Serial
    private static final long serialVersionUID = -6698884165491056621L;

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game o) {
        id = o.getId();
        title = o.getTitle();
        year = o.getYear();
        imgUrl = o.getImgUrl();
        shortDescription = o.getShortDescription();
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
