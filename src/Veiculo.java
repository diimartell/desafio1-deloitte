public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade =0;

    Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Adicionar ou diminuir a velocidade, de acordo com o valor atual da velocidade do veículo
    public float acelerar() {
        return this.velocidade += 10;
    }

    public float frear() {
        if (this.velocidade >= 10) {
            return this.velocidade -= 10;
        }
        else {
            return this.velocidade = 0;
        }
    }

    //Aplicando métodos
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public float getVelocidade() {
        return velocidade;
    }

    //Exibindo informações
    public String exibir_informacao() {
        return "Veiculo: " +
                " ano - " + getAno() +
                ", modelo - '" + getModelo() + '\'' +
                ", marca - '" + getMarca() + '\'' +
                ", velocidade atual - '" + getVelocidade() + " Km/h" + '\'';
    }
}
