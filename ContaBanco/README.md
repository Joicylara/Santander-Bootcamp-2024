## Desafio conta bancária atrável do terminal

O desafio proposto foi para fixar os conteúdos aprendidos no módulo de Sintaxe de Java

## Sobre o desafio
Foi disponibilizado no [github](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe) informações de fazer o desafio.
1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do programa.

### Variáveis e os tipos de dados
- numeroConta: int
- nomeCliente: String
- agencia: String
- saldo: double

### Entrada de dados
  Para a inserção de dados foi utilizado o scanner, que necessita da importação da biblioteca:
  
      import java.util.Locale;
      import java.util.Scanner;

Outro passo, é inicializar o objeto Scanner para ler a entrada do sistema (normalmente o teclado) e configura o Locale para Locale.US. Isso é útil quando você deseja ler números que utilizam o ponto (.) como separador decimal, como é o caso nos Estados Unidos.

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

Para modificar a leitura de diferentes tipos de dados:

    int numeroConta = scanner.nextInt();
    String agencia = scanner.next();
    double saldo = scanner.nextDouble();


### Saída de dados

Foi solicitado um modelo a ser seguido para a impressão dos dados:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*
    

