public class ChocolateBoiler {
  private static ChocolateBoiler uniqueInstance;
  private boolean empty;
  private boolean boiled;

  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  public static synchronized ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();
    }
    return uniqueInstance
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