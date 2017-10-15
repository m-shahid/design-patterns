package AbstractFactoryPattern;

public class AppTest {

    public static void main(String a[]){

        ApiClient apiClient = new HotelApiClient();
        apiClient.getApi("searchinit");
        System.out.println("******************");
        apiClient.getApi("searchstatus");
        System.out.println("******************");

        apiClient = new CarApiClient();
        apiClient.getApi("searchstatus");
        System.out.println("******************");
        apiClient.getApi("searchinit");

    }
}
