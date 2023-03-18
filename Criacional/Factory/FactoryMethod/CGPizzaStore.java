public class CGPizzaStore extends PizzaStore2 {

    @Override
    protected Pizza createPizza (String item){
        if (item.equals ("cheese"))
        return new CGStylecheesepizza();
        else if (item.equals ("veggie")) 
        return new CGStyleveggiePizza();
        else return null;
    }
    
}