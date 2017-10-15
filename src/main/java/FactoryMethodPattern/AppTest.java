package FactoryMethodPattern;

public class AppTest {

    public static void main(String a[]){

        ApiClient apiClient = new HotelApiClient();
        apiClient.getApi("searchinit");

        apiClient = new CarApiClient();
        apiClient.getApi("searchresult");
    }
}
