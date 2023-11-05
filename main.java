import java.util.Scanner;
import java.util.Vector;

class Flight{
    int number;
    int[] seat = new int[200];
    String starting;
    String destination;
    String time;
}


class Passanger{
    String name;
    int age;
    int id;
    String status;
    String password;

    Passanger(){
        status = "unbooked";
    }
}


class FlightGroup{
    static Vector<Flight> fl = new Vector();
    
    void addFlight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight number");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter starting point");
        String starting = sc.nextLine();
        System.out.println("Enter destination");
        String destination = sc.nextLine();
        System.out.println("Enter time");
        String time = sc.nextLine();

        Flight f = new Flight();
        f.number = number;
        f.starting = starting;
        f.destination = destination;
        f.time = time;
        fl.add(f);
    }

    void displayFlights(){
        for(int i=0;i<fl.size();i++){
            System.out.println(fl.get(i).starting + "-> " + fl.get(i).destination);
        }
    }

    void displayFligtsfrom(String starting){
        for(int i=0;i<fl.size();i++){
            if(fl.get(i).starting == starting){
                System.out.println(fl.get(i).destination);
            }
        }
    }

    void displayFlightsTo(String destination){
        for(int i=0;i<fl.size();i++){
            if(fl.get(i).destination == destination){
                System.out.println(fl.get(i).starting);
            }
        }
    }
}


class PassengerGroup{
    static Vector<Passanger> pg = new Vector();

    void addPassengers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();

        Passanger p = new Passanger();
        p.name = name;
        p.age = age;
        p.id = id;
        p.password = password;
        pg.add(p);

    }
    void getPassengers(){
        for(int i=0;i<pg.size();i++){
            System.out.println(pg.get(i).name);
        }
    }
}






public class main {

    int login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();

        for(int i=0;i<PassengerGroup.pg.size();i++){
            if(PassengerGroup.pg.get(i).id == id ){//&& PassengerGroup.pg.get(i).password == password){
                System.out.println("Login successful");
                return id;
            }
        }
        return -1;
    }

    int book(int id){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter flight number");
        int number = sc.nextInt();
        for(int i=0;i<FlightGroup.fl.size();i++){
            if(FlightGroup.fl.get(i).number == number){
                FlightGroup.fl.get(i).seat[id] = 1;
                return 1;
            }
        }
        return -1;
    }

    void addPassengers(){
        PassengerGroup pg = new PassengerGroup();
        pg.addPassengers();
    }

    void addFlights(){
        FlightGroup fg = new FlightGroup();
        fg.addFlight();
    }

    void getFlights(){
        FlightGroup fg = new FlightGroup();
        fg.displayFlights();
    }


    void getPassengers(){
        PassengerGroup pg = new PassengerGroup();
        pg.getPassengers();
    }

    void getFlightsFrom(String starting){
        FlightGroup fg = new FlightGroup();
        fg.displayFligtsfrom(starting);
    }

    void getFlightsTo(String destination){
        FlightGroup fg = new FlightGroup();
        fg.displayFlightsTo(destination);
    }






    public static void main(String[] args) {

        int ch = -1;
        while(ch !=3){
            System.out.println("Welcome to Airline Reservation System");
            System.out.println("1. Login as admin");
            System.out.println("2. Login as passenger");
            System.out.println("3. Exit");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            sc.nextLine();
            if(ch == 1){
                System.out.println("enter password");
                String password = sc.nextLine();
                int ch1;
                while(ch != 5){
                    System.out.println("1. Add flight");
                    System.out.println("2. Get flights");
                    System.out.println("3. Add passenger");
                    System.out.println("4. Get passengers");
                    // System.out.println("5. Get flights from");
                    // System.out.println("6. Get flights to");
                    System.out.println("5. Exit");
                    ch1 = sc.nextInt();
                    if(ch1 == 1){
                        main m = new main();
                        m.addFlights();
                    }
                    else if(ch1 == 2){
                        main m = new main();
                        m.getFlights();
                    }
                    else if(ch1 == 3){
                        main m = new main();
                        m.addPassengers();
                    }
                    else if(ch1 == 4){
                        main m = new main();
                        m.getPassengers();
                    }
                    // else if(ch1 == 5){
                    //     main m = new main();
                    //     System.out.println("Enter starting point");
                    //     String starting = sc.nextLine();
                    //     starting = sc.nextLine();
                    //     m.getFlightsFrom(starting);
                    // }
                    // else if(ch1 == 6){
                    //     main m = new main();
                    //     System.out.println("Enter destination");
                    //     String destination = sc.nextLine();
                    //     m.getFlightsTo(destination);
                    //}
                    else if(ch1 == 5){
                        break;
                    }
                    else{
                        System.out.println("Invalid choice");
                    }
                }
                // else{
                //     System.out.println("Invalid password");
                // }
            }
            else if(ch ==2){
                main m = new main();
                int id = m.login();
                if(id != -1){
                    int ch1 =-1;
                    while(ch1 != 3){
                        System.out.println("1. Book flight");
                        System.out.println("2. Get flights");
                        // System.out.println("3. Get flight from");
                        // System.out.println("4. Get flight to");
                        System.out.println("5. Exit");
                        ch1 = sc.nextInt();
                        sc.nextLine();
                        if(ch1 == 1){
                            m.book(id);
                        }
                        else if(ch1 == 2){
                            m.getFlights();
                        }
                        // else if(ch1 == 3){
                        //     System.out.println("Enter starting point");
                        //     String starting = sc.nextLine();
                        //     m.getFlightsFrom(starting);
                        // }
                        // else if(ch1 == 4){
                        //     System.out.println("Enter destination");
                        //     String destination = sc.nextLine();
                        //     m.getFlightsTo(destination);
                        // }
                        else if(ch1 == 3){
                            break;
                        }
                        else{
                            System.out.println("Invalid choice");
                        }
                    }
                    
                }
        }
        

        }
        
        
    }
}
