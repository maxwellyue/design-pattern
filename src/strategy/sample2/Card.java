package strategy.sample2;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午12:34 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Card implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        //进行强转
        PaymentContext2 context2 = (PaymentContext2)context;
        //转账
        System.out.println("给" + context2.getUsername() + "的银行卡号" + context2.getAccount() + "支付：" + context2.getMoney());
    }
}
