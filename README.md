# Task Manager API 🚀

Uma API REST minimalista construída com **Spring Boot** para gerenciamento de tarefas simples. O projeto foca na manipulação de dados em memória e serialização JSON customizada.

## ✨ Funcionalidades

- **Listagem de Tarefas:** Recupera todas as tarefas armazenadas em formato JSON.
- **Criação de Tarefas:** Adiciona novas strings à lista de tarefas via requisição.
- **Limpeza de Dados:** Remove todas as tarefas da lista instantaneamente.

## 🛠️ Tecnologias

- **Java 17+**
- **Spring Boot 3.x**
- **Jackson Databind** (Manipulação de JSON)
- **Maven** (Gerenciamento de dependências)

## 🔌 Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/tasks` | Retorna a lista de tarefas. |
| `POST` | `/tasks` | Adiciona uma nova tarefa (enviar texto no Body). |
| `DELETE` | `/tasks` | Limpa toda a lista de tarefas. |

## 🚀 Como usar

1. Clone o repositório:
```bash
   git clone [https://github.com/seu-usuario/testeapi.git](https://github.com/seu-usuario/testeapi.git)

