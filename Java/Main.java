class Main{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera","AND123"));     
        car.Passenger=4;
        car.printDatacar();

        Car car2 =new Car("QWE123", new Account("Eduardo Rodriguez", "ANDA123"));
        car2.Passenger=3;
        car2.printDatacar();

    }
}