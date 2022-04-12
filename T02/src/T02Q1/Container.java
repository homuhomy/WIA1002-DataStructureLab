package T02Q1;

public class Container <T>{
    private T t;

    public Container(){
    }

    public void add(T t){
        this.t = t;
    }

    public T retrieve(){
        return t;
    }

}

class Main{
    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>();
        Container<String> stringContainer = new Container<>();

        integerContainer.add(50); //auto-boxing
        stringContainer.add("Java"); //no need casting

        System.out.println("Integer Value : " + integerContainer.retrieve());
        System.out.println("String value: " + stringContainer.retrieve());
    }
}
