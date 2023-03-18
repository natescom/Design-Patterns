public class NYPizzaStore extends PizzaStore2 {

    @Override
    protected Pizza createPizza (String item){
        if (item.equals ("cheese"))
        return new NYStylecheesepizza();
        else if (item.equals ("veggie")) 
        return new NYStyleveggiePizza();
        else return null;
    }
    
}



