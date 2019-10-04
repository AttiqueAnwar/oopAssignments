public class Main {
    public static void main(String[] args) {
        TicketMachine machine = new TicketMachine(80, 20);
        int result = machine.getPrice();
        System.out.println(result);
        machine.insertMoney(120);
        int result1 = machine.getBalance();
        machine.insertMoney(60);
        int result2 = machine.getBalance();
        machine.insertMoney(20);
        int result3 = machine.getBalance();
        machine.printTicket();
        int result4 = machine.getBalance();
        machine.insertMoney(100);
        machine.printTicket();

        TicketMachine machine1 = new TicketMachine(100, 30);
        int result6 = machine1.getPrice();
        machine1.insertMoney(60);
        int result7 = machine1.getBalance();
        machine1.printTicket();
    }
}