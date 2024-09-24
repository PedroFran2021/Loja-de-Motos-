package entidades;


public class Yamaha implements Motos {
    public String nome;
    public  String cilindradas;
    public String cor;
    public Yamaha () {
        nome = "RD (Yamaha)";
        cilindradas = " 350 ";
        cor = " Vermelho ";
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
