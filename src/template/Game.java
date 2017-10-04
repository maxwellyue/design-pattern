package template;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午2:22 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public abstract class Game {

    //模板方法
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

    //具体实现抽象出来交给子类实现
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

}
