package Adv_Java.Enum;

 enum Color {
    RED("red"),Blue("blue"),GREEN("green");
    private String value;
    Color(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
