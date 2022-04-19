package com.rrvrafael.aulas.aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    private String raca;

    public Gato(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return null;
    }

    @Override
    public String amamentar() {
        return null;
    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
