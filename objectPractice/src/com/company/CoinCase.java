
//硬貨􏰀入れ物クラス、CoinCase を作成しましょう。
//1. 500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
//2. AddCoins メソッド􏰃硬貨を追加する。引数􏰁硬貨􏰀種類( int )􏰂枚数( int )
//3. GetCount メソッド􏰃、指定した硬貨が、何枚あるかを取得する。引数􏰁硬貨􏰀種類( int )、戻り値􏰁枚数( int )
//4. GetAmount メソッド􏰃硬貨􏰀総額を取得する。戻り値􏰁硬貨􏰀総額( int )
//
package com.company;

public class CoinCase {



    public int[] numbers = { 500, 100, 50, 10, 5, 1 };
    public int count ;


    public void AddCoins() {
        System.out.println("硬貨を入力してください");
        int numbers = new java.util.Scanner(System.in).nextInt();
        System.out.println("枚数を入力してください");
        int count = new java.util.Scanner(System.in).nextInt();

    }
    public void GetCount() {




    }
    void GetAmount(){

    }

}


