package Enums;

public enum Size {
    TALL("Большая"),
    SHORT("Маленькая"),
    NORMAL("Нормальная");

    private String title;

    Size(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}