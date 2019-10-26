package source;

import java.time.LocalDate;

public class Empregado {
    private String nome;
    private LocalDate dataAdmissao;  //metodo que valida Start, não pode ser menos que 2015
    private String cpf;  //não pode ser nulo e menor que 11
    private Double salario;
    private Integer plv = 1;

    private final static Integer ANO = 2015;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if(dataAdmissao.equals(null))
            throw new NullPointerException("campo localização obrigatorio");
        if(dataAdmissao.getYear() < ANO){
            throw new IllegalArgumentException("O ano não pode ser inferior a 2015!");
        }
        this.dataAdmissao = dataAdmissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setPlv(Integer plv) {
        this.plv = plv;
    }

    public Double calcularPlv(Double salario, Integer plv){
        return salario*plv;
    }

    public Empregado(String nome, LocalDate dataAdmissao, String cpf, Double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public Integer getPlv() {
        return plv;
    }

    @Override
    public String toString() {

        return "Nome: "+getNome()+
                "\nCPF: "+getCpf()+
                "\nData de Admissao: "+getDataAdmissao()+
                "\nSalario: "+getSalario()+
                "\nPVL: "+getPlv();

    }
}

