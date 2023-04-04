# Singleton
Esse padrão restringe a instância de uma classe a um único objeto. 
## Caracteristicas
- Construtor Privado

# Desafio - Fabrica de Chocolate
### Fonte: Use a cabeça - Padrões de projeto
Todo mundo sabe que todas as fåbricas de chocolate modernas têm caldeiras de chocolate controladas
por computadores. A tarefa da caldeira é pegar chocolate e leite, colocá-los em ebulição e passá-los
para a próxima fase da fabricação de barras de chocolate.

Esta é a classe controladora para a Caldeira de Chocolate industrial da Choc-O-Holic, Inc. Veja
o código, você irá notar que eles tentaram tomar cuidado para evitar que coisas ruins acontecessem,
como drenar 500 galőes de mistura não-fervida ou encher a caldeira quando ela já está cheia ou
ferver uma caldeira vazia!

Altere o algoritmo abaixo para usar o padrão Singleton

```
public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  public ChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
      // preencha a caldeira com uma mistura de leite e chocolate
    }
  }

  public void drain(){
    if (!isEmpty() && isBoiled()){
      // drena o leite e chocolate fervido
      empty = true;
    }
  }

  public boolean isEmpty(){
    return empty;
  }

  public boolean isBoiled(){
    return boiled;
  }

}
```
