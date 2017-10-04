package strategy.sample2;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午12:30 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class PaymentContext2 extends PaymentContext{

    //银行卡号
    private String account;

    public PaymentContext2(String username, double money, String account, PaymentStrategy strategy) {
        super(username, money, strategy);
        this.account = account;
    }

    //get方法，以便策略算法在计算时从上下文获取所需数据
    public String getAccount() {
        return account;
    }
}
