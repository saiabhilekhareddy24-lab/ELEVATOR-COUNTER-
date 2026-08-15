public class ElevatorCounterTest {

    public static void main(String[] args) {

        ElevatorCounter elevator = new ElevatorCounter(5);

        System.out.println("=================================");
        System.out.println("      ELEVATOR COUNTER TEST");
        System.out.println("=================================");

        // Person 1 enters
        elevator.enter();
        System.out.println("Person enters  -> Count: "
                + elevator.getPeopleCount());

        // Person 2 enters
        elevator.enter();
        System.out.println("Person enters  -> Count: "
                + elevator.getPeopleCount());

        // Person 3 enters
        elevator.enter();
        System.out.println("Person enters  -> Count: "
                + elevator.getPeopleCount());

        // Person 4 enters
        elevator.enter();
        System.out.println("Person enters  -> Count: "
                + elevator.getPeopleCount());

        // Person 5 enters
        elevator.enter();
        System.out.println("Person enters  -> Count: "
                + elevator.getPeopleCount());

        // Try to add another person
        if (!elevator.enter()) {
            System.out.println("Person enters  -> DENIED (Elevator FULL)");
        }

        // Person exits
        elevator.exit();
        System.out.println("Person exits   -> Count: "
                + elevator.getPeopleCount());

        // Another person exits
        elevator.exit();
        System.out.println("Person exits   -> Count: "
                + elevator.getPeopleCount());

        // Check status
        System.out.println("---------------------------------");
        System.out.println("Current Count  : "
                + elevator.getPeopleCount());
        System.out.println("Maximum Capacity: "
                + elevator.getMaxCapacity());
        System.out.println("Elevator Full  : "
                + elevator.isFull());
        System.out.println("Elevator Empty : "
                + elevator.isEmpty());
        System.out.println("=================================");
    }
}
