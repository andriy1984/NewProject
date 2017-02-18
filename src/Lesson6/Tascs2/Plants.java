package Lesson6.Tascs2;

public class Plants {

    public enum Color{White, Red, Green}
    public enum Type{Orchidaceae, Thuja, Chrysanthemum}

    private int size;
    private Color color;
    private Type type;

    public Plants(int size, String color, String type) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;

    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "green" : return Color.Green;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color Green, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "orchidaceae" : return Type.Orchidaceae;
            case "thuja" : return Type.Thuja;
            case "chrysanthemum" : return Type.Chrysanthemum;
            default : throw new TypeException("Input only color Orchidaceae, Thuja, Chrysanthemum");
        }
    }

    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {
       try {
          Plants [] pl = {
                  new Plants(5, "green", "thuja"),
                  //new Plants(7, "blue", "thuja"),
                  new Plants(8, "White", "Orchidaceae"),
                  new Plants(15, "red", "Chrysanthemum")
          };
           for (Plants p:pl
                ) {
               System.out.println(p);
           }
       }catch (ColorException|TypeException e){
           System.out.println(e.getMessage() + "\n");
       }

    }


}
