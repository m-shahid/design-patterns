package SimpleFactoryPattern;

public class ApiFactory {

    public Api createApi(String apiType){

        Api api = null;

        if(apiType.equalsIgnoreCase("Hotel")){
            api = new HotelApi();
        }else if(apiType.equalsIgnoreCase("car")){
            api = new CarApi();
        }else{
            System.out.println("Please enter valid API name");
        }

        return api;
    }
}
