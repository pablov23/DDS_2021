package domain.servicioCriptomoneda;

public class Criptomoneda {
    public String id;
    public int rank;
    public String symbol;
    public String name;
    public String priceUsd;
    public String explorer;

    public double getPriceUsd(){
        return Double.parseDouble(priceUsd);
    }

    @Override
    public String toString(){
        return "ID: "+id+"\tRank: "+rank+"\tSymbol: "+symbol+"\nName: "+name
                +"\tPrice: "+getPriceUsd()+"\tExplorer: "+explorer;
    }
}
