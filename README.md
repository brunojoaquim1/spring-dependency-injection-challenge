📝 Order & Shipping Service
🚀 Desafio do curso Java Spring Professional — DevSuperior (Professor Nélio Alves)

📌 Tema: Componentes e Injeção de Dependência

📖 Sobre o desafio

Implementar dois serviços (OrderService e ShippingService) que trabalham em conjunto para calcular o valor final de um pedido, aplicando regras de negócio isoladas:

ShippingService → responsável por calcular o frete a partir do valor básico do pedido.

OrderService → responsável por aplicar o desconto no pedido, somar ao frete e retornar o valor total.

👉 O objetivo principal foi exercitar componentização e injeção de dependência no Spring, entendendo como dividir responsabilidades entre classes sem acoplamento excessivo.

⚙️ Regras de negócio
ShippingService — cálculo de frete

Abaixo de 100.00 → frete = 20.00

De 100.00 até 200.00 → frete = 12.00

A partir de 200.00 → frete = 0.00

OrderService — cálculo total
total = (valor básico - desconto) + frete 

🛠️ Tecnologias utilizadas

Java 17+

Spring Boot

Injeção de Dependência (@Service, @Autowired/Construtor)

📂 Estrutura do projeto
src
 └── main
      └── java
           └── com.example.demo
                ├── domain
                │     └── Order.java
                └── service
                      ├── OrderService.java
                      └── ShippingService.java

💡 Conceitos praticados

Separação de responsabilidades entre classes

Criação de componentes Spring com @Service

Injeção de dependência por construtor

Evitar estado em beans singleton

Boas práticas de design (cohesão e baixo acoplamento)
