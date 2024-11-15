package com.willemberg.dslist.dto;

import com.willemberg.dslist.entities.Game;
import com.willemberg.dslist.entities.GameList;

public record GameListDTO(
        Long id,
        String name
) {
    public GameListDTO(GameList entity) {
        this(
                entity.getId(),
                entity.getName()
        );
    }
}
