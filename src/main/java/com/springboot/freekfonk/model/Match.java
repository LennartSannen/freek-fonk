package com.springboot.freekfonk.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_id_generator")
    @SequenceGenerator(name="match_id_generator", sequenceName = "match_id_seq", allocationSize=1)
    private Long id;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Match_Player",
            joinColumns = { @JoinColumn(name = "match_id") },
            inverseJoinColumns = { @JoinColumn(name = "player_id") }
    )
    private Set<Player> players = new HashSet<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Set<Player> getPlayers() {
        return players;
    }
}
