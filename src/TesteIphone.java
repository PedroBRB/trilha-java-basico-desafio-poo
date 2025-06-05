public class TesteIphone {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        Iphone meuiPhone = new Iphone();

        System.out.println("=== TESTANDO FUNCIONALIDADES DO iPHONE ===\n");

        // Testando Reprodutor Musical
        System.out.println("--- REPRODUTOR MUSICAL ---");
        meuiPhone.selecionarMusica("Imagine - John Lennon");
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.tocar();

        System.out.println("\n--- APARELHO TELEFÔNICO ---");
        meuiPhone.ligar("(11) 99999-9999");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        System.out.println("\n--- NAVEGADOR INTERNET ---");
        meuiPhone.exibirPagina("https://www.apple.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();

        // Mostrando status final
        meuiPhone.mostrarStatus();
    }
}
