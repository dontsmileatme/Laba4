package Enums;

public enum Condition {
    NEW("Новая"),
    OLD("Старая");

    private String title;

    Condition(String title) {
            this.title = title;
        }

    public String getTitle(){
            return this.title;
        }

}
