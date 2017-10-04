package strategy.sample1;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  上午11:35 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class BigCustomerStrategy implements Strategy {
    /**
     * 大客户：优惠10%
     * @param goodsPrice 商品销售原价
     * @return
     */
    @Override
    public double calcPrice(double goodsPrice) {
        return goodsPrice*(1-0.1);
    }
}
