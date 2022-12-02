public class Teste {
    public static void main(String[] args) {
       CconsultaOnline p1 = new CconsultaOnline(Teclado.leString("Digite a data: "),
                                    Teclado.leString("Digite seu hospital : "),
                                    Teclado.leChar("Digite seu turno : "),
                                    Teclado.leString("Digite seu nome : "),
                                    Teclado.leString("Digite seu endereco: "),
                                    Teclado.leInt("Digite sua idade: "),
                                    Teclado.leString("Digite seu telefone: "),
                                    Teclado.leString("Digite sua data de nascimento: "),
                                    Teclado.leString("Digite seu cpf: "));

                                    System.out.println("Aqui esta suas informacoes resumidas");
                                    p1.exibeDados();
    }
}
