package siga;

public class ServicoEmail {

    // Responsabilidade (c): COMUNICAÇÃO (enviar por e-mail)
    public void enviarPorEmail(String conteudo, String destinatario) {
        // Simulação de envio de e-mail.
        System.out.println("[email] Enviando relatório para: " + destinatario);
        System.out.println(conteudo);
    }
}
