package source;

import java.time.LocalDate;

public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado cto = new Cto("José", LocalDate.of(2019,8,1), "01234567890", 1200.0);
        System.out.println(cto.toString());

    }
}
