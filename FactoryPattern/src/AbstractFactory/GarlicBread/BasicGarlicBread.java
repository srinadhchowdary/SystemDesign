package AbstractFactory.GarlicBread;

public class BasicGarlicBread implements GarlicBread{

    @Override
    public void prepare() {
        System.out.println("Preparing Basic Garlic Bread with butter and garlic!");
    }
}
