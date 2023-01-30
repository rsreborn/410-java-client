/* Class11_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub2_Sub1 extends Class11_Sub2
{
    public int anInt1887;
    public int anInt1888;
    public int anInt1889;
    public int anInt1890;
    public int anInt1891;
    public int anInt1892;
    public int anInt1893;
    public boolean aBoolean1894;
    public int anInt1895;
    public int anInt1896;
    public int anInt1897;
    
    public static int method115(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				Class11_Sub2_Sub1 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 8;
	if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2--] * arg4;
	arg8.anInt1889 = arg2 << 8;
	return arg3;
    }
    
    public synchronized void method116(int arg0) {
	anInt1895 = arg0;
    }
    
    public static int method117(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class11_Sub2_Sub1 arg10) {
	arg2 >>= 8;
	arg9 >>= 8;
	arg4 <<= 8;
	if ((arg7 = arg3 + arg2 - (arg9 - 1)) > arg8)
	    arg7 = arg8;
	arg7 -= 3;
	while (arg3 < arg7) {
	    arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
	    arg4 += arg6;
	    arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
	    arg4 += arg6;
	    arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
	    arg4 += arg6;
	    arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
	    arg4 += arg6;
	}
	arg7 += 3;
	while (arg3 < arg7) {
	    arg1[arg3++] += arg0[arg2--] * arg4 >> arg5;
	    arg4 += arg6;
	}
	arg10.anInt1896 = arg4 >> 8;
	arg10.anInt1889 = arg2 << 8;
	return arg3;
    }
    
    public int method118(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	if (anInt1893 > 0) {
	    int i = arg1 + anInt1893;
	    if (i > arg3)
		i = arg3;
	    anInt1893 += arg1;
	    if (anInt1888 == 256 && (anInt1889 & 0xff) == 0)
		arg1 = method122((((Class11_Sub3_Sub1) aClass11_Sub3_1471)
				  .aByteArray1905),
				 arg0, anInt1889, arg1, anInt1896, anInt1892,
				 anInt1890, 0, i, arg2, this);
	    else
		arg1 = method124(0, 0,
				 (((Class11_Sub3_Sub1) aClass11_Sub3_1471)
				  .aByteArray1905),
				 arg0, anInt1889, arg1, anInt1896, anInt1892,
				 anInt1890, 0, i, arg2, this, anInt1888, arg4);
	    anInt1893 -= arg1;
	    if (anInt1893 != 0)
		return arg1;
	    if (anInt1897 == -2147483648) {
		this.method107(0);
		return arg3;
	    }
	    anInt1896 = anInt1897;
	}
	if (anInt1888 == 256 && (anInt1889 & 0xff) == 0)
	    return method125((((Class11_Sub3_Sub1) aClass11_Sub3_1471)
			      .aByteArray1905),
			     arg0, anInt1889, arg1, anInt1896, 0, arg3, arg2,
			     this);
	return method119(0, 0,
			 (((Class11_Sub3_Sub1) aClass11_Sub3_1471)
			  .aByteArray1905),
			 arg0, anInt1889, arg1, anInt1896, 0, arg3, arg2, this,
			 anInt1888, arg4);
    }
    
    public static int method119(int arg0, int arg1, byte[] arg2, int[] arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class11_Sub2_Sub1 arg10,
				int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++] += ((arg0 << 8)
			     + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff)) * arg6;
	    arg4 += arg11;
	}
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8)
	    arg7 = arg8;
	arg1 = arg12;
	while (arg5 < arg7) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6;
	    arg4 += arg11;
	}
	arg10.anInt1889 = arg4;
	return arg5;
    }
    
    public int method120(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	if (anInt1893 > 0) {
	    int i = arg1 + anInt1893;
	    if (i > arg3)
		i = arg3;
	    anInt1893 += arg1;
	    if (anInt1888 == -256 && (anInt1889 & 0xff) == 0)
		arg1 = method117((((Class11_Sub3_Sub1) aClass11_Sub3_1471)
				  .aByteArray1905),
				 arg0, anInt1889, arg1, anInt1896, anInt1892,
				 anInt1890, 0, i, arg2, this);
	    else
		arg1 = method126(0, 0,
				 (((Class11_Sub3_Sub1) aClass11_Sub3_1471)
				  .aByteArray1905),
				 arg0, anInt1889, arg1, anInt1896, anInt1892,
				 anInt1890, 0, i, arg2, this, anInt1888, arg4);
	    anInt1893 -= arg1;
	    if (anInt1893 != 0)
		return arg1;
	    if (anInt1897 == -2147483648) {
		this.method107(0);
		return arg3;
	    }
	    anInt1896 = anInt1897;
	}
	if (anInt1888 == -256 && (anInt1889 & 0xff) == 0)
	    return method115((((Class11_Sub3_Sub1) aClass11_Sub3_1471)
			      .aByteArray1905),
			     arg0, anInt1889, arg1, anInt1896, 0, arg3, arg2,
			     this);
	return method123(0, 0,
			 (((Class11_Sub3_Sub1) aClass11_Sub3_1471)
			  .aByteArray1905),
			 arg0, anInt1889, arg1, anInt1896, 0, arg3, arg2, this,
			 anInt1888, arg4);
    }
    
    public static Class11_Sub2_Sub1 method121(Class11_Sub3_Sub1 arg0, int arg1,
					      int arg2) {
	if (arg0.aByteArray1905 == null || arg0.aByteArray1905.length == 0)
	    return null;
	return new Class11_Sub2_Sub1(arg0,
				     (int) ((long) arg0.anInt1904 * 256L
					    * (long) arg1
					    / (long) (100 * (Class11_Sub10_Sub9
							     .anInt2203))),
				     arg2);
    }
    
    public static int method122(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class11_Sub2_Sub1 arg10) {
	arg2 >>= 8;
	arg9 >>= 8;
	arg4 <<= 8;
	if ((arg7 = arg3 + arg9 - arg2) > arg8)
	    arg7 = arg8;
	arg7 -= 3;
	while (arg3 < arg7) {
	    arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
	    arg4 += arg6;
	    arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
	    arg4 += arg6;
	    arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
	    arg4 += arg6;
	    arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
	    arg4 += arg6;
	}
	arg7 += 3;
	while (arg3 < arg7) {
	    arg1[arg3++] += arg0[arg2++] * arg4 >> arg5;
	    arg4 += arg6;
	}
	arg10.anInt1896 = arg4 >> 8;
	arg10.anInt1889 = arg2 << 8;
	return arg3;
    }
    
    public static int method123(int arg0, int arg1, byte[] arg2, int[] arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class11_Sub2_Sub1 arg10,
				int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6;
	    arg4 += arg11;
	}
	if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	arg0 = arg12;
	arg1 = arg11;
	while (arg5 < arg7) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6);
	    arg4 += arg1;
	}
	arg10.anInt1889 = arg4;
	return arg5;
    }
    
    public synchronized void method113(int arg0) {
	if (anInt1893 > 0) {
	    if (arg0 >= anInt1893) {
		if (anInt1897 == -2147483648) {
		    this.method107(0);
		    arg0 = anInt1893;
		} else
		    anInt1896 = anInt1897;
		anInt1893 = 0;
	    } else {
		anInt1896 += anInt1890 * arg0;
		anInt1893 -= arg0;
	    }
	}
	anInt1889 += anInt1888 * arg0;
	Class11_Sub3_Sub1 class11_sub3_sub1
	    = (Class11_Sub3_Sub1) aClass11_Sub3_1471;
	int i = anInt1887 << 8;
	int i_0_ = anInt1891 << 8;
	int i_1_ = class11_sub3_sub1.aByteArray1905.length << 8;
	int i_2_ = i_0_ - i;
	if (i_2_ <= 0)
	    anInt1895 = 0;
	if (anInt1895 < 0) {
	    if (aBoolean1894) {
		if (anInt1888 < 0) {
		    if (anInt1889 >= i)
			return;
		    anInt1889 = i + i - 1 - anInt1889;
		    anInt1888 = -anInt1888;
		}
		while (anInt1889 >= i_0_) {
		    anInt1889 = i_0_ + i_0_ - 1 - anInt1889;
		    anInt1888 = -anInt1888;
		    if (anInt1889 >= i)
			break;
		    anInt1889 = i + i - 1 - anInt1889;
		    anInt1888 = -anInt1888;
		}
	    } else if (anInt1888 < 0) {
		if (anInt1889 < i)
		    anInt1889 = i_0_ - 1 - (i_0_ - 1 - anInt1889) % i_2_;
	    } else if (anInt1889 >= i_0_)
		anInt1889 = i + (anInt1889 - i) % i_2_;
	} else {
	    do {
		if (anInt1895 > 0) {
		    if (aBoolean1894) {
			if (anInt1888 < 0) {
			    if (anInt1889 >= i)
				return;
			    anInt1889 = i + i - 1 - anInt1889;
			    anInt1888 = -anInt1888;
			    if (--anInt1895 == 0)
				break;
			}
			do {
			    if (anInt1889 < i_0_)
				return;
			    anInt1889 = i_0_ + i_0_ - 1 - anInt1889;
			    anInt1888 = -anInt1888;
			    if (--anInt1895 == 0)
				break;
			    if (anInt1889 >= i)
				return;
			    anInt1889 = i + i - 1 - anInt1889;
			    anInt1888 = -anInt1888;
			} while (--anInt1895 != 0);
		    } else if (anInt1888 < 0) {
			if (anInt1889 >= i)
			    return;
			int i_3_ = (i_0_ - 1 - anInt1889) / i_2_;
			if (i_3_ >= anInt1895) {
			    anInt1889 += i_2_ * anInt1895;
			    anInt1895 = 0;
			} else {
			    anInt1889 += i_2_ * i_3_;
			    anInt1895 -= i_3_;
			    return;
			}
		    } else {
			if (anInt1889 < i_0_)
			    return;
			int i_4_ = (anInt1889 - i) / i_2_;
			if (i_4_ >= anInt1895) {
			    anInt1889 -= i_2_ * anInt1895;
			    anInt1895 = 0;
			} else {
			    anInt1889 -= i_2_ * i_4_;
			    anInt1895 -= i_4_;
			    return;
			}
		    }
		}
	    } while (false);
	    if (anInt1888 < 0) {
		if (anInt1889 < 0) {
		    anInt1889 = 0;
		    this.method107(0);
		}
	    } else if (anInt1889 >= i_1_) {
		anInt1889 = i_1_ - 1;
		this.method107(0);
	    }
	}
    }
    
    public synchronized int method112(int[] arg0, int arg1, int arg2) {
	if (anInt1896 == 0 && (anInt1893 == 0 || anInt1897 == 0
			       || anInt1897 == -2147483648)) {
	    method113(arg2);
	    return 0;
	}
	Class11_Sub3_Sub1 class11_sub3_sub1
	    = (Class11_Sub3_Sub1) aClass11_Sub3_1471;
	int i = anInt1887 << 8;
	int i_5_ = anInt1891 << 8;
	int i_6_ = class11_sub3_sub1.aByteArray1905.length << 8;
	int i_7_ = i_5_ - i;
	if (i_7_ <= 0)
	    anInt1895 = 0;
	int i_8_ = arg1;
	arg2 += arg1;
	if (anInt1895 < 0) {
	    if (aBoolean1894) {
		if (anInt1888 < 0) {
		    i_8_ = method120(arg0, i_8_, i, arg2,
				     (class11_sub3_sub1.aByteArray1905
				      [anInt1887]));
		    if (anInt1889 >= i)
			return 1;
		    anInt1889 = i + i - 1 - anInt1889;
		    anInt1888 = -anInt1888;
		}
		for (;;) {
		    i_8_ = method118(arg0, i_8_, i_5_, arg2,
				     (class11_sub3_sub1.aByteArray1905
				      [anInt1891 - 1]));
		    if (anInt1889 < i_5_)
			return 1;
		    anInt1889 = i_5_ + i_5_ - 1 - anInt1889;
		    anInt1888 = -anInt1888;
		    i_8_ = method120(arg0, i_8_, i, arg2,
				     (class11_sub3_sub1.aByteArray1905
				      [anInt1887]));
		    if (anInt1889 >= i)
			return 1;
		    anInt1889 = i + i - 1 - anInt1889;
		    anInt1888 = -anInt1888;
		}
	    }
	    if (anInt1888 < 0) {
		for (;;) {
		    i_8_ = method120(arg0, i_8_, i, arg2,
				     (class11_sub3_sub1.aByteArray1905
				      [anInt1891 - 1]));
		    if (anInt1889 >= i)
			return 1;
		    anInt1889 = i_5_ - 1 - (i_5_ - 1 - anInt1889) % i_7_;
		}
	    }
	    for (;;) {
		i_8_ = method118(arg0, i_8_, i_5_, arg2,
				 class11_sub3_sub1.aByteArray1905[anInt1887]);
		if (anInt1889 < i_5_)
		    return 1;
		anInt1889 = i + (anInt1889 - i) % i_7_;
	    }
	}
	do {
	    if (anInt1895 > 0) {
		if (aBoolean1894) {
		    if (anInt1888 < 0) {
			i_8_ = method120(arg0, i_8_, i, arg2,
					 (class11_sub3_sub1.aByteArray1905
					  [anInt1887]));
			if (anInt1889 >= i)
			    return 1;
			anInt1889 = i + i - 1 - anInt1889;
			anInt1888 = -anInt1888;
			if (--anInt1895 == 0)
			    break;
		    }
		    do {
			i_8_ = method118(arg0, i_8_, i_5_, arg2,
					 (class11_sub3_sub1.aByteArray1905
					  [anInt1891 - 1]));
			if (anInt1889 < i_5_)
			    return 1;
			anInt1889 = i_5_ + i_5_ - 1 - anInt1889;
			anInt1888 = -anInt1888;
			if (--anInt1895 == 0)
			    break;
			i_8_ = method120(arg0, i_8_, i, arg2,
					 (class11_sub3_sub1.aByteArray1905
					  [anInt1887]));
			if (anInt1889 >= i)
			    return 1;
			anInt1889 = i + i - 1 - anInt1889;
			anInt1888 = -anInt1888;
		    } while (--anInt1895 != 0);
		} else if (anInt1888 < 0) {
		    for (;;) {
			i_8_ = method120(arg0, i_8_, i, arg2,
					 (class11_sub3_sub1.aByteArray1905
					  [anInt1891 - 1]));
			if (anInt1889 >= i)
			    return 1;
			int i_9_ = (i_5_ - 1 - anInt1889) / i_7_;
			if (i_9_ >= anInt1895) {
			    anInt1889 += i_7_ * anInt1895;
			    anInt1895 = 0;
			    break;
			}
			anInt1889 += i_7_ * i_9_;
			anInt1895 -= i_9_;
		    }
		} else {
		    for (;;) {
			i_8_ = method118(arg0, i_8_, i_5_, arg2,
					 (class11_sub3_sub1.aByteArray1905
					  [anInt1887]));
			if (anInt1889 < i_5_)
			    return 1;
			int i_10_ = (anInt1889 - i) / i_7_;
			if (i_10_ >= anInt1895) {
			    anInt1889 -= i_7_ * anInt1895;
			    anInt1895 = 0;
			    break;
			}
			anInt1889 -= i_7_ * i_10_;
			anInt1895 -= i_10_;
		    }
		}
	    }
	} while (false);
	if (anInt1888 < 0) {
	    method120(arg0, i_8_, 0, arg2, 0);
	    if (anInt1889 < 0) {
		anInt1889 = 0;
		this.method107(0);
	    }
	} else {
	    method118(arg0, i_8_, i_6_, arg2, 0);
	    if (anInt1889 >= i_6_) {
		anInt1889 = i_6_ - 1;
		this.method107(0);
	    }
	}
	return 1;
    }
    
    public static int method124
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 Class11_Sub2_Sub1 arg12, int arg13, int arg14) {
	if (arg13 == 0
	    || (arg9 = arg5 + (arg11 - arg4 + arg13 - 257) / arg13) > arg10)
	    arg9 = arg10;
	while (arg5 < arg9) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> arg7;
	    arg6 += arg8;
	    arg4 += arg13;
	}
	if (arg13 == 0
	    || (arg9 = arg5 + (arg11 - arg4 + arg13 - 1) / arg13) > arg10)
	    arg9 = arg10;
	arg1 = arg14;
	while (arg5 < arg9) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6
		    >> arg7);
	    arg6 += arg8;
	    arg4 += arg13;
	}
	arg12.anInt1896 = arg6;
	arg12.anInt1889 = arg4;
	return arg5;
    }
    
    public static int method125(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				Class11_Sub2_Sub1 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 8;
	if ((arg5 = arg3 + arg7 - arg2) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2++] * arg4;
	arg8.anInt1889 = arg2 << 8;
	return arg3;
    }
    
    public static int method126
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 Class11_Sub2_Sub1 arg12, int arg13, int arg14) {
	if (arg13 == 0
	    || (arg9 = arg5 + (arg11 + 256 - arg4 + arg13) / arg13) > arg10)
	    arg9 = arg10;
	while (arg5 < arg9) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> arg7);
	    arg6 += arg8;
	    arg4 += arg13;
	}
	if (arg13 == 0
	    || (arg9 = arg5 + (arg11 - arg4 + arg13) / arg13) > arg10)
	    arg9 = arg10;
	arg0 = arg14;
	arg1 = arg13;
	while (arg5 < arg9) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> arg7;
	    arg6 += arg8;
	    arg4 += arg1;
	}
	arg12.anInt1896 = arg6;
	arg12.anInt1889 = arg4;
	return arg5;
    }
    
    public int method114() {
	int i = anInt1896 * 3;
	i = (i ^ i >> 31) + (i >>> 31);
	if (anInt1895 == 0)
	    i -= i * anInt1889 / ((((Class11_Sub3_Sub1) aClass11_Sub3_1471)
				   .aByteArray1905).length
				  << 8);
	else if (anInt1895 >= 0)
	    i -= i * anInt1887 / (((Class11_Sub3_Sub1) aClass11_Sub3_1471)
				  .aByteArray1905).length;
	if (i > 255)
	    return 255;
	return i;
    }
    
    public Class11_Sub2_Sub1(Class11_Sub3_Sub1 arg0, int arg1, int arg2) {
	aClass11_Sub3_1471 = arg0;
	anInt1887 = arg0.anInt1907;
	anInt1891 = arg0.anInt1906;
	anInt1888 = arg1;
	anInt1896 = arg2;
	anInt1889 = 0;
    }
}
