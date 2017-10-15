package AbstractFactoryPattern;

public abstract class ApiClient {

    Api api = null;

    public Api getApi(String type){

        api = createApi(type);
        System.out.println(api.getApiName());
        api.buildApiBody(type);
        //System.out.println(api.getApiBaseUrl());
        //api.buildApiBody();

        return api;
    }

    public abstract Api createApi(String type);
}
