package strategy.sample2;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午12:12 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        System.out.println("给" + context.getUsername() + "美元现金支付：" + context.getMoney());
    }
}
