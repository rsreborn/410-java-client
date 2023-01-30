/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;

public abstract class Class15 {
    public static int anInt305;
    public static int anInt306;
    public static Class55_Sub1 aClass55_Sub1_307;
    public static int anInt308;
    public static boolean aBoolean309;
    public static int anInt310;
    public static int anInt311;
    public static int anInt312 = 0;
    public static int anInt313;
    public static int anInt314;
    public static Class11_Sub10_Sub13_Sub4 aClass11_Sub10_Sub13_Sub4_315;
    public static int anInt316;
    public static boolean aBoolean317;
    public static Class55 aClass55_318;

    public static void method524(byte arg0) {
        anInt314++;
        if (arg0 == -118) {
            Class6.anInt161 = 0;
            int i = ((Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2506 >> 2037244935) - -Class11_Sub10_Sub6.anInt2133);
            int i_0_ = (Class10.anInt214 + (Class48.aClass11_Sub10_Sub4_Sub2_Sub1_899.anInt2517 >> -30370457));
            if (i >= 3053 && (i ^ 0xffffffff) >= -3157 && i_0_ >= 3056 && i_0_ <= 3136) Class6.anInt161 = 1;
            if ((i ^ 0xffffffff) <= -3073 && (i ^ 0xffffffff) >= -3119 && i_0_ >= 9492 && i_0_ <= 9535)
                Class6.anInt161 = 1;
            if (Class6.anInt161 == 1 && (i ^ 0xffffffff) <= -3140 && i <= 3199 && (i_0_ ^ 0xffffffff) <= -3009 && (i_0_ ^ 0xffffffff) >= -3063)
                Class6.anInt161 = 0;
        }
    }

    public static void method525(boolean arg0, Class11_Sub10_Sub4_Sub2 arg1) {
        arg1.anInt2560 = arg1.anInt2525;
        anInt310++;
        if (arg1.anInt2551 == 0) arg1.anInt2515 = 0;
        else {
            if ((arg1.anInt2549 ^ 0xffffffff) != 0 && arg1.anInt2555 == 0) {
                Class11_Sub10_Sub12 class11_sub10_sub12 = NotActuallyBuffer.method600(arg1.anInt2549, 4867);
                if (arg1.anInt2514 > 0 && (class11_sub10_sub12.anInt2279 ^ 0xffffffff) == -1) {
                    arg1.anInt2515++;
                    return;
                }
                if ((arg1.anInt2514 ^ 0xffffffff) >= -1 && class11_sub10_sub12.anInt2283 == 0) {
                    arg1.anInt2515++;
                    return;
                }
            }
            if (arg0 == true) {
                int i = arg1.anInt2517;
                int i_1_ = arg1.anInt2506;
                int i_2_ = (arg1.anIntArray2500[-1 + arg1.anInt2551] * 128 - -(arg1.anInt2510 * 64));
                int i_3_ = (64 * arg1.anInt2510 + 128 * arg1.anIntArray2562[arg1.anInt2551 + -1]);
                if (-i_1_ + i_2_ > 256 || (-i_1_ + i_2_ ^ 0xffffffff) > 255 || i_3_ + -i > 256 || (i_3_ - i ^ 0xffffffff) > 255) {
                    arg1.anInt2506 = i_2_;
                    arg1.anInt2517 = i_3_;
                } else {
                    if (i_1_ < i_2_) {
                        if (i_3_ > i) arg1.anInt2516 = 1280;
                        else if ((i_3_ ^ 0xffffffff) <= (i ^ 0xffffffff)) arg1.anInt2516 = 1536;
                        else arg1.anInt2516 = 1792;
                    } else if ((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
                        if (i_3_ > i) arg1.anInt2516 = 768;
                        else if (i_3_ < i) arg1.anInt2516 = 256;
                        else arg1.anInt2516 = 512;
                    } else if ((i ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)) arg1.anInt2516 = 0;
                    else arg1.anInt2516 = 1024;
                    int i_4_ = 0x7ff & -arg1.anInt2547 + arg1.anInt2516;
                    if ((i_4_ ^ 0xffffffff) < -1025) i_4_ -= 2048;
                    int i_5_ = arg1.anInt2545;
                    int i_6_ = 4;
                    if (arg1.anInt2547 != arg1.anInt2516 && arg1.anInt2568 == -1 && arg1.anInt2518 != 0) i_6_ = 2;
                    if (i_4_ >= -256 && i_4_ <= 256) i_5_ = arg1.anInt2499;
                    else if (i_4_ < 256 || i_4_ >= 768) {
                        if ((i_4_ ^ 0xffffffff) <= 767 && i_4_ <= -256) i_5_ = arg1.anInt2546;
                    } else i_5_ = arg1.anInt2566;
                    if ((i_5_ ^ 0xffffffff) == 0) i_5_ = arg1.anInt2499;
                    arg1.anInt2560 = i_5_;
                    if ((arg1.anInt2551 ^ 0xffffffff) < -3) i_6_ = 6;
                    if ((arg1.anInt2551 ^ 0xffffffff) < -4) i_6_ = 8;
                    if ((arg1.anInt2515 ^ 0xffffffff) < -1 && arg1.anInt2551 > 1) {
                        arg1.anInt2515--;
                        i_6_ = 8;
                    }
                    if (arg1.aBooleanArray2497[arg1.anInt2551 - 1]) i_6_ <<= 1;
                    if (i_1_ < i_2_) {
                        arg1.anInt2506 += i_6_;
                        if ((i_2_ ^ 0xffffffff) > (arg1.anInt2506 ^ 0xffffffff)) arg1.anInt2506 = i_2_;
                    } else if ((i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
                        arg1.anInt2506 -= i_6_;
                        if (i_2_ > arg1.anInt2506) arg1.anInt2506 = i_2_;
                    }
                    if ((i_3_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
                        if ((i ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
                            arg1.anInt2517 -= i_6_;
                            if ((i_3_ ^ 0xffffffff) < (arg1.anInt2517 ^ 0xffffffff)) arg1.anInt2517 = i_3_;
                        }
                    } else {
                        arg1.anInt2517 += i_6_;
                        if (arg1.anInt2517 > i_3_) arg1.anInt2517 = i_3_;
                    }
                    if (arg1.anInt2506 == i_2_ && (arg1.anInt2517 ^ 0xffffffff) == (i_3_ ^ 0xffffffff)) {
                        if (arg1.anInt2514 > 0) arg1.anInt2514--;
                        arg1.anInt2551--;
                    }
                    if ((i_6_ ^ 0xffffffff) <= -9 && arg1.anInt2560 == arg1.anInt2499 && (arg1.anInt2504 ^ 0xffffffff) != 0)
                        arg1.anInt2560 = arg1.anInt2504;
                }
            }
        }
    }

    public abstract void method526(byte i);

    public static void method527(byte arg0) {
        try {
            Class17.aClass40_334.method740(4);
            if (arg0 == 116) anInt305++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ib.W(" + arg0 + ')');
        }
    }

    public static int method528(KeyEvent arg0, int arg1) {
        try {
            int i = -74 / ((arg1 - 38) / 43);
            int i_7_ = arg0.getKeyChar();
            if ((i_7_ ^ 0xffffffff) >= -1 || (i_7_ ^ 0xffffffff) <= -257) i_7_ = -1;
            anInt313++;
            return i_7_;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ib.FA(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
        }
    }

    public abstract void method529(byte i, int i_8_, int i_9_);

    public static void method530(boolean arg0) {
        do {
            try {
                aClass11_Sub10_Sub13_Sub4_315 = null;
                aClass55_318 = null;
                aClass55_Sub1_307 = null;
                if (arg0 == false) break;
                method532(-76);
            } catch (RuntimeException runtimeexception) {
                throw Class58.method939(runtimeexception, "ib.EA(" + arg0 + ')');
            }
            break;
        } while (false);
    }

    public static void method531(int arg0) {
        try {
            anInt316++;
            if (arg0 >= -87) aBoolean309 = false;
            try {
                if (Class8.loginState == 0) {
                    Class37.aBoolean686 = false;
                    Class11_Sub10_Sub4_Sub5.anInt2692 = 0;
                    Class11_Sub11.aClass41_1681 = null;
                    Class8.loginState = 1;
                    Class11_Sub12.aClass14_1699 = null;
                }
                if (Class8.loginState == 1) {
                    if (Class11_Sub11.aClass41_1681 == null)
                        Class11_Sub11.aClass41_1681 = Class55.aClass45_1141.method773((byte) -116, Class22.anInt403);
                    if (Class11_Sub11.aClass41_1681.anInt749 == 2) throw new IOException();
                    if (Class11_Sub11.aClass41_1681.anInt749 == 1) {
                        Class11_Sub12.aClass14_1699 = new Class14((Socket) (Class11_Sub11.aClass41_1681.anObject751), Class55.aClass45_1141);
                        Class11_Sub11.aClass41_1681 = null;
                        Class8.loginState = 2;
                    }
                }
                if (Class8.loginState == 2) {
                    long l = (Class11_Sub10_Sub8.aLong2195 = Class11_Sub10_Sub4_Sub5.aClass31_2680.method633((byte) -125));
                    Class40.outBuffer.position = 0;
                    int i = (int) (0x1fL & l >> 16);
                    Class40.outBuffer.writeByte(14);
                    Class40.outBuffer.writeByte(i);
                    Class40.outBuffer.writeIntBE(Constants.BUILD_NUMBER); // Added to support multiple builds
                    Class11_Sub12.aClass14_1699.method521(Class40.outBuffer.payload, 6, 0, true); // Increase size from 2 to 6
                    Class8.loginState = 3;
                    Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
                }
                if (Class8.loginState == 3) {
                    int i = Class11_Sub12.aClass14_1699.method516(0);
                    if (i != 0) {
                        Class11_Sub10_Sub4_Sub2_Sub2.method284(i, (byte) 101);
                        return;
                    }
                    Class8.loginState = 4;
                    Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
                }
                if (Class8.loginState == 4) {
                    if ((Class11_Sub10_Sub4_Sub2.inBuffer.position) < 8) {
                        int i = Class11_Sub12.aClass14_1699.method518(0);
                        if (i > -(Class11_Sub10_Sub4_Sub2.inBuffer.position) + 8)
                            i = -(Class11_Sub10_Sub4_Sub2.inBuffer.position) + 8;
                        if (i > 0) {
                            Class11_Sub12.aClass14_1699.method515((Class11_Sub10_Sub4_Sub2.inBuffer.position), i, (byte) 97, (Class11_Sub10_Sub4_Sub2.inBuffer.payload));
                            Class11_Sub10_Sub4_Sub2.inBuffer.position += i;
                        }
                    }
                    if (Class11_Sub10_Sub4_Sub2.inBuffer.position == 8) {
                        Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
                        Class54.aLong1084 = Class11_Sub10_Sub4_Sub2.inBuffer.method177(-122);
                        Class8.loginState = 5;
                    }
                }
                if (Class8.loginState == 5) {
                    int[] is = new int[4];
                    is[0] = (int) (Math.random() * 9.9999999E7);
                    is[1] = (int) (Math.random() * 9.9999999E7);
                    is[2] = (int) (Class54.aLong1084 >> 32);
                    is[3] = (int) Class54.aLong1084;
                    Class40.outBuffer.position = 0;
                    Class40.outBuffer.writeByte(10);
                    Class40.outBuffer.writeIntBE(is[0]);
                    Class40.outBuffer.writeIntBE(is[1]);
                    Class40.outBuffer.writeIntBE(is[2]);
                    Class40.outBuffer.writeIntBE(is[3]);
                    Class40.outBuffer.writeIntBE((Class55.aClass45_1141.anInt835));
                    Class40.outBuffer.method140(-24628, Class11_Sub10_Sub4_Sub5.aClass31_2680.method633((byte) -128));
                    Class40.outBuffer.method143(Class11_Sub10_Sub4_Sub5.aClass31_2666, (byte) -63);
                    Class40.outBuffer.encrypt(Canvas_Sub1.rsaKey, Class62.rsaModulus);
                    NotActuallyBuffer.loginBuffer.position = 0;
                    if (Class11_Sub10_Sub3.anInt2013 == 40) {
						NotActuallyBuffer.loginBuffer.writeByte(18);
					}  else {
						NotActuallyBuffer.loginBuffer.writeByte(16);
					}
                    NotActuallyBuffer.loginBuffer.writeByte(Class40.outBuffer.position + 53);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Constants.BUILD_NUMBER);
                    NotActuallyBuffer.loginBuffer.writeByte(Class1.aBoolean94 ? 1 : 0);
                    NotActuallyBuffer.loginBuffer.writeIntBE(aClass55_Sub1_307.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class11_Sub10_Sub6.aClass55_Sub1_2135.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class11_Sub10_Sub1.aClass55_Sub1_1939.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class8.aClass55_Sub1_166.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class11_Sub8.aClass55_Sub1_1623.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class13.aClass55_Sub1_270.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class47.aClass55_Sub1_876.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class11_Sub10_Sub12.aClass55_Sub1_2270.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class43.aClass55_Sub1_780.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class11_Sub8.aClass55_Sub1_1620.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class42.aClass55_Sub1_766.checksum);
                    NotActuallyBuffer.loginBuffer.writeIntBE(Class33.aClass55_Sub1_618.checksum);
                    NotActuallyBuffer.loginBuffer.method142(Class40.outBuffer.payload, 0, (byte) 65, Class40.outBuffer.position);
                    Class11_Sub12.aClass14_1699.method521(NotActuallyBuffer.loginBuffer.payload, NotActuallyBuffer.loginBuffer.position, 0, true);
                    Class40.outBuffer.method194(is, -100);
                    for (int i = 0; (i ^ 0xffffffff) > -5; i++)
                        is[i] += 50;
                    Class11_Sub10_Sub4_Sub2.inBuffer.method194(is, -56);
                    Class8.loginState = 6;
                }
                if ((Class8.loginState ^ 0xffffffff) == -7 && ((Class11_Sub12.aClass14_1699.method518(0) ^ 0xffffffff) < -1)) {
                    int i = Class11_Sub12.aClass14_1699.method516(0);
                    if (i != 21 || Class11_Sub10_Sub3.anInt2013 != 20) {
                        if ((i ^ 0xffffffff) == -3) Class8.loginState = 9;
                        else {
                            if ((i ^ 0xffffffff) == -16 && Class11_Sub10_Sub3.anInt2013 == 40) {
                                Class48.method789((byte) -72);
                                return;
                            }
                            if ((i ^ 0xffffffff) == -24 && Class28.anInt506 < 1) {
                                Class28.anInt506++;
                                Class8.loginState = 0;
                            } else {
                                Class11_Sub10_Sub4_Sub2_Sub2.method284(i, (byte) 101);
                                return;
                            }
                        }
                    } else Class8.loginState = 7;
                }
                if (Class8.loginState == 7 && Class11_Sub12.aClass14_1699.method518(0) > 0) {
                    Class62.anInt1297 = (Class11_Sub12.aClass14_1699.method516(0) + 3) * 60;
                    Class8.loginState = 8;
                }
                if (Class8.loginState == 8) {
                    Class11_Sub10_Sub4_Sub5.anInt2692 = 0;
                    Class11_Sub10_Sub4.method259(Class11_Sub10_Sub2.aClass31_1957, Class40.method744(0, (new Class31[]{Class52.aClass31_1028, (Class11_Sub11.method493(Class62.anInt1297 / 60, (byte) -124))})), (byte) 77);
                    if ((--Class62.anInt1297 ^ 0xffffffff) >= -1) Class8.loginState = 0;
                } else {
                    if ((Class8.loginState ^ 0xffffffff) == -10 && (Class11_Sub12.aClass14_1699.method518(0) ^ 0xffffffff) <= -9) {
                        Class25.anInt479 = Class11_Sub12.aClass14_1699.method516(0);
                        aBoolean309 = Class11_Sub12.aClass14_1699.method516(0) == 1;
                        Class44.anInt800 = Class11_Sub12.aClass14_1699.method516(0);
                        Class44.anInt800 <<= 8;
                        Class44.anInt800 += Class11_Sub12.aClass14_1699.method516(0);
                        Class11_Sub10_Sub15.anInt2371 = Class11_Sub12.aClass14_1699.method516(0);
                        Class11_Sub12.aClass14_1699.method515(0, 1, (byte) 110, (Class11_Sub10_Sub4_Sub2.inBuffer.payload));
                        Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
                        Class48.anInt906 = Class11_Sub10_Sub4_Sub2.inBuffer.method193((byte) 105);
                        Class11_Sub12.aClass14_1699.method515(0, 2, (byte) 89, (Class11_Sub10_Sub4_Sub2.inBuffer.payload));
                        Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
                        Class11_Sub10_Sub14.anInt2348 = Class11_Sub10_Sub4_Sub2.inBuffer.method164();
                        Class8.loginState = 10;
                    }
                    if ((Class8.loginState ^ 0xffffffff) == -11) {
                        if ((Class11_Sub12.aClass14_1699.method518(0) ^ 0xffffffff) <= (Class11_Sub10_Sub14.anInt2348 ^ 0xffffffff)) {
                            Class11_Sub10_Sub4_Sub2.inBuffer.position = 0;
                            Class11_Sub12.aClass14_1699.method515(0, Class11_Sub10_Sub14.anInt2348, (byte) 91, (Class11_Sub10_Sub4_Sub2.inBuffer.payload));
                            Class60.method952((byte) -114);
                            Class11_Sub10_Sub4_Sub2.anInt2571 = -1;
                            Class55.constructMapRegion(false, -50);
                            Class48.anInt906 = -1;
                        }
                    } else {
                        Class11_Sub10_Sub4_Sub5.anInt2692++;
                        if ((Class11_Sub10_Sub4_Sub5.anInt2692 ^ 0xffffffff) < -2001) {
                            if (Class28.anInt506 < 1) {
                                Class28.anInt506++;
                                if ((Class22.anInt403 ^ 0xffffffff) != (Class11_Sub10_Sub4_Sub2_Sub2.anInt2837 ^ 0xffffffff))
                                    Class22.anInt403 = (Class11_Sub10_Sub4_Sub2_Sub2.anInt2837);
                                else Class22.anInt403 = Class20.anInt389;
                                Class8.loginState = 0;
                            } else Class11_Sub10_Sub4_Sub2_Sub2.method284(-3, (byte) 101);
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (Class28.anInt506 < 1) {
                    if ((Class22.anInt403 ^ 0xffffffff) != (Class11_Sub10_Sub4_Sub2_Sub2.anInt2837 ^ 0xffffffff))
                        Class22.anInt403 = Class11_Sub10_Sub4_Sub2_Sub2.anInt2837;
                    else Class22.anInt403 = Class20.anInt389;
                    Class28.anInt506++;
                    Class8.loginState = 0;
                } else Class11_Sub10_Sub4_Sub2_Sub2.method284(-2, (byte) 101);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ib.BA(" + arg0 + ')');
        }
    }

    public static void method532(int arg0) {
        do {
            try {
                Class11_Sub10_Sub9.aClass37_2211.method706(-126);
                anInt306++;
                if (arg0 == -7184) break;
                method528(null, -30);
            } catch (RuntimeException runtimeexception) {
                throw Class58.method939(runtimeexception, "ib.V(" + arg0 + ')');
            }
            break;
        } while (false);
    }

    public static int method533(int arg0, byte arg1) {
        try {
            if (arg1 <= 44) aClass55_318 = null;
            anInt308++;
            return (int) ((868.5889638065036 * Math.log((double) arg0 * 0.00390625)) + 0.5);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "ib.CA(" + arg0 + ',' + arg1 + ')');
        }
    }

    public abstract void method534(int i);

    public abstract void method535(boolean bool, byte i, byte[] is, int i_10_);

    public abstract void method536(int i);

    public abstract void method537(int i);

    static {
        aBoolean309 = false;
    }
}
