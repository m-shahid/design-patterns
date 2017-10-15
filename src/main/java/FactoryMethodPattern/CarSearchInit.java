package FactoryMethodPattern;

public class CarSearchInit extends Api {

    public CarSearchInit(){
        setApiName("Car Search Init");
        setApiBaseUrl("Car Search Init Base Url");
    }

    public void buildApiBody(){
        System.out.println("Creating Car Search init api body");
    }
}
