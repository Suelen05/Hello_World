# **Programação Orientada a objetos**

---

## 📚Classes

- **Classe de modelo (model):** Classes que representem estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc...
- **Classe de Serviço (service):** Classes que contém regras de negócio e validação de nosso sistema. Só a service respectiva se comunica com a sua repository. Essa separação é de arquitetura e de segurança
- **Classe de repositório (repository):** Classes que contém uma integração com banco de dados.
- **Classes de controle (controller):** Classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.
- **Classe utilitária (util):** Classe que contém recursos comuns à toda a aplicação.

![Classes](Imagens/classes.png)

---

## 📦Pacotes

### 1. 📄Nomenclaturas

- Comercial: com.nomeDoPacote
- Governamental: gov.nomeDoPacote
- Código Aberto: org.nomeDoPacote
- Educacional: edu.nomeDoPacote

### 2. 🧑‍🏫Classes 
 
 Tipos de classes

 - Model
 - Service
 - Repository
 - Controller
 - Util

### 3. 🪪Identificação

- nome da empresa
- nome próprio

Exemplo: 

com.controle.acesso.model.Usuário

---

## 🤼‍♀️Package VS Import

**Package** = Localização de uma classe, sempre na primeira linha do código.

**Import** = Utilização de uma classe existente em outro pacote.

---

## 👁️Visibilidade

1. 🔓**Public:** Visível para qualquer outra classe, em qualquer pacote.
2. 🔏**Default:** Restringe a visibilidade por pacotes.
3. 🔒**Private:** Apenas a classe tem acesso; 
4. 🔐**Protected:** assegura que somente classes filhas ou de mesmo pacote acesse seus recursos de mesmo acesso.
 ---

 ## 🔧Getters e Setters

 Seguindo a convenção Java Beans

 Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos de instâncias de classes.

O método Getter retorna o valor do atributo especificado.

O método Setter define outro novo valor para o atributo especificado.

Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:

- Os atributos precisam ter o modificador de acesso private. Ex.: private String nome;
  
- Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos getX e setX, Ex.: getNome() e setNome(String novoNome);
  
- O método get é responsável por obter o valor atual do atributo, logo ele precisa ser public retornar um tipo correspondente ao valor, Ex.: public String getNome() {};
  
- O método set é responsável por definir ou modificador o valor de um atributo em um objeto, logo ele também precisa ser public, receber um parâmetro do mesmo tipo da variável mas não retorna nenhum valor void. Ex.: public void setNome(String newNome);

`this.` declara o atributo da classe.
`new` instancia um novo objeto.

Exemplo: 

``` java
public class Aluno{
    private String  nome;
    private int idade;

    public String getName{
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getName (){
        return idade;
    }

    public setIdade(int newIdade){
        this.idade = newIdade;
    }
}
```
---
## 🛠️Construtor

Ao instanciar um novo objeto podemos necessitar **obrigatoriamente** de algumas informações essenciais para isso usamos construtores.

Exemplo:

``` java
public class Aluno{
    private String  nome;
    private int idade;

    public Aluno (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getName{
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getName (){
        return idade;
    }

    public setIdade(int newIdade){
        this.idade = newIdade;
    }
}
```
---
## 🧮Enums

Classe onde os objetos são previamente criados, imutáveis e disponíveis em toda a aplicação.

Exemplo: 
- **Estado civil:** Solteiro, Casado, Viúvo, Divorciado, etc...
- **Grau de escolaridade:** Analfabeto, Fundamental, Médio, superior


>[!IMPORTANT]
>Não confunda uma lista de constantes com enums

Enquanto um constante é uma variável de tipo com valor imutável, um enum é um conjunto de objetos pré-definidos na aplicação.

Como um enum é um conjunto de objetos, podem conter atributos e métodos.

Exemplo: 
``` java
public enum EstadoBrasileiro{
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"), 
    RIO_GRANDE_SUL("RS", "Rio Grande do Sul");
    //etc...

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }    
}
```
---

## 🏛️Quatro Pilares da Orientação a Objetos

Exemplo de implementação dos pilares de POO estão em  - [Autódromo](../exemplos/ExemploPilaresPOO/Autodramo.java)

### 💊Encapsulamento

Nem tudo precisa estar visível, grande pate do algoritmo pode ser distribuído em métodos com finalidades especificas que complementam uma ação na aplicação.

**Exemplo:**
Ligar um veiculo exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição para dar a partida.

---

### 👨‍👩‍👧‍👦Herança

Características e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia de objetos.

**Exemplo:**
Um carro e uma moto possuem propriedades em comum, como placa, chassi, ano de fabricação, cor , métodos para acelerar, frear, etc. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe **Veiculo** para que seja herdada por Carro e Moto.

---

### 🎨Abstração

É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.

**Exemplo:** 
Veiculo determina duas ações como acelerar e frear, logo estes comportamentos deverão ser abstratos pois existem mais de uma maneira de se realizar a mesma operação. (polimorfismo)

---

### 🧬Polimorfismo

São as inúmeras maneiras de se realizar uma mesma ação.

**Exemplo:**
Veiculo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estamos nos referindo a um Carro ou uma Moto para determinar a lógica de aceleração e freagem.

---

## 📱Interfaces

>[!WARNING]
>Não estamos falando de Interfaces Gráficas

Java não permite **Herança Múltipla**, ou seja herdar características de mais de uma classe. 
para isso utilizamos interfaces 
