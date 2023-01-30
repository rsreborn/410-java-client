/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Font;

public class Class7 implements Interface3 {
    public static int anInt1420;
    public static Class11_Sub2 aClass11_Sub2_1421;
    public static int anInt1422;
    public static long[] aLongArray1423;
    public static int anInt1424;
    public static int anInt1425 = 0;
    public static Class31 aClass31_1426;
    public Class11_Sub9[] aClass11_Sub9Array1427;
    public static int anInt1428;
    public static int anInt1429;
    public static int anInt1430;
    public static Class37 aClass37_1431;
    public static Class31 aClass31_1432;
    public static int anInt1433;
    public static int anInt1434;
    public static Class31 aClass31_1435;
    public Class36 aClass36_1436 = new Class36();
    public static Class31 aClass31_1437;
    public static int anInt1438;
    public int anInt1439;
    public static Class31 aClass31_1440;
    public int anInt1441 = 0;
    public int anInt1442;
    public static Font aFont1443;
    public static Class31 aClass31_1444;
    public Class55 aClass55_1445;
    public static int anInt1446;
    public static int anInt1447;
    public static int anInt1448;
    public double aDouble1449;
    public static int anInt1450;

    public boolean method6(int arg0, byte arg1) {
        try {
            anInt1428++;
            if (arg1 <= 43) anInt1441 = 105;
            if ((anInt1439 ^ 0xffffffff) != -65) return false;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.B(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static void method76(byte arg0) {
        try {
            aFont1443 = null;
            aClass31_1435 = null;
            aClass31_1426 = null;
            aClass11_Sub2_1421 = null;
            aClass31_1437 = null;
            aClass37_1431 = null;
            aClass31_1440 = null;
            if (arg0 == 73) {
                aLongArray1423 = null;
                aClass31_1444 = null;
                aClass31_1432 = null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.H(" + arg0 + ')');
        }
    }

    public int[] method9(int arg0, byte arg1) {
        try {
            anInt1424++;
            if (arg1 > -117) return null;
            Class11_Sub9 class11_sub9 = aClass11_Sub9Array1427[arg0];
            if (class11_sub9 != null) {
                if (class11_sub9.anIntArray1641 != null) {
                    aClass36_1436.method699((byte) -128, class11_sub9);
                    class11_sub9.aBoolean1648 = true;
                    return class11_sub9.anIntArray1641;
                }
                boolean bool = class11_sub9.method223(aDouble1449, anInt1439, aClass55_1445);
                if (bool) {
                    if (anInt1441 != 0) anInt1441--;
                    else {
                        Class11_Sub9 class11_sub9_0_ = (Class11_Sub9) aClass36_1436.method688(false);
                        class11_sub9_0_.method222();
                    }
                    aClass36_1436.method699((byte) -120, class11_sub9);
                    class11_sub9.aBoolean1648 = true;
                    return class11_sub9.anIntArray1641;
                }
            }
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.L(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static void method77(int arg0) {
        try {
            Class64.anInt1340 = 0;
            anInt1433++;
            Class11_Sub11.anInt1687 = 0;
            Class57.parsePlayerMovement(arg0 + 94);
            Class11_Sub10.parseTrackedPlayerMovement(-918);
            Class54.registerNewPlayers((byte) -106);
            Class15_Sub1.parseTrackedNewPlayersUpdateMasks(arg0 + 4);
            for (int i = 0; (i ^ 0xffffffff) > (Class64.anInt1340 ^ 0xffffffff); i++) {
                int i_1_ = Class20.anIntArray394[i];
                if (((Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_1_].anInt2505) ^ 0xffffffff) != (Class61.anInt1283 ^ 0xffffffff))
                    Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_1_] = null;
            }
            if (Class11_Sub10_Sub14.anInt2348 != Class11_Sub10_Sub4_Sub2.inBuffer.position)
                throw new RuntimeException("gpp1 pos:" + (Class11_Sub10_Sub4_Sub2.inBuffer.position) + " psize:" + Class11_Sub10_Sub14.anInt2348);
            for (int i = arg0; (i ^ 0xffffffff) > (Class48.anInt885 ^ 0xffffffff); i++) {
                if ((Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160[Class32.anIntArray597[i]]) == null)
                    throw new RuntimeException("gpp2 pos:" + i + " size:" + Class48.anInt885);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.G(" + arg0 + ')');
        }
    }

    public static void method78(int arg0, int arg1, int arg2, int arg3, Class8[] arg4, byte arg5, int arg6, int arg7, Class49 arg8, int arg9, byte[] arg10) {
        try {
            anInt1429++;
            Buffer buffer = new Buffer(arg10);
            if (arg5 <= 102) method77(-65);
            int i = -1;
            for (; ; ) {
                int i_2_ = buffer.method158(true);
                if (i_2_ == 0) break;
                i += i_2_;
                int i_3_ = 0;
                for (; ; ) {
                    int i_4_ = buffer.method158(true);
                    if (i_4_ == 0) break;
                    i_3_ += -1 + i_4_;
                    int i_5_ = i_3_ & 0x3f;
                    int i_6_ = 0x3f & i_3_ >> -1392310234;
                    int i_7_ = i_3_ >> 1077914060;
                    int i_8_ = buffer.method168(255);
                    int i_9_ = i_8_ >> -1029545918;
                    int i_10_ = 0x3 & i_8_;
                    if (i_7_ == arg1 && i_6_ >= arg2 && i_6_ < arg2 - -8 && arg7 <= i_5_ && (8 + arg7 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
                        Class11_Sub10_Sub2 class11_sub10_sub2 = Class51.method853((byte) -123, i);
                        int i_11_ = (Class58.method944(i_6_ & 0x7, class11_sub10_sub2.anInt1974, 0x7 & i_5_, arg0, -2091, class11_sub10_sub2.anInt1967, i_10_) + arg3);
                        int i_12_ = (Class15_Sub1.method546(0x7 & i_6_, (class11_sub10_sub2.anInt1967), i_10_, arg0, (class11_sub10_sub2.anInt1974), (byte) 96, 0x7 & i_5_) + arg6);
                        if (i_11_ > 0 && i_12_ > 0 && (i_11_ ^ 0xffffffff) > -104 && (i_12_ ^ 0xffffffff) > -104) {
                            Class8 class8 = null;
                            int i_13_ = arg9;
                            if ((0x2 & (Class25.aByteArrayArrayArray481[1][i_11_][i_12_])) == 2) i_13_--;
                            if ((i_13_ ^ 0xffffffff) <= -1) class8 = arg4[i_13_];
                            Class44.method763(arg9, i, i_11_, (byte) -120, class8, 0x3 & arg0 + i_10_, i_9_, arg8, i_12_);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ea.A(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? "{...}" : "null") + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? "{...}" : "null") + ',' + arg9 + ',' + (arg10 != null ? "{...}" : "null") + ')'));
        }
    }

    public void method79(boolean arg0) {
        try {
            for (int i = 0; ((aClass11_Sub9Array1427.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                if (aClass11_Sub9Array1427[i] != null) aClass11_Sub9Array1427[i].method222();
            }
            if (arg0 != true) anInt1442 = 116;
            aClass36_1436 = new Class36();
            anInt1441 = anInt1442;
            anInt1450++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.K(" + arg0 + ')');
        }
    }

    public static void method80(Class31 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if ((Class11_Sub7.anInt1597 ^ 0xffffffff) > -501) {
            Class4.aClass31Array141[Class11_Sub7.anInt1597] = arg0;
            Class11_Sub10_Sub4_Sub2_Sub1.anIntArray2794[Class11_Sub7.anInt1597] = arg1;
            Class48.anIntArray914[Class11_Sub7.anInt1597] = arg5;
            Class11_Sub8.anIntArray1627[Class11_Sub7.anInt1597] = arg3;
            Class13.anIntArray267[Class11_Sub7.anInt1597] = arg2;
            Class11_Sub7.anInt1597++;
        }
        anInt1448++;
        if (arg4 != false) aClass31_1437 = null;
    }

    public boolean method7(byte arg0, int arg1) {
        try {
            if (arg0 != -20) method80(null, 53, -113, 36, true, 28);
            anInt1447++;
            return aClass11_Sub9Array1427[arg1].aBoolean1643;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.J(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static boolean method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            anInt1446++;
            if (!Class61.method968(arg2, -20142)) return false;
            Class11_Sub10_Sub13.method405(arg6, arg0, arg7, arg5);
            boolean bool = true;
            if (arg8 != 2) return false;
            Class11_Sub10_Sub5[] class11_sub10_sub5s = Canvas_Sub1.aClass11_Sub10_Sub5ArrayArray61[arg2];
            for (int i = 0; (class11_sub10_sub5s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                Class11_Sub10_Sub5 class11_sub10_sub5 = class11_sub10_sub5s[i];
                if (class11_sub10_sub5 != null && class11_sub10_sub5.anInt2117 == arg1) {
                    if ((class11_sub10_sub5.anInt2116 ^ 0xffffffff) < -1) Class62.method980(false, class11_sub10_sub5);
                    int i_14_ = -arg4 + (arg0 + class11_sub10_sub5.anInt2081);
                    int i_15_ = arg6 + class11_sub10_sub5.anInt2071;
                    if (class11_sub10_sub5.anInt2119 == 0) {
                        if (class11_sub10_sub5.aBoolean2054 && !Class11_Sub10_Sub14.method470(arg3, i, (byte) -97))
                            continue;
                        if (((class11_sub10_sub5.anInt2101 + -class11_sub10_sub5.anInt2115) ^ 0xffffffff) > (class11_sub10_sub5.anInt2080 ^ 0xffffffff))
                            class11_sub10_sub5.anInt2080 = (class11_sub10_sub5.anInt2101 - class11_sub10_sub5.anInt2115);
                        if (class11_sub10_sub5.anInt2080 < 0) class11_sub10_sub5.anInt2080 = 0;
                        bool &= method81(i_14_, i, arg2, arg3, class11_sub10_sub5.anInt2080, i_14_ + class11_sub10_sub5.anInt2115, i_15_, i_15_ - -class11_sub10_sub5.anInt2105, arg8);
                        Class11_Sub10_Sub13.method405(arg6, arg0, arg7, arg5);
                        if (class11_sub10_sub5.anInt2115 < class11_sub10_sub5.anInt2101)
                            Class11_Sub10_Sub15.method474(class11_sub10_sub5.anInt2115, 13379, i_15_ + class11_sub10_sub5.anInt2105, class11_sub10_sub5.anInt2080, i_14_, class11_sub10_sub5.anInt2101);
                    }
                    if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff) != -2) {
                        if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff) == -3) {
                            int i_16_ = 0;
                            for (int i_17_ = 0; ((class11_sub10_sub5.anInt2115 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
                                for (int i_18_ = 0; class11_sub10_sub5.anInt2105 > i_18_; i_18_++) {
                                    int i_19_ = i_18_ * (class11_sub10_sub5.anInt2053 + 32) + i_15_;
                                    int i_20_ = (((32 + class11_sub10_sub5.anInt2066) * i_17_) + i_14_);
                                    if (i_16_ < 20) {
                                        i_20_ += (class11_sub10_sub5.anIntArray2098[i_16_]);
                                        i_19_ += (class11_sub10_sub5.anIntArray2073[i_16_]);
                                    }
                                    if (((class11_sub10_sub5.anIntArray2106[i_16_]) ^ 0xffffffff) < -1) {
                                        int i_21_ = 0;
                                        int i_22_ = 0;
                                        int i_23_ = ((class11_sub10_sub5.anIntArray2106[i_16_]) - 1);
                                        if ((((i_19_ ^ 0xffffffff) < (-32 + (Class11_Sub10_Sub13.anInt2303) ^ 0xffffffff)) && ((i_19_ ^ 0xffffffff) > ((Class11_Sub10_Sub13.anInt2302) ^ 0xffffffff)) && (Class11_Sub10_Sub13.anInt2305 - 32) < i_20_ && (Class11_Sub10_Sub13.anInt2304 > i_20_)) || (Class48.anInt896 != 0 && ((i_16_ ^ 0xffffffff) == ((Class11_Sub10_Sub4_Sub6.anInt2720) ^ 0xffffffff)))) {
                                            int i_24_ = 0;
                                            if (Class39.anInt721 == 1 && i_16_ == Class10.anInt212 && (Class60.anInt1256 == ((arg2 << -1671502608) - -i)))
                                                i_24_ = 16777215;
                                            Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4 = (Class24.method586(i_24_, (class11_sub10_sub5.anIntArray2068[i_16_]), i_23_, -27287));
                                            if (class11_sub10_sub13_sub4 != null) {
                                                if (Class48.anInt896 == 0 || (((Class11_Sub10_Sub4_Sub6.anInt2720) ^ 0xffffffff) != (i_16_ ^ 0xffffffff)) || (i + (arg2 << 172888816) != Class40.anInt722)) {
                                                    if ((anInt1425 ^ 0xffffffff) == -1 || ((i_16_ ^ 0xffffffff) != ((Class43.anInt785) ^ 0xffffffff)) || ((Class20.anInt386 ^ 0xffffffff) != (i + (arg2 << 1705781680) ^ 0xffffffff)))
                                                        class11_sub10_sub13_sub4.method456(i_19_, i_20_);
                                                    else class11_sub10_sub13_sub4.method450(i_19_, i_20_, 128);
                                                } else {
                                                    i_21_ = (-(Class11_Sub10_Sub5.anInt2052) + (Class11_Sub10_Sub7.anInt2161));
                                                    if (i_21_ < 5 && (i_21_ ^ 0xffffffff) < 4) i_21_ = 0;
                                                    i_22_ = (-Class64.anInt1347 + (Class11_Sub6.anInt1590));
                                                    if (((i_22_ ^ 0xffffffff) > -6) && (i_22_ ^ 0xffffffff) < 4)
                                                        i_22_ = 0;
                                                    if ((Class1.anInt91 ^ 0xffffffff) > -6) {
                                                        i_21_ = 0;
                                                        i_22_ = 0;
                                                    }
                                                    class11_sub10_sub13_sub4.method450(i_19_ - -i_22_, i_21_ + i_20_, 128);
                                                    if ((arg1 ^ 0xffffffff) != 0) {
                                                        Class11_Sub10_Sub5 class11_sub10_sub5_25_ = (class11_sub10_sub5s[arg1]);
                                                        if (((Class11_Sub10_Sub13.anInt2305) > i_20_ - -i_21_) && ((class11_sub10_sub5_25_.anInt2080) > 0)) {
                                                            int i_26_ = ((Class17.anInt340) * (-i_20_ + (Class11_Sub10_Sub13.anInt2305) - i_21_) / 3);
                                                            if (i_26_ > ((Class17.anInt340) * 10))
                                                                i_26_ = (10 * (Class17.anInt340));
                                                            if (i_26_ > (class11_sub10_sub5_25_.anInt2080))
                                                                i_26_ = (class11_sub10_sub5_25_.anInt2080);
                                                            Class11_Sub10_Sub5.anInt2052 += i_26_;
                                                            class11_sub10_sub5_25_.anInt2080 -= i_26_;
                                                        }
                                                        if ((((i_20_ + i_21_ + 32) ^ 0xffffffff) < ((Class11_Sub10_Sub13.anInt2304) ^ 0xffffffff)) && (((-(class11_sub10_sub5_25_.anInt2115) + (class11_sub10_sub5_25_.anInt2101)) ^ 0xffffffff) < ((class11_sub10_sub5_25_.anInt2080) ^ 0xffffffff))) {
                                                            int i_27_ = ((Class17.anInt340) * (i_21_ + (i_20_ - -32) + -(Class11_Sub10_Sub13.anInt2304)) / 3);
                                                            if ((i_27_ ^ 0xffffffff) < ((10 * (Class17.anInt340)) ^ 0xffffffff))
                                                                i_27_ = (10 * (Class17.anInt340));
                                                            if ((i_27_ ^ 0xffffffff) < ((-(class11_sub10_sub5_25_.anInt2080) + ((class11_sub10_sub5_25_.anInt2101) - (class11_sub10_sub5_25_.anInt2115))) ^ 0xffffffff))
                                                                i_27_ = ((class11_sub10_sub5_25_.anInt2101) + (-(class11_sub10_sub5_25_.anInt2115) - class11_sub10_sub5_25_.anInt2080));
                                                            class11_sub10_sub5_25_.anInt2080 += i_27_;
                                                            Class11_Sub10_Sub5.anInt2052 -= i_27_;
                                                        }
                                                    }
                                                }
                                                if (((class11_sub10_sub13_sub4.anInt2779) ^ 0xffffffff) == -34 || (class11_sub10_sub5.anIntArray2068[i_16_]) != 1) {
                                                    int i_28_ = (class11_sub10_sub5.anIntArray2068[i_16_]);
                                                    Class37.aClass11_Sub10_Sub13_Sub2_699.method435((Class31.method626(i_28_, arg8 + 121)), 1 + i_19_ + i_22_, i_21_ + i_20_ + 10, 0);
                                                    Class37.aClass11_Sub10_Sub13_Sub2_699.method435((Class31.method626(i_28_, -77)), i_19_ + i_22_, i_20_ + (9 - -i_21_), 16776960);
                                                }
                                            } else bool = false;
                                        }
                                    } else if ((class11_sub10_sub5.anIntArray2076) != null && (i_16_ ^ 0xffffffff) > -21) {
                                        Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4 = class11_sub10_sub5.method341(i_16_, false);
                                        if (class11_sub10_sub13_sub4 == null) {
                                            if (Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798) bool = false;
                                        } else class11_sub10_sub13_sub4.method456(i_19_, i_20_);
                                    }
                                    i_16_++;
                                }
                            }
                        } else if (class11_sub10_sub5.anInt2119 == 3) {
                            int i_29_;
                            if (Class44.method764(class11_sub10_sub5, (byte) -58)) {
                                i_29_ = class11_sub10_sub5.anInt2082;
                                if (Class11_Sub10_Sub14.method470(arg3, i, (byte) -113) && class11_sub10_sub5.anInt2074 != 0)
                                    i_29_ = class11_sub10_sub5.anInt2074;
                            } else {
                                i_29_ = class11_sub10_sub5.anInt2075;
                                if (Class11_Sub10_Sub14.method470(arg3, i, (byte) -83) && class11_sub10_sub5.anInt2124 != 0)
                                    i_29_ = class11_sub10_sub5.anInt2124;
                            }
                            if ((class11_sub10_sub5.anInt2104 ^ 0xffffffff) == -1) {
                                if (class11_sub10_sub5.aBoolean2123)
                                    Class11_Sub10_Sub13.method404(i_15_, i_14_, class11_sub10_sub5.anInt2105, class11_sub10_sub5.anInt2115, i_29_);
                                else
                                    Class11_Sub10_Sub13.method399(i_15_, i_14_, class11_sub10_sub5.anInt2105, class11_sub10_sub5.anInt2115, i_29_);
                            } else if (class11_sub10_sub5.aBoolean2123)
                                Class11_Sub10_Sub13.method407(i_15_, i_14_, class11_sub10_sub5.anInt2105, class11_sub10_sub5.anInt2115, i_29_, (-(0xff & class11_sub10_sub5.anInt2104) + 256));
                            else
                                Class11_Sub10_Sub13.method401(i_15_, i_14_, class11_sub10_sub5.anInt2105, class11_sub10_sub5.anInt2115, i_29_, (-(class11_sub10_sub5.anInt2104 & 0xff) + 256));
                        } else if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff) == -5) {
                            Class11_Sub10_Sub13_Sub2 class11_sub10_sub13_sub2 = (Class11_Sub10_Sub4.aClass11_Sub10_Sub13_Sub2Array2034[class11_sub10_sub5.anInt2047]);
                            Class31 class31 = class11_sub10_sub5.aClass31_2077;
                            int i_30_;
                            if (Class44.method764(class11_sub10_sub5, (byte) -113)) {
                                i_30_ = class11_sub10_sub5.anInt2082;
                                if (Class11_Sub10_Sub14.method470(arg3, i, (byte) -37) && (class11_sub10_sub5.anInt2074 ^ 0xffffffff) != -1)
                                    i_30_ = class11_sub10_sub5.anInt2074;
                                if ((class11_sub10_sub5.aClass31_2094.method623(arg8 + 125) ^ 0xffffffff) < -1)
                                    class31 = class11_sub10_sub5.aClass31_2094;
                            } else {
                                i_30_ = class11_sub10_sub5.anInt2075;
                                if (Class11_Sub10_Sub14.method470(arg3, i, (byte) -74) && (class11_sub10_sub5.anInt2124 ^ 0xffffffff) != -1)
                                    i_30_ = class11_sub10_sub5.anInt2124;
                            }
                            if (class11_sub10_sub5.anInt2061 == 6 && Class39_Sub1.aBoolean1839) {
                                class31 = Class20.aClass31_398;
                                i_30_ = class11_sub10_sub5.anInt2075;
                            }
                            if ((Class11_Sub10_Sub13.anInt2306 ^ 0xffffffff) == -480) {
                                if (i_30_ == 16776960) i_30_ = 255;
                                if (i_30_ == 49152) i_30_ = 16777215;
                            }
                            class31 = Class55_Sub1.method913(class11_sub10_sub5, class31, 4);
                            int i_31_ = class11_sub10_sub13_sub2.anInt2759 + i_14_;
                            while ((class31.method623(-121) ^ 0xffffffff) < -1) {
                                int i_32_ = class31.method654((Class11_Sub10_Sub8.aClass31_2187), (byte) 95);
                                Class31 class31_33_;
                                if (i_32_ == -1) {
                                    class31_33_ = class31;
                                    class31 = Class25.aClass31_461;
                                } else {
                                    class31_33_ = class31.method634(i_32_, -32, 0);
                                    class31 = class31.method639(28418, i_32_ + 2);
                                }
                                if (!class11_sub10_sub5.aBoolean2050)
                                    class11_sub10_sub13_sub2.method434(class31_33_, i_15_, i_31_, i_30_, class11_sub10_sub5.aBoolean2059);
                                else
                                    class11_sub10_sub13_sub2.method438(class31_33_, (class11_sub10_sub5.anInt2105 / 2 + i_15_), i_31_, i_30_, class11_sub10_sub5.aBoolean2059);
                                i_31_ += class11_sub10_sub13_sub2.anInt2759;
                            }
                        } else if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff) == -6) {
                            Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4 = (class11_sub10_sub5.method339(Class44.method764(class11_sub10_sub5, (byte) -95), -1));
                            if (class11_sub10_sub13_sub4 != null) class11_sub10_sub13_sub4.method456(i_15_, i_14_);
                            else if (Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798) bool = false;
                        } else if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff) == -7) {
                            Class11_Sub10_Sub13_Sub1.method419(class11_sub10_sub5.anInt2105 / 2 + i_15_, i_14_ + class11_sub10_sub5.anInt2115 / 2);
                            int i_34_ = ((class11_sub10_sub5.anInt2079 * (Class11_Sub10_Sub13_Sub1.anIntArray2725[class11_sub10_sub5.anInt2065])) >> -1750067440);
                            int i_35_ = (((Class11_Sub10_Sub13_Sub1.anIntArray2721[class11_sub10_sub5.anInt2065]) * class11_sub10_sub5.anInt2079) >> 1571614928);
                            boolean bool_36_ = Class44.method764(class11_sub10_sub5, (byte) -34);
                            int i_37_;
                            if (bool_36_) i_37_ = class11_sub10_sub5.anInt2085;
                            else i_37_ = class11_sub10_sub5.anInt2057;
                            Class11_Sub10_Sub4_Sub4 class11_sub10_sub4_sub4;
                            if (class11_sub10_sub5.anInt2109 == 5)
                                class11_sub10_sub4_sub4 = (Class14.aClass24_279.method591(-1, -1, (byte) 101, null, null));
                            else if ((i_37_ ^ 0xffffffff) != 0) {
                                Class11_Sub10_Sub12 class11_sub10_sub12 = NotActuallyBuffer.method600(i_37_, 4867);
                                class11_sub10_sub4_sub4 = (class11_sub10_sub5.method335(127, class11_sub10_sub12, bool_36_, (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.aClass24_2810), class11_sub10_sub5.anInt2048));
                                if (class11_sub10_sub4_sub4 == null && (Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798))
                                    bool = false;
                            } else {
                                class11_sub10_sub4_sub4 = (class11_sub10_sub5.method335(arg8 + 107, null, bool_36_, (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.aClass24_2810), -1));
                                if (class11_sub10_sub4_sub4 == null && (Class11_Sub10_Sub4_Sub2_Sub1.aBoolean2798))
                                    bool = false;
                            }
                            if (class11_sub10_sub4_sub4 != null)
                                class11_sub10_sub4_sub4.method310(0, class11_sub10_sub5.anInt2120, 0, class11_sub10_sub5.anInt2065, 0, i_34_, i_35_);
                            Class11_Sub10_Sub13_Sub1.method420();
                        } else {
                            if ((class11_sub10_sub5.anInt2119 ^ 0xffffffff) == -8) {
                                Class11_Sub10_Sub13_Sub2 class11_sub10_sub13_sub2 = (Class11_Sub10_Sub4.aClass11_Sub10_Sub13_Sub2Array2034[class11_sub10_sub5.anInt2047]);
                                int i_38_ = 0;
                                for (int i_39_ = 0; i_39_ < class11_sub10_sub5.anInt2115; i_39_++) {
                                    for (int i_40_ = 0; ((i_40_ ^ 0xffffffff) > (class11_sub10_sub5.anInt2105 ^ 0xffffffff)); i_40_++) {
                                        if ((class11_sub10_sub5.anIntArray2106[i_38_]) > 0) {
                                            Class11_Sub10_Sub15 class11_sub10_sub15 = (Class60.method950(79, (class11_sub10_sub5.anIntArray2106[i_38_]) - 1));
                                            Class31 class31 = (class11_sub10_sub15.aClass31_2406);
                                            if (class31 == null) class31 = Class20.aClass31_390;
                                            if ((class11_sub10_sub15.aBoolean2405) || ((class11_sub10_sub5.anIntArray2068[i_38_]) ^ 0xffffffff) != -2)
                                                class31 = (Class40.method744(0, (new Class31[]{class31, (NotActuallyBuffer.aClass31_487), (Class11_Sub10_Sub4_Sub2.method268((class11_sub10_sub5.anIntArray2068[i_38_]), (byte) -77))})));
                                            int i_41_ = (i_15_ + (115 + (class11_sub10_sub5.anInt2053)) * i_40_);
                                            int i_42_ = (i_14_ + (i_39_ * (12 - -(class11_sub10_sub5.anInt2066))));
                                            if (class11_sub10_sub5.aBoolean2050)
                                                class11_sub10_sub13_sub2.method438(class31, (i_41_ + (class11_sub10_sub5.anInt2105) / 2), i_42_, (class11_sub10_sub5.anInt2075), (class11_sub10_sub5.aBoolean2059));
                                            else
                                                class11_sub10_sub13_sub2.method434(class31, i_41_, i_42_, (class11_sub10_sub5.anInt2075), (class11_sub10_sub5.aBoolean2059));
                                        }
                                        i_38_++;
                                    }
                                }
                            }
                            if (((class11_sub10_sub5.anInt2119 ^ 0xffffffff) == -9) && Class11_Sub4.method138(arg3, 67, i) && Class28.anInt502 == 100) {
                                int i_43_ = 0;
                                int i_44_ = 0;
                                Class11_Sub10_Sub13_Sub2 class11_sub10_sub13_sub2 = Class58.aClass11_Sub10_Sub13_Sub2_1228;
                                Class31 class31 = class11_sub10_sub5.aClass31_2077;
                                class31 = (Class55_Sub1.method913(class11_sub10_sub5, class31, 4));
                                while (class31.method623(arg8 ^ 0x7a) > 0) {
                                    int i_45_ = class31.method654((Class11_Sub10_Sub8.aClass31_2187), (byte) 95);
                                    Class31 class31_46_;
                                    if ((i_45_ ^ 0xffffffff) == 0) {
                                        class31_46_ = class31;
                                        class31 = Class25.aClass31_461;
                                    } else {
                                        class31_46_ = class31.method634(i_45_, -32, 0);
                                        class31 = class31.method639(28418, 2 + i_45_);
                                    }
                                    int i_47_ = class11_sub10_sub13_sub2.method436(class31_46_);
                                    i_44_ += (class11_sub10_sub13_sub2.anInt2759 - -1);
                                    if ((i_47_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff)) i_43_ = i_47_;
                                }
                                i_44_ += 7;
                                i_43_ += 6;
                                int i_48_ = (class11_sub10_sub5.anInt2115 + i_14_ - -5);
                                if (arg5 < i_48_ + i_44_) i_48_ = arg5 - i_44_;
                                int i_49_ = (-i_43_ + (i_15_ + class11_sub10_sub5.anInt2105) + -5);
                                if ((i_49_ ^ 0xffffffff) > (i_15_ + 5 ^ 0xffffffff)) i_49_ = 5 + i_15_;
                                if ((i_49_ + i_43_ ^ 0xffffffff) < (arg7 ^ 0xffffffff)) i_49_ = -i_43_ + arg7;
                                Class11_Sub10_Sub13.method404(i_49_, i_48_, i_43_, i_44_, 16777120);
                                Class11_Sub10_Sub13.method399(i_49_, i_48_, i_43_, i_44_, 0);
                                int i_50_ = (class11_sub10_sub13_sub2.anInt2759 + (i_48_ + 2));
                                class31 = class11_sub10_sub5.aClass31_2077;
                                class31 = (Class55_Sub1.method913(class11_sub10_sub5, class31, arg8 + 2));
                                while (class31.method623(121) > 0) {
                                    int i_51_ = class31.method654((Class11_Sub10_Sub8.aClass31_2187), (byte) 95);
                                    Class31 class31_52_;
                                    if (i_51_ == -1) {
                                        class31_52_ = class31;
                                        class31 = Class25.aClass31_461;
                                    } else {
                                        class31_52_ = class31.method634(i_51_, arg8 + -34, 0);
                                        class31 = class31.method639(28418, 2 + i_51_);
                                    }
                                    class11_sub10_sub13_sub2.method434(class31_52_, 3 + i_49_, i_50_, 0, false);
                                    i_50_ += 1 + (class11_sub10_sub13_sub2.anInt2759);
                                }
                            }
                        }
                    }
                }
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ea.F(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')'));
        }
    }

    public void method82(double arg0, int arg1) {
        try {
            aDouble1449 = arg0;
            anInt1422++;
            if (arg1 != 2) method8(false, 18);
            method79(true);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.E(" + arg0 + ',' + arg1 + ')');
        }
    }

    public void method83(int arg0, byte arg1) {
        try {
            for (int i = 0; ((aClass11_Sub9Array1427.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                Class11_Sub9 class11_sub9 = aClass11_Sub9Array1427[i];
                if (class11_sub9 != null && (class11_sub9.anInt1644 ^ 0xffffffff) != -1 && class11_sub9.aBoolean1648) {
                    class11_sub9.method220(arg0);
                    class11_sub9.aBoolean1648 = false;
                }
            }
            if (arg1 != 28) method79(false);
            anInt1420++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.D(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static Class11_Sub10_Sub13_Sub2 method84(int arg0) {
        try {
            int i = 123 / ((arg0 - -49) / 58);
            anInt1430++;
            Class11_Sub10_Sub13_Sub2 class11_sub10_sub13_sub2 = new Class11_Sub10_Sub13_Sub2(Class11_Sub4.anIntArray1505, Class28.anIntArray523, Class6.anIntArray153, Class39_Sub1.anIntArray1833, Class51.aByteArrayArray1013);
            Class52.method855(-104);
            return class11_sub10_sub13_sub2;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.I(" + arg0 + ')');
        }
    }

    public int method8(boolean arg0, int arg1) {
        try {
            if (arg0 != true) anInt1442 = 1;
            anInt1434++;
            if (aClass11_Sub9Array1427[arg1] == null) return 0;
            return aClass11_Sub9Array1427[arg1].anInt1646;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ea.C(" + arg0 + ',' + arg1 + ')');
        }
    }

    public Class7(Class55 arg0, Class55 arg1, int arg2, double arg3, int arg4) {
        anInt1439 = 128;
        aDouble1449 = 1.0;
        try {
            anInt1439 = arg4;
            aDouble1449 = arg3;
            aClass55_1445 = arg1;
            anInt1442 = arg2;
            anInt1441 = anInt1442;
            int[] is = arg0.method900((byte) -56, 0);
            int i = is.length;
            aClass11_Sub9Array1427 = new Class11_Sub9[arg0.method895(0, (byte) 120)];
            for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > (i ^ 0xffffffff); i_53_++) {
                Buffer buffer = new Buffer(arg0.method887((byte) -128, is[i_53_], 0));
                aClass11_Sub9Array1427[is[i_53_]] = new Class11_Sub9(buffer);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("ea.<init>(" + (arg0 != null ? "{...}" : "null") + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')'));
        }
    }

    static {
        aLongArray1423 = new long[200];
        aClass31_1432 = Class64.method992(" from your ignore list first", 255);
        aClass31_1426 = Class64.method992("redstone3", 255);
        aClass31_1435 = Class64.method992("@gr2@", 255);
        aClass31_1437 = Class64.method992("Imported models", 255);
        aClass31_1440 = Class64.method992("Import complete", 255);
        aClass31_1444 = Class64.method992("This world is full)3", 255);
    }
}
