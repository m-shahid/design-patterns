package AbstractFactoryPattern;

public class SearchInit extends Api {

    private ApiBuilderFactory apiBuilderFactory;

    public SearchInit(ApiBuilderFactory apiBuilderFactory){

        setApiName("SearchInit");
        this.apiBuilderFactory = apiBuilderFactory;
    }

    @Override
    public void buildApiBody(String apiType) {

        System.out.println("Creating Search init Api...");
        setBody(apiBuilderFactory.createBody(apiType));
    }
}
