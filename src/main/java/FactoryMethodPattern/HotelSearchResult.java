package FactoryMethodPattern;

public class HotelSearchResult extends Api {

    public HotelSearchResult(){
        setApiName("Hotel Search Result");
        setApiBaseUrl("Hotel Search Result Base Url");
    }

    public void buildApiBody(){
        System.out.println("Creating Hotel Search Result api body");
    }
}
