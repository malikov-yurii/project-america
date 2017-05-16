/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {
        BaseFactory blackFactory = AbstractFactory.getFactory(FactoryType.BLACK);
        System.out.println(blackFactory.createCircle());
        System.out.println(blackFactory.createTriangle());

        BaseFactory whiteFactory = AbstractFactory.getFactory(FactoryType.WHITE);
        System.out.println(whiteFactory.createCircle());
        System.out.println(whiteFactory.createTriangle());
    }



}
