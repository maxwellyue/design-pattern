package strategy.sample1;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  上午11:36 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Price {

    //虽然是一个接口，但实际是持有具体的策略实现类对象
    private Strategy strategy;

    /**
     * 构造方法，传入一个具体的策略对象
     * @param strategy 具体的策略对象
     */
    public Price(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 计算报价
     * @param goodsPrice
     * @return
     */
    public double quote(double goodsPrice){
        return this.strategy.calcPrice(goodsPrice);
    }
}
