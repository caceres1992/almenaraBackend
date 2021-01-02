package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AnioAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String anioInicio;
    private String anioFinal;
    private String mesInicio;
    private String mesFinal;

    private Long mesInicioNum;
    private Long mesFinalNum;

}
