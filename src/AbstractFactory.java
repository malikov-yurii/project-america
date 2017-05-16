/**
 * @author Yurii Malikov
 */
public abstract class AbstractFactory {

    public static BaseFactory getFactory(FactoryType type){

        switch (type) {
            case BLACK: return new BlackFactory();
            case WHITE: return new WhiteFactory();
        }

        return null;
    }

}
