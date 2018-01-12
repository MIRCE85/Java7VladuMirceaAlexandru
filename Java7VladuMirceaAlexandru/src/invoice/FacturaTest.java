/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.util.Scanner;

/**
 *
 * @author vladu
 */
public class FacturaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String item;
        item = " ";
        String description;
        description = " ";
        int quantity;
        quantity = 0;
        double price;
        price = 0.00;
        
        Factura invoice = new Factura(item,description,quantity,price);

        Scanner input = new Scanner(System.in);



        System.out.print("Enter Number: ");
        item = input.nextLine();
        invoice.setPartNumber(item);

        System.out.print("Enter Description of Item Purchased: ");
        description = input.nextLine();
        invoice.setPartDescription(description);

        System.out.print("Enter The Quantity of Item Purchased: ");
        quantity = input.nextInt();
        if (quantity > 0) {
            invoice.setQuantityOfItemPurchased(quantity);
        }

        System.out.print("Enter The Price Per Item: ");
        price = input.nextDouble();
        if (price > 0) {
            invoice.setPricePerItem(price);
        }
        System.out.println("Totalul pentru factura "+invoice.getPartNumber()+ "este: " + invoice.getInvoiceAmount());
        
    }
    
}
