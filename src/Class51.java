/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class51
{
    public static int anInt1003;
    public static int anInt1004;
    public static int[][][] anIntArrayArrayArray1005 = new int[4][105][105];
    public static int anInt1006 = 0;
    public static Class36[][][] aClass36ArrayArrayArray1007
	= new Class36[4][104][104];
    public static int anInt1008;
    public static int anInt1009;
    public static int anInt1010;
    public static int anInt1011 = 0;
    public static int anInt1012;
    public static byte[][] aByteArrayArray1013;
    public static int anInt1014;
    public static Class31 aClass31_1015 = Class64.method992("_", 255);
    public static int anInt1016 = 0;
    
    public static void method849(int arg0) {
	aByteArrayArray1013 = null;
	anIntArrayArrayArray1005 = null;
	aClass31_1015 = null;
	aClass36ArrayArrayArray1007 = null;
	if (arg0 != 23017)
	    method850(null, null, -82, 56);
    }
    
    public static void method850(Color arg0, Class31 arg1, int arg2,
				 int arg3) {
	try {
	    if (Class7.aFont1443 == null) {
		Class7.aFont1443 = new Font("Helvetica", 1, 13);
		Class11_Sub10_Sub12.aFontMetrics2294
		    = Class34.method672(-102).getFontMetrics(Class7.aFont1443);
	    }
	    if (Class1.aBoolean76) {
		Class1.aBoolean76 = false;
		Class11_Sub10_Sub11.aGraphics2261.setColor(Color.black);
		Class11_Sub10_Sub11.aGraphics2261
		    .fillRect(0, 0, Class47.anInt874, Class37.anInt695);
	    }
	    anInt1003++;
	    if (arg0 == null)
		arg0 = new Color(140, 17, 17);
	    try {
		if (Class39.anImage718 == null)
		    Class39.anImage718
			= Class34.method672(-110).createImage(304, 34);
		if (arg3 >= -88)
		    method854(null, null, (byte) -120, null);
		Graphics graphics = Class39.anImage718.getGraphics();
		graphics.setColor(arg0);
		graphics.drawRect(0, 0, 303, 33);
		graphics.fillRect(2, 2, arg2 * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(1, 1, 301, 31);
		graphics.fillRect(3 * arg2 + 2, 2, 300 - arg2 * 3, 30);
		graphics.setFont(Class7.aFont1443);
		graphics.setColor(Color.white);
		arg1.method648(0, 22, graphics,
			       (-arg1.method635((byte) 95, (Class11_Sub10_Sub12
							    .aFontMetrics2294))
				+ 304) / 2);
		Class11_Sub10_Sub11.aGraphics2261.drawImage
		    (Class39.anImage718, Class47.anInt874 / 2 + -152,
		     -18 + Class37.anInt695 / 2, null);
	    } catch (Exception exception) {
		int i = Class47.anInt874 / 2 - 152;
		int i_0_ = Class37.anInt695 / 2 - 18;
		Class11_Sub10_Sub11.aGraphics2261.setColor(arg0);
		Class11_Sub10_Sub11.aGraphics2261.drawRect(i, i_0_, 303, 33);
		Class11_Sub10_Sub11.aGraphics2261.fillRect(2 + i, i_0_ - -2,
							   arg2 * 3, 30);
		Class11_Sub10_Sub11.aGraphics2261.setColor(Color.black);
		Class11_Sub10_Sub11.aGraphics2261.drawRect(1 + i, i_0_ - -1,
							   301, 31);
		Class11_Sub10_Sub11.aGraphics2261.fillRect(i + (2 + 3 * arg2),
							   2 + i_0_,
							   300 + -(3 * arg2),
							   30);
		Class11_Sub10_Sub11.aGraphics2261.setFont(Class7.aFont1443);
		Class11_Sub10_Sub11.aGraphics2261.setColor(Color.white);
		arg1.method648(0, 22 + i_0_, Class11_Sub10_Sub11.aGraphics2261,
			       ((304 - arg1.method635((byte) 67,
						      (Class11_Sub10_Sub12
						       .aFontMetrics2294))) / 2
				+ i));
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ta.D("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ')'));
	}
    }
    
    public static void method851(Class11_Sub10_Sub4_Sub2 arg0, int arg1,
				 int arg2) {
	try {
	    anInt1009++;
	    if ((arg0.anInt2506 ^ 0xffffffff) > -129
		|| (arg0.anInt2517 ^ 0xffffffff) > -129
		|| arg0.anInt2506 >= 13184
		|| (arg0.anInt2517 ^ 0xffffffff) <= -13185) {
		arg0.anInt2537 = 0;
		arg0.anInt2509 = 0;
		arg0.anInt2543 = -1;
		arg0.anInt2549 = -1;
		arg0.anInt2506
		    = arg0.anInt2510 * 64 + arg0.anIntArray2500[0] * 128;
		arg0.anInt2517
		    = arg0.anInt2510 * 64 + arg0.anIntArray2562[0] * 128;
		arg0.method269(arg2 + -66);
	    }
	    if (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899 == arg0
		&& ((arg0.anInt2506 ^ 0xffffffff) > -1537
		    || arg0.anInt2517 < 1536 || arg0.anInt2506 >= 11776
		    || arg0.anInt2517 >= 11776)) {
		arg0.anInt2543 = -1;
		arg0.anInt2509 = 0;
		arg0.anInt2549 = -1;
		arg0.anInt2537 = 0;
		arg0.anInt2506
		    = arg0.anIntArray2500[0] * 128 - -(64 * arg0.anInt2510);
		arg0.anInt2517
		    = 128 * arg0.anIntArray2562[0] + 64 * arg0.anInt2510;
		arg0.method269(-2);
	    }
	    if (arg2 != 64)
		anInt1011 = -32;
	    if (Class61.anInt1283 >= arg0.anInt2509) {
		if (arg0.anInt2537 >= Class61.anInt1283)
		    Class1.method47(arg0, true);
		else
		    Class15.method525(true, arg0);
	    } else
		Class23.method580((byte) -115, arg0);
	    Class25.method598(0, arg0);
	    Class11_Sub10_Sub4_Sub2_Sub2.method285((byte) 106, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ta.B("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + arg1 + ',' + arg2 + ')'));
	}
    }
    
    public static Class11_Sub10_Sub7 method852(boolean arg0, int arg1) {
	try {
	    anInt1008++;
	    Class11_Sub10_Sub7 class11_sub10_sub7
		= ((Class11_Sub10_Sub7)
		   Class58.aClass40_1214.method735((long) arg1, (byte) -95));
	    if (class11_sub10_sub7 != null)
		return class11_sub10_sub7;
	    byte[] is
		= Applet_Sub1.aClass55_25.method887((byte) -127, arg1, 3);
	    if (arg0 != true)
		return null;
	    class11_sub10_sub7 = new Class11_Sub10_Sub7();
	    if (is != null)
		class11_sub10_sub7.method359(new Buffer(is), 18688);
	    Class58.aClass40_1214.method742(-123, (long) arg1,
					    class11_sub10_sub7);
	    return class11_sub10_sub7;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ta.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static Class11_Sub10_Sub2 method853(byte arg0, int arg1) {
	try {
	    anInt1012++;
	    Class11_Sub10_Sub2 class11_sub10_sub2
		= ((Class11_Sub10_Sub2)
		   Class11_Sub10_Sub16.aClass40_2435.method735((long) arg1,
							       (byte) -121));
	    if (class11_sub10_sub2 != null)
		return class11_sub10_sub2;
	    if (arg0 >= -106)
		aClass31_1015 = null;
	    byte[] is = Class32.aClass55_589.method887((byte) -123, arg1, 6);
	    class11_sub10_sub2 = new Class11_Sub10_Sub2();
	    class11_sub10_sub2.anInt1963 = arg1;
	    if (is != null)
		class11_sub10_sub2.method237((byte) -3, new Buffer(is));
	    class11_sub10_sub2.method242(0);
	    if (class11_sub10_sub2.aBoolean2009) {
		class11_sub10_sub2.aBoolean1960 = false;
		class11_sub10_sub2.aBoolean1969 = false;
	    }
	    Class11_Sub10_Sub16.aClass40_2435.method742(-120, (long) arg1,
							class11_sub10_sub2);
	    return class11_sub10_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ta.F(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method854(Class55 arg0, Class55 arg1, byte arg2,
				 Class55 arg3) {
	try {
	    anInt1014++;
	    Class43.aClass55_790 = arg3;
	    Class11_Sub10_Sub4_Sub2_Sub1.aClass55_2803 = arg1;
	    if (arg2 < -2) {
		Class22.aClass55_409 = arg0;
		Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61
		    = new Class11_Sub10_Sub5[Class11_Sub10_Sub4_Sub2_Sub1
						 .aClass55_2803
						 .method890((byte) 45)][];
		Class37_Sub1.aBooleanArray1808
		    = new boolean[Class11_Sub10_Sub4_Sub2_Sub1
				      .aClass55_2803.method890((byte) -118)];
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ta.C("
				     + (arg0 != null ? "{...}" : "null") + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ','
				     + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
}
