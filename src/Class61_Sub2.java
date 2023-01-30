/* Class61_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import sun.audio.AudioPlayer;

public class Class61_Sub2 extends Class61
{
    public InputStream_Sub1 anInputStream_Sub1_1886;
    
    public void method959() {
	try {
	    AudioPlayer.player.stop(anInputStream_Sub1_1886);
	    synchronized (anInputStream_Sub1_1886) {
		anInputStream_Sub1_1886.aBoolean69 = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    public Class61_Sub2() {
	super(8000);
	try {
	    anInputStream_Sub1_1886 = new InputStream_Sub1();
	    AudioPlayer.player.start(anInputStream_Sub1_1886);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
}
