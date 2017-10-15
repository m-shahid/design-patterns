package FactoryMethodPattern;

public class HotelApiClient extends ApiClient {
    @Override
    public Api createApi(String type) {

        if(type.equalsIgnoreCase("searchinit")){
            return new HotelSearchInit();
        }else if(type.equalsIgnoreCase("searchstatus")){
            return new HotelSearchStatus();
        }else if(type.equalsIgnoreCase("searchresult")){
            return new HotelSearchResult();
        }else{
            System.out.println("Please enter valid api name");
            return null;
        }
    }
}
