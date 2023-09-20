package domain;

import java.util.List;

public class Exame {

    private String nomeExame;

    private String resultado;
    
    private List<Consulta> consultas;

    public Exame(String nomeExame, String resultado) {
        this.nomeExame = nomeExame;
        this.resultado = resultado;
    }

    public String getnomeExame() {
        return nomeExame;
    }

    public void setnomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Exame [nomeExame=" + nome + ", resultado=" + resultado + ", consultas=" + consultas + "]";
    }

    


}
