
public class PizzaStore {

    public PizzaStore() {
    }
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
