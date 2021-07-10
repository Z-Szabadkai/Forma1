package module;

public enum Team {

    MERCEDES("Mercedes"),
    FERRARI("Ferrari"),
    RED_BULL("Red Bull Racing"),
    ALPINE("Alpine"),
    WILLIAMS("Williams");

    private String text;

    Team(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static Team fromString(String text) {
        for (Team t : Team.values()) {
            if (t.text.equals(text)) {
                return t;
            }
        }
        return null;
    }
}
