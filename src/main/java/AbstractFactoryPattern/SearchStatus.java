package AbstractFactoryPattern;

public class SearchStatus extends Api {

    private ApiBuilderFactory apiBuilderFactory;

    public SearchStatus(ApiBuilderFactory apiBuilderFactory){

        setApiName("SearchStatus");
        this.apiBuilderFactory = apiBuilderFactory;
    }

    @Override
    public void buildApiBody(String apiType) {

        System.out.println("Creating Search Status Api...");
        setBody(apiBuilderFactory.createBody(apiType));
    }
}
