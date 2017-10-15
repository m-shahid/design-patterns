package FactoryMethodPattern;

public class CarApiClient extends ApiClient {
    @Override
    public Api createApi(String type) {

        if(type.equalsIgnoreCase("searchinit")){
            return new CarSearchInit();
        }else if(type.equalsIgnoreCase("searchstatus")){
            return new CarSearchStatus();
        }else if(type.equalsIgnoreCase("searchresult")){
            return new CarSearchResult();
        }else{
            System.out.println("Please enter valid api name");
            return null;
        }
    }
}
