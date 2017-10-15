package AbstractFactoryPattern;

public class CarApiBuilderFactory implements ApiBuilderFactory {
    @Override
    public Body createBody(String apiType) {

        if(apiType.equalsIgnoreCase("searchinit")){

            return new CarSearchInit();

        }else if(apiType.equalsIgnoreCase("searchstatus")){

            return new CarSearchStatus();

        }else{

            return null;

        }
    }
}
