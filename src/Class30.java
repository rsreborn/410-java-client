/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30
{
    public static int[] anIntArray549;
    public int[] anIntArray550;
    public int anInt551;
    public int[] anIntArray552;
    public int[] anIntArray553;
    public int[] anIntArray554;
    public int anInt555;
    public static int[] anIntArray556 = new int[6];
    public boolean aBoolean557 = true;
    public int[] anIntArray558;
    public int[] anIntArray559;
    public static int[] anIntArray560;
    public int[] anIntArray561;
    public static int[][] anIntArrayArray562;
    public int anInt563;
    public int[] anIntArray564;
    public static int[] anIntArray565;
    public int anInt566;
    public static int[][] anIntArrayArray567;
    public int[] anIntArray568;
    public int[] anIntArray569;
    public static int[] anIntArray570;
    
    public static void method617() {
	anIntArray549 = null;
	anIntArray556 = null;
	anIntArray570 = null;
	anIntArray565 = null;
	anIntArray560 = null;
	anIntArrayArray567 = null;
	anIntArrayArray562 = null;
    }
    
    public Class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
		   int arg6, int arg7, int arg8, int arg9, int arg10,
		   int arg11, int arg12, int arg13, int arg14, int arg15,
		   int arg16, int arg17, int arg18) {
	if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8)
	    aBoolean557 = false;
	anInt566 = arg0;
	anInt555 = arg1;
	anInt563 = arg17;
	anInt551 = arg18;
	int i = 128;
	int i_0_ = i / 2;
	int i_1_ = i / 4;
	int i_2_ = i * 3 / 4;
	int[] is = anIntArrayArray567[arg0];
	int i_3_ = is.length;
	anIntArray552 = new int[i_3_];
	anIntArray568 = new int[i_3_];
	anIntArray559 = new int[i_3_];
	int[] is_4_ = new int[i_3_];
	int[] is_5_ = new int[i_3_];
	int i_6_ = arg3 * i;
	int i_7_ = arg4 * i;
	for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
	    int i_9_ = is[i_8_];
	    if ((i_9_ & 0x1) == 0 && i_9_ <= 8)
		i_9_ = (i_9_ - arg1 - arg1 - 1 & 0x7) + 1;
	    if (i_9_ > 8 && i_9_ <= 12)
		i_9_ = (i_9_ - 9 - arg1 & 0x3) + 9;
	    if (i_9_ > 12 && i_9_ <= 16)
		i_9_ = (i_9_ - 13 - arg1 & 0x3) + 13;
	    int i_10_;
	    int i_11_;
	    int i_12_;
	    int i_13_;
	    int i_14_;
	    if (i_9_ == 1) {
		i_10_ = i_6_;
		i_11_ = i_7_;
		i_12_ = arg5;
		i_13_ = arg9;
		i_14_ = arg13;
	    } else if (i_9_ == 2) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_;
		i_12_ = arg5 + arg6 >> 1;
		i_13_ = arg9 + arg10 >> 1;
		i_14_ = arg13 + arg14 >> 1;
	    } else if (i_9_ == 3) {
		i_10_ = i_6_ + i;
		i_11_ = i_7_;
		i_12_ = arg6;
		i_13_ = arg10;
		i_14_ = arg14;
	    } else if (i_9_ == 4) {
		i_10_ = i_6_ + i;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg6 + arg7 >> 1;
		i_13_ = arg10 + arg11 >> 1;
		i_14_ = arg14 + arg15 >> 1;
	    } else if (i_9_ == 5) {
		i_10_ = i_6_ + i;
		i_11_ = i_7_ + i;
		i_12_ = arg7;
		i_13_ = arg11;
		i_14_ = arg15;
	    } else if (i_9_ == 6) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_ + i;
		i_12_ = arg7 + arg8 >> 1;
		i_13_ = arg11 + arg12 >> 1;
		i_14_ = arg15 + arg16 >> 1;
	    } else if (i_9_ == 7) {
		i_10_ = i_6_;
		i_11_ = i_7_ + i;
		i_12_ = arg8;
		i_13_ = arg12;
		i_14_ = arg16;
	    } else if (i_9_ == 8) {
		i_10_ = i_6_;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg8 + arg5 >> 1;
		i_13_ = arg12 + arg9 >> 1;
		i_14_ = arg16 + arg13 >> 1;
	    } else if (i_9_ == 9) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_ + i_1_;
		i_12_ = arg5 + arg6 >> 1;
		i_13_ = arg9 + arg10 >> 1;
		i_14_ = arg13 + arg14 >> 1;
	    } else if (i_9_ == 10) {
		i_10_ = i_6_ + i_2_;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg6 + arg7 >> 1;
		i_13_ = arg10 + arg11 >> 1;
		i_14_ = arg14 + arg15 >> 1;
	    } else if (i_9_ == 11) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_ + i_2_;
		i_12_ = arg7 + arg8 >> 1;
		i_13_ = arg11 + arg12 >> 1;
		i_14_ = arg15 + arg16 >> 1;
	    } else if (i_9_ == 12) {
		i_10_ = i_6_ + i_1_;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg8 + arg5 >> 1;
		i_13_ = arg12 + arg9 >> 1;
		i_14_ = arg16 + arg13 >> 1;
	    } else if (i_9_ == 13) {
		i_10_ = i_6_ + i_1_;
		i_11_ = i_7_ + i_1_;
		i_12_ = arg5;
		i_13_ = arg9;
		i_14_ = arg13;
	    } else if (i_9_ == 14) {
		i_10_ = i_6_ + i_2_;
		i_11_ = i_7_ + i_1_;
		i_12_ = arg6;
		i_13_ = arg10;
		i_14_ = arg14;
	    } else if (i_9_ == 15) {
		i_10_ = i_6_ + i_2_;
		i_11_ = i_7_ + i_2_;
		i_12_ = arg7;
		i_13_ = arg11;
		i_14_ = arg15;
	    } else {
		i_10_ = i_6_ + i_1_;
		i_11_ = i_7_ + i_2_;
		i_12_ = arg8;
		i_13_ = arg12;
		i_14_ = arg16;
	    }
	    anIntArray552[i_8_] = i_10_;
	    anIntArray568[i_8_] = i_12_;
	    anIntArray559[i_8_] = i_11_;
	    is_4_[i_8_] = i_13_;
	    is_5_[i_8_] = i_14_;
	}
	int[] is_15_ = anIntArrayArray562[arg0];
	int i_16_ = is_15_.length / 4;
	anIntArray553 = new int[i_16_];
	anIntArray554 = new int[i_16_];
	anIntArray561 = new int[i_16_];
	anIntArray550 = new int[i_16_];
	anIntArray569 = new int[i_16_];
	anIntArray564 = new int[i_16_];
	if (arg2 != -1)
	    anIntArray558 = new int[i_16_];
	int i_17_ = 0;
	for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
	    int i_19_ = is_15_[i_17_];
	    int i_20_ = is_15_[i_17_ + 1];
	    int i_21_ = is_15_[i_17_ + 2];
	    int i_22_ = is_15_[i_17_ + 3];
	    i_17_ += 4;
	    if (i_20_ < 4)
		i_20_ = i_20_ - arg1 & 0x3;
	    if (i_21_ < 4)
		i_21_ = i_21_ - arg1 & 0x3;
	    if (i_22_ < 4)
		i_22_ = i_22_ - arg1 & 0x3;
	    anIntArray553[i_18_] = i_20_;
	    anIntArray554[i_18_] = i_21_;
	    anIntArray561[i_18_] = i_22_;
	    if (i_19_ == 0) {
		anIntArray550[i_18_] = is_4_[i_20_];
		anIntArray569[i_18_] = is_4_[i_21_];
		anIntArray564[i_18_] = is_4_[i_22_];
		if (anIntArray558 != null)
		    anIntArray558[i_18_] = -1;
	    } else {
		anIntArray550[i_18_] = is_5_[i_20_];
		anIntArray569[i_18_] = is_5_[i_21_];
		anIntArray564[i_18_] = is_5_[i_22_];
		if (anIntArray558 != null)
		    anIntArray558[i_18_] = arg2;
	    }
	}
	int i_23_ = arg5;
	int i_24_ = arg6;
	if (arg6 < i_23_)
	    i_23_ = arg6;
	if (arg6 > i_24_)
	    i_24_ = arg6;
	if (arg7 < i_23_)
	    i_23_ = arg7;
	if (arg7 > i_24_)
	    i_24_ = arg7;
	if (arg8 < i_23_)
	    i_23_ = arg8;
	if (arg8 > i_24_)
	    i_24_ = arg8;
	i_23_ /= 14;
	i_24_ /= 14;
    }
    
    static {
	anIntArray549 = new int[6];
	anIntArray560 = new int[6];
	anIntArray565 = new int[6];
	anIntArrayArray567
	    = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 },
			    { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 },
			    { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 },
			    { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			    { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 },
			    { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	anIntArray570 = new int[6];
	anIntArrayArray562
	    = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 },
			    { 1, 1, 2, 3, 1, 0, 1, 3 },
			    { 0, 1, 2, 3, 1, 0, 1, 3 },
			    { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 },
			    { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			    { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 },
			    { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			    { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 },
			    { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			    { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			    { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3,
			      1, 5, 4, 3, 1, 4, 2, 3 },
			    { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3,
			      0, 5, 4, 3, 0, 4, 2, 3 },
			    { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3,
			      0, 5, 2, 3, 0, 1, 2, 5 } };
    }
}
