public class Main {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("My favorite season is " + myFavoriteSeason.getSeasonName() + " with an average temperature of " + myFavoriteSeason.getAvgTemperature() + "°C.");

        printSeasonInformation(myFavoriteSeason);

        System.out.println("\nAll seasons:");
        for (Season season : Season.values()) {
            System.out.println("- " + season.getSeasonName() + " with an average temperature of " + season.getAvgTemperature() + "°C and is a " + season.getDescription() + ".");
        }
    }

    public static void printSeasonInformation(Season season) {
        System.out.println("I love " + season.getSeasonName().toLowerCase() + "!");
    }
}