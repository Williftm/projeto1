package domain;

import java.util.List;

public class Especie {
    
    private String nomeEspecie;

    private List<Animal> animais;

    public Especie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public String getnomeEspecie() {
        return nomeEspecie;
    }

    public void setnomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "Especie [nomeEspecie=" + nome + ", animais=" + animais + "]";
    }

    


}
