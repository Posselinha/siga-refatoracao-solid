# Problemas encontrados na ETAPA 1

## Questão

1. **Analisar** a classe `RelatorioAluno` e identificar, por escrito, as responsabilidades misturadas (SRP).

R - Foi encontrado de que a classe `RelatorioAluno` possui atualmente três responsabilidades:

1. Formatar Relátorio dos Alunos
2. Salvar Relátorio dos Alunos
3. Enviar Relátorio por E-mail

Essas responsabilidades estão violando o SRP do SOLID ao misturar várias responsabilidades dentro de uma única classe.
