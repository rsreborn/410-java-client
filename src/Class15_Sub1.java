/* Class15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

public abstract class Class15_Sub1 extends Class15 {
    public static int anInt1730;
    public static int anInt1731;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1732;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1733;
    public static int[] anIntArray1734;
    public static Class31 aClass31_1735;
    public static int anInt1736;
    public static int anInt1737;
    public static int anInt1738;
    public static int anInt1739;
    public static Class31 aClass31_1740 = Class64.method992("Login", 255);
    public static volatile int anInt1741;
    public static int anInt1742;
    public static int anInt1743;
    public static boolean aBoolean1744;
    public static Class31 aClass31_1745;
    public static Class11_Sub10_Sub13_Sub3 aClass11_Sub10_Sub13_Sub3_1746;
    public static Class31 aClass31_1747 = Class64.method992("white:", 255);
    public static int anInt1748;
    public static int anInt1749;
    public static Class31 aClass31_1750 = Class64.method992("button near the top of that page)3", 255);
    public static Class31 aClass31_1751;
    public static Class31 aClass31_1752;
    public static int anInt1753;
    public static byte[][][] aByteArrayArrayArray1754;

    public boolean method538(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xf0) == 176) {
            if (arg1 == 121) {
                method547(arg0, arg1, arg2, arg3);
                int i = arg0 & 0xf;
                Class20.anIntArray382[i] = 12800;
                int i_0_ = method543(i);
                method547(arg0, 7, i_0_ >> 7, arg3);
                method547(arg0, 39, i_0_ & 0x7f, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int i = arg0 & 0xf;
                if (arg1 == 7) Class20.anIntArray382[i] = (Class20.anIntArray382[i] & 0x7f) + (arg2 << 7);
                else Class20.anIntArray382[i] = (Class20.anIntArray382[i] & 0x3f80) + arg2;
                int i_1_ = method543(i);
                method547(arg0, 7, i_1_ >> 7, arg3);
                method547(arg0, 39, i_1_ & 0x7f, arg3);
                return true;
            }
        }
        return false;
    }

    public static void method539(byte arg0, long arg1) {
        try {
            anInt1742++;
            if (arg1 != 0L) {
                if ((Class55.anInt1143 ^ 0xffffffff) <= -101)
                    Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461, Class24.aClass31_454, true);
                else {
                    Class31 class31 = Class15_Sub2.method553(arg1, (byte) 115).method621(true);
                    for (int i = 0; i < Class55.anInt1143; i++) {
                        if (arg1 == Class46.aLongArray845[i]) {
                            Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461, Class40.method744(0, (new Class31[]{class31, (Class31.aClass31_1369)})), true);
                            return;
                        }
                    }
                    for (int i = 0; ((Buffer.anInt1573 ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                        if ((arg1 ^ 0xffffffffffffffffL) == (Class7.aLongArray1423[i] ^ 0xffffffffffffffffL)) {
                            Class11_Sub10_Sub4_Sub3.method288(0, Class25.aClass31_461, Class40.method744(0, (new Class31[]{Canvas_Sub1.aClass31_65, class31, (Class11_Sub10_Sub4_Sub3.aClass31_2575)})), true);
                            return;
                        }
                    }
                    if (!class31.method638(-10, (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.aClass31_2800))) {
                        Class46.aLongArray845[Class55.anInt1143++] = arg1;
                        if (arg0 == 45) {
                            Canvas_Sub1.anInt49++;
                            Class11_Sub10_Sub14.aBoolean2352 = true;
                            Class40.outBuffer.method196(1, 186);
                            Class40.outBuffer.method140(-24628, arg1);
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "cd.O(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static void parseTrackedNewPlayersUpdateMasks(int arg0) {
        try {
            anInt1730++;
            if (arg0 != 4) method548(null, null, null, (byte) 96);
            for (int i = 0; i < Class11_Sub11.anInt1687; i++) {
                int i_2_ = Class54.anIntArray1066[i];
                Class11_Sub10_Sub4_Sub2_Sub1 class11_sub10_sub4_sub2_sub1 = (Class11_Sub10_Sub7.aClass11_Sub10_Sub4_Sub2_Sub1Array2160[i_2_]);
                int i_3_ = Class11_Sub10_Sub4_Sub2.inBuffer.method168(arg0 + 251);
                if ((0x4 & i_3_) != 0) i_3_ += Class11_Sub10_Sub4_Sub2.inBuffer.method168(255) << -1107577848;
                Canvas_Sub1.parsePlayerSyncMasks(i_2_, class11_sub10_sub4_sub2_sub1, i_3_, -31566);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "cd.M(" + arg0 + ')');
        }
    }

    public void method541(int arg0, int arg1, long arg2, int arg3) {
        do {
            try {
                arg1 = (int) (0.5 + (Math.pow(0.1, (double) arg3 * 5.0E-4) * (double) arg1));
                if (arg0 != -65) anIntArray1734 = null;
                anInt1743++;
                if (arg1 == Class52.anInt1026) break;
                Class52.anInt1026 = arg1;
                for (int i = 0; i < 16; i++) {
                    int i_4_ = method543(i);
                    method547(i + 176, 7, i_4_ >> 476695463, arg2);
                    method547(i + 176, 39, i_4_ & 0x7f, arg2);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class58.method939(runtimeexception, ("cd.L(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
            }
            break;
        } while (false);
    }

    public void method542(long arg0, byte arg1) {
        try {
            anInt1753++;
            if (arg1 != 69) aClass11_Sub10_Sub13_Sub3_1733 = null;
            for (int i = 0; (i ^ 0xffffffff) > -17; i++)
                method547(176 + i, 123, 0, arg0);
            for (int i = 0; i < 16; i++)
                method547(176 - -i, 120, 0, arg0);
            for (int i = 0; i < 16; i++)
                method547(176 + i, 121, 0, arg0);
            for (int i = 0; i < 16; i++)
                method547(176 + i, 0, 0, arg0);
            for (int i = 0; i < 16; i++)
                method547(i + 176, 32, 0, arg0);
            for (int i = 0; i < 16; i++)
                method547(192 - -i, 0, 0, arg0);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "cd.T(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static int method543(int arg0) {
        int i = Class20.anIntArray382[arg0];
        i = (i * Class52.anInt1026 >> 8) * i;
        return (int) (Math.sqrt((double) i) + 0.5);
    }

    public void method544(byte arg0, long arg1) {
        try {
            anInt1731++;
            Class52.anInt1026 = 256;
            int i = -108 % ((-40 - arg0) / 35);
            for (int i_5_ = 0; i_5_ < 16; i_5_++)
                Class20.anIntArray382[i_5_] = 12800;
            for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -17; i_6_++) {
                method547(i_6_ + 176, 7, 100, arg1);
                method547(i_6_ + 176, 39, 0, arg1);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "cd.S(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static Class31 method545(int arg0, byte arg1, int arg2) {
        try {
            anInt1738++;
            if (arg1 != 9) anInt1737 = -48;
            int i = arg0 - arg2;
            if (i < -9) return Class14.aClass31_303;
            if ((i ^ 0xffffffff) > 5) return Class39_Sub1.aClass31_1829;
            if (i < -3) return Class36.aClass31_664;
            if (i < 0) return Class39_Sub1.aClass31_1830;
            if ((i ^ 0xffffffff) < -10) return Class11_Sub10_Sub7.aClass31_2155;
            if ((i ^ 0xffffffff) < -7) return Class57.aClass31_1168;
            if (i > 3) return Class7.aClass31_1435;
            if ((i ^ 0xffffffff) < -1) return Class11_Sub10_Sub4_Sub1.aClass31_2476;
            return Class11.aClass31_219;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("cd.Q(" + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public static int method546(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        try {
            if (arg5 <= 60) anInt1736 = -88;
            if ((0x1 & arg2 ^ 0xffffffff) == -2) {
                int i = arg1;
                arg1 = arg4;
                arg4 = i;
            }
            anInt1739++;
            arg3 &= 0x3;
            if ((arg3 ^ 0xffffffff) == -1) return arg6;
            if (arg3 == 1) return -arg0 + (7 - arg1 + 1);
            if ((arg3 ^ 0xffffffff) == -3) return 7 - arg6 + (1 + -arg4);
            return arg0;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("cd.R(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
        }
    }

    public abstract void method547(int i, int i_7_, int i_8_, long l);

    public static void method548(Class55 arg0, Component arg1, Class55 arg2, byte arg3) {
        try {
            anInt1749++;
            if (!Class33.aBoolean603) {
                Class25.aClass37_482 = Class44.method761(128, arg1, -8, 265);
                Class11_Sub10_Sub13.method402();
                Class54.aClass37_1081 = Class44.method761(128, arg1, -8, 265);
                Class11_Sub10_Sub13.method402();
                Class25.aClass37_464 = Class44.method761(509, arg1, -8, 171);
                Class11_Sub10_Sub13.method402();
                Class11_Sub8.aClass37_1631 = Class44.method761(360, arg1, -8, 132);
                Class11_Sub10_Sub13.method402();
                Class61.aClass37_1282 = Class44.method761(360, arg1, -8, 200);
                Class11_Sub10_Sub13.method402();
                Class7.aClass37_1431 = Class44.method761(202, arg1, -8, 238);
                Class11_Sub10_Sub13.method402();
                Class40.aClass37_726 = Class44.method761(203, arg1, -8, 238);
                Class11_Sub10_Sub13.method402();
                Class29.aClass37_531 = Class44.method761(74, arg1, -8, 94);
                Class11_Sub10_Sub13.method402();
                Class12.aClass37_247 = Class44.method761(75, arg1, -8, 94);
                Class11_Sub10_Sub13.method402();
                byte[] is = arg2.method888(Class11_Sub10_Sub5.aClass31_2064, (byte) 125, Class11_Sub10_Sub4_Sub5.aClass31_2687);
                Class11_Sub10_Sub13_Sub4 class11_sub10_sub13_sub4 = new Class11_Sub10_Sub13_Sub4(is, arg1);
                Class25.aClass37_482.method706(-54);
                class11_sub10_sub13_sub4.method451(0, 0);
                Class54.aClass37_1081.method706(-59);
                class11_sub10_sub13_sub4.method451(-637, 0);
                Class25.aClass37_464.method706(-106);
                class11_sub10_sub13_sub4.method451(-128, 0);
                Class11_Sub8.aClass37_1631.method706(-62);
                class11_sub10_sub13_sub4.method451(-202, -371);
                Class61.aClass37_1282.method706(-119);
                class11_sub10_sub13_sub4.method451(-202, -171);
                Class7.aClass37_1431.method706(-75);
                class11_sub10_sub13_sub4.method451(0, -265);
                Class40.aClass37_726.method706(-110);
                class11_sub10_sub13_sub4.method451(-562, -265);
                Class29.aClass37_531.method706(-81);
                class11_sub10_sub13_sub4.method451(-128, -171);
                Class12.aClass37_247.method706(-79);
                class11_sub10_sub13_sub4.method451(-562, -171);
                int[] is_9_ = new int[class11_sub10_sub13_sub4.anInt2780];
                for (int i = 0; i < class11_sub10_sub13_sub4.anInt2775; i++) {
                    for (int i_10_ = 0; ((class11_sub10_sub13_sub4.anInt2780 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++)
                        is_9_[i_10_] = (class11_sub10_sub13_sub4.anIntArray2776[(i * class11_sub10_sub13_sub4.anInt2780 + (-i_10_ + (class11_sub10_sub13_sub4.anInt2780 + -1)))]);
                    for (int i_11_ = 0; i_11_ < class11_sub10_sub13_sub4.anInt2780; i_11_++)
                        class11_sub10_sub13_sub4.anIntArray2776[i * class11_sub10_sub13_sub4.anInt2780 + i_11_] = is_9_[i_11_];
                }
                Class25.aClass37_482.method706(-65);
                class11_sub10_sub13_sub4.method451(382, 0);
                Class54.aClass37_1081.method706(-86);
                class11_sub10_sub13_sub4.method451(-255, 0);
                Class25.aClass37_464.method706(-64);
                class11_sub10_sub13_sub4.method451(254, 0);
                Class11_Sub8.aClass37_1631.method706(-89);
                class11_sub10_sub13_sub4.method451(180, -371);
                Class61.aClass37_1282.method706(-89);
                class11_sub10_sub13_sub4.method451(180, -171);
                Class7.aClass37_1431.method706(-104);
                class11_sub10_sub13_sub4.method451(382, -265);
                Class40.aClass37_726.method706(-60);
                class11_sub10_sub13_sub4.method451(-180, -265);
                Class29.aClass37_531.method706(-53);
                class11_sub10_sub13_sub4.method451(254, -171);
                Class12.aClass37_247.method706(-82);
                class11_sub10_sub13_sub4.method451(-180, -171);
                class11_sub10_sub13_sub4 = Class58.method938(Class32.aClass31_598, Class11_Sub10_Sub4_Sub5.aClass31_2687, -104, arg0);
                Class25.aClass37_464.method706(-76);
                class11_sub10_sub13_sub4.method456(-128 + -(class11_sub10_sub13_sub4.anInt2780 / 2) + 382, 18);
                Class11_Sub4.aClass11_Sub10_Sub13_Sub3_1496 = Class55.method896(arg0, true, Class11_Sub10_Sub4_Sub5.aClass31_2687, Class23.aClass31_427);
                Class11_Sub6.aClass11_Sub10_Sub13_Sub3_1593 = Class55.method896(arg0, true, Class11_Sub10_Sub4_Sub5.aClass31_2687, (Class11_Sub10_Sub4_Sub2_Sub2.aClass31_2831));
                Class11_Sub10_Sub4.aClass11_Sub10_Sub13_Sub3Array2038 = Class55_Sub1.method904(arg0, Class43.aClass31_775, (byte) -58, (Class11_Sub10_Sub4_Sub5.aClass31_2687));
                Class63.aClass11_Sub10_Sub13_Sub4_1324 = new Class11_Sub10_Sub13_Sub4(128, 265);
                Class11_Sub10_Sub4_Sub2_Sub2.aClass11_Sub10_Sub13_Sub4_2823 = new Class11_Sub10_Sub13_Sub4(128, 265);
                for (int i = 0; (i ^ 0xffffffff) > -33921; i++)
                    Class63.aClass11_Sub10_Sub13_Sub4_1324.anIntArray2776[i] = Class25.aClass37_482.anIntArray692[i];
                for (int i = 0; (i ^ 0xffffffff) > -33921; i++)
                    Class11_Sub10_Sub4_Sub2_Sub2.aClass11_Sub10_Sub13_Sub4_2823.anIntArray2776[i] = Class54.aClass37_1081.anIntArray692[i];
                Class11_Sub10_Sub15.anIntArray2410 = new int[256];
                for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                    Class11_Sub10_Sub15.anIntArray2410[i] = i * 262144;
                for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                    Class11_Sub10_Sub15.anIntArray2410[64 + i] = 16711680 - -(i * 1024);
                for (int i = 0; i < 64; i++)
                    Class11_Sub10_Sub15.anIntArray2410[128 + i] = 16776960 + 4 * i;
                for (int i = 0; i < 64; i++)
                    Class11_Sub10_Sub15.anIntArray2410[192 + i] = 16777215;
                Class11_Sub12.anIntArray1703 = new int[256];
                for (int i = 0; i < 64; i++)
                    Class11_Sub12.anIntArray1703[i] = 1024 * i;
                for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                    Class11_Sub12.anIntArray1703[i + 64] = 65280 + 4 * i;
                for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                    Class11_Sub12.anIntArray1703[i + 128] = 65535 + 262144 * i;
                for (int i = 0; i < 64; i++)
                    Class11_Sub12.anIntArray1703[192 + i] = 16777215;
                Class31.anIntArray1392 = new int[256];
                if (arg3 <= -45) {
                    for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                        Class31.anIntArray1392[i] = i * 4;
                    for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                        Class31.anIntArray1392[i + 64] = 255 - -(i * 262144);
                    for (int i = 0; (i ^ 0xffffffff) > -65; i++)
                        Class31.anIntArray1392[128 + i] = 1024 * i + 16711935;
                    for (int i = 0; i < 64; i++)
                        Class31.anIntArray1392[192 + i] = 16777215;
                    anIntArray1734 = new int[32768];
                    Class37_Sub1.anIntArray1806 = new int[256];
                    Class55_Sub1.anIntArray1871 = new int[32768];
                    Class11_Sub10_Sub11.method379(true, null);
                    Class11_Sub10_Sub4_Sub5.aClass31_2680 = Class11_Sub10_Sub4_Sub5.aClass31_2687;
                    Class11_Sub10_Sub4_Sub5.aClass31_2666 = Class11_Sub10_Sub4_Sub5.aClass31_2687;
                    Class51.anInt1011 = 0;
                    Class1.anIntArray72 = new int[32768];
                    Class58.anIntArray1227 = new int[32768];
                    if ((Class34.anInt632 ^ 0xffffffff) != -1 && !Class1.aBoolean94)
                        Class53.method866(Class11_Sub10_Sub9.aClass31_2206, (Class11_Sub10_Sub4_Sub5.aClass31_2687), Class47.aClass55_Sub1_876, 10, false, 0, Class34.anInt632, 2);
                    else Class53.method860(10, -98);
                    Class11_Sub10_Sub3.method248(false, -23689);
                    Class33.aBoolean603 = true;
                    Class1.aBoolean76 = true;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("cd.N(" + (arg0 != null ? "{...}" : "null") + ',' + (arg1 != null ? "{...}" : "null") + ',' + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
        }
    }

    public static void method549(int arg0) {
        try {
            aClass31_1740 = null;
            aByteArrayArrayArray1754 = null;
            aClass11_Sub10_Sub13_Sub3_1732 = null;
            aClass31_1751 = null;
            aClass11_Sub10_Sub13_Sub3_1733 = null;
            aClass31_1752 = null;
            if (arg0 >= -98) aClass31_1747 = null;
            aClass31_1747 = null;
            aClass31_1745 = null;
            anIntArray1734 = null;
            aClass31_1750 = null;
            aClass11_Sub10_Sub13_Sub3_1746 = null;
            aClass31_1735 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "cd.K(" + arg0 + ')');
        }
    }

    static {
        anInt1741 = 0;
        anInt1737 = 0;
        aClass31_1745 = Class64.method992("Connection timed out", 255);
        aClass31_1751 = (Class64.method992("Moderator option: Mute player for 48 hours: <ON>", 255));
        aBoolean1744 = false;
        aClass31_1752 = Class64.method992("Loading sprites )2 ", 255);
        aClass31_1735 = Class64.method992("Add friend @whi@", 255);
    }
}
