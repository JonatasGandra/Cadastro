
# Cadastro de Pessoa (Java Swing)

Este projeto é uma aplicação Java utilizando a biblioteca Swing para criar uma interface gráfica (GUI) que permite o cadastro de pessoas físicas ou jurídicas.

## Visão Geral

A interface é composta por um formulário com diversos campos organizados em um layout visualmente amigável, com o uso do `GridBagLayout`, `BoxLayout` e `FlowLayout`.

---

## Estrutura do Código

### Classe Principal

```java
public class CadastroPessoa extends JFrame
```

A classe herda de `JFrame`, que é a janela principal da aplicação Swing.

### Construtor `CadastroPessoa()`

- Define o título, tamanho e posição da janela.
- Cria o painel principal (`painelPrincipal`) com layout `BoxLayout` na vertical.
- Adiciona um título com `JLabel`.

### Painel do Formulário

```java
JPanel form = new JPanel(new GridBagLayout());
```

Utiliza `GridBagLayout` para controle preciso da posição dos componentes.

Cada linha do formulário é construída com componentes como:

- `JLabel`: para os rótulos de campos
- `JTextField`: para entrada de texto
- `JComboBox`: para seleção do tipo de pessoa (Física/Jurídica)
- `JCheckBox`: para indicar se a pessoa é fornecedor
- `JRadioButton`: para a situação (Ativo/Inativo)

#### Campos do Formulário

1. **Tipo de Pessoa**
   - `JComboBox`: seleciona entre "Física" e "Jurídica"

2. **CPF / CNPJ**
   - `JTextField`: campo de texto

3. **Fornecedor**
   - `JCheckBox`: se é fornecedor

4. **Nome**
   - Campo grande (`JTextField` com `gridwidth = 5`)

5. **RG / Inscrição Estadual** e **Órgão Expedidor**
   - Dois campos de texto

6. **E-mail** e **CEP**

7. **País**
   - Campo fixo "BRASIL" com `JLabel`

8. **UF (estado)**, **Município**, **Logradouro**, **Número**, **Complemento**

9. **Bairro** e **Telefone**

10. **Situação**
    - `JRadioButton`: "Ativo" ou "Inativo" (em um `ButtonGroup`)

### Botões

```java
JButton confirmar, excluir, limpar;
```

- **Confirmar**: simula o envio do formulário
- **Excluir**: placeholder para lógica de remoção
- **Limpar**: idealmente limparia os campos (funcionalidade não implementada)

Os botões têm cores personalizadas (laranja e branco) para destacar.

---

## Como executar

1. Compile o código:

```bash
javac CadastroPessoa.java
```

2. Execute:

```bash
java CadastroPessoa
```

---

## Considerações

- O layout é responsivo dentro do `JFrame` fixo de 1200x700.
- Ainda não há validações ou persistência dos dados.
- O design segue uma estética próxima a formulários usados em sistemas administrativos.

---
