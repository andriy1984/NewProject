
public class Lesson4Enum {

    public enum Continent{
        AUSTRALIA, EUROPE, ASIA, AFRICA
    }

    Continent continent;

    public void getCoutry(String country){

        switch (country){
            case "Australia":
                continent = Continent.AUSTRALIA; break;
            case "Poland":case "France":case  "Italia":
                continent = Continent.EUROPE; break;
            case "China":case "Malaysia":case "Singapore":
                continent = Continent.ASIA; break;
            case "Morocco":case "Tunisia":case "Egypt":
                continent = Continent.AFRICA; break;
            default:
                System.out.println("No this country = [" + country + "]");
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Lesson4Enum lenm = new Lesson4Enum();
        lenm.getCoutry("Poland");
        System.out.println("Continent = [" + lenm.continent + "]");
    }
}
