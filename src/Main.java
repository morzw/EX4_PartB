import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Object> systemObjects; //holds all objects in the system

    public static void main(String[] args) {

        // initial the park
        ePark ePark = new ePark();

        // initial 3 devices
        Device mambaRide = new ExtremeDevice("Mamba Ride", 20, 12, 1.4, 0);
        Device giantWheel = new Device("Giant Wheel", 20, 0, 0, 0);
        Device carrousel = new Device("Carrousel", 20, 8, 0, 0);

        systemObjects = new ArrayList<>();
        systemObjects.add(mambaRide);
        systemObjects.add(giantWheel);
        systemObjects.add(carrousel);

        // initial 3 devices to the park
        ePark.addDevice(mambaRide.getID(), mambaRide);
        ePark.addDevice(giantWheel.getID(), giantWheel);
        ePark.addDevice(carrousel.getID(), carrousel);

        systemObjects.add(ePark);

        // initial guardian
        Guardian guardian = new Guardian("1");
        guardian.setSystem(new Application());
        guardian.getSystem().setGuardian(guardian);
        guardian.getSystem().setePark(ePark);
        guardian.setWebsite(new Website());
        guardian.getWebsite().setGuardian(guardian);
        guardian.getWebsite().setePark(ePark);


        systemObjects.add(guardian);
        systemObjects.add(guardian.getWebsite());
        systemObjects.add(guardian.getSystem());

        // Main Menu
        System.out.println("Welcome to ePark Main Menu!\nPlease select one of the following options:");
        String action = "";
        while (action != "exit") {
            System.out.println("For Register child enter register");
            System.out.println("For Manage ticket enter manageTicket <child_name>,  e.g., manageTicket Mor");
            System.out.println("For Exit park enter exitPark");
            System.out.println("For Exit enter exit");
            Scanner in = new Scanner(System.in);
            action = in.nextLine();
            String originAction = action;
            action = action.toLowerCase();
            String childName = "";
            if (action.contains("manageticket")) {
                childName = originAction.substring(13);
                action = "manageticket";
            }
            switch (action) {
                case "register":
                    String input = "y";
                    while (input.equals("y")) {
                        System.out.println("enter child name:");
                        String name = in.nextLine();
                        System.out.println("enter child weight:");
                        double weight = in.nextDouble();
                        System.out.println("enter child height:");
                        double height = in.nextDouble();
                        System.out.println("enter child age:");
                        int age = in.nextInt();
                        Child child = new Child(name, "1234", age, 5, height, weight);
                        guardian.addChildren(child);
                        systemObjects.add(child);
                        systemObjects.add(child.geteTicket());
                        systemObjects.add(child.geteTicket().geteBracelet());
                        System.out.println("to register another child press y");
                        input = in.next();
                    }
                    System.out.println("enter credit card number:");
                    int creditCardNumber = in.nextInt();
                    System.out.println("enter credit card password(int):");
                    int creditCardPassword = in.nextInt();
                    CreditCard creditCard = new CreditCard(creditCardNumber, creditCardPassword);
                    systemObjects.add(creditCard);
                    System.out.println("enter account limit:");
                    double limit = in.nextDouble();
                    guardian.setAccount(new Account(limit, 0));
                    systemObjects.add(guardian.getAccount());
                    break;
                case "manageticket":
                    manageTicketMenu(guardian ,childName);
                    break;
                case "exitpark":
                    System.out.println("enter child name to remove");
                    String name = in.next();
                    Child child = guardian.exitPark(name);
                    systemObjects.remove(child);
                    systemObjects.remove(child.geteTicket().geteBracelet());
                    systemObjects.remove(child.geteTicket());
                    break;
                case "exit":
                    systemObjects.clear();
                    System.out.println("GoodBye! Hope to see you soon :)");
                    return;
                default:
                    System.out.println("Oops! something went wrong.. Please enter your input again");
            }
        }
    }

    // manage ticket menu
    private static void manageTicketMenu(Guardian guardian, String childName) {
//        System.out.println("Welcome to Manage ticket!\nPlease enter the child name from the list for whom you would like to manage the e-Ticket");
        System.out.println("Welcome to Manage e-Ticket for: " + childName);
        String manageTicketAction = "";
        String rideToAdd = "";
        String rideToRemove = "";
        while (manageTicketAction != "exitmenu") {
            System.out.println("Please select one of the following options:");
            System.out.println("For adding a ride enter Add");
            System.out.println("For removing a ride enter Remove");
            System.out.println("For resuming enter exitMenu");
            Scanner in = new Scanner(System.in);
            manageTicketAction = in.nextLine();
//            String originManageTicketAction = manageTicketAction;
            manageTicketAction = manageTicketAction.toLowerCase();
//            if (manageTicketAction.contains("add")) {
//                rideToAdd = originManageTicketAction.substring(4);
//                manageTicketAction = "add";
//            }
//            if (manageTicketAction.contains("remove")) {
//                rideToRemove = originManageTicketAction.substring(7);
//                manageTicketAction = "remove";
//            }
            switch (manageTicketAction) {
                case "add":
                    System.out.println("Please choose a ride to add:");
                    guardian.getSystem().getDevicesForChild(guardian.getChildren().get(childName));
                    Scanner name = new Scanner(System.in);
                    String rideName = name.nextLine();
                    if (guardian.getSystem().ePark.getDevices().get(rideName).isExtreme()){
                        System.out.println("Do you allow extreme ride? Y/N");
                    }
                    //TODO: show the list of possible rides
                    //TODO: add ride
//                    Guardian guardian = signIn(e_park);
//
//                    if(guardian!=null) {
//                        allObjects.add(guardian);
//                        mainMenu(e_park, guardian);
//                    }
                    break;
                case "remove":
                    //TODO: show the child list of rides
                    //TODO: remove ride
//                    Guardian guardian2 = logIn(e_park);
//                    if(guardian2!=null) {
//                        mainMenu(e_park, guardian2);
//                    }
                    break;
                case "exitmenu":
                    return;
                default:
                    System.out.println("Oops! something went wrong.. Please enter your input again");
            }
        }
    }
}