/* Class11_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

public class Buffer extends Class11 {
    public static int anInt1506;
    public static int anInt1507;
    public static int anInt1508;
    public static int anInt1509;
    public static int anInt1510;
    public static int anInt1511;
    public static int anInt1512;
    public static int anInt1513;
    public static int anInt1514;
    public static int anInt1515;
    public static int anInt1516;
    public static int anInt1517;
    public int position;
    public static int anInt1519;
    public static int anInt1520;
    public static int anInt1521;
    public static int anInt1522;
    public static int anInt1523;
    public static int anInt1524;
    public static int anInt1525;
    public static int anInt1526;
    public static int anInt1527;
    public static int anInt1528;
    public static int anInt1529;
    public static int anInt1530;
    public static Class40 aClass40_1531 = new Class40(64);
    public static int anInt1532;
    public static int anInt1533;
    public static int anInt1534;
    public static int anInt1535;
    public static int anInt1536;
    public static int anInt1537;
    public byte[] payload;
    public static int anInt1539;
    public static int anInt1540;
    public static int anInt1541;
    public static int anInt1542;
    public static int anInt1543;
    public static int anInt1544;
    public static int anInt1545;
    public static int anInt1546;
    public static int anInt1547;
    public static int anInt1548;
    public static int anInt1549;
    public static int anInt1550;
    public static int anInt1551;
    public static int anInt1552;
    public static int anInt1553;
    public static int anInt1554;
    public static int anInt1555;
    public static int anInt1556;
    public static Class31 aClass31_1557 = Class64.method992("backbase1", 255);
    public static boolean aBoolean1558;
    public static Class31 aClass31_1559
            = Class64.method992("Side panel redrawn", 255);
    public static int anInt1560;
    public static int anInt1561;
    public static Class31 aClass31_1562;
    public static Class31 aClass31_1563;
    public static int anInt1564;
    public static int anInt1565;
    public static int anInt1566;
    public static int anInt1567;
    public static int anInt1568;
    public static int anInt1569;
    public static int anInt1570;
    public static int anInt1571;
    public static int anInt1572;
    public static int anInt1573;
    public static Class31 aClass31_1574;
    public static boolean aBoolean1575;

    public void method140(int arg0, long arg1) {
        payload[position++] = (byte) (int) (arg1 >> 56);
        payload[position++] = (byte) (int) (arg1 >> 48);
        payload[position++] = (byte) (int) (arg1 >> 40);
        anInt1570++;
        payload[position++] = (byte) (int) (arg1 >> 32);
        payload[position++] = (byte) (int) (arg1 >> 24);
        payload[position++] = (byte) (int) (arg1 >> 16);
        payload[position++] = (byte) (int) (arg1 >> 8);
        payload[position++] = (byte) (int) arg1;
    }

    public int method141(int arg0) {
        position += 2;
        anInt1537++;
        return ((0xff00 & payload[-2 + position] << 8)
                + (payload[position + -1] + -128 & 0xff));
    }

    public void method142(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 37)
            aClass31_1557 = null;
        anInt1548++;
        for (int i = arg1; arg3 + arg1 > i; i++)
            payload[position++] = arg0[i];
    }

    public void method143(Class31 arg0, byte arg1) {
        anInt1555++;
        if (arg1 == -63) {
            position += arg0.method645(payload, 0, 63, arg0.method623(20), position);
            payload[position++] = (byte) 0;
        }
    }

    public void method144(int arg0, int arg1, int[] arg2, int arg3) {
        anInt1515++;
        int i = position;
        position = arg3;
        int i_0_ = (arg0 - arg3) / arg1;
        for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
            int i_2_ = method188((byte) 105);
            int i_3_ = method188((byte) 105);
            int i_4_ = -957401312;
            int i_5_ = -1640531527;
            int i_6_ = 32;
            while ((~i_6_--) < -1) {
                i_3_ -= (i_2_ + (i_2_ << 4 ^ i_2_ >>> 5)
                        ^ arg2[(0x1cca & i_4_) >>> 1779944779] + i_4_);
                i_4_ -= i_5_;
                i_2_ -= i_4_ - -arg2[0x3 & i_4_] ^ ((i_3_ << 4
                        ^ i_3_ >>> 5)
                        + i_3_);
            }
            position -= 8;
            writeIntBE(i_2_);
            writeIntBE(i_3_);
        }
        position = i;
    }

    public void encrypt(BigInteger key, BigInteger modulus) {
        anInt1513++;
        int i = position;
        byte[] is = new byte[i];
        position = 0;
        method169(0, i, is, -86);
        BigInteger biginteger = new BigInteger(is);
        BigInteger biginteger_7_ = biginteger.modPow(key, modulus);
        byte[] is_8_ = biginteger_7_.toByteArray();
        position = 0;
        writeByte(is_8_.length);
        method142(is_8_, 0, (byte) 95, is_8_.length);
    }

    public void method146(int arg1) {
        anInt1540++;
        payload[position++] = (byte) (arg1 >> 16);
        payload[position++] = (byte) (arg1 >> 24);
        payload[position++] = (byte) arg1;
        payload[position++] = (byte) (arg1 >> 8);
    }

    public int method147(int arg0, int arg1) {
        anInt1572++;
        int i = Class6.method75(arg1, payload, position, false);
        writeIntBE(i);
        return i;
    }

    public void method148(int value) {
        anInt1568++;
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public static void method149() {
        aClass40_1531 = null;
        aClass31_1557 = null;
        aClass31_1559 = null;
        aClass31_1562 = null;
        aClass31_1563 = null;
        aClass31_1574 = null;
    }

    public byte method150() {
        anInt1529++;
        return (byte) (-payload[position++] + 128);
    }

    public byte method151(int arg0) {
        anInt1553++;
        return (byte) -payload[position++];
    }

    public void method152(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int i = arg2 + (arg3 - 1); i >= arg2; i--)
            arg0[i] = payload[position++];
        anInt1526++;
    }

    public int method153(int arg0) {
        anInt1567++;
        position += 2;
        int i = ((0xff & -128 + payload[position + -1]) + (0xff00 & payload[-2 + position] << 8));
        if ((~i) < -32768)
            i -= 65536;
        return i;
    }

    public void writeShortBE(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
        anInt1549++;
    }

    public void method155(int arg0) {
        anInt1556++;
        if (arg0 >= 0 && arg0 < 128)
            writeByte(arg0);
        else if ((~arg0) <= -1
                && (~arg0) > -32769)
            writeShortBE(arg0 + 32768);
        else
            throw new IllegalArgumentException();
    }

    public byte method156(int arg0) {
        anInt1520++;
        return payload[position++];
    }

    public void method157(int arg0, int arg1) {
        payload[position++] = (byte) arg1;
        payload[position++] = (byte) (arg1 >> 8);
        anInt1516++;
        payload[position++] = (byte) (arg1 >> 16);
        payload[position++] = (byte) (arg1 >> 24);
    }

    public int method158(boolean arg0) {
        int i = payload[position] & 0xff;
        anInt1510++;
        if ((i ^ 0xffffffff) > -129)
            return method168(255);
        return method164() - 32768;
    }

    public int method159(byte arg0) {
        try {
            anInt1508++;
            if (arg0 <= 13)
                anInt1564 = -18;
            int i = 0xff & payload[position];
            if ((i ^ 0xffffffff) <= -129)
                return method164() + -49152;
            return method168(255) + -64;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "eb.QB(" + arg0 + ')');
        }
    }

    public static void method160(int arg0, byte arg1) {
        if (arg1 >= -54)
            anInt1566 = -33;
        anInt1547++;
        int i = Class54.method873((byte) -68, arg0).anInt2015;
        if ((i ^ 0xffffffff) != -1) {
            int i_9_ = Class29.anIntArray547[arg0];
            if ((i ^ 0xffffffff) == -2) {
                if ((i_9_ ^ 0xffffffff) == -2) {
                    Class11_Sub10_Sub13_Sub1.method410(0.9);
                    ((Class7) Class11_Sub10_Sub13_Sub1.anInterface3_2727)
                            .method82(0.9, 2);
                }
                if (i_9_ == 2) {
                    Class11_Sub10_Sub13_Sub1.method410(0.8);
                    ((Class7) Class11_Sub10_Sub13_Sub1.anInterface3_2727)
                            .method82(0.8, 2);
                }
                if ((i_9_ ^ 0xffffffff) == -4) {
                    Class11_Sub10_Sub13_Sub1.method410(0.7);
                    ((Class7) Class11_Sub10_Sub13_Sub1.anInterface3_2727)
                            .method82(0.7, 2);
                }
                if ((i_9_ ^ 0xffffffff) == -5) {
                    Class11_Sub10_Sub13_Sub1.method410(0.6);
                    ((Class7) Class11_Sub10_Sub13_Sub1.anInterface3_2727)
                            .method82(0.6, 2);
                }
                Class43.method752((byte) -6);
                Class1.aBoolean76 = true;
            }
            if (i == 3) {
                int i_10_ = 0;
                if (i_9_ == 0)
                    i_10_ = 255;
                if (i_9_ == 1)
                    i_10_ = 192;
                if (i_9_ == 2)
                    i_10_ = 128;
                if (i_9_ == 3)
                    i_10_ = 64;
                if (i_9_ == 4)
                    i_10_ = 0;
                if ((~Class34.anInt632) != (~i_10_)) {
                    if ((~Class34.anInt632) == -1
                            && (~Class46.anInt853) != 0) {
                        Class53.method869(0, 0, Class46.anInt853, -31,
                                Class47.aClass55_Sub1_876, i_10_,
                                false);
                        Class39_Sub1.anInt1823 = 0;
                    } else if ((~i_10_) != -1)
                        Class13.method513(-14399, i_10_);
                    else {
                        Class53.method867(-1986);
                        Class39_Sub1.anInt1823 = 0;
                    }
                    Class34.anInt632 = i_10_;
                }
            }
            if (i == 6)
                Class11_Sub11.anInt1680 = i_9_;
            if ((i ^ 0xffffffff) == -10)
                Class11_Sub10_Sub1.anInt1951 = i_9_;
            if (i == 8) {
                Class11_Sub10_Sub8.anInt2190 = i_9_;
                Class32.aBoolean575 = true;
            }
            if ((i ^ 0xffffffff) == -5) {
                if ((i_9_ ^ 0xffffffff) == -1)
                    Class54.anInt1083 = 127;
                if (i_9_ == 1)
                    Class54.anInt1083 = 96;
                if (i_9_ == 2)
                    Class54.anInt1083 = 64;
                if ((i_9_ ^ 0xffffffff) == -4)
                    Class54.anInt1083 = 32;
                if (i_9_ == 4)
                    Class54.anInt1083 = 0;
            }
            if (i == 5)
                Class62.anInt1305 = i_9_;
        }
    }

    public int method161(byte arg0) {
        try {
            if (arg0 >= -119)
                return -67;
            anInt1542++;
            position += 2;
            int i
                    = ((0xff & payload[position + -1])
                    + ((payload[-2 + position] & 0xff) << -1051676152));
            if (i > 32767)
                i -= 65536;
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "eb.BA(" + arg0 + ')');
        }
    }

    public void method162(int arg0, int arg1) {
        anInt1552++;
        payload[position++] = (byte) -arg1;
        if (arg0 != -5016)
            anInt1565 = 0;
    }

    public void writeByte(int value) {
        anInt1571++;
        payload[position++] = (byte) value;
    }

    public int method164() {
        anInt1523++;
        position += 2;
        return ((payload[position - 1] & 0xff) + (0xff00 & payload[position - 2] << 8));
    }

    public int method165() {
        position += 2;
        anInt1517++;
        return ((0xff00 & payload[position - 1] << 8) - -(0xff & payload[position - 2]));
    }

    public int method166(boolean arg0) {
        try {
            if (arg0 != false)
                anInt1569 = 75;
            anInt1546++;
            return -128 + payload[position++] & 0xff;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "eb.EB(" + arg0 + ')');
        }
    }

    public void method167(int value) {
            payload[position++] = (byte) (128 + value);
            anInt1525++;
            payload[position++] = (byte) (value >> 8);
    }

    public int method168(int arg0) {
        try {
            if (arg0 != 255)
                method161((byte) -73);
            anInt1530++;
            return payload[position++] & 0xff;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "eb.JB(" + arg0 + ')');
        }
    }

    public void method169(int arg0, int arg1, byte[] arg2, int arg3) {
        try {
            if (arg3 < -3) {
                for (int i = arg0; i < arg0 + arg1; i++)
                    arg2[i] = payload[position++];
                anInt1528++;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception,
                    ("eb.M(" + arg0 + ',' + arg1 + ','
                            + (arg2 != null ? "{...}" : "null") + ','
                            + arg3 + ')'));
        }
    }

    public int method170(int arg0) {
        try {
            int i = 31 % ((35 - arg0) / 58);
            position += 4;
            anInt1554++;
            return ((0xff & payload[-2 + position])
                    + (~0xffffff & payload[position + -3] << 24)
                    - (-((0xff & payload[position - 4]) << 16)
                    - (payload[position - 1] << 8
                    & 0xff00)));
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "eb.HA(" + arg0 + ')');
        }
    }

    public void method171(int arg0, int arg1) {
        try {
            if (arg1 == -3420) {
                anInt1561++;
                payload[position++] = (byte) (arg0 >> 8);
                payload[position++] = (byte) (arg0 - -128);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception,
                    "eb.RA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public void method172(boolean arg0, int arg1) {
        try {
            payload[position++] = (byte) (arg1 + 128);
            if (arg0 == false)
                anInt1521++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception,
                    "eb.KB(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static void method173(byte arg0) {
        try {
            anInt1506++;
            anInt1566++;
            Class37.method705(true, (byte) -92);
            Class13.method508((byte) -120, true);
            Class37.method705(false, (byte) -92);
            Class13.method508((byte) -107, false);
            Class11_Sub10_Sub4_Sub2_Sub1.method276(false);
            Class1.method46(-89);
            if (!Class34.aBoolean636) {
                int i = 0x7ff & Class29.anInt535 - -Class62.anInt1300;
                int i_11_ = Class52.anInt1022;
                if (i_11_ < Class64.anInt1346 / 256)
                    i_11_ = Class64.anInt1346 / 256;
                if (Class54.aBooleanArray1060[4]
                        && Class13.anIntArray266[4] + 128 > i_11_)
                    i_11_ = Class13.anIntArray266[4] - -128;
                Class11_Sub10_Sub16.method488
                        (Class11_Sub10_Sub10.anInt2213, i, true, Class28.anInt511,
                                i_11_,
                                ((Class11_Sub10_Sub4_Sub5.method324
                                        (Class1.anInt82,
                                                Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506, 3,
                                                Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517))
                                        - 50),
                                i_11_ * 3 + 600);
            }
            int i;
            if (!Class34.aBoolean636)
                i = Class22.method576(false);
            else
                i = Class4.method65(63);
            int i_12_ = Class15_Sub2.anInt1764;
            int i_13_ = Class15_Sub1.anInt1748;
            int i_14_ = Class42.anInt761;
            int i_15_ = Class11_Sub8.anInt1628;
            int i_16_ = Class8.anInt180;
            for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -6; i_17_++) {
                if (Class54.aBooleanArray1060[i_17_]) {
                    int i_18_
                            = (int) ((double) -Class39_Sub1.anIntArray1834[i_17_]
                            + ((double) (1 + 2 * (Class39_Sub1
                            .anIntArray1834[i_17_]))
                            * Math.random())
                            + (Math.sin((double) (Class39.anIntArray704
                            [i_17_])
                            * ((double) (Class11_Sub8
                            .anIntArray1616
                            [i_17_])
                            / 100.0))
                            * (double) Class13.anIntArray266[i_17_]));
                    if ((i_17_ ^ 0xffffffff) == -4)
                        Class8.anInt180 = 0x7ff & Class8.anInt180 + i_18_;
                    if (i_17_ == 2)
                        Class15_Sub1.anInt1748 += i_18_;
                    if ((i_17_ ^ 0xffffffff) == -5) {
                        Class11_Sub8.anInt1628 += i_18_;
                        if (Class11_Sub8.anInt1628 < 128)
                            Class11_Sub8.anInt1628 = 128;
                        if (Class11_Sub8.anInt1628 > 383)
                            Class11_Sub8.anInt1628 = 383;
                    }
                    if ((i_17_ ^ 0xffffffff) == -2)
                        Class42.anInt761 += i_18_;
                    if ((i_17_ ^ 0xffffffff) == -1)
                        Class15_Sub2.anInt1764 += i_18_;
                }
            }
            Class36.method700(25085);
            Class11_Sub10_Sub4_Sub4.aBoolean2648 = true;
            Class11_Sub10_Sub4_Sub4.anInt2633
                    = Class11_Sub10_Sub7.anInt2161 + -4;
            Class11_Sub10_Sub4_Sub4.anInt2631 = 0;
            Class11_Sub10_Sub4_Sub4.anInt2656 = Class11_Sub6.anInt1590 + -4;
            Class11_Sub10_Sub13.method402();
            Class52.aClass49_1024.method813(Class15_Sub2.anInt1764,
                    Class42.anInt761,
                    Class15_Sub1.anInt1748,
                    Class11_Sub8.anInt1628,
                    Class8.anInt180, i);
            if (arg0 <= 23)
                anInt1573 = 21;
            Class52.aClass49_1024.method837();
            Class11_Sub10_Sub9.method370(65535);
            Class29.method614(-11);
            ((Class7) Class11_Sub10_Sub13_Sub1.anInterface3_2727)
                    .method83(Class17.anInt340, (byte) 28);
            Class4.method63((byte) 38);
            if (Class36.aBoolean670
                    && (Class60.method949(false, true, 0) ^ 0xffffffff) == -1)
                Class36.aBoolean670 = false;
            if (Class36.aBoolean670) {
                Class36.method700(25085);
                Class11_Sub10_Sub13.method402();
                Class28.method610(false, null, Class54.aClass31_1059, -32266);
            }
            Class40.method743((byte) -61, Class11_Sub10_Sub11.aGraphics2261);
            Class42.anInt761 = i_14_;
            Class11_Sub8.anInt1628 = i_15_;
            Class15_Sub1.anInt1748 = i_13_;
            Class15_Sub2.anInt1764 = i_12_;
            Class8.anInt180 = i_16_;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "eb.NB(" + arg0 + ')');
        }
    }

    public Buffer(int arg0) {
        payload = Class17.method564(arg0, -30001);
        position = 0;
    }

    public int method174(int arg0) {
        anInt1522++;
        position += 2;
        return ((payload[-2 + position] - 128 & 0xff) + (0xff00 & payload[-1 + position] << 8));
    }

    public int readUByteA() {
        anInt1511++;
        return 0xff & 128 - payload[position++];
    }

    public void method176(boolean arg0, int arg1) {
        payload[position++] = (byte) (-arg1 + 128);
        anInt1541++;
    }

    public long method177(int arg0) {
        anInt1534++;
        long l = 0xffffffffL & (long) method188((byte) 105);
        long l_19_ = (long) method188((byte) 105) & 0xffffffffL;
        return l_19_ + (l << 32);
    }

    public int method178() {
        anInt1519++;
        position += 3;
        return ((0xff00 & payload[position - 2] << 8) + (0xff0000 & payload[position + -3] << 16) + (0xff & payload[-1 + position]));
    }

    public int method179(boolean arg0) {
        position += 2;
        anInt1512++;
        int i = ((payload[-1 + position] << 874566632 & 0xff00)
                - -(payload[-2 + position] & 0xff));
        if ((i ^ 0xffffffff) < -32768)
            i -= 65536;
        return i;
    }

    public void writeShortLE(int value) {
        anInt1543++;
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
    }

    public Class31 method181(byte arg0) {
        anInt1507++;
        int i = position;
        while ((payload[position++] ^ 0xffffffff) != -1) {
            /* empty */
        }
        return Class11_Sub12.method500(-i + (position + -1), payload, 0, i);
    }

    public Buffer(byte[] arg0) {
        position = 0;
        payload = arg0;
    }

    public void method182(int arg0, int arg1) {
            anInt1545++;
            payload[position++] = (byte) (arg1 >> 8);
            payload[position++] = (byte) arg1;
            payload[position++] = (byte) (arg1 >> 24);
            payload[position++] = (byte) (arg1 >> 16);
    }

    public int method183(boolean arg0) {
        anInt1524++;
        position += 2;
        int i = (((payload[-1 + position] & 0xff) << 8) + (0xff & payload[-2 + position] - 128));
        if ((~i) < -32768)
            i -= 65536;
        return i;
    }

    public int method184(int arg0) {
        int i = payload[position++];
        anInt1532++;
        int i_20_ = 0;
        if (arg0 <= 5)
            method149();
        for (/**/; (i ^ 0xffffffff) > -1; i = payload[position++])
            i_20_ = (i_20_ | 0x7f & i) << 1795287175;
        return i_20_ | i;
    }

    public void writeIntBE(int value) {
        anInt1550++;
        payload[position++] = (byte) (value >> 24);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public static int method186(int arg0, byte[] arg1, boolean arg2) {
        anInt1560++;
        return Class6.method75(0, arg1, arg0, false);
    }

    public static void method187(int arg0, int arg1, int arg2, int arg3,
                                 int arg4, int arg5, int arg6, int arg7,
                                 int arg8, int arg9) {
        try {
            anInt1533++;
            Class11_Sub8 class11_sub8 = null;
            for (Class11_Sub8 class11_sub8_21_
                 = ((Class11_Sub8)
                    Class37_Sub1.aClass36_1794.method694((byte) -124));
                 class11_sub8_21_ != null;
                 class11_sub8_21_ = (Class11_Sub8) Class37_Sub1
                         .aClass36_1794
                         .method701(0)) {
                if ((class11_sub8_21_.anInt1614 ^ 0xffffffff) == (arg1
                        ^ 0xffffffff)
                        && ((class11_sub8_21_.anInt1615 ^ 0xffffffff)
                        == (arg9 ^ 0xffffffff))
                        && ((class11_sub8_21_.anInt1619 ^ 0xffffffff)
                        == (arg7 ^ 0xffffffff))
                        && class11_sub8_21_.anInt1626 == arg2) {
                    class11_sub8 = class11_sub8_21_;
                    break;
                }
            }
            if (class11_sub8 == null) {
                class11_sub8 = new Class11_Sub8();
                class11_sub8.anInt1614 = arg1;
                class11_sub8.anInt1626 = arg2;
                class11_sub8.anInt1615 = arg9;
                class11_sub8.anInt1619 = arg7;
                Class55_Sub1.method905(class11_sub8, 1196625736);
                Class37_Sub1.aClass36_1794.method691((byte) -98, class11_sub8);
            }
            class11_sub8.anInt1635 = arg4;
            if (arg3 != 386132008)
                method187(102, -6, 97, 62, 45, 52, 122, -31, 57, -16);
            class11_sub8.anInt1634 = arg6;
            class11_sub8.anInt1632 = arg8;
            class11_sub8.anInt1633 = arg0;
            class11_sub8.anInt1617 = arg5;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception,
                    ("eb.HB(" + arg0 + ',' + arg1 + ',' + arg2
                            + ',' + arg3 + ',' + arg4 + ',' + arg5
                            + ',' + arg6 + ',' + arg7 + ',' + arg8
                            + ',' + arg9 + ')'));
        }
    }

    public int method188(byte arg0) {
        position += 4;
        anInt1551++;
        return ((payload[-1 + position] & 0xff)
                + ((payload[-2 + position] << 1064256648 & 0xff00)
                + ((0xff & payload[-4 + position]) << 24)
                - -((0xff & payload[position - 3]) << 16)));
    }

    public int method189(int arg0) {
        position += arg0;
        anInt1544++;
        return ((0xff & payload[position - 4])
                + (0xff00 & payload[-3 + position] << 8)
                + (~0xffffff & payload[-1 + position] << 24)
                + ((payload[position + -2] & 0xff) << 16));
    }

    public int method190() {
        anInt1514++;
        return -payload[position++] & 0xff;
    }

    public void method191(int arg1) {
        payload[-1 + (position - arg1)] = (byte) arg1;
        anInt1527++;
    }

    public int method192(int arg0) {
        position += 4;
        anInt1509++;
        return ((payload[-3 + position] & 0xff)
                + (payload[position - 2] << 24 & ~0xffffff)
                + ((payload[-1 + position] << 16 & 0xff0000)
                + (0xff00 & payload[-4 + position] << 8)));
    }

    static {
        aBoolean1558 = false;
        anInt1566 = 0;
        anInt1569 = -1;
        anInt1564 = -1;
        aClass31_1574 = Class64.method992("Jun", 255);
        aClass31_1562 = Class64.method992("Import ready", 255);
        anInt1573 = 0;
        aClass31_1563 = Class64.method992("Loaded input handler", 255);
    }
}
