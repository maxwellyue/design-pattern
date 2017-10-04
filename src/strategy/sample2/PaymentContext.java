package strategy.sample2;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午12:04 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class PaymentContext {

    private String username;
    private double money;
    private PaymentStrategy strategy;

    public PaymentContext(String username, double money, PaymentStrategy strategy){
        this.username = username;
        this.money = money;
        this.strategy = strategy;
    }


    //get方法，以便策略算法在计算时从上下文获取所需数据
    public String getUsername() {
        return username;
    }

    //get方法，以便策略算法在计算时从上下文获取所需数据
    public double getMoney() {
        return money;
    }

    /**
     * 支付工资
     */
    public void payNow(){
        this.strategy.pay(this);
    }


}
