package com.zte.TBattle;

//程序入口
public class TankMain {
	public static void main(String[] args) {
		Window Ts = new Window();
	}
	
}



//道具BUG：道具可能会出现在金属墙中(道具不应出现在'墙'或河流的位置上,道具图层应位于'树'的上方)
//子弹BUG:离砖墙太近时 打到砖墙可能会出现子弹无效的情况.己方子弹射击频率过快.
//代码冗余有待优化...
//@_@ Time:2018/4/26/19:00
/*                      _oo0oo_
*                      o8888888o
*                      88" . "88
*                      (| -_- |)
*                      0\  =  /0
*                    ___/`---'\___
*                  .' \\|     |// '.
*                 / \\|||  :  |||// \
*                / _||||| -:- |||||- \
*               |   | \\\  -  /// |   |
*               | \_|  ''\---/''  |_/ |
*               \  .-\__  '-'  ___/-. /
*             ___'. .'  /--.--\  `. .'___
*          ."" '<  `.___\_<|>_/___.' >' "".
*         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
*         \  \ `_.   \_ __\ /__ _/   .-` /  /
*     =====`-.____`.___ \_____/___.-`___.-'=====
*                       `=---='          
*                   
*     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*                   佛祖保佑         永无BUG              */