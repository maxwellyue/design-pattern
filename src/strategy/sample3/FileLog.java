package strategy.sample3;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午1:05 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class FileLog implements LogStrategy {
    @Override
    public void log(String message) {
        System.out.println("将" + message + "记录到文件");
    }
}
