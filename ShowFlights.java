import java.util.Scanner;
public class ShowFlights {

    static Scanner scanner = new Scanner(System.in);
    static String[] routes = new String[15];
    static String[] routeInfo = new String[15];

    public static String[] getRouteInformation(){
        for(int index = 0; index < 15; index++){
            routes[index] = scanner.nextLine();    
        }
        return routes;
    }
    public static void displayRouteInfo(){
        System.out.print("S.No \t \t"+ " From \t \t"+ " To \t " +" Distance in kms \t" + "Travel time \t "+ "Typical Airfare");
        System.out.println();
        for(int index = 0; index < routes.length; index++){
            String[] getInfo = routes[index].split("[,]", 0);
            System.out.printf("%d \t \t", (index+1));
            for(int j = 0; j < getInfo.length; j++){
                System.out.printf("%s \t \t", getInfo[j]);
            }
            System.out.println();
        }
    }

    public static void showDirectFlights(String[] routeInfo, String fromCity){
        System.out.print("S.No \t \t"+ " From \t \t"+ " To \t " +" Distance in kms \t" + "Travel time \t "+ "Typical Airfare");
        System.out.println();
        for(int i = 0; i < routeInfo.length; i++){
            if(routeInfo[i].contains(fromCity)){
                String[] filterRoute = routeInfo[i].split("[,]", 0);
                for(int j = 0; j < filterRoute.length; j++){
                    System.out.printf("%s \t \t", filterRoute[j]);
                }
            }         
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter route infomation :");
        routeInfo = getRouteInformation();
        displayRouteInfo();
        System.out.println("Enter the departure place : ");
        String departure = scanner.nextLine();
        showDirectFlights(routeInfo, departure);
    }
}
