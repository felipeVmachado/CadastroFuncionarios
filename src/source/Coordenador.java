package source;

import java.time.LocalDate;

public class Coordenador  extends Empregado {

        //- Coordenadores
        private String numeroFuncionario;  //  Numeros de funcionarios ligados - não pode ser nulo - deve constar o numeros de func.
        private String departamentoCoordenacao ;  // - não pode ser nulo -deve constar o departamento ex. RH, TI,

    public Coordenador(String nome, LocalDate dataAdmissao, String cpf, Double salario) {
        super(nome, dataAdmissao, cpf, salario);
    }

    @Override
        public Double calcularPlv(Double salario, Integer plv) {
            return super.calcularPlv(salario, plv);
        }
    }

    //Numeros de funcionarios ligados - não pode ser nulo - deve constar o numeros de func.
    //Departamento de coordenaçao - não pode ser nulo -deve constar o departamento ex. RH, TI,

