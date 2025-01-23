package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.BeanUtils;
import java.util.Objects;

public class GameDto {
    //Classe para seguir o padrão de projeto, onde um service retorna para o
    // controlador um EntityDTO e não a Entity. Evita tambem representação ciclica.

    private Long id;
    private String title;

    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDto() {
    }

    public GameDto(Game entity) {
        BeanUtils.copyProperties(entity, this); //os nomes das prop. tem que ser iguais.
    }

    /// Nesse Dto usaremos get e set para todos os campos, pois usamos o BeantUtils no contrutor.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        GameDto gameDto = (GameDto) o;
        return Objects.equals(id, gameDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
