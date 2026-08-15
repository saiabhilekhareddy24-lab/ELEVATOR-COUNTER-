public class ElevatorCounter {
    private int peopleCount;
    private final int maxCapacity;

    public ElevatorCounter(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.peopleCount = 0;
    }

    public boolean enter() {
        if (peopleCount < maxCapacity) {
            peopleCount++;
            return true;
        }
        return false;
    }

    public boolean exit() {
        if (peopleCount > 0) {
            peopleCount--;
            return true;
        }
        return false;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean isFull() {
        return peopleCount == maxCapacity;
    }

    public boolean isEmpty() {
        return peopleCount == 0;
    }
    }
          
