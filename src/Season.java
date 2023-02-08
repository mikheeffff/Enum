public enum Season {
    WINTER("Winter", -10),
    SPRING("Spring", 5),
    SUMMER("Summer", 20),
    AUTUMN("Autumn", 15);

    private final String seasonName;
    private final int avgTemperature;

    Season(String seasonName, int avgTemperature) {
        this.seasonName = seasonName;
        this.avgTemperature = avgTemperature;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDescription() {
        return switch (this) {
            case SUMMER -> "Warm season";
            case AUTUMN -> "Slightly warm season";
            case SPRING -> "Cool season";
            case WINTER -> "Cold season";
        };
    }
}
