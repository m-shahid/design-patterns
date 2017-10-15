package AbstractFactoryPattern;

public class HotelApiBuilderFactory implements ApiBuilderFactory {
    @Override
    public Body createBody(String apiType) {

        if(apiType.equalsIgnoreCase("searchinit")){

            return new HotelSearchInit();

        }else if(apiType.equalsIgnoreCase("searchstatus")){

            return new HotelSearchStatus();

        }else{

            return null;

        }

    }
}
