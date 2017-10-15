package FactoryMethodPattern;

public class HotelSearchInit extends Api {

    public HotelSearchInit(){
        setApiName("Hotel Search Init");
        setApiBaseUrl("Hotel Search Init Base Url");
    }

    public void buildApiBody(){
        System.out.println("Creating Hotel Search init api body");
    }
}
