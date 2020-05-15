package com.cognitiveradio.entities;

import javax.persistence.*;

@Entity
@Table(name = "information")
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

}
