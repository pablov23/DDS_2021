package domain.servicioCriptomoneda;

public class Criptomoneda {
    private String id;
    private int rank;
    private String symbol;
    private String priceUsd;

    public Criptomoneda(String id, int rank, String symbol, String priceUsd) {
        this.id = id;
        this.rank = rank;
        this.symbol = symbol;
        this.priceUsd = priceUsd;
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice(){
        return Double.parseDouble(priceUsd);
    }

    @Override
    public String toString(){
        return "ID: "+id+"\tRank: "+rank+"\tSymbol: "+symbol
                +"\tPrice: "+ getPrice();
    }
}
