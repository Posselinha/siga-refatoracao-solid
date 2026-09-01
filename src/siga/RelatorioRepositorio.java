package siga;

public class RelatorioRepositorio {

    // Responsabilidade (b): PERSISTÊNCIA (gravar em arquivo)
    public void salvarEmArquivo(String conteudo, String caminho) {
        // Simulação de gravação em disco (a implementação real não importa para a atividade).
        System.out.println("[disco] Gravando relatório em: " + caminho);
        System.out.println(conteudo);
    }
}
