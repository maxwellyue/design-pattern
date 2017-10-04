package strategy.sample3;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午1:06 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class LogContext {

    /**
     * 记录日志的方法，提供给客户端使用
     *
     * 在上下文中，自行实现对具体策略的选择
     *
     * @param message
     */
    public void log(String message){

        //优先选用策略：记录到数据库
        LogStrategy strategy = new DbLog();
        try {
            strategy.log(message);
        }catch (Exception e){
            //数据库记录日志出错，就记录到为日志文件中
            strategy = new FileLog();
            strategy.log(message);
        }
    }
}
