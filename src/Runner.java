/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {
        BaseFactory blackFactory = AbstractFactory.getFactory(Color.BLACK);
        System.out.println(blackFactory.createCircle());
        System.out.println(blackFactory.createTriangle());

        BaseFactory whiteFactory = AbstractFactory.getFactory(Color.WHITE);
        System.out.println(whiteFactory.createCircle());
        System.out.println(whiteFactory.createTriangle());
    }



}
