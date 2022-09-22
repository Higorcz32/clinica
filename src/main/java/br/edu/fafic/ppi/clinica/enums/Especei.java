package br.edu.fafic.ppi.clinica.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Especei {

    GATO("Gato"),
    CACHORRO("Cachorro");

    private final String especieType;
}
