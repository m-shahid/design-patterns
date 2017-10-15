package AbstractFactoryPattern;

public class CarApiClient extends ApiClient {
    @Override
    public Api createApi(String type) {

        Api api = null;
        ApiBuilderFactory apiBuilderFactory = new CarApiBuilderFactory();

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
