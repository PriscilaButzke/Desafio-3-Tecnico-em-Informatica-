Desafio 3- Peso Ideal - Técnico em Informática - Ulbra São Lucas - Sapucaia do Sul

Proposta a ser elaborada: 

Modele uma classe Pessoa conforme situação:

O cálculo do peso ideal é baseado na altura e no sexo da pessoa, conforme as fórmulas:

Peso ideal para Homens: (72.7 * altura) – 58;
Peso ideal para Mulheres: (62.1 * altura) – 44.7;

A classe deve ter também um método que diga se a pessoa está acima, abaixo ou no peso ideal.
Estará “Abaixo do peso” se seu peso atual for menor que o peso ideal -2.
Estará “Acima do peso” se seu peso atual for maior que o peso ideal + 2.
Caso nenhuma das opções acima for verdadeira, estará no peso ideal.

Pessoa
-altura:double
-sexo:int
-pesoAtual:double

+gets e sets
+calcularPesoIdeal():double
+verificarPeso():String
+toString():String


Na classe principal, faça com que o usuário informe a altura, o sexo (escolhendo entre 1 e 2) 
e o seu peso atual, e com base nestas informações o sistema deve exibir o peso ideal e a análise do peso atual da pessoa.

