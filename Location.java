package Enums;

public enum Location {
    FREEPLACE("свободное место"),
    ALONGTHETREES("среди деревьев"),
    NEST("гнездо");

    private String title;

    Location(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}