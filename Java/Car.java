class Car{
        Integer id;
        String License;
        Account driver;
        Integer Passenger;

        public Car(String license, Account driver){
                this.License=license;
                this.driver=driver;

        }
        void printDatacar(){
                System.out.println("License: " + License + "Driver:" + driver.name);
        }
}