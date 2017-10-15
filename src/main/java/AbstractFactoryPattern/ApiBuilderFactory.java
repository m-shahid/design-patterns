package AbstractFactoryPattern;

public interface ApiBuilderFactory {

    public Body createBody(String apiType);
}
