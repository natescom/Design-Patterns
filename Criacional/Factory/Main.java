
public class Main {
  public static void main(String[] args){
    System.out.println("\tAbstract Factory");
    PizzaStore aStore = new PizzaStore();
    Pizza pizza = aStore.orderPizza("Veggie");
    System.out.println(pizza.name);

    System.out.println("\tFactory Methods");
    PizzaStore2 storeNY = new NYPizzaStore();
    PizzaStore2 storeCG = new CGPizzaStore();

    pizza = storeNY.orderPizza("veggie");
    System.out.println(pizza.name);
    System.out.println();
    pizza = storeCG.orderPizza("veggie");
    System.out.println(pizza.name);
    
  }

}