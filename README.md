<h1 align="center">
   Banco Digital - Sistema Bancário em Java
</h1>


Este é um sistema bancário simples desenvolvido em Java que permite a criação de contas bancárias para clientes. O sistema oferece três tipos de contas: **Conta Corrente**, **Conta Poupança**, e a possibilidade de criar ambas as contas para um cliente. O cliente pode realizar operações como depósito e visualizar extratos.   

## Estrutura do Projeto   

A estrutura do projeto é organizada da seguinte maneira:   

```   
digital-bank-app/
├── src/
│   └── com/digitalInnovation/
│       ├── Banco.java
│       ├── Cliente.java
│       ├── Conta.java
│       ├── ContaCorrente.java
│       ├── ContaPoupanca.java
│       ├── IConta.java
│       └── Main.java
```   

## Classes Principais   

### Banco.java   

A classe **Banco** representa uma entidade bancária, contendo o nome do banco e uma lista de contas associadas. Ela pode ser usada para gerenciar as contas de todos os clientes.

**Atributos:**   

- **nome** (String): Nome do banco.
- **contas** (List<Conta>): Lista de contas bancárias associadas ao banco.   

**Métodos:**   

- **getNome()**: Retorna o nome do banco.
- **setNome(String nome)**: Define o nome do banco.
- **getContas()**: Retorna a lista de contas do banco.
- **setContas(List<Conta> contas)**: Define a lista de contas associadas ao banco.   

#    

### Cliente.java   

A classe **Cliente** representa um cliente do banco. Ela contém informações básicas como o nome do cliente.

**Atributos:**   

- **nome** (String): Nome do cliente.   

**Métodos:**   

- **getNome()**: Retorna o nome do cliente.
- **setNome(String nome)**: Define o nome do cliente.   

#   

### Conta.java   

A classe **Conta** é uma classe abstrata que representa uma conta bancária. Ela implementa a interface **IConta** e contém métodos para realizar operações bancárias, como saque, depósito e transferência. Conta também armazena dados como agência, número da conta, saldo e o cliente associado.

**Atributos:**   

- **AGENCIA_PADRAO** (final int): Número da agência padrão.
- **SEQUENCIAL** (static int): Número sequencial para o número da conta.
- **agencia** (int): Agência da conta.
- **numero** (int): Número da conta.
- **saldo** (double): Saldo da conta.
- **cliente** (Cliente): Cliente associado à conta.   

**Métodos:**   

- **sacar(double valor)**: Realiza o saque de um valor da conta.
- **depositar(double valor)**: Realiza o depósito de um valor na conta.
- **transferir(double valor, Conta contaDestino)**: Realiza uma transferência de valores para outra conta.
- **imprimirInfosComuns()**: Exibe as informações comuns da conta (nome do cliente, agência, número da conta e saldo).   

#   

### ContaCorrente.java   

A classe **ContaCorrente** é uma implementação concreta da classe **Conta** e representa uma conta corrente.

**Métodos:**   

- **imprimirExtrato()**: Exibe o extrato da conta corrente, utilizando o método **imprimirInfosComuns()** da classe **Conta**.   

#   

### ContaPoupanca.java   

A classe **ContaPoupanca** é uma implementação concreta da classe **Conta** e representa uma conta poupança.

**Métodos:**   

- **imprimirExtrato()**: Exibe o extrato da conta poupança, utilizando o método **imprimirInfosComuns()** da classe **Conta**.   

#   

### IConta.java   

A interface **IConta** define os métodos básicos que qualquer tipo de conta bancária deve implementar, como saque, depósito, transferência e impressão de extrato.

**Métodos:**   

- **sacar(double valor)**: Realiza o saque de um valor da conta.
- **depositar(double valor)**: Realiza o depósito de um valor na conta.
- **transferir(double valor, Conta contaDestino)**: Realiza uma transferência de valores para outra conta.
- **imprimirExtrato()**: Exibe o extrato da conta.   

#   

### Main.java   

A classe **Main** contém o método **main** que permite a interação com o usuário para abrir contas e realizar operações bancárias.

**Fluxo de Execução:**   

1. O usuário insere o nome do cliente.
2. O sistema pergunta qual tipo de conta o cliente deseja abrir:
   - **1**: Conta Corrente.
   - **2**: Conta Poupança.
   - **3**: Conta Corrente e Conta Poupança.
3. O sistema solicita o valor para depósito inicial em cada conta selecionada.
4. O extrato da(s) conta(s) selecionada(s) é exibido.   


## Passos para Executar o Projeto   

**1. Pré-requisitos**   

**JDK 11** ou superior.

**2. Clonar o Repositório**   

Primeiro, faça o clone do repositório para sua máquina local usando o comando:   

```   
git clone https://github.com/Gilvan-R-A/digital-bank-app.git
```   

**3. Navegar até o Diretório do Projeto**   

Acesse o diretório do projeto clonado:   

```   
cd digital-bank-app
```   

**4. Compilar o Código**   

Navegue até o diretório **src** do projeto e compile todos os arquivos Java:   

```   
javac src/com/digitalInnovation/*.java
```   
Este comando criará os arquivos **.class** para todas as classes do projeto.   

**5. Executar o Projeto**   

Após a compilação bem-sucedida execute a classe principal **Main**:   

```   
java com.digitalInnovation.Main
```   

**6. Interagir com o Programa**   

O programa solicitará que você:

1. Insira o nome do cliente.
2. Escolha o tipo de conta que deseja abrir:
   - 1: Conta Corrente.
   - 2: Conta Poupança.
   - 3: Conta Corrente e Poupança.
3. Informe o valor inicial de depósito para cada conta selecionada.
4. Visualize o extrato da(s) conta(s).   


## Passos Adicionais (Se Necessário)

**Testar o Programa com um IDE**   

Caso prefira, você pode abrir o projeto em uma IDE, como **IntelliJ IDEA, Eclipse** ou **NetBeans**:

1. **Importar o Projeto:**

   - Abra a IDE.
   - Importe o diretório clonado como um projeto Java.
   - Configure o SDK (Java JDK 11 ou superior).   

2. **Executar o Programa:**

   - Localize a classe **Main.java**.
   - Clique com o botão direito e escolha "**Run Main.main()**".

