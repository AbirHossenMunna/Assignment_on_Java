public class CostCalculation {
    public static void main(String[] args) {
        // Given prices
        int laptopPrice = 100000;  // in tk
        int mousePrice = 2500;    // in tk

        // Calculate total cost before discount
        int totalCostBeforeDiscount = laptopPrice + mousePrice;

        // Apply 15% discount
        double discount = 0.15;
        double totalCostAfterDiscount = totalCostBeforeDiscount * (1 - discount);

        // Output the total cost after discount
        System.out.println("Total cost after 15% discount: " + totalCostAfterDiscount + " tk");
    }
}
