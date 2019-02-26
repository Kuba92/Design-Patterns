package co.devfoundry.designpatterns.flyweight.pieces;

public abstract class ChessPiece {

    private String name;

    private String numberPosition;

    private String letterPosition;

    private Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black" : {
                this.color = ColorRepository.getBlack();
                break;
            } case "white" : {
                this.color = ColorRepository.getWhite();
                break;
            } default: {
                throw new IllegalArgumentException("Wrong color!");
            }
        }
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "name='" + name + '\'' +
                ", numberPosition='" + numberPosition + '\'' +
                ", letterPosition='" + letterPosition + '\'' +
                ", color=" + color +
                '}';
    }
}
