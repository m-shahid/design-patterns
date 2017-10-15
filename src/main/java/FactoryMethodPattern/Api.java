package FactoryMethodPattern;

public abstract class Api {

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    private String apiName;
    private String apiBaseUrl;

    public void buildApiBody(){
        System.out.println("Creating api body");
    }
}
