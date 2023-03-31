package wgk20202091105lab1;

import java.lang.String;
/*
*
*  @author wgk20202091105*/
public class Stock {
    private final String symbol;        //股票代码
    private final String name;          // 股票名称
    private double previousClosingPrice;        //前一日的收盘价
    private double currentPrice;        //当前股价

    public Stock() {
        symbol="INV";
        name="Snake Corporation";
    }

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public void setPrevious(double price) {
        previousClosingPrice = price;
    }

    public void setCurrent(double price){
        currentPrice = price;
    }

    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }

    public String toString(){
        return "Symbol:"+symbol+"  "+"Name:"+name;
    }

    public static void main(String[] args){
        Stock stock = new Stock();
        //Stock stock=new Stock("HGs","Snake");
        stock.setPrevious(115);
        stock.setCurrent(129);
        System.out.println(stock.toString());
        System.out.println("市值变化百分比："+String.format("%.2f",stock.getChangePercent())+"%");
    }
}