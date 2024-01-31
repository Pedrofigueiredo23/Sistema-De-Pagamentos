public class FormaDePagamento {
    public static void processarPagamento(){
        System.out.println("Processamento de pagamento.");
    }

    class CartaoCredito extends FormaDePagamento{ // subclass Cartao de Crédito
        public static void processarPagamento(){
            System.out.println("Pagamento por Cartão de Crédito.");
        }
    }

    class PayPal extends FormaDePagamento{ // subclass PayPal
        public static void processarPagamento(){
            System.out.println("Pagamento por PayPal.");
        }
    }
}
