/* Class61_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class61_Sub1_Sub1 extends Class61_Sub1
{
    public AudioFormat anAudioFormat2449;
    public byte[] aByteArray2450 = new byte[512];
    public SourceDataLine aSourceDataLine2451;
    public static Class aClass2452;
    
    public void method975(int arg0) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass2452 == null
		     ? (aClass2452
			= method978("javax.sound.sampled.SourceDataLine"))
		     : aClass2452),
		    anAudioFormat2449, 2 * arg0));
	    aSourceDataLine2451 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine2451.open();
	    aSourceDataLine2451.start();
	} catch (LineUnavailableException lineunavailableexception) {
	    aSourceDataLine2451 = null;
	    throw lineunavailableexception;
	}
    }
    
    public void method969() {
	for (int i = 0; i < 256; i++) {
	    int i_0_ = anIntArray1884[i];
	    if ((i_0_ + 8388608 & ~0xffffff) != 0)
		i_0_ = 0x7fffff ^ i_0_ >> 31;
	    aByteArray2450[i * 2] = (byte) (i_0_ >> 8);
	    aByteArray2450[i * 2 + 1] = (byte) (i_0_ >> 16);
	}
	aSourceDataLine2451.write(aByteArray2450, 0, 512);
    }
    
    public void method973() {
	if (null != aSourceDataLine2451) {
	    aSourceDataLine2451.close();
	    aSourceDataLine2451 = null;
	}
    }
    
    public int method976() {
	int i;
	try {
	    i = aSourceDataLine2451.available() >> 1;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public Class61_Sub1_Sub1() throws Exception {
	super(22050);
	anAudioFormat2449 = new AudioFormat(22050.0F, 16, 1, true, false);
    }
    
    public static Class method978(String arg0) {
	Class var_class;
	try {
	    var_class = Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    return null;
	}
	return var_class;
    }
}
