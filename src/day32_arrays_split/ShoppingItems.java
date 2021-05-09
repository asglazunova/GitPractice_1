package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {

         //indexFor      //   0         1        2        3          4             5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,     150.0,    9.99,    250.0 ,    439.50,     39.99};
        int[] itemIDs =   {12345 ,    12346,   12347,    12348,     12349,      12350};

        System.out.println("-------FIND THE FIRST INDEX OF 'Gloves' in items array -----");

        for (int i = 0 ; i < items.length ; i++){
           if (items[i].equals("Gloves")){
               System.out.println("gloves found at index " + i);
               break;
               //System.out.println(i + " - " + items[i]);

            }
        }
        System.out.println("-------FIND THE FIRST INDEX OF 'iPad' in items array -----");
        boolean iPadExists = false;
        for (String itemNeedFind : items){
            if (itemNeedFind.equalsIgnoreCase("Ipad")){
                iPadExists = true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);
        if (iPadExists){
            System.out.println("We bought the Ipad!!");
        }else{
            System.out.println("We forgot the Ipad! :( ");
        }
        System.out.println("-----Print a report of each shopping item ------");

        /**
         * Shoes - $99.99 - #12345
         * .......
         * iphone 12 case -  $39.99 -   #12350
         */

        for (int i = 0 ; i < prices.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
        System.out.println("-----Look for 'Jacket' in item and print all details  ------");

        for (int i = 0 ; i < items.length ; i ++){
            if (items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break; // stop searching after jacket is found
            }

        }
    }


}
