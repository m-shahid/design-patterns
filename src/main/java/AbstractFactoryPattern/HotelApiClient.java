package AbstractFactoryPattern;

public class HotelApiClient extends ApiClient {
    @Override
    public Api createApi(String type) {

        Api api = null;
        ApiBuilderFactory apiBuilderFactory = new HotelApiBuilderFactory();

        if(type.equalsIgnoreCase("searchinit")){

            api = new SearchInit(apiBuilderFactory);

        }else if(type.equalsIgnoreCase("searchstatus")){

            api = new SearchStatus(apiBuilderFactory);

        }else{

            System.out.println("Please selet valid api");

        }

        return api;
    }
}
