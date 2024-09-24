package entidades;

public class Suzuki implements Motos {
    public String nome;
    public  String cilindradas;
    public String cor;
    public Suzuki () {
        nome = "DRZ (Suzuki)";
        cilindradas = " 400 ";
        cor = " Amarelo ";
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public String getCilindradas() {
        return cilindradas;
    }
}
