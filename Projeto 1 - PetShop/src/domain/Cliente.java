package domain;

import java.util.List;

public class Cliente {
    
    private String nomeCliente;

    private String endereco;

    private String telefone;

    private List<Animal> animais;

    public Cliente(String nomeCliente, String endereco, String telefone) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getnomeCliente() {
        return nomeCliente;
    }

    public void setnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "Cliente [nomeCliente=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", animais=" + animais
                + "]";
    }

    


}
