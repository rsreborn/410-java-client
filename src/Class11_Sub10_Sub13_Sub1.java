/* Class11_Sub10_Sub13_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub10_Sub13_Sub1 extends Class11_Sub10_Sub13
{
    public static int[] anIntArray2721 = new int[2048];
    public static int anInt2722;
    public static int anInt2723;
    public static boolean aBoolean2724 = true;
    public static int[] anIntArray2725;
    public static int anInt2726;
    public static Interface3 anInterface3_2727;
    public static int[] anIntArray2728;
    public static int anInt2729;
    public static int anInt2730;
    public static int anInt2731;
    public static boolean aBoolean2732 = false;
    public static int anInt2733;
    public static int anInt2734;
    public static boolean aBoolean2735 = false;
    public static int anInt2736;
    public static boolean aBoolean2737;
    public static int[] anIntArray2738;
    public static int[] anIntArray2739;
    public static int[] anIntArray2740;
    
    public static int method408(int arg0, int arg1) {
	arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public static int[] method409() {
	return anIntArray2739;
    }
    
    public static void method410(double arg0) {
	arg0 += Math.random() * 0.03 - 0.015;
	int i = 0;
	for (int i_0_ = 0; i_0_ < 512; i_0_++) {
	    double d = (double) (i_0_ >> 3) / 64.0 + 0.0078125;
	    double d_1_ = (double) (i_0_ & 0x7) / 8.0 + 0.0625;
	    for (int i_2_ = 0; i_2_ < 128; i_2_++) {
		double d_3_ = (double) i_2_ / 128.0;
		double d_4_ = d_3_;
		double d_5_ = d_3_;
		double d_6_ = d_3_;
		if (d_1_ != 0.0) {
		    double d_7_;
		    if (d_3_ < 0.5)
			d_7_ = d_3_ * (1.0 + d_1_);
		    else
			d_7_ = d_3_ + d_1_ - d_3_ * d_1_;
		    double d_8_ = 2.0 * d_3_ - d_7_;
		    double d_9_ = d + 0.3333333333333333;
		    if (d_9_ > 1.0)
			d_9_--;
		    double d_10_ = d;
		    double d_11_ = d - 0.3333333333333333;
		    if (d_11_ < 0.0)
			d_11_++;
		    if (6.0 * d_9_ < 1.0)
			d_4_ = d_8_ + (d_7_ - d_8_) * 6.0 * d_9_;
		    else if (2.0 * d_9_ < 1.0)
			d_4_ = d_7_;
		    else if (3.0 * d_9_ < 2.0)
			d_4_ = d_8_ + ((d_7_ - d_8_)
				       * (0.6666666666666666 - d_9_) * 6.0);
		    else
			d_4_ = d_8_;
		    if (6.0 * d_10_ < 1.0)
			d_5_ = d_8_ + (d_7_ - d_8_) * 6.0 * d_10_;
		    else if (2.0 * d_10_ < 1.0)
			d_5_ = d_7_;
		    else if (3.0 * d_10_ < 2.0)
			d_5_ = d_8_ + ((d_7_ - d_8_)
				       * (0.6666666666666666 - d_10_) * 6.0);
		    else
			d_5_ = d_8_;
		    if (6.0 * d_11_ < 1.0)
			d_6_ = d_8_ + (d_7_ - d_8_) * 6.0 * d_11_;
		    else if (2.0 * d_11_ < 1.0)
			d_6_ = d_7_;
		    else if (3.0 * d_11_ < 2.0)
			d_6_ = d_8_ + ((d_7_ - d_8_)
				       * (0.6666666666666666 - d_11_) * 6.0);
		    else
			d_6_ = d_8_;
		}
		int i_12_ = (int) (d_4_ * 256.0);
		int i_13_ = (int) (d_5_ * 256.0);
		int i_14_ = (int) (d_6_ * 256.0);
		int i_15_ = (i_12_ << 16) + (i_13_ << 8) + i_14_;
		i_15_ = method413(i_15_, arg0);
		if (i_15_ == 0)
		    i_15_ = 1;
		anIntArray2740[i++] = i_15_;
	    }
	}
    }
    
    public static int[] method411(int arg0, int arg1, int arg2, int arg3,
				  int[] arg4) {
	anInt2723 = arg2 - arg0;
	anInt2736 = arg3 - arg1;
	if (arg4 == null) {
	    int i = anInt2736;
	    if (i == 0)
		i++;
	    anIntArray2739 = new int[i];
	    for (int i_16_ = 0; i_16_ < i; i_16_++)
		anIntArray2739[i_16_]
		    = (arg1 + i_16_) * Class11_Sub10_Sub13.anInt2306 + arg0;
	} else
	    anIntArray2739 = arg4;
	method420();
	return anIntArray2739;
    }
    
    public static void method412(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 int arg12, int arg13, int arg14) {
	if (arg5 < arg6) {
	    int i;
	    int i_17_;
	    if (aBoolean2732) {
		i_17_ = (arg8 - arg7) / (arg6 - arg5);
		if (arg6 > anInt2723)
		    arg6 = anInt2723;
		if (arg5 < 0) {
		    arg7 -= arg5 * i_17_;
		    arg5 = 0;
		}
		if (arg5 >= arg6)
		    return;
		i = arg6 - arg5 >> 3;
		i_17_ <<= 12;
		arg7 <<= 9;
	    } else {
		if (arg6 - arg5 > 7) {
		    i = arg6 - arg5 >> 3;
		    i_17_ = (arg8 - arg7) * anIntArray2728[i] >> 6;
		} else {
		    i = 0;
		    i_17_ = 0;
		}
		arg7 <<= 9;
	    }
	    arg4 += arg5;
	    if (aBoolean2735) {
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = arg5 - anInt2730;
		arg9 += (arg12 >> 3) * i_20_;
		arg10 += (arg13 >> 3) * i_20_;
		arg11 += (arg14 >> 3) * i_20_;
		int i_21_ = arg11 >> 12;
		if (i_21_ != 0) {
		    arg2 = arg9 / i_21_;
		    arg3 = arg10 / i_21_;
		    if (arg2 < 0)
			arg2 = 0;
		    else if (arg2 > 4032)
			arg2 = 4032;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		i_21_ = arg11 >> 12;
		if (i_21_ != 0) {
		    i_18_ = arg9 / i_21_;
		    i_19_ = arg10 / i_21_;
		    if (i_18_ < 7)
			i_18_ = 7;
		    else if (i_18_ > 4032)
			i_18_ = 4032;
		}
		int i_22_ = i_18_ - arg2 >> 3;
		int i_23_ = i_19_ - arg3 >> 3;
		arg2 += (arg7 & 0x600000) >> 3;
		int i_24_ = arg7 >> 23;
		if (aBoolean2737) {
		    while (i-- > 0) {
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 = i_18_;
			arg3 = i_19_;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			i_21_ = arg11 >> 12;
			if (i_21_ != 0) {
			    i_18_ = arg9 / i_21_;
			    i_19_ = arg10 / i_21_;
			    if (i_18_ < 7)
				i_18_ = 7;
			    else if (i_18_ > 4032)
				i_18_ = 4032;
			}
			i_22_ = i_18_ - arg2 >> 3;
			i_23_ = i_19_ - arg3 >> 3;
			arg7 += i_17_;
			arg2 += (arg7 & 0x600000) >> 3;
			i_24_ = arg7 >> 23;
		    }
		    i = arg6 - arg5 & 0x7;
		    while (i-- > 0) {
			arg0[arg4++]
			    = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_;
			arg2 += i_22_;
			arg3 += i_23_;
		    }
		} else {
		    while (i-- > 0) {
			int i_25_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
			if ((i_25_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_25_;
			arg4++;
			arg2 = i_18_;
			arg3 = i_19_;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			i_21_ = arg11 >> 12;
			if (i_21_ != 0) {
			    i_18_ = arg9 / i_21_;
			    i_19_ = arg10 / i_21_;
			    if (i_18_ < 7)
				i_18_ = 7;
			    else if (i_18_ > 4032)
				i_18_ = 4032;
			}
			i_22_ = i_18_ - arg2 >> 3;
			i_23_ = i_19_ - arg3 >> 3;
			arg7 += i_17_;
			arg2 += (arg7 & 0x600000) >> 3;
			i_24_ = arg7 >> 23;
		    }
		    i = arg6 - arg5 & 0x7;
		    while (i-- > 0) {
			int i_26_;
			if ((i_26_
			     = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_24_)
			    != 0)
			    arg0[arg4] = i_26_;
			arg4++;
			arg2 += i_22_;
			arg3 += i_23_;
		    }
		}
	    } else {
		int i_27_ = 0;
		int i_28_ = 0;
		int i_29_ = arg5 - anInt2730;
		arg9 += (arg12 >> 3) * i_29_;
		arg10 += (arg13 >> 3) * i_29_;
		arg11 += (arg14 >> 3) * i_29_;
		int i_30_ = arg11 >> 14;
		if (i_30_ != 0) {
		    arg2 = arg9 / i_30_;
		    arg3 = arg10 / i_30_;
		    if (arg2 < 0)
			arg2 = 0;
		    else if (arg2 > 16256)
			arg2 = 16256;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		i_30_ = arg11 >> 14;
		if (i_30_ != 0) {
		    i_27_ = arg9 / i_30_;
		    i_28_ = arg10 / i_30_;
		    if (i_27_ < 7)
			i_27_ = 7;
		    else if (i_27_ > 16256)
			i_27_ = 16256;
		}
		int i_31_ = i_27_ - arg2 >> 3;
		int i_32_ = i_28_ - arg3 >> 3;
		arg2 += arg7 & 0x600000;
		int i_33_ = arg7 >> 23;
		if (aBoolean2737) {
		    while (i-- > 0) {
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 = i_27_;
			arg3 = i_28_;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			i_30_ = arg11 >> 14;
			if (i_30_ != 0) {
			    i_27_ = arg9 / i_30_;
			    i_28_ = arg10 / i_30_;
			    if (i_27_ < 7)
				i_27_ = 7;
			    else if (i_27_ > 16256)
				i_27_ = 16256;
			}
			i_31_ = i_27_ - arg2 >> 3;
			i_32_ = i_28_ - arg3 >> 3;
			arg7 += i_17_;
			arg2 += arg7 & 0x600000;
			i_33_ = arg7 >> 23;
		    }
		    i = arg6 - arg5 & 0x7;
		    while (i-- > 0) {
			arg0[arg4++]
			    = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_;
			arg2 += i_31_;
			arg3 += i_32_;
		    }
		} else {
		    while (i-- > 0) {
			int i_34_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
			if ((i_34_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_34_;
			arg4++;
			arg2 = i_27_;
			arg3 = i_28_;
			arg9 += arg12;
			arg10 += arg13;
			arg11 += arg14;
			i_30_ = arg11 >> 14;
			if (i_30_ != 0) {
			    i_27_ = arg9 / i_30_;
			    i_28_ = arg10 / i_30_;
			    if (i_27_ < 7)
				i_27_ = 7;
			    else if (i_27_ > 16256)
				i_27_ = 16256;
			}
			i_31_ = i_27_ - arg2 >> 3;
			i_32_ = i_28_ - arg3 >> 3;
			arg7 += i_17_;
			arg2 += arg7 & 0x600000;
			i_33_ = arg7 >> 23;
		    }
		    i = arg6 - arg5 & 0x7;
		    while (i-- > 0) {
			int i_35_;
			if ((i_35_
			     = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_33_)
			    != 0)
			    arg0[arg4] = i_35_;
			arg4++;
			arg2 += i_31_;
			arg3 += i_32_;
		    }
		}
	    }
	}
    }
    
    public static int method413(int arg0, double arg1) {
	double d = (double) (arg0 >> 16) / 256.0;
	double d_36_ = (double) (arg0 >> 8 & 0xff) / 256.0;
	double d_37_ = (double) (arg0 & 0xff) / 256.0;
	d = Math.pow(d, arg1);
	d_36_ = Math.pow(d_36_, arg1);
	d_37_ = Math.pow(d_37_, arg1);
	int i = (int) (d * 256.0);
	int i_38_ = (int) (d_36_ * 256.0);
	int i_39_ = (int) (d_37_ * 256.0);
	return (i << 16) + (i_38_ << 8) + i_39_;
    }
    
    public static void method414(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = 0;
	int i_40_ = 0;
	if (arg1 != arg0) {
	    i = (arg4 - arg3 << 16) / (arg1 - arg0);
	    i_40_ = (arg7 - arg6 << 15) / (arg1 - arg0);
	}
	int i_41_ = 0;
	int i_42_ = 0;
	if (arg2 != arg1) {
	    i_41_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    i_42_ = (arg8 - arg7 << 15) / (arg2 - arg1);
	}
	int i_43_ = 0;
	int i_44_ = 0;
	if (arg2 != arg0) {
	    i_43_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    i_44_ = (arg6 - arg8 << 15) / (arg0 - arg2);
	}
	if (arg0 <= arg1 && arg0 <= arg2) {
	    if (arg0 < anInt2736) {
		if (arg1 > anInt2736)
		    arg1 = anInt2736;
		if (arg2 > anInt2736)
		    arg2 = anInt2736;
		if (arg1 < arg2) {
		    arg5 = arg3 <<= 16;
		    arg8 = arg6 <<= 15;
		    if (arg0 < 0) {
			arg5 -= i_43_ * arg0;
			arg3 -= i * arg0;
			arg8 -= i_44_ * arg0;
			arg6 -= i_40_ * arg0;
			arg0 = 0;
		    }
		    arg4 <<= 16;
		    arg7 <<= 15;
		    if (arg1 < 0) {
			arg4 -= i_41_ * arg1;
			arg7 -= i_42_ * arg1;
			arg1 = 0;
		    }
		    if (arg0 != arg1 && i_43_ < i
			|| arg0 == arg1 && i_43_ > i_41_) {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg1 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
				      arg6 >> 7);
			    arg5 += i_43_;
			    arg3 += i;
			    arg8 += i_44_;
			    arg6 += i_40_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
				      arg7 >> 7);
			    arg5 += i_43_;
			    arg4 += i_41_;
			    arg8 += i_44_;
			    arg7 += i_42_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg1 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
				      arg8 >> 7);
			    arg5 += i_43_;
			    arg3 += i;
			    arg8 += i_44_;
			    arg6 += i_40_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
				      arg8 >> 7);
			    arg5 += i_43_;
			    arg4 += i_41_;
			    arg8 += i_44_;
			    arg7 += i_42_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		} else {
		    arg4 = arg3 <<= 16;
		    arg7 = arg6 <<= 15;
		    if (arg0 < 0) {
			arg4 -= i_43_ * arg0;
			arg3 -= i * arg0;
			arg7 -= i_44_ * arg0;
			arg6 -= i_40_ * arg0;
			arg0 = 0;
		    }
		    arg5 <<= 16;
		    arg8 <<= 15;
		    if (arg2 < 0) {
			arg5 -= i_41_ * arg2;
			arg8 -= i_42_ * arg2;
			arg2 = 0;
		    }
		    if (arg0 != arg2 && i_43_ < i
			|| arg0 == arg2 && i_41_ > i) {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
				      arg6 >> 7);
			    arg4 += i_43_;
			    arg3 += i;
			    arg7 += i_44_;
			    arg6 += i_40_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg1 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
				      arg6 >> 7);
			    arg5 += i_41_;
			    arg3 += i;
			    arg8 += i_42_;
			    arg6 += i_40_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
				      arg7 >> 7);
			    arg4 += i_43_;
			    arg3 += i;
			    arg7 += i_44_;
			    arg6 += i_40_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg1 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
				      arg8 >> 7);
			    arg5 += i_41_;
			    arg3 += i;
			    arg8 += i_42_;
			    arg6 += i_40_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		}
	    }
	} else if (arg1 <= arg2) {
	    if (arg1 < anInt2736) {
		if (arg2 > anInt2736)
		    arg2 = anInt2736;
		if (arg0 > anInt2736)
		    arg0 = anInt2736;
		if (arg2 < arg0) {
		    arg3 = arg4 <<= 16;
		    arg6 = arg7 <<= 15;
		    if (arg1 < 0) {
			arg3 -= i * arg1;
			arg4 -= i_41_ * arg1;
			arg6 -= i_40_ * arg1;
			arg7 -= i_42_ * arg1;
			arg1 = 0;
		    }
		    arg5 <<= 16;
		    arg8 <<= 15;
		    if (arg2 < 0) {
			arg5 -= i_43_ * arg2;
			arg8 -= i_44_ * arg2;
			arg2 = 0;
		    }
		    if (arg1 != arg2 && i < i_41_
			|| arg1 == arg2 && i > i_43_) {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
				      arg7 >> 7);
			    arg3 += i;
			    arg4 += i_41_;
			    arg6 += i_40_;
			    arg7 += i_42_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg0 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
				      arg8 >> 7);
			    arg3 += i;
			    arg5 += i_43_;
			    arg6 += i_40_;
			    arg8 += i_44_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
				      arg6 >> 7);
			    arg3 += i;
			    arg4 += i_41_;
			    arg6 += i_40_;
			    arg7 += i_42_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg0 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
				      arg6 >> 7);
			    arg3 += i;
			    arg5 += i_43_;
			    arg6 += i_40_;
			    arg8 += i_44_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		} else {
		    arg5 = arg4 <<= 16;
		    arg8 = arg7 <<= 15;
		    if (arg1 < 0) {
			arg5 -= i * arg1;
			arg4 -= i_41_ * arg1;
			arg8 -= i_40_ * arg1;
			arg7 -= i_42_ * arg1;
			arg1 = 0;
		    }
		    arg3 <<= 16;
		    arg6 <<= 15;
		    if (arg0 < 0) {
			arg3 -= i_43_ * arg0;
			arg6 -= i_44_ * arg0;
			arg0 = 0;
		    }
		    if (i < i_41_) {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg0 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
				      arg7 >> 7);
			    arg5 += i;
			    arg4 += i_41_;
			    arg8 += i_40_;
			    arg7 += i_42_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
				      arg7 >> 7);
			    arg3 += i_43_;
			    arg4 += i_41_;
			    arg6 += i_44_;
			    arg7 += i_42_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg0 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
				      arg8 >> 7);
			    arg5 += i;
			    arg4 += i_41_;
			    arg8 += i_40_;
			    arg7 += i_42_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method421(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
				      arg6 >> 7);
			    arg3 += i_43_;
			    arg4 += i_41_;
			    arg6 += i_44_;
			    arg7 += i_42_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		}
	    }
	} else if (arg2 < anInt2736) {
	    if (arg0 > anInt2736)
		arg0 = anInt2736;
	    if (arg1 > anInt2736)
		arg1 = anInt2736;
	    if (arg0 < arg1) {
		arg4 = arg5 <<= 16;
		arg7 = arg8 <<= 15;
		if (arg2 < 0) {
		    arg4 -= i_41_ * arg2;
		    arg5 -= i_43_ * arg2;
		    arg7 -= i_42_ * arg2;
		    arg8 -= i_44_ * arg2;
		    arg2 = 0;
		}
		arg3 <<= 16;
		arg6 <<= 15;
		if (arg0 < 0) {
		    arg3 -= i * arg0;
		    arg6 -= i_40_ * arg0;
		    arg0 = 0;
		}
		if (i_41_ < i_43_) {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg0 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
				  arg8 >> 7);
			arg4 += i_41_;
			arg5 += i_43_;
			arg7 += i_42_;
			arg8 += i_44_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg1 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
				  arg6 >> 7);
			arg4 += i_41_;
			arg3 += i;
			arg7 += i_42_;
			arg6 += i_40_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		} else {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg0 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
				  arg7 >> 7);
			arg4 += i_41_;
			arg5 += i_43_;
			arg7 += i_42_;
			arg8 += i_44_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg1 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
				  arg7 >> 7);
			arg4 += i_41_;
			arg3 += i;
			arg7 += i_42_;
			arg6 += i_40_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		}
	    } else {
		arg3 = arg5 <<= 16;
		arg6 = arg8 <<= 15;
		if (arg2 < 0) {
		    arg3 -= i_41_ * arg2;
		    arg5 -= i_43_ * arg2;
		    arg6 -= i_42_ * arg2;
		    arg8 -= i_44_ * arg2;
		    arg2 = 0;
		}
		arg4 <<= 16;
		arg7 <<= 15;
		if (arg1 < 0) {
		    arg4 -= i * arg1;
		    arg7 -= i_40_ * arg1;
		    arg1 = 0;
		}
		if (i_41_ < i_43_) {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg1 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
				  arg8 >> 7);
			arg3 += i_41_;
			arg5 += i_43_;
			arg6 += i_42_;
			arg8 += i_44_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg0 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
				  arg8 >> 7);
			arg4 += i;
			arg5 += i_43_;
			arg7 += i_40_;
			arg8 += i_44_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		} else {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg1 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
				  arg6 >> 7);
			arg3 += i_41_;
			arg5 += i_43_;
			arg6 += i_42_;
			arg8 += i_44_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg0 >= 0) {
			method421(Class11_Sub10_Sub13.anIntArray2307, arg2, 0,
				  0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
				  arg7 >> 7);
			arg4 += i;
			arg5 += i_43_;
			arg7 += i_40_;
			arg8 += i_44_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		}
	    }
	}
    }
    
    public static void method415(Interface3 arg0) {
	anInterface3_2727 = arg0;
    }
    
    public static void method416(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	int i = 0;
	if (arg1 != arg0)
	    i = (arg4 - arg3 << 16) / (arg1 - arg0);
	int i_45_ = 0;
	if (arg2 != arg1)
	    i_45_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	int i_46_ = 0;
	if (arg2 != arg0)
	    i_46_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	if (arg0 <= arg1 && arg0 <= arg2) {
	    if (arg0 < anInt2736) {
		if (arg1 > anInt2736)
		    arg1 = anInt2736;
		if (arg2 > anInt2736)
		    arg2 = anInt2736;
		if (arg1 < arg2) {
		    arg5 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg5 -= i_46_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_45_ * arg1;
			arg1 = 0;
		    }
		    if (arg0 != arg1 && i_46_ < i
			|| arg0 == arg1 && i_46_ > i_45_) {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg1 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg5 >> 16, arg3 >> 16);
			    arg5 += i_46_;
			    arg3 += i;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg5 >> 16, arg4 >> 16);
			    arg5 += i_46_;
			    arg4 += i_45_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg1 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg3 >> 16, arg5 >> 16);
			    arg5 += i_46_;
			    arg3 += i;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg4 >> 16, arg5 >> 16);
			    arg5 += i_46_;
			    arg4 += i_45_;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		} else {
		    arg4 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg4 -= i_46_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_45_ * arg2;
			arg2 = 0;
		    }
		    if (arg0 != arg2 && i_46_ < i
			|| arg0 == arg2 && i_45_ > i) {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg4 >> 16, arg3 >> 16);
			    arg4 += i_46_;
			    arg3 += i;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg1 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg5 >> 16, arg3 >> 16);
			    arg5 += i_45_;
			    arg3 += i;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray2739[arg0];
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg3 >> 16, arg4 >> 16);
			    arg4 += i_46_;
			    arg3 += i;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg1 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg0,
				      arg6, 0, arg3 >> 16, arg5 >> 16);
			    arg5 += i_45_;
			    arg3 += i;
			    arg0 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		}
	    }
	} else if (arg1 <= arg2) {
	    if (arg1 < anInt2736) {
		if (arg2 > anInt2736)
		    arg2 = anInt2736;
		if (arg0 > anInt2736)
		    arg0 = anInt2736;
		if (arg2 < arg0) {
		    arg3 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg3 -= i * arg1;
			arg4 -= i_45_ * arg1;
			arg1 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_46_ * arg2;
			arg2 = 0;
		    }
		    if (arg1 != arg2 && i < i_45_
			|| arg1 == arg2 && i > i_46_) {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg3 >> 16, arg4 >> 16);
			    arg3 += i;
			    arg4 += i_45_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg0 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg3 >> 16, arg5 >> 16);
			    arg3 += i;
			    arg5 += i_46_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg4 >> 16, arg3 >> 16);
			    arg3 += i;
			    arg4 += i_45_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg0 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg5 >> 16, arg3 >> 16);
			    arg3 += i;
			    arg5 += i_46_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		} else {
		    arg5 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg5 -= i * arg1;
			arg4 -= i_45_ * arg1;
			arg1 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_46_ * arg0;
			arg0 = 0;
		    }
		    if (i < i_45_) {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg0 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg5 >> 16, arg4 >> 16);
			    arg5 += i;
			    arg4 += i_45_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg3 >> 16, arg4 >> 16);
			    arg3 += i_46_;
			    arg4 += i_45_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    } else {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray2739[arg1];
			while (--arg0 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg4 >> 16, arg5 >> 16);
			    arg5 += i;
			    arg4 += i_45_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
			while (--arg2 >= 0) {
			    method423(Class11_Sub10_Sub13.anIntArray2307, arg1,
				      arg6, 0, arg4 >> 16, arg3 >> 16);
			    arg3 += i_46_;
			    arg4 += i_45_;
			    arg1 += Class11_Sub10_Sub13.anInt2306;
			}
		    }
		}
	    }
	} else if (arg2 < anInt2736) {
	    if (arg0 > anInt2736)
		arg0 = anInt2736;
	    if (arg1 > anInt2736)
		arg1 = anInt2736;
	    if (arg0 < arg1) {
		arg4 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg4 -= i_45_ * arg2;
		    arg5 -= i_46_ * arg2;
		    arg2 = 0;
		}
		arg3 <<= 16;
		if (arg0 < 0) {
		    arg3 -= i * arg0;
		    arg0 = 0;
		}
		if (i_45_ < i_46_) {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg0 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg4 >> 16, arg5 >> 16);
			arg4 += i_45_;
			arg5 += i_46_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg1 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg4 >> 16, arg3 >> 16);
			arg4 += i_45_;
			arg3 += i;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		} else {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg0 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg5 >> 16, arg4 >> 16);
			arg4 += i_45_;
			arg5 += i_46_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg1 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg3 >> 16, arg4 >> 16);
			arg4 += i_45_;
			arg3 += i;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		}
	    } else {
		arg3 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg3 -= i_45_ * arg2;
		    arg5 -= i_46_ * arg2;
		    arg2 = 0;
		}
		arg4 <<= 16;
		if (arg1 < 0) {
		    arg4 -= i * arg1;
		    arg1 = 0;
		}
		if (i_45_ < i_46_) {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg1 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg3 >> 16, arg5 >> 16);
			arg3 += i_45_;
			arg5 += i_46_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg0 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg4 >> 16, arg5 >> 16);
			arg4 += i;
			arg5 += i_46_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		} else {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray2739[arg2];
		    while (--arg1 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg5 >> 16, arg3 >> 16);
			arg3 += i_45_;
			arg5 += i_46_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		    while (--arg0 >= 0) {
			method423(Class11_Sub10_Sub13.anIntArray2307, arg2,
				  arg6, 0, arg5 >> 16, arg4 >> 16);
			arg4 += i;
			arg5 += i_46_;
			arg2 += Class11_Sub10_Sub13.anInt2306;
		    }
		}
	    }
	}
    }
    
    public static int[] method417(int[] arg0) {
	return method411(Class11_Sub10_Sub13.anInt2303,
			 Class11_Sub10_Sub13.anInt2305,
			 Class11_Sub10_Sub13.anInt2302,
			 Class11_Sub10_Sub13.anInt2304, arg0);
    }
    
    public static void method418
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
	int[] is = anInterface3_2727.method9(arg18, (byte) -125);
	if (is == null) {
	    int i = anInterface3_2727.method8(true, arg18);
	    method414(arg0, arg1, arg2, arg3, arg4, arg5, method408(i, arg6),
		      method408(i, arg7), method408(i, arg8));
	} else {
	    aBoolean2735 = anInterface3_2727.method6(arg18, (byte) 79);
	    aBoolean2737 = anInterface3_2727.method7((byte) -20, arg18);
	    arg10 = arg9 - arg10;
	    arg13 = arg12 - arg13;
	    arg16 = arg15 - arg16;
	    arg11 -= arg9;
	    arg14 -= arg12;
	    arg17 -= arg15;
	    int i = arg11 * arg12 - arg14 * arg9 << 14;
	    int i_47_ = arg14 * arg15 - arg17 * arg12 << 8;
	    int i_48_ = arg17 * arg9 - arg11 * arg15 << 5;
	    int i_49_ = arg10 * arg12 - arg13 * arg9 << 14;
	    int i_50_ = arg13 * arg15 - arg16 * arg12 << 8;
	    int i_51_ = arg16 * arg9 - arg10 * arg15 << 5;
	    int i_52_ = arg13 * arg11 - arg10 * arg14 << 14;
	    int i_53_ = arg16 * arg14 - arg13 * arg17 << 8;
	    int i_54_ = arg10 * arg17 - arg16 * arg11 << 5;
	    int i_55_ = 0;
	    int i_56_ = 0;
	    if (arg1 != arg0) {
		i_55_ = (arg4 - arg3 << 16) / (arg1 - arg0);
		i_56_ = (arg7 - arg6 << 16) / (arg1 - arg0);
	    }
	    int i_57_ = 0;
	    int i_58_ = 0;
	    if (arg2 != arg1) {
		i_57_ = (arg5 - arg4 << 16) / (arg2 - arg1);
		i_58_ = (arg8 - arg7 << 16) / (arg2 - arg1);
	    }
	    int i_59_ = 0;
	    int i_60_ = 0;
	    if (arg2 != arg0) {
		i_59_ = (arg3 - arg5 << 16) / (arg0 - arg2);
		i_60_ = (arg6 - arg8 << 16) / (arg0 - arg2);
	    }
	    if (arg0 <= arg1 && arg0 <= arg2) {
		if (arg0 < anInt2736) {
		    if (arg1 > anInt2736)
			arg1 = anInt2736;
		    if (arg2 > anInt2736)
			arg2 = anInt2736;
		    if (arg1 < arg2) {
			arg5 = arg3 <<= 16;
			arg8 = arg6 <<= 16;
			if (arg0 < 0) {
			    arg5 -= i_59_ * arg0;
			    arg3 -= i_55_ * arg0;
			    arg8 -= i_60_ * arg0;
			    arg6 -= i_56_ * arg0;
			    arg0 = 0;
			}
			arg4 <<= 16;
			arg7 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_57_ * arg1;
			    arg7 -= i_58_ * arg1;
			    arg1 = 0;
			}
			int i_61_ = arg0 - anInt2729;
			i += i_48_ * i_61_;
			i_49_ += i_51_ * i_61_;
			i_52_ += i_54_ * i_61_;
			if (arg0 != arg1 && i_59_ < i_55_
			    || arg0 == arg1 && i_59_ > i_57_) {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray2739[arg0];
			    while (--arg1 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg5 >> 16,
					  arg3 >> 16, arg8 >> 8, arg6 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_59_;
				arg3 += i_55_;
				arg8 += i_60_;
				arg6 += i_56_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg5 >> 16,
					  arg4 >> 16, arg8 >> 8, arg7 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_59_;
				arg4 += i_57_;
				arg8 += i_60_;
				arg7 += i_58_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			} else {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray2739[arg0];
			    while (--arg1 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg3 >> 16,
					  arg5 >> 16, arg6 >> 8, arg8 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_59_;
				arg3 += i_55_;
				arg8 += i_60_;
				arg6 += i_56_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg4 >> 16,
					  arg5 >> 16, arg7 >> 8, arg8 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_59_;
				arg4 += i_57_;
				arg8 += i_60_;
				arg7 += i_58_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			}
		    } else {
			arg4 = arg3 <<= 16;
			arg7 = arg6 <<= 16;
			if (arg0 < 0) {
			    arg4 -= i_59_ * arg0;
			    arg3 -= i_55_ * arg0;
			    arg7 -= i_60_ * arg0;
			    arg6 -= i_56_ * arg0;
			    arg0 = 0;
			}
			arg5 <<= 16;
			arg8 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_57_ * arg2;
			    arg8 -= i_58_ * arg2;
			    arg2 = 0;
			}
			int i_62_ = arg0 - anInt2729;
			i += i_48_ * i_62_;
			i_49_ += i_51_ * i_62_;
			i_52_ += i_54_ * i_62_;
			if (arg0 != arg2 && i_59_ < i_55_
			    || arg0 == arg2 && i_57_ > i_55_) {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray2739[arg0];
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg4 >> 16,
					  arg3 >> 16, arg7 >> 8, arg6 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg4 += i_59_;
				arg3 += i_55_;
				arg7 += i_60_;
				arg6 += i_56_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg1 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg5 >> 16,
					  arg3 >> 16, arg8 >> 8, arg6 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_57_;
				arg3 += i_55_;
				arg8 += i_58_;
				arg6 += i_56_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			} else {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray2739[arg0];
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg3 >> 16,
					  arg4 >> 16, arg6 >> 8, arg7 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg4 += i_59_;
				arg3 += i_55_;
				arg7 += i_60_;
				arg6 += i_56_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg1 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg0, arg3 >> 16,
					  arg5 >> 16, arg6 >> 8, arg8 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_57_;
				arg3 += i_55_;
				arg8 += i_58_;
				arg6 += i_56_;
				arg0 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			}
		    }
		}
	    } else if (arg1 <= arg2) {
		if (arg1 < anInt2736) {
		    if (arg2 > anInt2736)
			arg2 = anInt2736;
		    if (arg0 > anInt2736)
			arg0 = anInt2736;
		    if (arg2 < arg0) {
			arg3 = arg4 <<= 16;
			arg6 = arg7 <<= 16;
			if (arg1 < 0) {
			    arg3 -= i_55_ * arg1;
			    arg4 -= i_57_ * arg1;
			    arg6 -= i_56_ * arg1;
			    arg7 -= i_58_ * arg1;
			    arg1 = 0;
			}
			arg5 <<= 16;
			arg8 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_59_ * arg2;
			    arg8 -= i_60_ * arg2;
			    arg2 = 0;
			}
			int i_63_ = arg1 - anInt2729;
			i += i_48_ * i_63_;
			i_49_ += i_51_ * i_63_;
			i_52_ += i_54_ * i_63_;
			if (arg1 != arg2 && i_55_ < i_57_
			    || arg1 == arg2 && i_55_ > i_59_) {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray2739[arg1];
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg3 >> 16,
					  arg4 >> 16, arg6 >> 8, arg7 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg3 += i_55_;
				arg4 += i_57_;
				arg6 += i_56_;
				arg7 += i_58_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg0 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg3 >> 16,
					  arg5 >> 16, arg6 >> 8, arg8 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg3 += i_55_;
				arg5 += i_59_;
				arg6 += i_56_;
				arg8 += i_60_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			} else {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray2739[arg1];
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg4 >> 16,
					  arg3 >> 16, arg7 >> 8, arg6 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg3 += i_55_;
				arg4 += i_57_;
				arg6 += i_56_;
				arg7 += i_58_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg0 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg5 >> 16,
					  arg3 >> 16, arg8 >> 8, arg6 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg3 += i_55_;
				arg5 += i_59_;
				arg6 += i_56_;
				arg8 += i_60_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			}
		    } else {
			arg5 = arg4 <<= 16;
			arg8 = arg7 <<= 16;
			if (arg1 < 0) {
			    arg5 -= i_55_ * arg1;
			    arg4 -= i_57_ * arg1;
			    arg8 -= i_56_ * arg1;
			    arg7 -= i_58_ * arg1;
			    arg1 = 0;
			}
			arg3 <<= 16;
			arg6 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_59_ * arg0;
			    arg6 -= i_60_ * arg0;
			    arg0 = 0;
			}
			int i_64_ = arg1 - anInt2729;
			i += i_48_ * i_64_;
			i_49_ += i_51_ * i_64_;
			i_52_ += i_54_ * i_64_;
			if (i_55_ < i_57_) {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray2739[arg1];
			    while (--arg0 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg5 >> 16,
					  arg4 >> 16, arg8 >> 8, arg7 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_55_;
				arg4 += i_57_;
				arg8 += i_56_;
				arg7 += i_58_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg3 >> 16,
					  arg4 >> 16, arg6 >> 8, arg7 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg3 += i_59_;
				arg4 += i_57_;
				arg6 += i_60_;
				arg7 += i_58_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			} else {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray2739[arg1];
			    while (--arg0 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg4 >> 16,
					  arg5 >> 16, arg7 >> 8, arg8 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg5 += i_55_;
				arg4 += i_57_;
				arg8 += i_56_;
				arg7 += i_58_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			    while (--arg2 >= 0) {
				method412(Class11_Sub10_Sub13.anIntArray2307,
					  is, 0, 0, arg1, arg4 >> 16,
					  arg3 >> 16, arg7 >> 8, arg6 >> 8, i,
					  i_49_, i_52_, i_47_, i_50_, i_53_);
				arg3 += i_59_;
				arg4 += i_57_;
				arg6 += i_60_;
				arg7 += i_58_;
				arg1 += Class11_Sub10_Sub13.anInt2306;
				i += i_48_;
				i_49_ += i_51_;
				i_52_ += i_54_;
			    }
			}
		    }
		}
	    } else if (arg2 < anInt2736) {
		if (arg0 > anInt2736)
		    arg0 = anInt2736;
		if (arg1 > anInt2736)
		    arg1 = anInt2736;
		if (arg0 < arg1) {
		    arg4 = arg5 <<= 16;
		    arg7 = arg8 <<= 16;
		    if (arg2 < 0) {
			arg4 -= i_57_ * arg2;
			arg5 -= i_59_ * arg2;
			arg7 -= i_58_ * arg2;
			arg8 -= i_60_ * arg2;
			arg2 = 0;
		    }
		    arg3 <<= 16;
		    arg6 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_55_ * arg0;
			arg6 -= i_56_ * arg0;
			arg0 = 0;
		    }
		    int i_65_ = arg2 - anInt2729;
		    i += i_48_ * i_65_;
		    i_49_ += i_51_ * i_65_;
		    i_52_ += i_54_ * i_65_;
		    if (i_57_ < i_59_) {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray2739[arg2];
			while (--arg0 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg4 >> 16, arg5 >> 16,
				      arg7 >> 8, arg8 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg4 += i_57_;
			    arg5 += i_59_;
			    arg7 += i_58_;
			    arg8 += i_60_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
			while (--arg1 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg4 >> 16, arg3 >> 16,
				      arg7 >> 8, arg6 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg4 += i_57_;
			    arg3 += i_55_;
			    arg7 += i_58_;
			    arg6 += i_56_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
		    } else {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray2739[arg2];
			while (--arg0 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg5 >> 16, arg4 >> 16,
				      arg8 >> 8, arg7 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg4 += i_57_;
			    arg5 += i_59_;
			    arg7 += i_58_;
			    arg8 += i_60_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
			while (--arg1 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg3 >> 16, arg4 >> 16,
				      arg6 >> 8, arg7 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg4 += i_57_;
			    arg3 += i_55_;
			    arg7 += i_58_;
			    arg6 += i_56_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
		    }
		} else {
		    arg3 = arg5 <<= 16;
		    arg6 = arg8 <<= 16;
		    if (arg2 < 0) {
			arg3 -= i_57_ * arg2;
			arg5 -= i_59_ * arg2;
			arg6 -= i_58_ * arg2;
			arg8 -= i_60_ * arg2;
			arg2 = 0;
		    }
		    arg4 <<= 16;
		    arg7 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_55_ * arg1;
			arg7 -= i_56_ * arg1;
			arg1 = 0;
		    }
		    int i_66_ = arg2 - anInt2729;
		    i += i_48_ * i_66_;
		    i_49_ += i_51_ * i_66_;
		    i_52_ += i_54_ * i_66_;
		    if (i_57_ < i_59_) {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray2739[arg2];
			while (--arg1 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg3 >> 16, arg5 >> 16,
				      arg6 >> 8, arg8 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg3 += i_57_;
			    arg5 += i_59_;
			    arg6 += i_58_;
			    arg8 += i_60_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
			while (--arg0 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg4 >> 16, arg5 >> 16,
				      arg7 >> 8, arg8 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg4 += i_55_;
			    arg5 += i_59_;
			    arg7 += i_56_;
			    arg8 += i_60_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
		    } else {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray2739[arg2];
			while (--arg1 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg5 >> 16, arg3 >> 16,
				      arg8 >> 8, arg6 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg3 += i_57_;
			    arg5 += i_59_;
			    arg6 += i_58_;
			    arg8 += i_60_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
			while (--arg0 >= 0) {
			    method412(Class11_Sub10_Sub13.anIntArray2307, is,
				      0, 0, arg2, arg5 >> 16, arg4 >> 16,
				      arg8 >> 8, arg7 >> 8, i, i_49_, i_52_,
				      i_47_, i_50_, i_53_);
			    arg4 += i_55_;
			    arg5 += i_59_;
			    arg7 += i_56_;
			    arg8 += i_60_;
			    arg2 += Class11_Sub10_Sub13.anInt2306;
			    i += i_48_;
			    i_49_ += i_51_;
			    i_52_ += i_54_;
			}
		    }
		}
	    }
	}
    }
    
    public static void method419(int arg0, int arg1) {
	int i = anIntArray2739[0];
	int i_67_ = i / Class11_Sub10_Sub13.anInt2306;
	int i_68_ = i - i_67_ * Class11_Sub10_Sub13.anInt2306;
	anInt2730 = arg0 - i_68_;
	anInt2729 = arg1 - i_67_;
	anInt2722 = -anInt2730;
	anInt2726 = anInt2723 - anInt2730;
	anInt2733 = -anInt2729;
	anInt2731 = anInt2736 - anInt2729;
    }
    
    public static void method420() {
	anInt2730 = anInt2723 / 2;
	anInt2729 = anInt2736 / 2;
	anInt2722 = -anInt2730;
	anInt2726 = anInt2723 - anInt2730;
	anInt2733 = -anInt2729;
	anInt2731 = anInt2736 - anInt2729;
    }
    
    public static void method421(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	if (aBoolean2724) {
	    int i;
	    if (aBoolean2732) {
		if (arg5 - arg4 > 3)
		    i = (arg7 - arg6) / (arg5 - arg4);
		else
		    i = 0;
		if (arg5 > anInt2723)
		    arg5 = anInt2723;
		if (arg4 < 0) {
		    arg6 -= arg4 * i;
		    arg4 = 0;
		}
		if (arg4 >= arg5)
		    return;
		arg1 += arg4;
		arg3 = arg5 - arg4 >> 2;
		i <<= 2;
	    } else {
		if (arg4 >= arg5)
		    return;
		arg1 += arg4;
		arg3 = arg5 - arg4 >> 2;
		if (arg3 > 0)
		    i = (arg7 - arg6) * anIntArray2728[arg3] >> 15;
		else
		    i = 0;
	    }
	    if (anInt2734 == 0) {
		while (--arg3 >= 0) {
		    arg2 = anIntArray2740[arg6 >> 8];
		    arg6 += i;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		}
		arg3 = arg5 - arg4 & 0x3;
		if (arg3 > 0) {
		    arg2 = anIntArray2740[arg6 >> 8];
		    do
			arg0[arg1++] = arg2;
		    while (--arg3 > 0);
		}
	    } else {
		int i_69_ = anInt2734;
		int i_70_ = 256 - anInt2734;
		while (--arg3 >= 0) {
		    arg2 = anIntArray2740[arg6 >> 8];
		    arg6 += i;
		    arg2 = (((arg2 & 0xff00ff) * i_70_ >> 8 & 0xff00ff)
			    + ((arg2 & 0xff00) * i_70_ >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2
			   + ((arg0[arg1] & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i_69_ >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2
			   + ((arg0[arg1] & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i_69_ >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2
			   + ((arg0[arg1] & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i_69_ >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2
			   + ((arg0[arg1] & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i_69_ >> 8 & 0xff00));
		}
		arg3 = arg5 - arg4 & 0x3;
		if (arg3 > 0) {
		    arg2 = anIntArray2740[arg6 >> 8];
		    arg2 = (((arg2 & 0xff00ff) * i_70_ >> 8 & 0xff00ff)
			    + ((arg2 & 0xff00) * i_70_ >> 8 & 0xff00));
		    do
			arg0[arg1++] = (arg2
					+ ((arg0[arg1] & 0xff00ff) * i_69_ >> 8
					   & 0xff00ff)
					+ ((arg0[arg1] & 0xff00) * i_69_ >> 8
					   & 0xff00));
		    while (--arg3 > 0);
		}
	    }
	} else if (arg4 < arg5) {
	    int i = (arg7 - arg6) / (arg5 - arg4);
	    if (aBoolean2732) {
		if (arg5 > anInt2723)
		    arg5 = anInt2723;
		if (arg4 < 0) {
		    arg6 -= arg4 * i;
		    arg4 = 0;
		}
		if (arg4 >= arg5)
		    return;
	    }
	    arg1 += arg4;
	    arg3 = arg5 - arg4;
	    if (anInt2734 == 0) {
		do {
		    arg0[arg1++] = anIntArray2740[arg6 >> 8];
		    arg6 += i;
		} while (--arg3 > 0);
	    } else {
		int i_71_ = anInt2734;
		int i_72_ = 256 - anInt2734;
		do {
		    arg2 = anIntArray2740[arg6 >> 8];
		    arg6 += i;
		    arg2 = (((arg2 & 0xff00ff) * i_72_ >> 8 & 0xff00ff)
			    + ((arg2 & 0xff00) * i_72_ >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2
			   + ((arg0[arg1] & 0xff00ff) * i_71_ >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i_71_ >> 8 & 0xff00));
		} while (--arg3 > 0);
	    }
	}
    }
    
    public static void method422() {
	anIntArray2739 = null;
	anIntArray2740 = null;
	anInterface3_2727 = null;
	anIntArray2728 = null;
	anIntArray2738 = null;
	anIntArray2725 = null;
	anIntArray2721 = null;
    }
    
    public static void method423(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	if (aBoolean2732) {
	    if (arg5 > anInt2723)
		arg5 = anInt2723;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg3 = arg5 - arg4 >> 2;
	    if (anInt2734 == 0) {
		while (--arg3 >= 0) {
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++] = arg2;
	    } else {
		int i = anInt2734;
		int i_73_ = 256 - anInt2734;
		arg2 = (((arg2 & 0xff00ff) * i_73_ >> 8 & 0xff00ff)
			+ ((arg2 & 0xff00) * i_73_ >> 8 & 0xff00));
		while (--arg3 >= 0) {
		    arg0[arg1++]
			= (arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00));
		    arg0[arg1++]
			= (arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00));
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++]
			= (arg2 + ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((arg0[arg1] & 0xff00) * i >> 8 & 0xff00));
	    }
	}
    }
    
    static {
	anIntArray2728 = new int[512];
	anIntArray2725 = new int[2048];
	aBoolean2737 = false;
	anInt2734 = 0;
	anIntArray2738 = new int[2048];
	anIntArray2740 = new int[65536];
	for (int i = 1; i < 512; i++)
	    anIntArray2728[i] = 32768 / i;
	for (int i = 1; i < 2048; i++)
	    anIntArray2738[i] = 65536 / i;
	for (int i = 0; i < 2048; i++) {
	    anIntArray2725[i]
		= (int) (65536.0 * Math.sin((double) i * 0.0030679615));
	    anIntArray2721[i]
		= (int) (65536.0 * Math.cos((double) i * 0.0030679615));
	}
    }
}
