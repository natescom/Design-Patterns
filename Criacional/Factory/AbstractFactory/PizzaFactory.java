public abstract class PizzaFactory {
    
    public static Pizza createPizza(String type){
        if(type.equals("Pepperoni"))
        return new PizzaPepperoni();
        if(type.equals("Veggie"))
        return new PizzaVeggie();
        else
        return new PizzaMozzarela();
    }
}
