package strategy.sample1;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  上午11:38 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Client {

    public static void main(String[] args){
        //1:选择并创建需要使用的策略对象
        Strategy strategy = new BigCustomerStrategy();
        //2:创建上下文
        Price price = new Price(strategy);
        //3:计算报价
        double quote = price.quote(1000);
        System.out.println("应该向客户报价：" + quote);
    }
}
