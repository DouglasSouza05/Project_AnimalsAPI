package animalsAPI;

public class MockAnimalsService implements AnimalsService {

    @Override
    public String getAnimalsAPI(String name) {

        if (name == "Cheetah") {
            return AnimalsConst.Cheetah;
        } else if (name == "Kangaroo") {
            return AnimalsConst.Kangaroo;
        } else
            return AnimalsConst.Default;
    }
}
