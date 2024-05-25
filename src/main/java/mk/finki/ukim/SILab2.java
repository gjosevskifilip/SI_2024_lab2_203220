package mk.finki.ukim;

import java.util.List;


public class SILab2 {
    public static boolean checkCart(List<Item> allItems, int payment){
        if (allItems == null){//A
            throw new RuntimeException("allItems list can't be null!");//B
        }

        float sum = 0;//C

        for (int i = 0; i < allItems.size(); i++){//D
            Item item = allItems.get(i);//E
            if (item.getName() == null || item.getName().length() == 0){//F
                item.setName("unknown");//G
            }
            if (item.getBarcode() != null){//H
                String allowed = "0123456789";//I
                char chars[] = item.getBarcode().toCharArray();//I
                for (int j = 0; j < item.getBarcode().length(); j++){//J
                    char c = item.getBarcode().charAt(j);//K
                    if (allowed.indexOf(c) == -1){//L
                        throw new RuntimeException("Invalid character in item barcode!");//M
                    }
                }
                if (item.getDiscount() > 0){//N
                    sum += item.getPrice()*item.getDiscount();//O
                }
                else {//P
                    sum += item.getPrice();//Q
                }
            }
            else {//R
                throw new RuntimeException("No barcode!");//S
            }
            if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'){//T
                sum -= 30;//U
            }
        }
        if (sum <= payment){//V
            return true;//W
        }
        else {//X
            return false;//Y
        }
    }
}
