package entidades;

public class Honda implements Motos {
        public String nome;
        public  String cilindradas;
        public String cor;
        public Honda () {
            nome = "CBX (Honda)";
            cilindradas = " 500";
            cor = "Azul";
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
