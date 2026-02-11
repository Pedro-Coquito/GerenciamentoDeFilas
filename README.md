# 📋 Gerenciamento de Filas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-3.9+-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

Sistema robusto de gerenciamento e organização de filas de atendimento, desenvolvido com as versões mais recentes do ecossistema Java. O projeto foca em escalabilidade e organização de fluxo para ambientes de alto tráfego.

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java 21 (LTS) 
- **Framework:** Spring Boot 3.5.5.
- **Gerenciador de Dependências:** Maven.
- **Arquitetura:** REST API (ou MVC dependendo da implementação).

## 🚀 Funcionalidades

- **Geração Dinâmica de Senhas:** Emissão de tickets com IDs únicos.
- **Priorização Inteligente:** Lógica para intercalar atendimentos preferenciais e convencionais.
- **Painel de Monitoramento:** Interface para acompanhamento em tempo real das chamadas.
- **Gestão de Atendentes:** Endpoints/Interfaces para que múltiplos atendentes processem a fila simultaneamente.

## 📦 Como rodar o projeto

### Pré-requisitos
* Java 21 instalado.
* Maven 3.9+ instalado.

### Instalação
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Pedro-Coquito/GerenciamentoDeFilas.git](https://github.com/Pedro-Coquito/GerenciamentoDeFilas.git)
```

## 🏗️ Estrutura do Projeto
O projeto segue os princípios da Programação Orientada a Objetos (POO):

Modelo: Classes que representam a Senha e a Fila.

Visão: Interfaces gráficas para o cliente e para o atendente.

Controle: Lógica que gerencia a transição das senhas entre a espera e o atendimento.

## 📝 Licença
Este projeto é para fins de estudo. Sinta-se à vontade para usá-lo e modificá-lo.

Desenvolvido por Pedro Coquito 🚀
