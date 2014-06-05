package manageryzy.game.stg;

import java.util.logging.Level;
import java.util.logging.Logger;

import manageryzy.stg.engine.hal.StgHal;

public class Luncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger.getGlobal().setLevel(Level.FINE);
		Logger.getGlobal().log(Level.INFO, "luncher start");
		StgHal.theStgHal=new StgHal("STG.db");
		StgHal.theStgHal.SoundEffect.LoadSound("Sound1", "se_powerup.wav");
		StgHal.theStgHal.BGMEngine.addMusic("Music1", "��ɫС�� �� Colorful Path.wav", 0, 0);
		StgHal.theStgHal.SoundEffect.PlaySound("Sound1");
		StgHal.theStgHal.BGMEngine.Play("Music1");
		
		try {
			Thread.currentThread();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StgHal.theStgHal.SoundEffect.PlaySound("Sound1");
		
		try {
			Thread.currentThread();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		StgHal.theStgHal.SoundEffect.PlaySound("Sound1");
//		StgHal.theStgHal.SoundEffect.PlaySound("Sound1");
		StgHal.theStgHal.initWindow("STG game");
		Logger.getGlobal().log(Level.INFO, "luncher exit");
		
	}

}