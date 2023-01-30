/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38
{
    public static Class57 aClass57_702 = new Class57();
    
    public static int method715(byte[] arg0, int arg1, byte[] arg2, int arg3,
				int arg4) {
	synchronized (aClass57_702) {
	    aClass57_702.aByteArray1191 = arg2;
	    aClass57_702.anInt1198 = arg4;
	    aClass57_702.aByteArray1176 = arg0;
	    aClass57_702.anInt1170 = 0;
	    aClass57_702.anInt1171 = arg1;
	    aClass57_702.anInt1188 = 0;
	    aClass57_702.anInt1163 = 0;
	    aClass57_702.anInt1165 = 0;
	    aClass57_702.anInt1200 = 0;
	    method723(aClass57_702);
	    arg1 -= aClass57_702.anInt1171;
	    aClass57_702.aByteArray1191 = null;
	    aClass57_702.aByteArray1176 = null;
	    return arg1;
	}
    }
    
    public static void method716(Class57 arg0) {
	arg0.anInt1178 = 0;
	for (int i = 0; i < 256; i++) {
	    if (arg0.aBooleanArray1180[i]) {
		arg0.aByteArray1166[arg0.anInt1178] = (byte) i;
		arg0.anInt1178++;
	    }
	}
    }
    
    public static void method717(Class57 arg0) {
	byte i = arg0.aByte1172;
	int i_0_ = arg0.anInt1194;
	int i_1_ = arg0.anInt1183;
	int i_2_ = arg0.anInt1169;
	int[] is = Class11_Sub10_Sub14.anIntArray2349;
	int i_3_ = arg0.anInt1175;
	byte[] is_4_ = arg0.aByteArray1176;
	int i_5_ = arg0.anInt1170;
	int i_6_ = arg0.anInt1171;
	int i_7_ = i_6_;
	int i_8_ = arg0.anInt1160 + 1;
    while_2_:
	for (;;) {
	    if (i_0_ > 0) {
		for (;;) {
		    if (i_6_ == 0)
			break while_2_;
		    if (i_0_ == 1)
			break;
		    is_4_[i_5_] = i;
		    i_0_--;
		    i_5_++;
		    i_6_--;
		}
		if (i_6_ == 0) {
		    i_0_ = 1;
		    break;
		}
		is_4_[i_5_] = i;
		i_5_++;
		i_6_--;
	    }
	    boolean bool = true;
	    while (bool) {
		bool = false;
		if (i_1_ == i_8_) {
		    i_0_ = 0;
		    break while_2_;
		}
		i = (byte) i_2_;
		i_3_ = is[i_3_];
		int i_9_ = (byte) (i_3_ & 0xff);
		i_3_ >>= 8;
		i_1_++;
		if (i_9_ != i_2_) {
		    i_2_ = i_9_;
		    if (i_6_ == 0) {
			i_0_ = 1;
			break while_2_;
		    }
		    is_4_[i_5_] = i;
		    i_5_++;
		    i_6_--;
		    bool = true;
		} else if (i_1_ == i_8_) {
		    if (i_6_ == 0) {
			i_0_ = 1;
			break while_2_;
		    }
		    is_4_[i_5_] = i;
		    i_5_++;
		    i_6_--;
		    bool = true;
		}
	    }
	    i_0_ = 2;
	    i_3_ = is[i_3_];
	    int i_10_ = (byte) (i_3_ & 0xff);
	    i_3_ >>= 8;
	    if (++i_1_ != i_8_) {
		if (i_10_ != i_2_)
		    i_2_ = i_10_;
		else {
		    i_0_ = 3;
		    i_3_ = is[i_3_];
		    i_10_ = (byte) (i_3_ & 0xff);
		    i_3_ >>= 8;
		    if (++i_1_ != i_8_) {
			if (i_10_ != i_2_)
			    i_2_ = i_10_;
			else {
			    i_3_ = is[i_3_];
			    i_10_ = (byte) (i_3_ & 0xff);
			    i_3_ >>= 8;
			    i_1_++;
			    i_0_ = (i_10_ & 0xff) + 4;
			    i_3_ = is[i_3_];
			    i_2_ = (byte) (i_3_ & 0xff);
			    i_3_ >>= 8;
			    i_1_++;
			}
		    }
		}
	    }
	}
	int i_11_ = arg0.anInt1200;
	arg0.anInt1200 += i_7_ - i_6_;
	arg0.aByte1172 = i;
	arg0.anInt1194 = i_0_;
	arg0.anInt1183 = i_1_;
	arg0.anInt1169 = i_2_;
	Class11_Sub10_Sub14.anIntArray2349 = is;
	arg0.anInt1175 = i_3_;
	arg0.aByteArray1176 = is_4_;
	arg0.anInt1170 = i_5_;
	arg0.anInt1171 = i_6_;
    }
    
    public static void method718(int[] arg0, int[] arg1, int[] arg2,
				 byte[] arg3, int arg4, int arg5, int arg6) {
	int i = 0;
	for (int i_12_ = arg4; i_12_ <= arg5; i_12_++) {
	    for (int i_13_ = 0; i_13_ < arg6; i_13_++) {
		if (arg3[i_13_] == i_12_) {
		    arg2[i] = i_13_;
		    i++;
		}
	    }
	}
	for (int i_14_ = 0; i_14_ < 23; i_14_++)
	    arg1[i_14_] = 0;
	for (int i_15_ = 0; i_15_ < arg6; i_15_++)
	    arg1[arg3[i_15_] + 1]++;
	for (int i_16_ = 1; i_16_ < 23; i_16_++)
	    arg1[i_16_] += arg1[i_16_ - 1];
	for (int i_17_ = 0; i_17_ < 23; i_17_++)
	    arg0[i_17_] = 0;
	int i_18_ = 0;
	for (int i_19_ = arg4; i_19_ <= arg5; i_19_++) {
	    i_18_ += arg1[i_19_ + 1] - arg1[i_19_];
	    arg0[i_19_] = i_18_ - 1;
	    i_18_ <<= 1;
	}
	for (int i_20_ = arg4 + 1; i_20_ <= arg5; i_20_++)
	    arg1[i_20_] = (arg0[i_20_ - 1] + 1 << 1) - arg1[i_20_];
    }
    
    public static byte method719(Class57 arg0) {
	return (byte) method721(1, arg0);
    }
    
    public static byte method720(Class57 arg0) {
	return (byte) method721(8, arg0);
    }
    
    public static int method721(int arg0, Class57 arg1) {
	int i;
	for (;;) {
	    if (arg1.anInt1188 >= arg0) {
		int i_21_ = (arg1.anInt1163 >> arg1.anInt1188 - arg0
			     & (1 << arg0) - 1);
		arg1.anInt1188 -= arg0;
		i = i_21_;
		break;
	    }
	    arg1.anInt1163 = (arg1.anInt1163 << 8
			      | arg1.aByteArray1191[arg1.anInt1198] & 0xff);
	    arg1.anInt1188 += 8;
	    arg1.anInt1198++;
	    arg1.anInt1165++;
	}
	return i;
    }
    
    public static void method722() {
	aClass57_702 = null;
    }
    
    public static void method723(Class57 arg0) {
	boolean bool = false;
	boolean bool_22_ = false;
	boolean bool_23_ = false;
	boolean bool_24_ = false;
	boolean bool_25_ = false;
	boolean bool_26_ = false;
	boolean bool_27_ = false;
	boolean bool_28_ = false;
	boolean bool_29_ = false;
	boolean bool_30_ = false;
	boolean bool_31_ = false;
	boolean bool_32_ = false;
	boolean bool_33_ = false;
	boolean bool_34_ = false;
	boolean bool_35_ = false;
	boolean bool_36_ = false;
	boolean bool_37_ = false;
	boolean bool_38_ = false;
	int i = 0;
	int[] is = null;
	int[] is_39_ = null;
	int[] is_40_ = null;
	arg0.anInt1181 = 1;
	if (Class11_Sub10_Sub14.anIntArray2349 == null)
	    Class11_Sub10_Sub14.anIntArray2349
		= new int[arg0.anInt1181 * 100000];
	boolean bool_41_ = true;
	while (bool_41_) {
	    byte i_42_ = method720(arg0);
	    if (i_42_ == 23)
		break;
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method720(arg0);
	    i_42_ = method719(arg0);
	    arg0.anInt1153 = 0;
	    int i_43_ = method720(arg0);
	    arg0.anInt1153 = arg0.anInt1153 << 8 | i_43_ & 0xff;
	    i_43_ = method720(arg0);
	    arg0.anInt1153 = arg0.anInt1153 << 8 | i_43_ & 0xff;
	    i_43_ = method720(arg0);
	    arg0.anInt1153 = arg0.anInt1153 << 8 | i_43_ & 0xff;
	    for (int i_44_ = 0; i_44_ < 16; i_44_++) {
		i_42_ = method719(arg0);
		if (i_42_ == 1)
		    arg0.aBooleanArray1156[i_44_] = true;
		else
		    arg0.aBooleanArray1156[i_44_] = false;
	    }
	    for (int i_45_ = 0; i_45_ < 256; i_45_++)
		arg0.aBooleanArray1180[i_45_] = false;
	    for (int i_46_ = 0; i_46_ < 16; i_46_++) {
		if (arg0.aBooleanArray1156[i_46_]) {
		    for (int i_47_ = 0; i_47_ < 16; i_47_++) {
			i_42_ = method719(arg0);
			if (i_42_ == 1)
			    arg0.aBooleanArray1180[i_46_ * 16 + i_47_] = true;
		    }
		}
	    }
	    method716(arg0);
	    int i_48_ = arg0.anInt1178 + 2;
	    int i_49_ = method721(3, arg0);
	    int i_50_ = method721(15, arg0);
	    for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
		int i_52_ = 0;
		for (;;) {
		    i_42_ = method719(arg0);
		    if (i_42_ == 0)
			break;
		    i_52_++;
		}
		arg0.aByteArray1157[i_51_] = (byte) i_52_;
	    }
	    byte[] is_53_ = new byte[6];
	    for (byte i_54_ = 0; i_54_ < i_49_; i_54_++)
		is_53_[i_54_] = i_54_;
	    for (int i_55_ = 0; i_55_ < i_50_; i_55_++) {
		byte i_56_ = arg0.aByteArray1157[i_55_];
		byte i_57_ = is_53_[i_56_];
		for (/**/; i_56_ > 0; i_56_--)
		    is_53_[i_56_] = is_53_[i_56_ - 1];
		is_53_[0] = i_57_;
		arg0.aByteArray1173[i_55_] = i_57_;
	    }
	    for (int i_58_ = 0; i_58_ < i_49_; i_58_++) {
		int i_59_ = method721(5, arg0);
		for (int i_60_ = 0; i_60_ < i_48_; i_60_++) {
		    for (;;) {
			i_42_ = method719(arg0);
			if (i_42_ == 0)
			    break;
			i_42_ = method719(arg0);
			if (i_42_ == 0)
			    i_59_++;
			else
			    i_59_--;
		    }
		    arg0.aByteArrayArray1182[i_58_][i_60_] = (byte) i_59_;
		}
	    }
	    for (int i_61_ = 0; i_61_ < i_49_; i_61_++) {
		int i_62_ = 32;
		byte i_63_ = 0;
		for (int i_64_ = 0; i_64_ < i_48_; i_64_++) {
		    if (arg0.aByteArrayArray1182[i_61_][i_64_] > i_63_)
			i_63_ = arg0.aByteArrayArray1182[i_61_][i_64_];
		    if (arg0.aByteArrayArray1182[i_61_][i_64_] < i_62_)
			i_62_ = arg0.aByteArrayArray1182[i_61_][i_64_];
		}
		method718(arg0.anIntArrayArray1193[i_61_],
			  arg0.anIntArrayArray1196[i_61_],
			  arg0.anIntArrayArray1192[i_61_],
			  arg0.aByteArrayArray1182[i_61_], i_62_, i_63_,
			  i_48_);
		arg0.anIntArray1177[i_61_] = i_62_;
	    }
	    int i_65_ = arg0.anInt1178 + 1;
	    int i_66_ = -1;
	    int i_67_ = 0;
	    for (int i_68_ = 0; i_68_ <= 255; i_68_++)
		arg0.anIntArray1195[i_68_] = 0;
	    int i_69_ = 4095;
	    for (int i_70_ = 15; i_70_ >= 0; i_70_--) {
		for (int i_71_ = 15; i_71_ >= 0; i_71_--) {
		    arg0.aByteArray1187[i_69_] = (byte) (i_70_ * 16 + i_71_);
		    i_69_--;
		}
		arg0.anIntArray1185[i_70_] = i_69_ + 1;
	    }
	    int i_72_ = 0;
	    if (i_67_ == 0) {
		i_66_++;
		i_67_ = 50;
		byte i_73_ = arg0.aByteArray1173[i_66_];
		i = arg0.anIntArray1177[i_73_];
		is = arg0.anIntArrayArray1193[i_73_];
		is_40_ = arg0.anIntArrayArray1192[i_73_];
		is_39_ = arg0.anIntArrayArray1196[i_73_];
	    }
	    i_67_--;
	    int i_74_ = i;
	    int i_75_;
	    int i_76_;
	    for (i_76_ = method721(i_74_, arg0); i_76_ > is[i_74_];
		 i_76_ = i_76_ << 1 | i_75_) {
		i_74_++;
		i_75_ = method719(arg0);
	    }
	    int i_77_ = is_40_[i_76_ - is_39_[i_74_]];
	    while (i_77_ != i_65_) {
		if (i_77_ == 0 || i_77_ == 1) {
		    int i_78_ = -1;
		    int i_79_ = 1;
		    do {
			if (i_77_ == 0)
			    i_78_ += i_79_;
			else if (i_77_ == 1)
			    i_78_ += 2 * i_79_;
			i_79_ *= 2;
			if (i_67_ == 0) {
			    i_66_++;
			    i_67_ = 50;
			    byte i_80_ = arg0.aByteArray1173[i_66_];
			    i = arg0.anIntArray1177[i_80_];
			    is = arg0.anIntArrayArray1193[i_80_];
			    is_40_ = arg0.anIntArrayArray1192[i_80_];
			    is_39_ = arg0.anIntArrayArray1196[i_80_];
			}
			i_67_--;
			i_74_ = i;
			for (i_76_ = method721(i_74_, arg0); i_76_ > is[i_74_];
			     i_76_ = i_76_ << 1 | i_75_) {
			    i_74_++;
			    i_75_ = method719(arg0);
			}
			i_77_ = is_40_[i_76_ - is_39_[i_74_]];
		    } while (i_77_ == 0 || i_77_ == 1);
		    i_78_++;
		    i_43_ = (arg0.aByteArray1166
			     [(arg0.aByteArray1187[arg0.anIntArray1185[0]]
			       & 0xff)]);
		    arg0.anIntArray1195[i_43_ & 0xff] += i_78_;
		    for (/**/; i_78_ > 0; i_78_--) {
			Class11_Sub10_Sub14.anIntArray2349[i_72_]
			    = i_43_ & 0xff;
			i_72_++;
		    }
		} else {
		    int i_81_ = i_77_ - 1;
		    if (i_81_ < 16) {
			int i_82_ = arg0.anIntArray1185[0];
			i_42_ = arg0.aByteArray1187[i_82_ + i_81_];
			for (/**/; i_81_ > 3; i_81_ -= 4) {
			    int i_83_ = i_82_ + i_81_;
			    arg0.aByteArray1187[i_83_]
				= arg0.aByteArray1187[i_83_ - 1];
			    arg0.aByteArray1187[i_83_ - 1]
				= arg0.aByteArray1187[i_83_ - 2];
			    arg0.aByteArray1187[i_83_ - 2]
				= arg0.aByteArray1187[i_83_ - 3];
			    arg0.aByteArray1187[i_83_ - 3]
				= arg0.aByteArray1187[i_83_ - 4];
			}
			for (/**/; i_81_ > 0; i_81_--)
			    arg0.aByteArray1187[i_82_ + i_81_]
				= arg0.aByteArray1187[i_82_ + i_81_ - 1];
			arg0.aByteArray1187[i_82_] = i_42_;
		    } else {
			int i_84_ = i_81_ / 16;
			int i_85_ = i_81_ % 16;
			int i_86_ = arg0.anIntArray1185[i_84_] + i_85_;
			i_42_ = arg0.aByteArray1187[i_86_];
			for (/**/; i_86_ > arg0.anIntArray1185[i_84_]; i_86_--)
			    arg0.aByteArray1187[i_86_]
				= arg0.aByteArray1187[i_86_ - 1];
			arg0.anIntArray1185[i_84_]++;
			for (/**/; i_84_ > 0; i_84_--) {
			    arg0.anIntArray1185[i_84_]--;
			    arg0.aByteArray1187[arg0.anIntArray1185[i_84_]]
				= (arg0.aByteArray1187
				   [arg0.anIntArray1185[i_84_ - 1] + 16 - 1]);
			}
			arg0.anIntArray1185[0]--;
			arg0.aByteArray1187[arg0.anIntArray1185[0]] = i_42_;
			if (arg0.anIntArray1185[0] == 0) {
			    int i_87_ = 4095;
			    for (int i_88_ = 15; i_88_ >= 0; i_88_--) {
				for (int i_89_ = 15; i_89_ >= 0; i_89_--) {
				    arg0.aByteArray1187[i_87_]
					= (arg0.aByteArray1187
					   [(arg0.anIntArray1185[i_88_]
					     + i_89_)]);
				    i_87_--;
				}
				arg0.anIntArray1185[i_88_] = i_87_ + 1;
			    }
			}
		    }
		    arg0.anIntArray1195[(arg0.aByteArray1166[i_42_ & 0xff]
					 & 0xff)]++;
		    Class11_Sub10_Sub14.anIntArray2349[i_72_]
			= arg0.aByteArray1166[i_42_ & 0xff] & 0xff;
		    i_72_++;
		    if (i_67_ == 0) {
			i_66_++;
			i_67_ = 50;
			byte i_90_ = arg0.aByteArray1173[i_66_];
			i = arg0.anIntArray1177[i_90_];
			is = arg0.anIntArrayArray1193[i_90_];
			is_40_ = arg0.anIntArrayArray1192[i_90_];
			is_39_ = arg0.anIntArrayArray1196[i_90_];
		    }
		    i_67_--;
		    i_74_ = i;
		    for (i_76_ = method721(i_74_, arg0); i_76_ > is[i_74_];
			 i_76_ = i_76_ << 1 | i_75_) {
			i_74_++;
			i_75_ = method719(arg0);
		    }
		    i_77_ = is_40_[i_76_ - is_39_[i_74_]];
		}
	    }
	    arg0.anInt1194 = 0;
	    arg0.aByte1172 = (byte) 0;
	    arg0.anIntArray1199[0] = 0;
	    for (int i_91_ = 1; i_91_ <= 256; i_91_++)
		arg0.anIntArray1199[i_91_] = arg0.anIntArray1195[i_91_ - 1];
	    for (int i_92_ = 1; i_92_ <= 256; i_92_++)
		arg0.anIntArray1199[i_92_] += arg0.anIntArray1199[i_92_ - 1];
	    for (int i_93_ = 0; i_93_ < i_72_; i_93_++) {
		i_43_ = (byte) (Class11_Sub10_Sub14.anIntArray2349[i_93_]
				& 0xff);
		Class11_Sub10_Sub14.anIntArray2349[(arg0.anIntArray1199
						    [i_43_ & 0xff])]
		    |= i_93_ << 8;
		arg0.anIntArray1199[i_43_ & 0xff]++;
	    }
	    arg0.anInt1175
		= Class11_Sub10_Sub14.anIntArray2349[arg0.anInt1153] >> 8;
	    arg0.anInt1183 = 0;
	    arg0.anInt1175
		= Class11_Sub10_Sub14.anIntArray2349[arg0.anInt1175];
	    arg0.anInt1169 = (byte) (arg0.anInt1175 & 0xff);
	    arg0.anInt1175 >>= 8;
	    arg0.anInt1183++;
	    arg0.anInt1160 = i_72_;
	    method717(arg0);
	    if (arg0.anInt1183 == arg0.anInt1160 + 1 && arg0.anInt1194 == 0)
		bool_41_ = true;
	    else
		bool_41_ = false;
	}
    }
}
