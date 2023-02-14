# O que é o Strategy
Esse é um padrão que sugere a extração de trechos de código que podem indicar comportamentos distintos para uma mesma classe. Dessa forma cada trecho se torna uma subclasse chamadas de estratégias. 
A classe original colocará no lugar uma interface que generaliza o funcionamento das estratégias, recebendo quando necessário a implementação dela.
# Exemplo
No código, para implementação de um algoritmo de pagamento é conveniente separar as formas de pagamentos em pequenas estratégias enquanto implementam uma interface geral chamada de Pagamento.
Assim na classe Main, antes de processar o pagamento só é necessário instanciar uma das implementações das formas de pagamento.