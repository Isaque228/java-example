# Explicação do Código Java

## Elementos Utilizados:

### 1. **Classes**
   - O código define três classes: `Animal`, `Cachorro` e `Gato`.
   - `Animal` é a classe base.
   - `Cachorro` e `Gato` herdam de `Animal`.

### 2. **Objetos**
   - Objetos são criados na classe `Main` usando:
     ```java
     Animal meuCachorro = new Cachorro("DOG_NAME");
     Animal meuGato = new Gato("GATO_NAME");
     ```
   - Aqui, estamos instanciando `Cachorro` e `Gato` como `Animal`.

### 3. **Métodos**
   - `fazerSom()` é um método definido na classe `Animal`.
   - Esse método é sobrescrito nas classes `Cachorro` e `Gato`.
   - É chamado nos objetos criados em `Main`.

### 4. **Herança**
   - `Cachorro` e `Gato` **herdam** de `Animal` usando `extends`.
   - Isso permite que compartilhem atributos e métodos da classe `Animal`.

### 5. **Polimorfismo**
   - O método `fazerSom()` tem diferentes implementações em `Cachorro` e `Gato`.
   - Quando chamamos `meuCachorro.fazerSom();`, ele executa a versão específica do `Cachorro`.
   - Quando chamamos `meuGato.fazerSom();`, executa a versão de `Gato`.
