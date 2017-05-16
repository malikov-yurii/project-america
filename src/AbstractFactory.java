/**
 * @author Yurii Malikov
 */
public abstract class AbstractFactory {

    public static BaseFactory getFactory(Color color){

        switch (color) {
            case BLACK: return new BlackFactory();
            case WHITE: return new WhiteFactory();
        }

        return null;
    }

}
