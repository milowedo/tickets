package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="team")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="team_id")
    private int team_id;

    @Column(name="name")
    private String name;
}
