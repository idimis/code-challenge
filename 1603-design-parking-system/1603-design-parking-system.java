class ParkingSystem {
    // Variables to store the number of available parking slots for each car type
    private int bigSlots;
    private int mediumSlots;
    private int smallSlots;

    // Constructor to initialize the parking system with given slots for each car type
    public ParkingSystem(int big, int medium, int small) {
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;
    }

    // Method to add a car to the parking system
    public boolean addCar(int carType) {
        // Check the type of car and attempt to park it
        switch (carType) {
            case 1: // Big car
                if (bigSlots > 0) { // Check if there's an available slot
                    bigSlots--; // Park the car and decrease the slot count
                    return true; // Successfully parked
                }
                break;
            case 2: // Medium car
                if (mediumSlots > 0) { // Check if there's an available slot
                    mediumSlots--; // Park the car and decrease the slot count
                    return true; // Successfully parked
                }
                break;
            case 3: // Small car
                if (smallSlots > 0) { // Check if there's an available slot
                    smallSlots--; // Park the car and decrease the slot count
                    return true; // Successfully parked
                }
                break;
            default:
                return false; // Invalid car type
        }
        return false; // No available slot for the given car type
    }
}

