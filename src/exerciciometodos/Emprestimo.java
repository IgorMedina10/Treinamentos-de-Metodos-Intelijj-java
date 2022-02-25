package exerciciometodos;

public class Emprestimo {

    public static int getduasparcelas() {
        return 2;
    }

    public static int gettresparcelas() {
        return 3;
    }

    public static double gettaxaduasparcelas() {
        return 0.3;
    }

    public static double gettaxatresparcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {

            double valorFinal = valor + (valor * gettaxaduasparcelas());

            System.out.println("Valor final do emprestimo para duas parcelas: R$ " + valorFinal);

        }else if (parcelas == 3) {

            double valorFinal = valor + (valor * gettaxatresparcelas());
            System.out.println("O valor final para três parcelas é " + valorFinal);
        } else{

            System.out.println("Parcelas não aceitas");

        }
    }

}

