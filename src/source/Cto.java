package source;

import java.time.LocalDate;

public class Cto extends Empregado {

    Integer bonusAnual;
    String localizacao;   //local de localização - não pode ser nulo, definir localização

    public Cto(String nome, LocalDate dataAdmissao, String cpf, Double salario, Integer bonusAnual, String localizacao) {
        super(nome, dataAdmissao, cpf, salario);
        this.bonusAnual = bonusAnual;
        this.localizacao = localizacao;
    }

    public void setLocalizacao(String localizacao) {

        if(localizacao.equals(null))
            throw new NullPointerException("campo localização obrigatorio");

        this.localizacao = localizacao;
    }

    @Override
    public Double calcularPlv(Double salario, Integer plv) {
        return super.calcularPlv(salario, plv);
    }

    public Cto(String nome, LocalDate dataAdmissao, String cpf, Double salario) {
        super(nome, dataAdmissao, cpf, salario);
    }

    public Integer getBonusAnual() {
        return bonusAnual;
    }

    public String getLocalizacao() {
        return localizacao;
    }




}
