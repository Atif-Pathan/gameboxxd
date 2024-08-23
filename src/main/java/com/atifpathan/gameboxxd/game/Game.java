package com.atifpathan.gameboxxd.game;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table("games_by_id")
class Game {

    @PrimaryKeyColumn(name = "game_id", type = PrimaryKeyType.PARTITIONED)
    private UUID gameId;

    private String name;
    private String slug;
    private String storyline;
    private String summary;
    private List<String>genres;
    private List<String>platforms;

    @Column("cover_url")
    private String coverURL;

    @Column("franchise_name")
    private String franchiseName;

    @Column("franchise_slug")
    private String franchiseSlug;

    @Column("game_modes")
    private List<String> gameModes;

    @Column("genre_slugs")
    private List<String>genreSlugs;

    @Column("involved_company_names")
    private List<String>involvedCompanyNames;

    @Column("involved_company_slugs")
    private List<String>involvedCompanySlugs;

    @Column("platform_slugs")
    private List<String>platformSlugs;

    @Column("similar_game_ids")
    private List<UUID>similarGameIDs;

    @Column("similar_game_names")
    private List<String> similarGameNames;

    @Column("similar_game_slugs")
    private List<String>similarGameSlugs;

    @Column("total_rating")
    private Double totalRating;

    @Column("total_rating_count")
    private Integer totalRatingCount;

}
