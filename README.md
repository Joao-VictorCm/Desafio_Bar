# 🥂 DESAFIO: Bar OO

## 📌 Descrição do problema

O desafio “Bar OO” consiste em criar um programa que calcule a conta de um cliente em um bar usando **orientação a objetos** (OO) e **membros estáticos**.

O programa deve ler dados do cliente (sexo e quantidade de consumos) e gerar um relatório completo com:

* Consumo
* Couvert artístico (ou isento)
* Ingresso
* Valor total a pagar

---

## 💰 Preços no Bar

| Item               | Preço Unitário |
| ------------------ | -------------- |
| Ingresso Masculino | R$ 10,00       |
| Ingresso Feminino  | R$ 8,00        |
| Cerveja            | R$ 5,00        |
| Refrigerante       | R$ 3,00        |
| Espetinho          | R$ 7,00        |
| Couvert Artístico  | R$ 4,00        |

> **Observação:** o couvert artístico é **isento se o consumo ultrapassar R$ 30,00**.

---

## 🏗️ Estrutura do Projeto

```
application/
├── Program.java   // Classe principal que lê entradas e gera o relatório
└── Bill.java      // Classe com métodos estáticos para cálculos
```

---

## 🔹 Classe Program.java

Responsável por:

* Ler dados do cliente (`sexo`, quantidade de cervejas, refrigerantes e espetinhos)
* Chamar métodos da classe `Bill` para calcular:

  * Consumo (`feeding`)
  * Couvert artístico (`cover`)
  * Valor do ingresso (`ticket`)
  * Valor total (`total`)
* Exibir o relatório no console

```java
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

System.out.print("Sexo (M ou F): ");
Bill.gender = sc.next().charAt(0);
System.out.print("Quantidade de cervejas: ");
Bill.beer = sc.nextInt();
System.out.print("Quantidade de refrigerantes: ");
Bill.softDrink = sc.nextInt();
System.out.print("Quantidade de espetinhos: ");
Bill.barbecue = sc.nextInt();
```

---

## 🔹 Classe Bill.java

Classe utilitária com **métodos estáticos**:

1. **`feeding(int beer, int barbecue, int softDrink)`**
   Calcula o total do consumo:

   ```java
   return (beer * 5) + (barbecue * 7) + (softDrink * 3);
   ```

2. **`ticket(char gender)`**
   Retorna o valor do ingresso:

   ```java
   if(gender == 'M') return 10.0; else return 8.0;
   ```

3. **`cover(double feeding)`**
   Calcula o couvert artístico:

   ```java
   if(feeding > 30.0) return 0.0; else return 4.0;
   ```

4. **`total(double feeding, double ticket, double cover)`**
   Calcula o valor total da noite:

   ```java
   return feeding(beer, barbecue, softDrink) + ticket + cover(feeding);
   ```

> Todos os métodos e atributos são **estáticos**, permitindo chamadas diretas sem criar instâncias.

---

## 🔄 Fluxo de cálculo

1. **Ler entradas do cliente**: sexo, cervejas, refrigerantes, espetinhos
2. **Calcular consumo**: `consumo = feeding(beer, barbecue, softDrink)`
3. **Calcular couvert artístico**:

   * Se `consumo > 30` → Couvert = 0
   * Caso contrário → Couvert = 4
4. **Calcular ingresso**: `ticket(gender)`
5. **Somar tudo**: `total = consumo + ingresso + couvert`
6. **Exibir relatório completo**:

```
RELATÓRIO
Consumo = R$ 32.0
Isento de Couvert
Ingresso = R$ 10.0
Valor a pagar = R$ 42.0
```

---

## 💻 Como executar

1. Abra o projeto no Eclipse (ou outra IDE Java)
2. Compile as classes `Program.java` e `Bill.java`
3. Execute a classe **`Program`**
4. Digite as entradas solicitadas
5. Confira o relatório gerado no console

---

## 📌 Observações

* O projeto **não utiliza módulo (`module-info.java`)**, apenas classes Java tradicionais.
* A lógica de cálculos está isolada na classe `Bill`, tornando o código **organizado e reutilizável**.
* Todos os métodos usam **membros estáticos**, reforçando a prática de **programação orientada a objetos simplificada**.

---

## 📂 Referência

* Problema baseado no desafio **“Bar” do módulo de Lógica de Programação**.
