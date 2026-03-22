# Sistema de Seleção Interestelar

Programa desenvolvido em Java com o objetivo de praticar entrada e saída de dados, formatação de texto e estruturas condicionais.

Este exercício simula um sistema de cadastro de candidatos para uma missão interestelar, coletando informações básicas e validando critérios para participação.

## Objetivo

Criar um programa que receba dados de um candidato e exiba suas informações formatadas, além de validar se ele está apto para os testes físicos com base na idade.

## Conceitos Aplicados

- **Entrada de dados (`Scanner`)**  
Utilizado para capturar informações digitadas pelo usuário, como nome, idade, altura e experiência.

- **Saída de dados formatada (`System.out.printf`)**  
Aplicação de formatação com `%d`, `%f` e `%s` para exibir os dados de forma organizada.

- **Operador ternário (`? :`)**  
Usado para exibir "Sim" ou "Não" com base na experiência do candidato.

- **Estrutura condicional (`if/else`)**  
Responsável por validar se o candidato está dentro da faixa etária permitida.

## Funcionamento

O programa solicita ao usuário:

- Nome completo  
- Idade  
- Altura (em metros)  
- Experiência com drones (true/false)  

Após a coleta, os dados são exibidos de forma organizada no console.

Em seguida, o sistema verifica:

- Se a idade está entre **18 e 45 anos**

Com base nisso, retorna:

- **"Apto para os testes físicos"**  
ou  
- **"Idade fora dos parâmetros da missão"**

## Exemplo de Saída

```text
=== SISTEMA DE SELEÇÃO INTERESTELAR ===
Por favor, insira os dados do candidato:

Nome completo do aspirante: Luan
Idade terrestre: 22
Altura (em metros): 1.75
Possui experiência com pilotagem de drones? (true/false): true

--- PROCESSANDO DADOS DO FICHA ---
Candidato: Luan
Idade: 22 anos | Altura: 1.75 m
Experiência com drones: Sim
Status: Apto para os testes físicos.
----------------------------------------
