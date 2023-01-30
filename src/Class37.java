/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Class37
{
    public static int anInt681;
    public Image anImage682;
    public static Class31 aClass31_683;
    public static int[] anIntArray684 = new int[100];
    public int anInt685;
    public static boolean aBoolean686;
    public static int anInt687;
    public static int anInt688;
    public static int anInt689;
    public static int[] anIntArray690;
    public int anInt691;
    public int[] anIntArray692;
    public static Class31 aClass31_693;
    public static int anInt694;
    public static int anInt695;
    public static Class34 aClass34_696;
    public static int anInt697;
    public static int anInt698;
    public static Class11_Sub10_Sub13_Sub2 aClass11_Sub10_Sub13_Sub2_699;
    public static Class31 aClass31_700;
    public static Class31 aClass31_701;
    
    public static void method702(boolean arg0) {
	try {
	    aClass11_Sub10_Sub13_Sub2_699 = null;
	    aClass31_683 = null;
	    aClass31_700 = null;
	    aClass34_696 = null;
	    if (arg0 != false)
		anInt694 = 36;
	    aClass31_701 = null;
	    anIntArray684 = null;
	    aClass31_693 = null;
	    anIntArray690 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "p.J(" + arg0 + ')');
	}
    }
    
    public abstract void method703(int i, int i_0_, Component component,
				   int i_1_);
    
    public abstract void method704(int i, Graphics graphics, int i_2_,
				   int i_3_);
    
    public static void method705(boolean arg0, byte arg1) {
	try {
	    if (((Class14.anInt302 ^ 0xffffffff)
		 == ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506
		      >> 761439975)
		     ^ 0xffffffff))
		&& ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517
		     >> 1670762695)
		    ^ 0xffffffff) == (Class40.anInt735 ^ 0xffffffff))
		Class14.anInt302 = 0;
	    anInt697++;
	    if (arg1 == -92) {
		int i = Class48.anInt885;
		if (arg0)
		    i = 1;
		int i_4_ = 0;
		for (/**/; i_4_ < i; i_4_++) {
		    Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1;
		    int i_5_;
		    if (arg0) {
			i_5_ = 33538048;
			class11_sub10_sub4_sub2_sub1
			    = Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899;
		    } else {
			class11_sub10_sub4_sub2_sub1
			    = (Class11_Sub10_Sub7
			       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160
			       [Class32.anIntArray597[i_4_]]);
			i_5_ = Class32.anIntArray597[i_4_] << -626000914;
		    }
		    if (class11_sub10_sub4_sub2_sub1 != null
			&& class11_sub10_sub4_sub2_sub1.method270(28738)) {
			int i_6_ = (class11_sub10_sub4_sub2_sub1.anInt2506
				    >> -1254328665);
			class11_sub10_sub4_sub2_sub1.aBoolean2815 = false;
			if (((Class1.aBoolean94
			      && (Class48.anInt885 ^ 0xffffffff) < -51)
			     || (Class48.anInt885 ^ 0xffffffff) < -201)
			    && !arg0
			    && (class11_sub10_sub4_sub2_sub1.anInt2560
				== class11_sub10_sub4_sub2_sub1.anInt2525))
			    class11_sub10_sub4_sub2_sub1.aBoolean2815 = true;
			int i_7_ = (class11_sub10_sub4_sub2_sub1.anInt2517
				    >> 2097130535);
			if (i_6_ >= 0 && (i_6_ ^ 0xffffffff) > -105
			    && (i_7_ ^ 0xffffffff) <= -1
			    && (i_7_ ^ 0xffffffff) > -105) {
			    if ((class11_sub10_sub4_sub2_sub1
				 .aClass11_Sub10_Sub4_Sub4_2788) != null
				&& (Class61.anInt1283
				    >= class11_sub10_sub4_sub2_sub1.anInt2792)
				&& ((Class61.anInt1283 ^ 0xffffffff)
				    > (class11_sub10_sub4_sub2_sub1.anInt2797
				       ^ 0xffffffff))) {
				class11_sub10_sub4_sub2_sub1.aBoolean2815
				    = false;
				class11_sub10_sub4_sub2_sub1.anInt2795
				    = (Class11_Sub10_Sub4_Sub5.method324
				       (Class1.anInt82,
					class11_sub10_sub4_sub2_sub1.anInt2506,
					3,
					(class11_sub10_sub4_sub2_sub1
					 .anInt2517)));
				Class52.aClass49_1024.method840
				    (Class1.anInt82,
				     class11_sub10_sub4_sub2_sub1.anInt2506,
				     class11_sub10_sub4_sub2_sub1.anInt2517,
				     class11_sub10_sub4_sub2_sub1.anInt2795,
				     60, class11_sub10_sub4_sub2_sub1,
				     class11_sub10_sub4_sub2_sub1.anInt2547,
				     i_5_,
				     class11_sub10_sub4_sub2_sub1.anInt2782,
				     class11_sub10_sub4_sub2_sub1.anInt2791,
				     class11_sub10_sub4_sub2_sub1.anInt2783,
				     class11_sub10_sub4_sub2_sub1.anInt2807);
			    } else {
				if (((class11_sub10_sub4_sub2_sub1.anInt2506
				      & 0x7f)
				     ^ 0xffffffff) == -65
				    && ((class11_sub10_sub4_sub2_sub1.anInt2517
					 & 0x7f)
					^ 0xffffffff) == -65) {
				    if (Buffer.anInt1566
					== (RuntimeException_Sub1
					    .anIntArrayArray1356[i_6_][i_7_]))
					continue;
				    RuntimeException_Sub1
					.anIntArrayArray1356[i_6_][i_7_]
					= Buffer.anInt1566;
				}
				class11_sub10_sub4_sub2_sub1.anInt2795
				    = (Class11_Sub10_Sub4_Sub5.method324
				       (Class1.anInt82,
					class11_sub10_sub4_sub2_sub1.anInt2506,
					3,
					(class11_sub10_sub4_sub2_sub1
					 .anInt2517)));
				Class52.aClass49_1024.method808
				    (Class1.anInt82,
				     class11_sub10_sub4_sub2_sub1.anInt2506,
				     class11_sub10_sub4_sub2_sub1.anInt2517,
				     class11_sub10_sub4_sub2_sub1.anInt2795,
				     60, class11_sub10_sub4_sub2_sub1,
				     class11_sub10_sub4_sub2_sub1.anInt2547,
				     i_5_,
				     (class11_sub10_sub4_sub2_sub1
				      .aBoolean2565));
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "p.K(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method706(int arg0) {
	try {
	    if (arg0 >= -52)
		method703(-67, -68, null, -78);
	    Class11_Sub10_Sub13.method396(anIntArray692, anInt685, anInt691);
	    anInt698++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "p.L(" + arg0 + ')');
	}
    }
    
    public static int method707(byte arg0) {
	try {
	    anInt681++;
	    if (arg0 != 119)
		method707((byte) -55);
	    return Class15_Sub1.anInt1741++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "p.I(" + arg0 + ')');
	}
    }
    
    public static void method708(byte arg0) {
	try {
	    Class39_Sub1.aClass40_1811.method740(4);
	    if (arg0 <= 66)
		method708((byte) 76);
	    anInt688++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "p.M(" + arg0 + ')');
	}
    }
    
    static {
	aClass31_683 = Class64.method992(" with @yel@", 255);
	aBoolean686 = false;
	aClass31_693
	    = (Class64.method992
	       ("You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3",
		255));
	anIntArray690 = new int[128];
	aClass34_696 = new Class34(32);
	aClass31_701 = Class64.method992("Loading config )2 ", 255);
	aClass31_700
	    = Class64.method992("You are standing in a members)2only area)3",
				255);
    }
}
