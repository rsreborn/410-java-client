/* Class11_Sub10_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub13 extends Class11_Sub10
{
    public static int anInt2301;
    public static int anInt2302 = 0;
    public static int anInt2303 = 0;
    public static int anInt2304;
    public static int anInt2305 = 0;
    public static int anInt2306;
    public static int[] anIntArray2307;
    
    public static void method395(int arg0, int arg1, int arg2, int arg3) {
	if (arg1 >= anInt2305 && arg1 < anInt2304) {
	    if (arg0 < anInt2303) {
		arg2 -= anInt2303 - arg0;
		arg0 = anInt2303;
	    }
	    if (arg0 + arg2 > anInt2302)
		arg2 = anInt2302 - arg0;
	    int i = arg0 + arg1 * anInt2306;
	    for (int i_0_ = 0; i_0_ < arg2; i_0_++)
		anIntArray2307[i + i_0_] = arg3;
	}
    }
    
    public static void method396(int[] arg0, int arg1, int arg2) {
	anIntArray2307 = arg0;
	anInt2306 = arg1;
	anInt2301 = arg2;
	method405(0, 0, arg1, arg2);
    }
    
    public static void method397() {
	anIntArray2307 = null;
    }
    
    public static void method398(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	if (arg1 >= anInt2305 && arg1 < anInt2304) {
	    if (arg0 < anInt2303) {
		arg2 -= anInt2303 - arg0;
		arg0 = anInt2303;
	    }
	    if (arg0 + arg2 > anInt2302)
		arg2 = anInt2302 - arg0;
	    int i = 256 - arg4;
	    int i_1_ = (arg3 >> 16 & 0xff) * arg4;
	    int i_2_ = (arg3 >> 8 & 0xff) * arg4;
	    int i_3_ = (arg3 & 0xff) * arg4;
	    int i_4_ = arg0 + arg1 * anInt2306;
	    for (int i_5_ = 0; i_5_ < arg2; i_5_++) {
		int i_6_ = (anIntArray2307[i_4_] >> 16 & 0xff) * i;
		int i_7_ = (anIntArray2307[i_4_] >> 8 & 0xff) * i;
		int i_8_ = (anIntArray2307[i_4_] & 0xff) * i;
		int i_9_ = ((i_1_ + i_6_ >> 8 << 16) + (i_2_ + i_7_ >> 8 << 8)
			    + (i_3_ + i_8_ >> 8));
		anIntArray2307[i_4_++] = i_9_;
	    }
	}
    }
    
    public static void method399(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	method395(arg0, arg1, arg2, arg4);
	method395(arg0, arg1 + arg3 - 1, arg2, arg4);
	method403(arg0, arg1, arg3, arg4);
	method403(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
    
    public static void method400(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	if (arg0 >= anInt2303 && arg0 < anInt2302) {
	    if (arg1 < anInt2305) {
		arg2 -= anInt2305 - arg1;
		arg1 = anInt2305;
	    }
	    if (arg1 + arg2 > anInt2304)
		arg2 = anInt2304 - arg1;
	    int i = 256 - arg4;
	    int i_10_ = (arg3 >> 16 & 0xff) * arg4;
	    int i_11_ = (arg3 >> 8 & 0xff) * arg4;
	    int i_12_ = (arg3 & 0xff) * arg4;
	    int i_13_ = arg0 + arg1 * anInt2306;
	    for (int i_14_ = 0; i_14_ < arg2; i_14_++) {
		int i_15_ = (anIntArray2307[i_13_] >> 16 & 0xff) * i;
		int i_16_ = (anIntArray2307[i_13_] >> 8 & 0xff) * i;
		int i_17_ = (anIntArray2307[i_13_] & 0xff) * i;
		int i_18_
		    = ((i_10_ + i_15_ >> 8 << 16) + (i_11_ + i_16_ >> 8 << 8)
		       + (i_12_ + i_17_ >> 8));
		anIntArray2307[i_13_] = i_18_;
		i_13_ += anInt2306;
	    }
	}
    }
    
    public static void method401(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	method398(arg0, arg1, arg2, arg4, arg5);
	method398(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
	if (arg3 >= 3) {
	    method400(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
	    method400(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}
    }
    
    public static void method402() {
	int i = 0;
	int i_19_ = anInt2306 * anInt2301 - 7;
	while (i < i_19_) {
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	    anIntArray2307[i++] = 0;
	}
	i_19_ += 7;
	while (i < i_19_)
	    anIntArray2307[i++] = 0;
    }
    
    public static void method403(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 >= anInt2303 && arg0 < anInt2302) {
	    if (arg1 < anInt2305) {
		arg2 -= anInt2305 - arg1;
		arg1 = anInt2305;
	    }
	    if (arg1 + arg2 > anInt2304)
		arg2 = anInt2304 - arg1;
	    int i = arg0 + arg1 * anInt2306;
	    for (int i_20_ = 0; i_20_ < arg2; i_20_++)
		anIntArray2307[i + i_20_ * anInt2306] = arg3;
	}
    }
    
    public static void method404(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	if (arg0 < anInt2303) {
	    arg2 -= anInt2303 - arg0;
	    arg0 = anInt2303;
	}
	if (arg1 < anInt2305) {
	    arg3 -= anInt2305 - arg1;
	    arg1 = anInt2305;
	}
	if (arg0 + arg2 > anInt2302)
	    arg2 = anInt2302 - arg0;
	if (arg1 + arg3 > anInt2304)
	    arg3 = anInt2304 - arg1;
	int i = anInt2306 - arg2;
	int i_21_ = arg0 + arg1 * anInt2306;
	for (int i_22_ = -arg3; i_22_ < 0; i_22_++) {
	    for (int i_23_ = -arg2; i_23_ < 0; i_23_++)
		anIntArray2307[i_21_++] = arg4;
	    i_21_ += i;
	}
    }
    
    public static void method405(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 < 0)
	    arg0 = 0;
	if (arg1 < 0)
	    arg1 = 0;
	if (arg2 > anInt2306)
	    arg2 = anInt2306;
	if (arg3 > anInt2301)
	    arg3 = anInt2301;
	anInt2303 = arg0;
	anInt2305 = arg1;
	anInt2302 = arg2;
	anInt2304 = arg3;
    }
    
    public static void method406() {
	anInt2303 = 0;
	anInt2305 = 0;
	anInt2302 = anInt2306;
	anInt2304 = anInt2301;
    }
    
    public static void method407(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	if (arg0 < anInt2303) {
	    arg2 -= anInt2303 - arg0;
	    arg0 = anInt2303;
	}
	if (arg1 < anInt2305) {
	    arg3 -= anInt2305 - arg1;
	    arg1 = anInt2305;
	}
	if (arg0 + arg2 > anInt2302)
	    arg2 = anInt2302 - arg0;
	if (arg1 + arg3 > anInt2304)
	    arg3 = anInt2304 - arg1;
	int i = 256 - arg5;
	int i_24_ = (arg4 >> 16 & 0xff) * arg5;
	int i_25_ = (arg4 >> 8 & 0xff) * arg5;
	int i_26_ = (arg4 & 0xff) * arg5;
	int i_27_ = anInt2306 - arg2;
	int i_28_ = arg0 + arg1 * anInt2306;
	for (int i_29_ = 0; i_29_ < arg3; i_29_++) {
	    for (int i_30_ = -arg2; i_30_ < 0; i_30_++) {
		int i_31_ = (anIntArray2307[i_28_] >> 16 & 0xff) * i;
		int i_32_ = (anIntArray2307[i_28_] >> 8 & 0xff) * i;
		int i_33_ = (anIntArray2307[i_28_] & 0xff) * i;
		int i_34_
		    = ((i_24_ + i_31_ >> 8 << 16) + (i_25_ + i_32_ >> 8 << 8)
		       + (i_26_ + i_33_ >> 8));
		anIntArray2307[i_28_++] = i_34_;
	    }
	    i_28_ += i_27_;
	}
    }
    
    static {
	anInt2304 = 0;
    }
}
