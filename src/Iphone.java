import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String musicaAtual;
    private boolean chamadaAtiva;
    private String paginaAtual;
    private List<String> abas;
    private boolean musicaTocando;

    public Iphone() {
        this.abas = new ArrayList<>();
        this.chamadaAtiva = false;
        this.musicaTocando = false;
    }

    @Override
    public void tocar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            musicaTocando = true;
            System.out.println("♪ Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            musicaTocando = false;
            System.out.println("⏸ Música pausada");
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("🎵 Música selecionada: " + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("📞 Ligando para: " + numero);
        chamadaAtiva = true;
        System.out.println("Chamada iniciada...");
    }

    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("📱 Atendendo chamada...");
        } else {
            System.out.println("📱 Chamada atendida");
            chamadaAtiva = true;
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📧 Iniciando correio de voz...");
        System.out.println("Grave sua mensagem após o sinal...");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌐 Exibindo página: " + url);
        System.out.println("Página carregada com sucesso!");
    }

    @Override
    public void adicionarNovaAba() {
        String novaAba = "Nova Aba " + (abas.size() + 1);
        abas.add(novaAba);
        System.out.println("🔖 " + novaAba + " adicionada");
        System.out.println("Total de abas abertas: " + abas.size());
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null && !paginaAtual.isEmpty()) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
            System.out.println("Página atualizada!");
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    // Métodos auxiliares para demonstração
    public void mostrarStatus() {
        System.out.println("\n=== STATUS DO iPHONE ===");
        System.out.println("Música atual: " + (musicaAtual != null ? musicaAtual : "Nenhuma"));
        System.out.println("Música tocando: " + (musicaTocando ? "Sim" : "Não"));
        System.out.println("Chamada ativa: " + (chamadaAtiva ? "Sim" : "Não"));
        System.out.println("Página atual: " + (paginaAtual != null ? paginaAtual : "Nenhuma"));
        System.out.println("Abas abertas: " + abas.size());
        System.out.println("========================\n");
    }

}
