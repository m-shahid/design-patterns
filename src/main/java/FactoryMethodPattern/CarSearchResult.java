package FactoryMethodPattern;

public class CarSearchResult extends Api {

    public CarSearchResult(){
        setApiName("Car Search Result");
        setApiBaseUrl("Car Search Result Base Url");
    }

    public void buildApiBody(){
        System.out.println("Creating Car Search Result api body");
    }
}
