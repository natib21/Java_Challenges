package Encapsulation;

public class Printer {

    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel , boolean duplex){

        this.tonerLevel = (tonerLevel < 0 || tonerLevel == 100) ? -1 :tonerLevel;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            int tooner = tonerAmount + tonerLevel;

            if(tooner > 100){
                return -1;
            }
            tonerLevel = tonerLevel + tonerAmount;
            return tonerLevel;
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint  = (duplex) ? (pages /2 ) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint ;
        return pagesToPrint ;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
