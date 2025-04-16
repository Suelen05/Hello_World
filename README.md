# Hello World
 
Ótimo, Suelen! Aqui está um **roteiro de apresentação técnico, direto e bem distribuído**, com tempo estimado por slide para manter a apresentação dentro dos 15 minutos.

---

### 🎤 **Slide 2 – Introdução ao Cenário** (≈ 1min)

> “O cultivo de plantas em vasos é uma prática comum, especialmente em ambientes urbanos com espaços limitados. No entanto, manter as condições ideais como irrigação, iluminação e temperatura pode ser um desafio, principalmente devido à rotina acelerada das pessoas. A automação via IoT surge como uma solução viável para monitorar e manter essas variáveis sob controle, de forma precisa e contínua.”

---

### 🎤 **Slide 3 – Objetivo do Projeto** (≈ 1min)

> “O principal objetivo deste projeto é desenvolver um sistema embarcado capaz de monitorar as principais variáveis ambientais que influenciam diretamente na saúde das plantas. Entre elas: temperatura, umidade do solo, umidade do ar, intensidade luminosa e pH do solo. Os dados são exibidos localmente e também enviados para uma plataforma na nuvem, permitindo acompanhamento remoto.”

---

### 🎤 **Slide 4 – Justificativa** (≈ 1min)

> “Muitas plantas morrem por falta de cuidado ou desconhecimento sobre as condições ideais. A aplicação de IoT nesse cenário permite leituras em tempo real e facilita a tomada de decisão, reduzindo o risco de estresse hídrico ou excesso de luminosidade. Além disso, soluções como essa são acessíveis, sustentáveis e replicáveis, atendendo tanto a hobbystas quanto à agricultura urbana de pequeno porte.”

---

### 🎤 **Slide 5 – Visão Geral da Solução** (≈ 1min)

> “A arquitetura do sistema utiliza o Arduino Uno como unidade de controle principal, com sensores conectados para coleta de dados. O RTC garante a precisão temporal dos registros. O display LCD permite a visualização local, enquanto o módulo ESP8266 é responsável por enviar os dados via protocolo HTTP para a nuvem, utilizando a plataforma ThingSpeak como interface de visualização.”

---

### 🎤 **Slide 6 – Diagrama do Sistema** (≈ 1min)

> “Aqui podemos observar o diagrama do sistema, que representa as conexões entre os sensores, o microcontrolador, o módulo de tempo e o módulo de comunicação. As setas indicam o fluxo de dados e o processo de monitoramento, que vai desde a aquisição, passa pelo processamento e termina na visualização remota.”

---

### 🎤 **Slide 6 – Protótipo Físico** (≈ 1min)

> “Essa é a montagem ilustrativa do protótipo na protoboard. Podemos ver  a disposição dos sensores ao redor do Arduino Uno, bem como a conexão com o módulo RTC, o display LCD e o LED de alerta. Essa configuração permite testes modulares e ajustes fáceis durante o desenvolvimento.”

---

### 🎤 **Slide 7 – Hardware Utilizado** (≈ 1min)

> “O hardware foi escolhido com base em custo, disponibilidade e compatibilidade. O Arduino Uno é uma plataforma consolidada. O DHT22 fornece dados confiáveis de temperatura e umidade. O sensor capacitivo de umidade do solo é mais durável do que os resistivos. O sensor de pH permite avaliar a acidez do substrato, fator crucial para muitas espécies. E o ESP8266 viabiliza a conexão com a internet sem necessidade de hardware adicional.”

---

### 🎤 **Slide 7 – Software Utilizado** (≈ 1min)

> “A programação foi realizada na IDE do Arduino, com bibliotecas específicas para os sensores e módulos. A comunicação com a nuvem foi feita via protocolo HTTP utilizando o ESP-01. A plataforma ThingSpeak foi escolhida por ser gratuita, com integração direta ao Arduino e por permitir a criação de dashboards com visualização gráfica em tempo real.”

---

### 🎤 **Slide 8 – Benefícios da Solução** (≈ 1min)

> “Entre os principais benefícios estão a praticidade no cuidado com plantas, economia de água ao evitar regas desnecessárias e a possibilidade de expansão para automação da irrigação. O sistema é de baixo custo, fácil montagem e escalável para múltiplos vasos ou até estufas.”

---

### 🎤 **Slide 8 – Considerações Finais** (≈ 1min)

> “O protótipo atendeu aos requisitos propostos, demonstrando a viabilidade de integrar sensores com coleta local e transmissão para a nuvem. Como trabalhos futuros, pode-se incluir notificações inteligentes e integração com atuadores para irrigação automatizada. O projeto mostra como a IoT pode ser aplicada para promover práticas mais sustentáveis e eficientes na jardinagem doméstica.”

---

### ⏱️ **Tempo estimado total: ~10 minutos**
