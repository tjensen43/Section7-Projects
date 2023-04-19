public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream mintChocChip = new IceCream("Mint Chocolate Chip", 2, 2);
        System.out.println(mintChocChip.getName());
        System.out.println(mintChocChip.getCost());
        System.out.println(mintChocChip.getNumScoops());

        mintChocChip.addTopping("Sprinkles");
        mintChocChip.printToppings();

    }
}
