/* Class11_Sub10_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class11_Sub10_Sub8 extends Class11_Sub10
{
    public int anInt2170;
    public static CRC32 aCRC32_2171;
    public int anInt2172;
    public static int anInt2173;
    public static int anInt2174;
    public static Class31 aClass31_2175
	= Class64.method992("wishes to duel with you)3", 255);
    public int anInt2176;
    public static int anInt2177 = 0;
    public static int anInt2178 = -1;
    public int anInt2179 = 0;
    public static int anInt2180;
    public static Class31 aClass31_2181
	= Class64.method992("Connecting to friendserver", 255);
    public int anInt2182;
    public static int anInt2183;
    public static int anInt2184;
    public static int anInt2185;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_2186;
    public static Class31 aClass31_2187;
    public static int[] anIntArray2188;
    public static Class31 aClass31_2189;
    public static int anInt2190;
    public static int anInt2191;
    public static int[] anIntArray2192;
    public static int[] anIntArray2193;
    public static Class31 aClass31_2194;
    public static long aLong2195;
    public static Class31 aClass31_2196;
    
    public static void method361(int arg0, Class11_Sub10_Sub4_Sub2_Sub1 arg1,
				 int arg2, int arg3, int arg4) {
	try {
	    anInt2185++;
	    if (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899 != arg1
		&& Class11_Sub7.anInt1597 < 400) {
		Class31 class31;
		if ((arg1.anInt2787 ^ 0xffffffff) != -1)
		    class31 = (Class40.method744
			       (0, (new Class31[]
				    { arg1.aClass31_2800, Class40.aClass31_732,
				      Class11_Sub11.method493(arg1.anInt2787,
							      (byte) -125),
				      Class50.aClass31_986 })));
		else
		    class31
			= (Class40.method744
			   (0, (new Class31[]
				{ arg1.aClass31_2800,
				  (Class15_Sub1.method545
				   ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				     .anInt2793),
				    (byte) 9, arg1.anInt2793)),
				  Class11.aClass31_223,
				  Class11_Sub11.method493(arg1.anInt2793,
							  (byte) -124),
				  Class50.aClass31_986 })));
		if (Class39.anInt721 == 1) {
		    Class39.anInt714++;
		    Class7.method80((Class40.method744
				     (0,
				      (new Class31[]
				       { Class8.aClass31_168,
					 Class11_Sub10_Sub6.aClass31_2146,
					 Class11_Sub10_Sub4_Sub2.aClass31_2523,
					 class31 }))),
				    25, arg0, arg2, false, arg4);
		} else if ((Class11_Sub10_Sub11.anInt2269 ^ 0xffffffff)
			   != -2) {
		    for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
			if (Class64.aClass31Array1349[i] != null) {
			    Class11_Sub10_Sub9.anInt2204++;
			    int i_0_ = 0;
			    int i_1_ = 0;
			    if (!Class64.aClass31Array1349[i]
				     .method653(Class60.aClass31_1258, true)) {
				if (Class11_Sub10.aBooleanArray1658[i])
				    i_0_ = 2000;
			    } else {
				if ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				     .anInt2793)
				    < arg1.anInt2793)
				    i_0_ = 2000;
				if (((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899
				      .anInt2799)
				     ^ 0xffffffff) != -1
				    && (arg1.anInt2799 ^ 0xffffffff) != -1) {
				    if ((arg1.anInt2799 ^ 0xffffffff)
					== ((Class48
					     .aClass11_Sub10_Sub4_Sub2_Sub1_899
					     .anInt2799)
					    ^ 0xffffffff))
					i_0_ = 2000;
				    else
					i_0_ = 0;
				}
			    }
			    if ((i ^ 0xffffffff) == -1)
				i_1_ = i_0_ + 15;
			    if ((i ^ 0xffffffff) == -2)
				i_1_ = 30 + i_0_;
			    if (i == 2)
				i_1_ = i_0_ + 43;
			    if ((i ^ 0xffffffff) == -4)
				i_1_ = 38 - -i_0_;
			    if (i == 4)
				i_1_ = i_0_ + 33;
			    Class7.method80((Class40.method744
					     (0,
					      (new Class31[]
					       { Class64.aClass31Array1349[i],
						 Class55_Sub1.aClass31_1867,
						 class31 }))),
					    i_1_, arg0, arg2, false, arg4);
			}
		    }
		} else if ((Class11_Sub10_Sub4_Sub5.anInt2676 & 0x8
			    ^ 0xffffffff)
			   == -9) {
		    Class7.method80(Class40.method744(0,
						      (new Class31[]
						       { Class44.aClass31_799,
							 (Class55_Sub1
							  .aClass31_1867),
							 class31 })),
				    36, arg0, arg2, false, arg4);
		    Class47.anInt879++;
		}
		if (arg3 != 1000)
		    anInt2177 = 2;
		for (int i = 0; i < Class11_Sub7.anInt1597; i++) {
		    if (Class11_Sub10_Sub4_Sub2_Sub1.anIntArray2794[i] == 24) {
			Class4.aClass31Array141[i]
			    = Class40.method744(0, (new Class31[]
						    { Class33.aClass31_620,
						      class31 }));
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("vc.E(" + arg0 + ','
				     + (arg1 != null ? "{...}" : "null") + ','
				     + arg2 + ',' + arg3 + ',' + arg4 + ')'));
	}
    }
    
    public void method362(int arg0, int arg1, byte arg2, Buffer arg3) {
	try {
	    if (arg2 != -60)
		method365(39, 79);
	    if (arg1 == 1)
		anInt2179 = arg3.method178(2);
	    anInt2184++;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("vc.D(" + arg0 + ',' + arg1 + ',' + arg2
				     + ',' + (arg3 != null ? "{...}" : "null")
				     + ')'));
	}
    }
    
    public void method363(Buffer arg0, int arg1, int arg2) {
	anInt2174++;
	for (;;) {
	    int i = arg0.method168(255);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method362(arg2, i, (byte) -60, arg0);
	}
	if (arg1 <= 120)
	    method365(-126, -3);
    }
    
    public void method364(byte arg0) {
	try {
	    if (arg0 <= 38)
		aClass31_2181 = null;
	    anInt2180++;
	    method365(0, anInt2179);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "vc.A(" + arg0 + ')');
	}
    }
    
    public void method365(int arg0, int arg1) {
	try {
	    anInt2173++;
	    double d = (double) (0xff & arg1) / 256.0;
	    double d_2_ = (double) ((0xff60 & arg1) >> -1235167160) / 256.0;
	    double d_3_ = (double) (0xff & arg1 >> 1899771824) / 256.0;
	    double d_4_ = d_3_;
	    if (d_2_ < d_4_)
		d_4_ = d_2_;
	    if (d_4_ > d)
		d_4_ = d;
	    double d_5_ = d_3_;
	    double d_6_ = 0.0;
	    if (d_5_ < d_2_)
		d_5_ = d_2_;
	    if (d > d_5_)
		d_5_ = d;
	    double d_7_ = (double) arg0;
	    double d_8_ = (d_4_ + d_5_) / 2.0;
	    anInt2170 = (int) (d_8_ * 256.0);
	    if (d_4_ != d_5_) {
		if (d_3_ == d_5_)
		    d_6_ = (-d + d_2_) / (d_5_ - d_4_);
		else if (d_5_ == d_2_)
		    d_6_ = 2.0 + (d - d_3_) / (d_5_ - d_4_);
		else if (d == d_5_)
		    d_6_ = (-d_2_ + d_3_) / (-d_4_ + d_5_) + 4.0;
		if (d_8_ < 0.5)
		    d_7_ = (-d_4_ + d_5_) / (d_4_ + d_5_);
		if (d_8_ >= 0.5)
		    d_7_ = (d_5_ - d_4_) / (-d_5_ + 2.0 - d_4_);
	    }
	    anInt2172 = (int) (d_7_ * 256.0);
	    if (anInt2172 < 0)
		anInt2172 = 0;
	    else if ((anInt2172 ^ 0xffffffff) < -256)
		anInt2172 = 255;
	    if (d_8_ > 0.5)
		anInt2176 = (int) (512.0 * (d_7_ * (1.0 - d_8_)));
	    else
		anInt2176 = (int) (512.0 * (d_7_ * d_8_));
	    if (anInt2176 < 1)
		anInt2176 = 1;
	    if (anInt2170 >= 0) {
		if (anInt2170 > 255)
		    anInt2170 = 255;
	    } else
		anInt2170 = 0;
	    d_6_ /= 6.0;
	    anInt2182 = (int) ((double) anInt2176 * d_6_);
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "vc.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method366(int arg0) {
	try {
	    anIntArray2193 = null;
	    aClass31_2196 = null;
	    if (arg0 != 7954)
		aClass31_2181 = null;
	    aClass31_2175 = null;
	    aClass31_2194 = null;
	    anIntArray2188 = null;
	    aClass31_2181 = null;
	    aClass31_2189 = null;
	    aClass11_Sub10_Sub13_Sub3_2186 = null;
	    aClass31_2187 = null;
	    aCRC32_2171 = null;
	    anIntArray2192 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "vc.B(" + arg0 + ')');
	}
    }
    
    static {
	aCRC32_2171 = new CRC32();
	aClass31_2189 = Class64.method992("Loaded fonts", 255);
	anIntArray2193 = new int[1000];
	anInt2191 = 0;
	aClass31_2194 = Class64.method992("Sep", 255);
	aClass31_2187 = Class64.method992("*6n", 255);
	anIntArray2192 = new int[128];
	aClass31_2196 = Class64.method992("Bad session id)3", 255);
	anInt2190 = 0;
    }
}
