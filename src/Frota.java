import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> veiculos;
    ArrayList<Motorista> motoristas;

    public Frota() {
        this.veiculos = new ArrayList<>();
        this.motoristas = new ArrayList<>();
    }

    public void add_veiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }
    public void add_motorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void listar_frota() {
        if (veiculos.isEmpty() && motoristas.isEmpty()) {
            System.out.println("Não há motoristas e veículos adicionados na lista.");
        }
        else if (veiculos.isEmpty()) {
            System.out.println("Não há veículos adicionados na lista.");
        }
        else {
            System.out.println("Veículos adicionados na frota.");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo.exibir_informacao());
            }
        }

        if (motoristas.isEmpty()) {
            System.out.println("Não há motoristas adicionados na lista.");
        }
        else {
            System.out.println("Motoristas adicionados na frota.");
            for (Motorista motorista : motoristas) {
                System.out.println("Motorista: " + motorista.getNome());
            }
        }
    }
}
