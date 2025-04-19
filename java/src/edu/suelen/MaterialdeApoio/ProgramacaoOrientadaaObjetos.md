# **Programação Orientada a objetos**

## 📚Classes

- **Classe de modelo (model):** Classes que representem estrutura de dominio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc...
- **Classe de Serviço (service):** Classes que contém regras de negócio e validação de nosso sistema. Só a service respectiva se comunica com a sua repository. Essa separação é de arquitetura e de segurança
- **Classe de repositório (repository):** Classes que contém uma integração com banco de dados.
- **Classes de controle (controller):** Classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.
- **Classe utilitária (util):** Classe que contém recursos comuns à toda a aplicação.

![Classes](classes.png)

---

## 📦Pacotes

### 1. 📄Nomeclaturas

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
- nome proprio

Exemplo: 

com.controle.acesso.model.Usuario

---

## 🤼‍♀️Package VS Import

**Package** = Localização de uma classe, sempre na primeira linha do código.

**Import** = Utilização de uma classe existente em outro pacote.

---

## 👁️Visibilidade

1. **Public:** Visivel para qualquer outra classe, em qualquer pacote.
2. **Default:** Restringe a visibilidade por pacotes.
3. **Private:** Apenas a classe tem acesso; 

