package FactoryMethodPattern;

public class CarSearchStatus extends Api {

    public CarSearchStatus(){
        setApiName("Car Search Status");
        setApiBaseUrl("Car Search Status Base Url");
    }

    public void buildApiBody(){
        System.out.println("Creating Car Search Status api body");
    }
}
