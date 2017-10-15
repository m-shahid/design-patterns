package SimpleFactoryPattern;

import java.util.Scanner;

public class MainClient {

    public static void main(String a[]){

        ApiFactory apiFactory = new ApiFactory();
        Api api = null;
        Scanner userInput = new Scanner(System.in);
        String apiType = null;

        System.out.println("What type of Api you want? (Hotel / Car)");

        if(userInput.hasNextLine()){

            apiType = userInput.nextLine();

        }

        api = apiFactory.createApi(apiType);

        System.out.println(api.getApiName());
        System.out.println(api.getUrl());

    }
}
