/* Class11_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11_Sub5_Sub1 extends Buffer {
    public static int anInt1908;
    public static int anInt1909;
    public static Class31 aClass31_1910 = (Class64.method992("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", 255));
    public static int anInt1911;
    public static int anInt1912;
    public int anInt1913;
    public static int anInt1914;
    public static Class31[] aClass31Array1915;
    public static int anInt1916;
    public static Class31 aClass31_1917 = Class64.method992("Importing models )2 ", 255);
    public static int anInt1918;
    public static int anInt1919;
    public static int anInt1920;
    public static int anInt1921;
    public Class63 aClass63_1922;
    public static int anInt1923;
    public static Class31 aClass31_1924;
    public static Class15 aClass15_1925;
    public static Class31 aClass31_1926;

    public int method193(byte arg0) {
        try {
            if (arg0 != 105) method194(null, -64);
            anInt1911++;
            return (payload[position++] - aClass63_1922.method984(255) & 0xff);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "wc.D(" + arg0 + ')');
        }
    }

    public void method194(int[] arg0, int arg1) {
        try {
            anInt1916++;
            int i = -15 / ((14 - arg1) / 62);
            aClass63_1922 = new Class63(arg0);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "wc.I(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
        }
    }

    public static byte[] method195(int arg0, int arg1, int arg2, Class55 arg3, int arg4) {
        try {
            anInt1908++;
            long l = ((long) (arg4 << -798932656) + ((long) arg0 << arg2) - -(long) (0xffff & arg1 + arg4 * 37));
            if (Class11_Sub10_Sub15.aClass40_2404 != null) {
                Class11_Sub10_Sub9 class11_sub10_sub9 = (Class11_Sub10_Sub9) Class11_Sub10_Sub15.aClass40_2404.method735(l, (byte) -114);
                if (class11_sub10_sub9 != null) return class11_sub10_sub9.aByteArray2209;
            }
            byte[] is = arg3.method887((byte) -120, arg1, arg4);
            if (is == null) return null;
            if (Class11_Sub10_Sub15.aClass40_2404 != null)
                Class11_Sub10_Sub15.aClass40_2404.method742(-121, l, new Class11_Sub10_Sub9(is));
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("wc.L(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
        }
    }

    public void method196(int arg0, int arg1) {
        payload[position++] = (byte) (aClass63_1922.method984(255) + arg1);
        anInt1909++;
        if (arg0 != 1) method197(true);
    }

    public void method197(boolean arg0) {
        try {
            anInt1919++;
            if (arg0 == false) anInt1913 = 8 * position;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "wc.K(" + arg0 + ')');
        }
    }

    public Class11_Sub5_Sub1(int arg0) {
        super(arg0);
    }

    public static void method198(int arg0) {
        try {
            aClass31_1926 = null;
            aClass15_1925 = null;
            aClass31_1917 = null;
            aClass31_1910 = null;
            if (arg0 != -1650) aClass31_1924 = null;
            aClass31Array1915 = null;
            aClass31_1924 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "wc.H(" + arg0 + ')');
        }
    }

    public void method199(byte arg0) {
        anInt1920++;
        position = (anInt1913 - -7) / 8;
        if (arg0 != 43) method199((byte) 126);
    }

    public static void method200(int arg0) {
        anInt1912++;
        while (Class11_Sub4.method135(-14465)) {
            if (Buffer.anInt1564 != -1 && Class36.anInt667 == Buffer.anInt1564) {
                if ((Class11_Sub10_Sub15.anInt2384 ^ 0xffffffff) == -86 && ((Class25.aClass31_465.method623(-117) ^ 0xffffffff) < -1))
                    Class25.aClass31_465 = (Class25.aClass31_465.method634(-1 + Class25.aClass31_465.method623(arg0 ^ 0xf), arg0 ^ ~0x1e, 0));
                if ((Class1.method45(-123, Class55_Sub1.anInt1857) || (Class55_Sub1.anInt1857 ^ 0xffffffff) == -33) && Class25.aClass31_465.method623(127) < 12)
                    Class25.aClass31_465 = Class25.aClass31_465.method646((byte) -105, Class55_Sub1.anInt1857);
            } else if (Class33.aBoolean609) {
                if (Class11_Sub10_Sub15.anInt2384 == 85 && Class25.aClass31_463.method623(arg0 + 126) > 0) {
                    Class25.aClass31_463 = Class25.aClass31_463.method634((Class25.aClass31_463.method623(-127) - 1), -32, 0);
                    Class32.aBoolean575 = true;
                }
                if (Class36.method698(Class55_Sub1.anInt1857, 127) && (Class25.aClass31_463.method623(arg0 + -113) ^ 0xffffffff) > -81) {
                    Class25.aClass31_463 = Class25.aClass31_463.method646((byte) -82, Class55_Sub1.anInt1857);
                    Class32.aBoolean575 = true;
                }
                if (Class11_Sub10_Sub15.anInt2384 == 84) {
                    Class32.aBoolean575 = true;
                    Class33.aBoolean609 = false;
                    if (Class52.anInt1027 == 1) {
                        long l = Class25.aClass31_463.method633((byte) -125);
                        Class11_Sub10_Sub5.method340(l, -116);
                    }
                    if (Class52.anInt1027 == 2 && (Buffer.anInt1573 ^ 0xffffffff) < -1) {
                        long l = Class25.aClass31_463.method633((byte) -127);
                        Class11_Sub12.method501(-50, l);
                    }
                    if ((Class52.anInt1027 ^ 0xffffffff) == -4 && ((Class25.aClass31_463.method623(-88) ^ 0xffffffff) < -1)) {
                        Class40.outBuffer.method196(1, 22);
                        Class36.anInt656++;
                        Class40.outBuffer.writeByte(0);
                        int i = Class40.outBuffer.position;
                        Class40.outBuffer.method140(-24628, Class11_Sub10_Sub4_Sub2.aLong2529);
                        Class11_Sub7.method213(Class25.aClass31_463, 111, Class40.outBuffer);
                        Class40.outBuffer.method191(-i + Class40.outBuffer.position);
                        if ((Class59.anInt1236 ^ 0xffffffff) == -3) {
                            Class31.anInt1386++;
                            Class59.anInt1236 = 1;
                            Class20.aBoolean392 = true;
                            Class40.outBuffer.method196(1, 132);
                            Class40.outBuffer.writeByte(Class11_Sub10_Sub10.anInt2222);
                            Class40.outBuffer.writeByte(Class59.anInt1236);
                            Class40.outBuffer.writeByte(Class58.anInt1222);
                        }
                    }
                    if (Class52.anInt1027 == 4 && Class55.anInt1143 < 100) {
                        long l = Class25.aClass31_463.method633((byte) -128);
                        Class15_Sub1.method539((byte) 45, l);
                    }
                    if ((Class52.anInt1027 ^ 0xffffffff) == -6 && Class55.anInt1143 > 0) {
                        long l = Class25.aClass31_463.method633((byte) -128);
                        Class43.method755((byte) -42, l);
                    }
                }
            } else if ((~Class57.anInt1154) == -2) {
                if ((~Class11_Sub10_Sub15.anInt2384) == -86 && ((~Class25.aClass31_460.method623(121)) < -1)) {
                    Class25.aClass31_460 = Class25.aClass31_460.method634((Class25.aClass31_460.method623(121) + -1), -32, 0);
                    Class32.aBoolean575 = true;
                }
                if (Class28.method609(Class55_Sub1.anInt1857, (byte) -122) && Class25.aClass31_460.method623(arg0 ^ ~0x1b) < 10) {
                    Class25.aClass31_460 = Class25.aClass31_460.method646((byte) -116, Class55_Sub1.anInt1857);
                    Class32.aBoolean575 = true;
                }
                if ((~Class11_Sub10_Sub15.anInt2384) == -85) {
                    if ((~Class25.aClass31_460.method623(arg0 ^ 0x6)) < -1) {
                        Class11_Sub6.anInt1576++;
                        int i = 0;
                        if (Class25.aClass31_460.method630(-126)) i = Class25.aClass31_460.method652((byte) 55);
                        Class40.outBuffer.method196(1, 122);
                        Class40.outBuffer.writeIntBE(i);
                    }
                    Class32.aBoolean575 = true;
                    Class57.anInt1154 = 0;
                }
            } else if (Class57.anInt1154 != 2) {
                if ((~Class57.anInt1154) != -4) {
                    if ((~Class47.anInt881) == 0 && Class46.anInt844 == -1) {
                        if (Class11_Sub10_Sub15.anInt2384 == 85 && Class25.aClass31_476.method623(-93) > 0) {
                            Class25.aClass31_476 = (Class25.aClass31_476.method634(-1 + Class25.aClass31_476.method623(arg0 ^ ~0x3d), arg0 ^ ~0x1e, 0));
                            Class32.aBoolean575 = true;
                        }
                        if (Class36.method698(Class55_Sub1.anInt1857, arg0 + 126) && (Class25.aClass31_476.method623(-36) ^ 0xffffffff) > -81) {
                            Class25.aClass31_476 = Class25.aClass31_476.method646((byte) -92, (Class55_Sub1.anInt1857));
                            Class32.aBoolean575 = true;
                        }
                        if (Class11_Sub10_Sub15.anInt2384 == 84 && (Class25.aClass31_476.method623(-61) ^ 0xffffffff) < -1) {
                            if ((~Class25.anInt479) == -3) {
                                if (Class25.aClass31_476.method638(-10, Class11_Sub12.aClass31_1690))
                                    Class11_Sub7.method215(arg0 ^ ~0x4a54);
                                if (Class25.aClass31_476.method638(-10, Class42.aClass31_767))
                                    Class11_Sub10_Sub4_Sub2_Sub2.aBoolean2830 = true;
                                if (Class25.aClass31_476.method638(-10, Class11_Sub10_Sub11.aClass31_2265))
                                    Class11_Sub10_Sub4_Sub2_Sub2.aBoolean2830 = false;
                                if (Class25.aClass31_476.method638(-10, Class28.aClass31_501)) {
                                    for (int i = 0; i < 4; i++) {
                                        for (int i_0_ = 1; (i_0_ ^ 0xffffffff) > -104; i_0_++) {
                                            for (int i_1_ = 1; i_1_ < 103; i_1_++)
                                                Class39.aClass8Array707[i].anIntArrayArray179[i_0_][i_1_] = 0;
                                        }
                                    }
                                }
                                if ((Class25.aClass31_476.method638(arg0 + -11, Class62.aClass31_1292)) && Class50.anInt993 == 2)
                                    throw new RuntimeException();
                                if (Class25.aClass31_476.method638(-10, Class20.aClass31_391))
                                    Class31.aBoolean1389 = true;
                            }
                            if (Class25.aClass31_476.method622(Class11_Sub10_Sub10.aClass31_2239, 68)) {
                                Class11_Sub10_Sub4.anInt2045++;
                                Class40.outBuffer.method196(arg0, 92);
                                Class40.outBuffer.writeByte(Class25.aClass31_476.method623(121) - 1);
                                Class40.outBuffer.method143(Class25.aClass31_476.method639(28418, 2), (byte) -63);
                            } else {
                                Class11_Sub10_Sub4_Sub2_Sub1.anInt2781++;
                                Class31 class31 = Class25.aClass31_476.method650(-104);
                                int i = 0;
                                int i_2_ = 0;
                                if (class31.method622(Class17.aClass31_345, 112)) {
                                    i = 0;
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 7);
                                } else if (class31.method622((Class11_Sub6.aClass31_1586), 76)) {
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 4);
                                    i = 1;
                                } else if (class31.method622((client.aClass31_1451), 50)) {
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(arg0 + 28417, 6);
                                    i = 2;
                                } else if (class31.method622((Class9.aClass31_192), 90)) {
                                    i = 3;
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 5);
                                } else if (!class31.method622((Class43.aClass31_789), 88)) {
                                    if (class31.method622((Class15_Sub1.aClass31_1747), 102)) {
                                        i = 5;
                                        Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 6);
                                    } else if (!class31.method622(Class39_Sub1.aClass31_1825, arg0 + 61)) {
                                        if (class31.method622((Canvas_Sub1.aClass31_56), 88)) {
                                            i = 7;
                                            Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 7);
                                        } else if (class31.method622(Class43.aClass31_786, 64)) {
                                            i = 8;
                                            Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 7);
                                        } else if (class31.method622(Class50.aClass31_994, 98)) {
                                            i = 9;
                                            Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 6);
                                        } else if (class31.method622(Class25.aClass31_472, 88)) {
                                            i = 10;
                                            Class25.aClass31_476 = (Class25.aClass31_476.method639(arg0 + 28417, 6));
                                        } else if (class31.method622(Class44.aClass31_819, 91)) {
                                            Class25.aClass31_476 = (Class25.aClass31_476.method639(arg0 ^ 0x6f03, 6));
                                            i = 11;
                                        }
                                    } else {
                                        Class25.aClass31_476 = Class25.aClass31_476.method639(arg0 + 28417, 7);
                                        i = 6;
                                    }
                                } else {
                                    i = 4;
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 7);
                                }
                                class31 = Class25.aClass31_476.method650(arg0 ^ ~0x7d);
                                if (class31.method622((Class11_Sub10_Sub5.aClass31_2121), 52)) {
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 5);
                                    i_2_ = 1;
                                } else if (class31.method622((Class62.aClass31_1306), arg0 + 88)) {
                                    i_2_ = 2;
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 6);
                                } else if (class31.method622(Class11_Sub10_Sub3.aClass31_2026, 105)) {
                                    i_2_ = 3;
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 6);
                                } else if (class31.method622((Class52.aClass31_1037), 78)) {
                                    i_2_ = 4;
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 7);
                                } else if (class31.method622((Class32.aClass31_595), arg0 + 86)) {
                                    Class25.aClass31_476 = Class25.aClass31_476.method639(28418, 6);
                                    i_2_ = 5;
                                }
                                Class40.outBuffer.method196(1, 40);
                                Class40.outBuffer.writeByte(0);
                                int i_3_ = Class40.outBuffer.position;
                                Class40.outBuffer.writeByte(i);
                                Class40.outBuffer.writeByte(i_2_);
                                Class11_Sub7.method213(Class25.aClass31_476, 113, Class40.outBuffer);
                                Class40.outBuffer.method191(-i_3_ + (Class40.outBuffer.position));
                                if (Class11_Sub10_Sub10.anInt2222 == 2) {
                                    Class11_Sub10_Sub10.anInt2222 = 3;
                                    Class20.aBoolean392 = true;
                                    Class31.anInt1386++;
                                    Class40.outBuffer.method196(1, 132);
                                    Class40.outBuffer.writeByte(Class11_Sub10_Sub10.anInt2222);
                                    Class40.outBuffer.writeByte(Class59.anInt1236);
                                    Class40.outBuffer.writeByte(Class58.anInt1222);
                                }
                            }
                            Class25.aClass31_476 = Class25.aClass31_461;
                            Class32.aBoolean575 = true;
                        }
                    }
                } else {
                    if (Class11_Sub10_Sub15.anInt2384 == 85 && (~Class25.aClass31_460.method623(arg0 + 124)) < -1) {
                        Class25.aClass31_460 = (Class25.aClass31_460.method634(-1 + Class25.aClass31_460.method623(0), arg0 ^ ~0x1e, 0));
                        Class32.aBoolean575 = true;
                    }
                    if (Class36.method698(Class55_Sub1.anInt1857, 127) && Class25.aClass31_460.method623(120) < 40) {
                        Class25.aClass31_460 = Class25.aClass31_460.method646((byte) -117, (Class55_Sub1.anInt1857));
                        Class32.aBoolean575 = true;
                    }
                }
            } else {
                if (Class11_Sub10_Sub15.anInt2384 == 85 && ((~Class25.aClass31_460.method623(-115)) < -1)) {
                    Class25.aClass31_460 = Class25.aClass31_460.method634((Class25.aClass31_460.method623(123) + -1), arg0 ^ ~0x1e, 0);
                    Class32.aBoolean575 = true;
                }
                if ((Class1.method45(-123, Class55_Sub1.anInt1857) || Class55_Sub1.anInt1857 == 32) && Class25.aClass31_460.method623(-66) < 12) {
                    Class25.aClass31_460 = Class25.aClass31_460.method646((byte) -63, Class55_Sub1.anInt1857);
                    Class32.aBoolean575 = true;
                }
                if (Class11_Sub10_Sub15.anInt2384 == 84) {
                    if ((~Class25.aClass31_460.method623(-24)) < -1) {
                        Class40.outBuffer.method196(1, 51);
                        Class11_Sub10_Sub5.anInt2060++;
                        Class40.outBuffer.method140(-24628, Class25.aClass31_460.method633((byte) -126));
                    }
                    Class32.aBoolean575 = true;
                    Class57.anInt1154 = 0;
                }
            }
        }
        if (arg0 != 1) method195(-59, -30, 60, null, 89);
    }

    public static void method201(Class55 arg0, Class55 arg1, byte arg2, boolean arg3) {
        try {
            Class11_Sub10_Sub4_Sub2.aClass55_2521 = arg0;
            Class15.aBoolean317 = arg3;
            anInt1914++;
            if (arg2 != -123) aClass31_1924 = null;
            Class11_Sub10_Sub16.aClass55_2436 = arg1;
            Class14.anInt278 = Class11_Sub10_Sub16.aClass55_2436.method895(10, (byte) 120);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("wc.F(" + (arg0 != null ? "{...}" : "null") + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + arg3 + ')'));
        }
    }

    public int method202(boolean arg0, int arg1) {
        try {
            if (!arg0) aClass31_1910 = null;
            anInt1918++;
            return arg1 * 8 + -anInt1913;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "wc.E(" + arg0 + ',' + arg1 + ')');
        }
    }

    public int method203(int arg0, int arg1) {
        try {
            anInt1921++;
            int i = anInt1913 >> 3;
            int i_4_ = -27 % ((-10 - arg0) / 50);
            int i_5_ = 8 + -(0x7 & anInt1913);
            anInt1913 += arg1;
            int i_6_ = 0;
            for (/**/; (~i_5_) > (~arg1); i_5_ = 8) {
                i_6_ += (payload[i++] & Class15_Sub2.anIntArray1771[i_5_]) << arg1 + -i_5_;
                arg1 -= i_5_;
            }
            if (arg1 == i_5_) i_6_ += Class15_Sub2.anIntArray1771[i_5_] & payload[i];
            else i_6_ += (payload[i] >> -arg1 + i_5_ & Class15_Sub2.anIntArray1771[arg1]);
            return i_6_;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "wc.J(" + arg0 + ',' + arg1 + ')');
        }
    }

    public static Class11_Sub10_Sub6 method204(boolean arg0, Class55 arg1, int arg2, Class55 arg3, int arg4) {
        try {
            anInt1923++;
            boolean bool = true;
            int[] is = arg1.method900((byte) -100, arg4);
            int i = 0;
            if (arg2 != 32214) return null;
            for (/**/; (i ^ 0xffffffff) > (is.length ^ 0xffffffff); i++) {
                byte[] is_7_ = arg1.method879(arg4, is[i], -1);
                if (is_7_ == null) bool = false;
                else {
                    int i_8_ = is_7_[0] << -1472879160 & 0xff00 | is_7_[1] & 0xff;
                    byte[] is_9_;
                    if (!arg0) is_9_ = arg3.method879(i_8_, 0, -1);
                    else is_9_ = arg3.method879(0, i_8_, -1);
                    if (is_9_ == null) bool = false;
                }
            }
            if (!bool) return null;
            try {
                return new Class11_Sub10_Sub6(arg1, arg3, arg4, arg0);
            } catch (Exception exception) {
                return null;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("wc.A(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + (arg3 != null ? "{...}" : "null") + ',' + arg4 + ')'));
        }
    }

    static {
        aClass31Array1915 = new Class31[100];
        aClass31_1924 = Class64.method992("You need to set*6nnew contact details)3", 255);
        aClass31_1926 = Class64.method992("The server is being updated)3", 255);
    }
}
