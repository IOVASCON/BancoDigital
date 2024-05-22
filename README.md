# Banco Digital

Este é um projeto de um Banco Digital desenvolvido em Java, utilizando os conceitos de Programação Orientada a Objetos (POO). O objetivo deste projeto é reforçar o conhecimento em POO através da implementação de um sistema bancário digital. Projeto Desafio "Criando um Banco Digital com Java e Orientação a Objetos" promovido pela empresa educadora DIO. curso "Formação Java Developer".

## Funcionalidades

O Banco Digital oferece as seguintes funcionalidades:

1. **Criação de Clientes**
   - Adição de clientes com nome, número do PIX, tipo de cliente (PF/PJ) e informação sobre cartão de crédito.

2. **Tipos de Conta**
   - Conta Corrente
   - Conta Poupança

3. **Operações Bancárias**
   - Depósito
   - Saque
   - Transferência entre contas

4. **Listagem de Clientes**
   - Exibição de todos os clientes cadastrados no banco.

5. **Débito Automático**
   - Pagamento automático de serviços como luz e água.

6. **Interface Gráfica (GUI)**
   - Interface gráfica desenvolvida com Swing para facilitar a interação com o sistema.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

BancoDigital/
├── .vscode/
├── bin/
├── lib/
├── src/
│ ├── Banco.java
│ ├── Cliente.java
│ ├── Conta.java
│ ├── ContaCorrente.java
│ ├── ContaPoupanca.java
│ ├── IConta.java
│ ├── Main.java
│ └── BancoDigitalGUI.java
└── README.md

## Instruções para Compilação e Execução

### Compilação

Para compilar o projeto, navegue até o diretório raiz do projeto e execute o seguinte comando:

javac -d bin src/*.java

### Execução

Para executar o projeto com a interface gráfica, utilize o seguinte comando:

java -cp bin BancoDigitalGUI

### Novas Implementações

As seguintes implementações foram adicionadas ao projeto original:

    Listar todos os clientes do Banco
        Permite visualizar todos os clientes cadastrados no banco com suas informações.

    Inclusão da informação 'Número do PIX'
        Cada cliente possui um número do PIX associado.

    Diferenciação pelo tipo de cliente (PF ou PJ)
        Identificação se o cliente é Pessoa Física (PF) ou Pessoa Jurídica (PJ).

    Verificação de cartão de crédito
        Informação se o cliente possui cartão de crédito.

    Débito automático
        Função para realizar pagamentos automáticos de serviços como luz e água.

    Interface Gráfica (GUI)
        Adição de uma interface gráfica para facilitar a interação com o sistema.

### Contribuição

Se você deseja contribuir para este projeto, sinta-se à vontade para fazer um fork do repositório e enviar pull requests.
Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

Autor:Izairton Oliveira de Vasconcelos
e-mail:iovascon@gmail.com
