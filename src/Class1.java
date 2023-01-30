/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.Date;

public class Class1
{
    public static int[] anIntArray72;
    public int anInt73;
    public int anInt74 = 0;
    public int anInt75;
    public static volatile boolean aBoolean76;
    public int anInt77;
    public static int anInt78;
    public int anInt79;
    public Class11_Sub10_Sub4 aClass11_Sub10_Sub4_80;
    public static int anInt81;
    public static int anInt82;
    public static Class31 aClass31_83
	= Class64.method992(" has logged out)3", 255);
    public int anInt84;
    public static int anInt85;
    public static Class31 aClass31_86;
    public static int anInt87;
    public static int anInt88;
    public static int anInt89;
    public static long aLong90;
    public static int anInt91;
    public static int anInt92;
    public static Class31 aClass31_93;
    public static boolean aBoolean94;
    public static int anInt95;
    public int anInt96 = 0;
    public static Class31 aClass31_97;
    public static Class37 aClass37_98;
    
    public static Class31 method44(byte arg0, int arg1) {
	try {
	    anInt88++;
	    if (arg1 > 10 + Class11_Sub10_Sub4_Sub5.anInt2688)
		return Class3.aClass31_109;
	    long l = (11745L + (long) arg1) * 86400000L;
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(new Date(l));
	    int i = calendar.get(5);
	    if (arg0 >= -52)
		return null;
	    int i_0_ = calendar.get(2);
	    int i_1_ = calendar.get(1);
	    Class31[] class31s
		= { Class54.aClass31_1076, Class11_Sub4.aClass31_1492,
		    Class11_Sub10_Sub4_Sub2_Sub1.aClass31_2806,
		    Class53.aClass31_1054, Class14.aClass31_282,
		    Buffer.aClass31_1574, Class63.aClass31_1322,
		    Class55.aClass31_1095, Class11_Sub10_Sub8.aClass31_2194,
		    Class53.aClass31_1048, Class11_Sub10_Sub2.aClass31_1988,
		    Class11_Sub8.aClass31_1640 };
	    return Class40.method744(0,
				     (new Class31[]
				      { Class11_Sub11.method493(i,
								(byte) -126),
					Class11_Sub10_Sub4_Sub1.aClass31_2486,
					class31s[i_0_],
					Class11_Sub10_Sub4_Sub1.aClass31_2486,
					Class11_Sub11
					    .method493(i_1_, (byte) -128) }));
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "a.B(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static boolean method45(int arg0, int arg1) {
	try {
	    anInt78++;
	    if (arg1 >= 97 && (arg1 ^ 0xffffffff) >= -123)
		return true;
	    if (arg1 >= 65 && arg1 <= 90)
		return true;
	    if (arg0 != -123)
		return false;
	    if (arg1 >= 48 && arg1 <= 57)
		return true;
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    "a.D(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method46(int arg0) {
	try {
	    if (arg0 < -28) {
		Class11_Sub10_Sub4_Sub6 class11_sub10_sub4_sub6
		    = ((Class11_Sub10_Sub4_Sub6)
		       Class11_Sub10_Sub4_Sub2_Sub2.aClass36_2818
			   .method694((byte) -123));
		anInt81++;
		for (/**/; class11_sub10_sub4_sub6 != null;
		     class11_sub10_sub4_sub6
			 = ((Class11_Sub10_Sub4_Sub6)
			    Class11_Sub10_Sub4_Sub2_Sub2.aClass36_2818
				.method701(0))) {
		    if (((class11_sub10_sub4_sub6.anInt2712 ^ 0xffffffff)
			 == (anInt82 ^ 0xffffffff))
			&& !class11_sub10_sub4_sub6.aBoolean2696) {
			if (Class61.anInt1283
			    >= class11_sub10_sub4_sub6.anInt2708) {
			    class11_sub10_sub4_sub6.method329(Class17.anInt340,
							      true);
			    if (!class11_sub10_sub4_sub6.aBoolean2696)
				Class52.aClass49_1024.method808
				    (class11_sub10_sub4_sub6.anInt2712,
				     class11_sub10_sub4_sub6.anInt2709,
				     class11_sub10_sub4_sub6.anInt2704,
				     class11_sub10_sub4_sub6.anInt2693, 60,
				     class11_sub10_sub4_sub6, 0, -1, false);
			    else
				class11_sub10_sub4_sub6.method107(0);
			}
		    } else
			class11_sub10_sub4_sub6.method107(0);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "a.E(" + arg0 + ')');
	}
    }
    
    public static void method47(Class11_Sub10_Sub4_Sub2 arg0, boolean arg1) {
	try {
	    if (arg1 == true) {
		if (arg0.anInt2537 == Class61.anInt1283
		    || (arg0.anInt2549 ^ 0xffffffff) == 0
		    || (arg0.anInt2555 ^ 0xffffffff) != -1
		    || (arg0.anInt2496 - -1
			> (NotActuallyBuffer.method600(arg0.anInt2549, 4867)
			   .anIntArray2296[arg0.anInt2558]))) {
		    int i = -arg0.anInt2509 + arg0.anInt2537;
		    int i_2_ = -arg0.anInt2509 + Class61.anInt1283;
		    int i_3_ = 64 * arg0.anInt2510 + 128 * arg0.anInt2564;
		    int i_4_ = arg0.anInt2510 * 64 + arg0.anInt2553 * 128;
		    int i_5_ = 128 * arg0.anInt2519 + 64 * arg0.anInt2510;
		    int i_6_ = arg0.anInt2510 * 64 + arg0.anInt2559 * 128;
		    arg0.anInt2506 = ((i + -i_2_) * i_6_ + i_4_ * i_2_) / i;
		    arg0.anInt2517 = ((-i_2_ + i) * i_3_ - -(i_5_ * i_2_)) / i;
		}
		anInt89++;
		arg0.anInt2515 = 0;
		if ((arg0.anInt2556 ^ 0xffffffff) == -1)
		    arg0.anInt2516 = 1024;
		if ((arg0.anInt2556 ^ 0xffffffff) == -2)
		    arg0.anInt2516 = 1536;
		if (arg0.anInt2556 == 2)
		    arg0.anInt2516 = 0;
		if (arg0.anInt2556 == 3)
		    arg0.anInt2516 = 512;
		arg0.anInt2547 = arg0.anInt2516;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception,
				    ("a.C(" + (arg0 != null ? "{...}" : "null")
				     + ',' + arg1 + ')'));
	}
    }
    
    public static void method48(int arg0) {
	try {
	    if (arg0 <= 48)
		aClass37_98 = null;
	    aClass31_93 = null;
	    aClass31_86 = null;
	    aClass37_98 = null;
	    anIntArray72 = null;
	    aClass31_97 = null;
	    aClass31_83 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class58.method939(runtimeexception, "a.A(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean76 = true;
	aLong90 = 0L;
	anInt91 = 0;
	anInt85 = 0;
	aClass31_93 = Class64.method992("redstone1", 255);
	aBoolean94 = false;
	aClass31_86 = Class64.method992("Enter message to send to ", 255);
	aClass31_97 = Class64.method992(": ", 255);
    }
}
