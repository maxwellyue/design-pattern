package template;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年10月04日 --  下午2:23 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
public class Badminton extends Game {

    @Override
    void initialize() {
        System.out.println("Badminton Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Badminton Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Badminton Game Finished!");
    }
}