package mobile;


    public class Account_details {
        private String account_holder_name;
        private String account_pnone_number;
        private double balance;
        private String pin;





        //    Constructor having pin, name, phone_number  arguments
        public Account_details(String name, String account_pnone_number, String pin){
            account_holder_name = name;
            this.account_pnone_number = account_pnone_number;
            this.pin = pin;
        }


        //    Constructor without pin number  arguments
        //create an account without pin
        public Account_details(String name, String account_pnone_number){
            this.account_holder_name = name;
            this.account_pnone_number = account_pnone_number;
            System.out.println("Wellcome. You created an account successfully ");
        }

        //new customer pin set up
        public void Account_details(String pin) {
            this.pin = pin;
            System.out.println("Your pin set successfully");
        }







        public boolean pin_update(String old_pin, String new_pin){
            if(old_pin == this.pin){
                this.pin = new_pin;
                System.out.println("Pin updated successfully  " + pin_print());
                return true;
            }
            else{
                System.out.println("Old pin does not match. Pin update failed. " );
                return false;
            }
        }
        //for see password
        private String pin_print(){
            String new_pin_info = getAccount_holder_name()+ ", Pin: " + this.pin;
            return new_pin_info;
        }





        public void add_money(double amount){
            balance += amount;
            System.out.println("Add money: " + amount );
        }

        public void cash_out(double amount, String pin){
            if (pin != this.pin){
                System.out.println("Pin does not match");
                return;
            }
            else{
                if (balance >= amount){
                    balance -= amount;
                    System.out.println("Cash out: " + amount);
                }
                else {
                    System.out.println("Failed to cash out due to balance limit");
                }
            }
        }
        public void cheek_balence(String pin)
        {
            if(pin==this.pin)
                System.out.println("Your current balance is " +balance);
             else
                System.out.println("Wrong pin . Input correct pin");
        }





        @Override
        public String toString() {
            return "\nAccount details \n{ " +
                    "Account Holder Name= " + account_holder_name  +
                    ", Pnone Number= " + account_pnone_number + ", Balance= " + balance + "}";
        }

        public String getAccount_holder_name(){
            return this.account_holder_name;
        }

        public String getAccount_pnone_number(){
            return this.account_pnone_number;
        }

        public double getBalance(){
            return this.balance;
        }

    }


