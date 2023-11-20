package crackit.qstnset1;

public enum Continents {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    EUROPE,
    AUSTRALIA,
    ANTARCTICA;

    //crackit.qstnset1.Main method in Enums
    public static void main(String[] args) {
        //Looping through enums
        for (Continents continent : Continents.values()) {
            System.out.println(continent);
        }

        //Single enum access
        System.out.println("Single Enum Access :" + Continents.AFRICA);
    }
}


