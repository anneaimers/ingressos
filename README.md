# Ingressos (Herança e Polimorfismo)

## Objetivo
Calcular o valor de três modalidades de ingresso usando herança em cadeia
e sobrescrita do método calcularValor().

## Hierarquia
Ingresso → IngressoVip → IngressoCamarote

## Regras de cálculo
- Ingresso: valorBase + R$ 10,00 (taxa de emissão)
- IngressoVip: super.calcularValor() + adicionalVip
- IngressoCamarote: super.calcularValor() + valorReserva

## Classes
- Ingresso: nomeEvento, valorBase, getters, calcularValor()
- IngressoVip: adicionalVip, getAdicionalVip(), calcularValor() com @Override
- IngressoCamarote: valorReserva, getValorReserva(), calcularValor() com @Override
- App: cria os três objetos com referência do tipo Ingresso e imprime os valores

## Saída esperada
Comum: R$ 60,00
VIP: R$ 90,00
Camarote: R$ 130,00

## Conceitos aplicados
extends, super, @Override, polimorfismo por referência da superclasse
