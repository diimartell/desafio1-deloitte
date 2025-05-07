//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro ("Chevrolet", "Prisma", 2022, 4);
        Caminhao caminhao1 = new Caminhao ("Volvo", "FMX", 2025, 38);

        Motorista motorista = new Motorista ("Antônio", "54896312547");
        motorista.atribuir_veiculo(carro1);
        motorista.remover_veiculo();
        motorista.atribuir_veiculo(caminhao1);

        Frota frotaLocadora = new Frota();
        frotaLocadora.add_motorista(motorista);
        frotaLocadora.add_veiculo(carro1);
        frotaLocadora.add_veiculo(caminhao1);

        //Ações desempenhadas pelo motorista e pelo carro
        carro1.acelerar();
        motorista.dirigir();

        frotaLocadora.listar_frota();

        //Exibindo informações
        System.out.println(carro1.exibir_informacao());
        System.out.println(caminhao1.exibir_informacao());
    }
}