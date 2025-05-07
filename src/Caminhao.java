public class Caminhao extends Veiculo{
    private float capacidade_carga;

    Caminhao(String marca, String modelo, int ano, float capacidade_carga) {
        super(marca, modelo, ano);
        this.capacidade_carga = capacidade_carga;
    }

    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    @Override
    public String exibir_informacao() {
        return super.exibir_informacao().replace("Veiculo", "Caminhao") + ", capacidadeCarga - " + getCapacidade_carga() + " toneladas";
    }
}
