/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43
{
    public static Class31 aClass31_769
	= (Class64.method992
	   ("This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3",
	    255));
    public static int anInt770;
    public int anInt771;
    public int anInt772;
    public static int anInt773;
    public static int anInt774;
    public static Class31 aClass31_775;
    public int anInt776;
    public static int anInt777 = (int) (Math.random() * 17.0) - 8;
    public int anInt778;
    public static int anInt779;
    public static Class55_Sub1 aClass55_Sub1_780;
    public static Class31 aClass31_781;
    public boolean aBoolean782 = true;
    public int anInt783;
    public static int anInt784;
    public static int anInt785;
    public static Class31 aClass31_786;
    public static int anInt787;
    public static int anInt788;
    public static Class31 aClass31_789;
    public static Class55 aClass55_790;
    public int anInt791;
    
    public static void method752(byte arg0) {
	try {
	    Class11_Sub10_Sub12.aClass40_2291.method740(4);
	    anInt779++;
	    int i = 92 % ((-62 - arg0) / 47);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ra.E(" + arg0 + ')');
	}
    }
    
    public static void method753(int arg0, int arg1, byte arg2, int arg3,
				 int arg4, int arg5) {
	if (!Class1.aBoolean94)
	    arg1 = 0;
	anInt784++;
	if ((arg0 ^ 0xffffffff) != (Class11_Sub10_Sub4_Sub2.anInt2571
				    ^ 0xffffffff)
	    || (arg5 ^ 0xffffffff) != (Class11_Sub10_Sub4.anInt2043
				       ^ 0xffffffff)
	    || Class11_Sub10_Sub14.anInt2355 != arg1) {
	    Class11_Sub10_Sub14.anInt2355 = arg1;
	    Class11_Sub10_Sub4.anInt2043 = arg5;
	    Class11_Sub10_Sub4_Sub2.anInt2571 = arg0;
	    Class34.method674(25, false);
	    Class28.method610(false, null, Class54.aClass31_1059, -32266);
	    int i = Class10.anInt214;
	    Class10.anInt214 = (-6 + arg5) * 8;
	    int i_0_ = -i + Class10.anInt214;
	    i = Class10.anInt214;
	    int i_1_ = Class11_Sub10_Sub6.anInt2133;
	    Class11_Sub10_Sub6.anInt2133 = arg0 * 8 - 48;
	    int i_2_ = -i_1_ + Class11_Sub10_Sub6.anInt2133;
	    i_1_ = Class11_Sub10_Sub6.anInt2133;
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -16385; i_3_++) {
		Class11_Sub10_Sub4_Sub2_Sub2 class11_sub10_sub4_sub2_sub2
		    = Class12.aClass11_Sub10_Sub4_Sub2_Sub2Array235[i_3_];
		if (class11_sub10_sub4_sub2_sub2 != null) {
		    for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -11; i_4_++) {
			class11_sub10_sub4_sub2_sub2.anIntArray2500[i_4_]
			    -= i_2_;
			class11_sub10_sub4_sub2_sub2.anIntArray2562[i_4_]
			    -= i_0_;
		    }
		    class11_sub10_sub4_sub2_sub2.anInt2506 -= i_2_ * 128;
		    class11_sub10_sub4_sub2_sub2.anInt2517 -= i_0_ * 128;
		}
	    }
	    for (int i_5_ = 0; i_5_ < 2048; i_5_++) {
		Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1
		    = (Class11_Sub10_Sub7
		       .aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_5_]);
		if (class11_sub10_sub4_sub2_sub1 != null) {
		    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -11; i_6_++) {
			class11_sub10_sub4_sub2_sub1.anIntArray2500[i_6_]
			    -= i_2_;
			class11_sub10_sub4_sub2_sub1.anIntArray2562[i_6_]
			    -= i_0_;
		    }
		    class11_sub10_sub4_sub2_sub1.anInt2506 -= i_2_ * 128;
		    class11_sub10_sub4_sub2_sub1.anInt2517 -= i_0_ * 128;
		}
	    }
	    int i_7_ = 0;
	    Class1.anInt82 = arg1;
	    Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
		.method271(false, arg3, (byte) 50, arg4);
	    int i_8_ = 104;
	    int i_9_ = 1;
	    int i_10_ = 0;
	    if (i_2_ < 0) {
		i_9_ = -1;
		i_7_ = 103;
		i_8_ = -1;
	    }
	    int i_11_ = 1;
	    int i_12_ = 104;
	    if ((i_0_ ^ 0xffffffff) > -1) {
		i_11_ = -1;
		i_10_ = 103;
		i_12_ = -1;
	    }
	    for (int i_13_ = i_7_; (i_8_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff);
		 i_13_ += i_9_) {
		for (int i_14_ = i_10_; i_12_ != i_14_; i_14_ += i_11_) {
		    int i_15_ = i_2_ + i_13_;
		    int i_16_ = i_0_ + i_14_;
		    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -5; i_17_++) {
			if (i_15_ < 0 || i_16_ < 0 || i_15_ >= 104
			    || i_16_ >= 104)
			    Class51.aClass36ArrayArrayArray1007[i_17_]
				[i_13_][i_14_]
				= null;
			else
			    Class51.aClass36ArrayArrayArray1007[i_17_]
				[i_13_][i_14_]
				= (Class51.aClass36ArrayArrayArray1007[i_17_]
				   [i_15_][i_16_]);
		    }
		}
	    }
	    for (Class11_Sub8 class11_sub8
		     = ((Class11_Sub8)
			Class37_Sub1.aClass36_1794.method694((byte) -126));
		 class11_sub8 != null;
		 class11_sub8 = ((Class11_Sub8)
				 Class37_Sub1.aClass36_1794.method701(0))) {
		class11_sub8.anInt1619 -= i_0_;
		class11_sub8.anInt1615 -= i_2_;
		if ((class11_sub8.anInt1615 ^ 0xffffffff) > -1
		    || (class11_sub8.anInt1619 ^ 0xffffffff) > -1
		    || (class11_sub8.anInt1615 ^ 0xffffffff) <= -105
		    || class11_sub8.anInt1619 >= 104)
		    class11_sub8.method107(0);
	    }
	    Class34.aBoolean636 = false;
	    if (Class14.anInt302 != 0) {
		Class14.anInt302 -= i_2_;
		Class40.anInt735 -= i_0_;
	    }
	    Buffer.anInt1569 = -1;
	    Class11_Sub10_Sub4_Sub2_Sub2.aClass36_2818.method692(-9707);
	    Class11_Sub10_Sub11.aClass36_2263.method692(-9707);
	    if (arg2 <= 83)
		aClass55_Sub1_780 = null;
	}
    }
    
    public static void method754(byte arg0) {
	try {
	    anInt788++;
	    Class11_Sub10_Sub16.aClass40_2435.method740(4);
	    Class37_Sub1.aClass40_1781.method740(4);
	    Class11_Sub10_Sub16.aClass40_2425.method740(4);
	    if (arg0 != -14)
		anInt777 = -1;
	    Class12.aClass40_248.method740(4);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ra.C(" + arg0 + ')');
	}
    }
    
    public static void method755(byte arg0, long arg1) {
	try {
	    anInt787++;
	    if (arg0 != -42)
		method756(-14);
	    if (arg1 != 0L) {
		for (int i = 0; i < Class55.anInt1143; i++) {
		    if ((arg1 ^ 0xffffffffffffffffL)
			== (Class46.aLongArray845[i] ^ 0xffffffffffffffffL)) {
			Class55.anInt1143--;
			Class11_Sub10_Sub14.aBoolean2352 = true;
			for (int i_18_ = i; ((Class55.anInt1143 ^ 0xffffffff)
					     < (i_18_ ^ 0xffffffff)); i_18_++)
			    Class46.aLongArray845[i_18_]
				= Class46.aLongArray845[i_18_ + 1];
			Class40.aClass11_Sub5_Sub1_728.method196(1, 168);
			Class31.anInt1407++;
			Class40.aClass11_Sub5_Sub1_728.method140(-24628, arg1);
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "ra.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method756(int arg0) {
	try {
	    aClass31_789 = null;
	    aClass31_775 = null;
	    aClass31_786 = null;
	    aClass55_790 = null;
	    if (arg0 == 0) {
		aClass55_Sub1_780 = null;
		aClass31_781 = null;
		aClass31_769 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "ra.A(" + arg0 + ')');
	}
    }
    
    public Class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
		   boolean arg6) {
	try {
	    anInt772 = arg3;
	    anInt771 = arg2;
	    anInt791 = arg0;
	    anInt778 = arg1;
	    anInt783 = arg4;
	    anInt776 = arg5;
	    aBoolean782 = arg6;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("ra.<init>(" + arg0 + ',' + arg1 + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ','
				     + arg5 + ',' + arg6 + ')'));
	}
    }
    
    static {
	anInt770 = 5063219;
	aClass31_786 = Class64.method992("flash3:", 255);
	aClass31_775 = Class64.method992("runes", 255);
	aClass31_781 = Class64.method992("From ", 255);
	anInt785 = 0;
	aClass31_789 = Class64.method992("purple:", 255);
    }
}
