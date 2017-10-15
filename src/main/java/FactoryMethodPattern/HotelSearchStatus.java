package FactoryMethodPattern;

public class HotelSearchStatus extends Api {

    public HotelSearchStatus(){
        setApiName("Hotel Search Status");
        setApiBaseUrl("Hotel Search Status Base Url");
    }

    public void buildApiBody(){
        System.out.println("Creating Hotel Search Status api body");
    }
}
