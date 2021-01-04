package mobile;

public class Customer_details {
    public void customer_programe()
    {
        String sakib_pin = "1234";
        String sheam_pin = "4321";
        String new_customer_pin = "1122";
        Account_details Sakib = new Account_details("Sakib", "01707502276", sakib_pin);
        Account_details sheam = new Account_details("Sheam", "01521786812", sheam_pin);


        System.out.println(Sakib);
        Sakib.add_money(1500);
        Sakib.add_money(2000);
            Sakib.cash_out(1600, sakib_pin);
             Sakib.cash_out(2500, sakib_pin);
        Sakib.cheek_balence(sakib_pin);
                sakib_pin = Sakib.pin_update("1234","1122") ? "1122" : sakib_pin;



        System.out.println(sheam);
                 sheam.add_money(2000);
        sheam.cash_out(1200, sheam_pin);
        sheam_pin = sheam.pin_update("1234","1267")?"1267" : sheam_pin;
          //toString function . print customer details




        //create account without pin
        Account_details new_customer = new Account_details("Sykot" , "01920977868");

        new_customer.Account_details(new_customer_pin);             //pin setup
                  System.out.println(new_customer);
        new_customer.add_money(1200);
        new_customer.cash_out(1000, new_customer_pin);
        new_customer.cheek_balence(new_customer_pin);



    }
}



