package com.springboot.freekfonk.model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_id_generator")
    @SequenceGenerator(name="player_id_generator", sequenceName = "player_id_seq", allocationSize=1)
    private Long id;
    private String username;
    private int score;
    private int highScore;
    @ManyToMany(mappedBy = "players")
    private Set<Match> Matches = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}
