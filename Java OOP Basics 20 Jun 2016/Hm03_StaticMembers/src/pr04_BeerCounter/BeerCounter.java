package pr04_BeerCounter;

public class BeerCounter {
    private static Integer beerInStock = 0;
    private static Integer beersDrankCount = 0;

    public static Integer getBeerInStock() {
        return beerInStock;
    }

    public static Integer getBeersDrankCount() {
        return beersDrankCount;
    }

    public static void buyBeer(Integer beerCount) {
        BeerCounter.beerInStock += beerCount;
    }

    public static void drinkBeer(Integer beerCount) {
        BeerCounter.beerInStock -= beerCount;
        BeerCounter.beersDrankCount += beerCount;
    }
}
