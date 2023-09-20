package domain;

import java.util.List;

public class Veterinario {

    private String nomeVeterinario;

    private String especialidade;

    private List<Consulta> consultas;

    public Veterinario(String nomeVeterinario, String especialidade) {
        this.nomeVeterinario = nomeVeterinario;
        this.especialidade = especialidade;
    }

    public String getnomeVeterinario() {
        return nomeVeterinario;
    }

    public void setnomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Veterinario [nomeVeterinario=" + nome + ", especialidade=" + especialidade + ", consultas=" + consultas + "]";
    }

    

}
