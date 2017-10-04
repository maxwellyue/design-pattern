package strategy.sample2;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午12:13 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Client {

    public static void main(String[] args){
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();

        PaymentContext context1 = new PaymentContext("小王", 8000, strategyRMB);
        context1.payNow();

        PaymentContext context2 = new PaymentContext("Peter", 6000, strategyDollar);
        context2.payNow();

        //新增银行卡支付
        PaymentStrategy strategyCard = new Card();
        PaymentContext2 context3 = new PaymentContext2("小李", 5000, "6223987999987788", strategyCard);
        context3.payNow();

        //新增银行卡支付
        PaymentStrategy strategyCard2 = new Card2("6223987999987788");
        PaymentContext context4 = new PaymentContext("小张", 7000, strategyCard2);
        context4.payNow();




    }
}
