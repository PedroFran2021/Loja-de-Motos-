package Aplicacao;

import javax.swing.JOptionPane;
import entidades.Motos; // Supondo que exista uma interface Motos
import entidades.Honda;
import entidades.Suzuki;
import entidades.Yamaha;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                String nome = JOptionPane.showInputDialog("Informe a marca [Cancelar] para sair:");
                if (nome == null) break; // Se o usuário clicar em Cancelar

                Motos moto = null;

                switch (nome.toLowerCase()) {
                    case "honda":
                        moto = new Honda();
                        break;
                    case "yamaha":
                        moto = new Yamaha();
                        break;
                    case "suzuki":
                        moto = new Suzuki();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Marca inválida.");
                        continue; // Pular para a próxima iteração
                }

                exibirDadosMoto(moto);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("\nPROGRAMA FINALIZADO!");
    }

    private static void exibirDadosMoto(Motos moto) {
        JOptionPane.showMessageDialog(null, "\nNome: " +
                        moto.getNome() +
                        "\nCilindrada: " + moto.getCilindradas() +
                        "\nCor: " + moto.getCor(),
                "Dados da moto", JOptionPane.INFORMATION_MESSAGE);
    }
}
