/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;

public class client extends Applet_Sub1 {
    public static Class31 aClass31_1451;
    public static Class31 aClass31_1452 = Class64.method992("", 255);
    public static Class31 aClass31_1453;
    public static byte[][] aByteArrayArray1454 = new byte[1000][];
    public static int anInt1455;
    public static int anInt1456;
    public static int anInt1457;
    public static int anInt1458;
    public static int anInt1459;
    public static int anInt1460;
    public static int anInt1461;
    public static int anInt1462;
    public static int anInt1463;
    public static int anInt1464;
    public static int anInt1465;
    public static int anInt1466;
    public static int anInt1467;
    public static int anInt1468;
    public static boolean aBoolean1469;

    public void method23(int arg0) {
        try {
            int i = -64 % ((-56 - arg0) / 43);
            if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -1)
                Class51.method850(null, Class54.aClass31_1085, Class53.anInt1055, -119);
            else if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) != -6) {
                if (Class11_Sub10_Sub3.anInt2013 == 10)
                    Class57.method933(Class37.aClass11_Sub10_Sub13_Sub2_699, Class11_Sub10_Sub11.aGraphics2261, -86, (RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357));
                else if (Class11_Sub10_Sub3.anInt2013 == 20)
                    Class57.method933(Class37.aClass11_Sub10_Sub13_Sub2_699, Class11_Sub10_Sub11.aGraphics2261, 120, (RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357));
                else if (Class11_Sub10_Sub3.anInt2013 != 25) {
                    if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -31) Class53.method859(77);
                    else if (Class11_Sub10_Sub3.anInt2013 != 35) {
                        if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -41)
                            Class28.method610(false, Class12.aClass31_236, Class58.aClass31_1223, -32266);
                    } else Class53.method862(30272);
                } else if (Applet_Sub1.anInt5 == 1) {
                    if ((Class11_Sub7.anInt1607 ^ 0xffffffff) > (Class11_Sub10_Sub3.anInt2024 ^ 0xffffffff))
                        Class11_Sub7.anInt1607 = Class11_Sub10_Sub3.anInt2024;
                    int i_0_ = ((Class11_Sub7.anInt1607 - Class11_Sub10_Sub3.anInt2024) * 50 / Class11_Sub7.anInt1607);
                    Class28.method610(true, (Class40.method744(0, (new Class31[]{Class62.aClass31_1293, Class11_Sub11.method493(i_0_, (byte) -126), (Class11_Sub10_Sub3.aClass31_2029)}))), Class54.aClass31_1059, -32266);
                } else if (Applet_Sub1.anInt5 == 2) {
                    if (Class11_Sub10.anInt1655 < Class29.anInt530) Class11_Sub10.anInt1655 = Class29.anInt530;
                    int i_1_ = (((-Class29.anInt530 + Class11_Sub10.anInt1655) * 50 / Class11_Sub10.anInt1655) + 50);
                    Class28.method610(true, (Class40.method744(0, (new Class31[]{Class62.aClass31_1293, Class11_Sub11.method493(i_1_, (byte) -125), (Class11_Sub10_Sub3.aClass31_2029)}))), Class54.aClass31_1059, -32266);
                } else Class28.method610(false, null, Class54.aClass31_1059, -32266);
            } else
                Class57.method933(Class37.aClass11_Sub10_Sub13_Sub2_699, Class11_Sub10_Sub11.aGraphics2261, -2, (RuntimeException_Sub1.aClass11_Sub10_Sub13_Sub2_1357));
            Class11_Sub10_Sub4_Sub2.anInt2570 = 0;
            anInt1457++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "client.G(" + arg0 + ')');
        }
    }

    public static void method33(Class55 arg0, int arg1) {
        try {
            if (arg1 == 4) {
                Class28.aClass55_508 = arg0;
                anInt1461++;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, ("client.S(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public void method34(byte arg0, int arg1) {
        Class29.anInt545 = 0;
        Class8.anInt190++;
        if (Class11_Sub10_Sub4_Sub2_Sub2.anInt2837 != Class22.anInt403)
            Class22.anInt403 = Class11_Sub10_Sub4_Sub2_Sub2.anInt2837;
        else Class22.anInt403 = Class20.anInt389;
        if (arg0 == 109) {
            anInt1464++;
            Class9.aClass14_199 = null;
            Class40.aClass41_745 = null;
            if (Class8.anInt190 < 2 || arg1 != 7 && (arg1 ^ 0xffffffff) != -10) {
                if ((Class8.anInt190 ^ 0xffffffff) > -3 || (arg1 ^ 0xffffffff) != -7) {
                    if ((Class8.anInt190 ^ 0xffffffff) <= -5) {
                        if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) >= -6) {
                            this.method26(104, "js5connect");
                            Class11_Sub10_Sub3.anInt2013 = 1000;
                        } else Class17.anInt343 = 3000;
                    }
                } else {
                    this.method26(115, "js5connect_outofdate");
                    Class11_Sub10_Sub3.anInt2013 = 1000;
                }
            } else if (Class11_Sub10_Sub3.anInt2013 > 5) Class17.anInt343 = 3000;
            else {
                this.method26(106, "js5connect_full");
                Class11_Sub10_Sub3.anInt2013 = 1000;
            }
        }
    }

    public void method20(int arg0) {
        anInt1458++;
        Class11_Sub10_Sub4_Sub2_Sub2.anInt2837 = ((Class50.anInt993 ^ 0xffffffff) == -1 ? 43594 : 40000 + Class55_Sub1.anInt1863);
        Class22.anInt403 = Class11_Sub10_Sub4_Sub2_Sub2.anInt2837;
        Class20.anInt389 = ((Class50.anInt993 ^ 0xffffffff) == -1 ? 443 : 50000 - -Class55_Sub1.anInt1863);
        Class11_Sub10_Sub4_Sub2.method264(117);
        Class11_Sub10_Sub15.method475(Class34.method672(-126), (byte) 66);
        Class29.method612(Class34.method672(-111), 84);
        Class58.anInt1230 = Class45.anInt822;
        try {
            if (Class55.aClass45_1141.aClass5_838 != null) {
                Class28.aClass3_521 = new Class3(Class55.aClass45_1141.aClass5_838, 5200, 0);
                for (int i = 0; i < 12; i++)
                    Class12.aClass3Array245[i] = new Class3(Class55.aClass45_1141.aClass5Array830[i], 6000, 0);
                Class60.aClass3_1246 = new Class3(Class55.aClass45_1141.aClass5_841, 6000, 0);
                Class33.aClass64_617 = new Class64(255, Class28.aClass3_521, Class60.aClass3_1246, 500000);
                Class55.aClass45_1141.aClass5_841 = null;
                Class55.aClass45_1141.aClass5_838 = null;
                Class55.aClass45_1141.aClass5Array830 = null;
            }
            if (Class55.aClass45_1141.aClass5_839 != null) {
                Class62.aClass3_1301 = new Class3(Class55.aClass45_1141.aClass5_839, 5200, 0);
                for (int i = 0; i < 5; i++)
                    Class11_Sub7.aClass3Array1609[i] = new Class3(Class55.aClass45_1141.aClass5Array825[i], 6000, 0);
                Class55.aClass45_1141.aClass5_839 = null;
                Class55.aClass45_1141.aClass5Array825 = null;
            }
            if (arg0 != -12527) method34((byte) -43, 25);
        } catch (java.io.IOException ioexception) {
            Class28.aClass3_521 = null;
            Class62.aClass3_1301 = null;
            Class60.aClass3_1246 = null;
            Class33.aClass64_617 = null;
        }
        if ((Class50.anInt993 ^ 0xffffffff) != -1) Class11_Sub10_Sub4_Sub2_Sub2.aBoolean2830 = true;
    }

    public void method35(int arg0) {
        anInt1463++;
        if (arg0 != Class11_Sub10_Sub3.anInt2013) {
            boolean bool = Class11_Sub7.method214((byte) 11);
            if (!bool) method36((byte) -127);
        }
    }

    private void loadRSAKeys() {
        try {
            // final ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./data/public.key"));
            InputStream is = getClass().getResourceAsStream("/data/public.key");
            if (is == null) {
                is = new FileInputStream("./data/public.key");
            }
            final ObjectInputStream oin = new ObjectInputStream(is);
            Class62.rsaModulus = (BigInteger) oin.readObject();
            Canvas_Sub1.rsaKey = (BigInteger) oin.readObject();
        } catch (final Exception ex) {
            System.err.println("Cannot find public RSA key file! Shutting down...");
            System.exit(1);
        }
    }

    public void init() {
        try {
            anInt1455++;
            if (this.method24(-1)) {
                Class55_Sub1.anInt1863 = Integer.parseInt(this.getParameter("worldid"));
                Class39_Sub1.anInt1832 = Integer.parseInt(this.getParameter("modewhat"));
                Class50.anInt993 = Integer.parseInt(this.getParameter("modewhere"));
                String string = this.getParameter("lowmem");
                if (string != null && string.equals("1")) Class11.method106(true);
                else Class34.method675((byte) 84);
                String string_2_ = this.getParameter("members");
                if (string_2_ != null && string_2_.equals("1")) Class4.aBoolean146 = true;
                else Class4.aBoolean146 = false;
                this.method19(Class39_Sub1.anInt1832 + 32, 503, 765, 410, 22895);
            }
            loadRSAKeys();
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "client.init(" + ')');
        }
    }

    public void method36(byte arg0) {
        anInt1467++;
        if ((Class31.anInt1413 ^ 0xffffffff) <= -5) {
            this.method26(111, "js5crc");
            Class11_Sub10_Sub3.anInt2013 = 1000;
        } else {
            if (Class57.anInt1158 >= 4) {
                if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) < -6) {
                    Class57.anInt1158 = 3;
                    Class17.anInt343 = 3000;
                } else {
                    this.method26(108, "js5io");
                    Class11_Sub10_Sub3.anInt2013 = 1000;
                    return;
                }
            }
            if ((Class17.anInt343-- ^ 0xffffffff) >= -1 && arg0 < -46) {
                do {
                    try {
                        if (Class29.anInt545 == 0) {
                            Class40.aClass41_745 = Class55.aClass45_1141.method773((byte) -101, (Class22.anInt403));
                            Class29.anInt545++;
                        }
                        if ((Class29.anInt545 ^ 0xffffffff) == -2) {
                            if ((Class40.aClass41_745.anInt749 ^ 0xffffffff) == -3) {
                                method34((byte) 109, -1);
                                break;
                            }
                            if (Class40.aClass41_745.anInt749 == 1) Class29.anInt545++;
                        }
                        if (Class29.anInt545 == 2) {
                            Class9.aClass14_199 = new Class14((Socket) (Class40.aClass41_745.anObject751), Class55.aClass45_1141);
                            Buffer buffer = new Buffer(5);
                            buffer.writeByte(15);
                            buffer.writeIntBE(Constants.BUILD_NUMBER);
                            Class9.aClass14_199.method521((buffer.payload), 5, 0, true);
                            Class29.anInt545++;
                            Class11_Sub10_Sub9.aLong2210 = System.currentTimeMillis();
                        }
                        if ((Class29.anInt545 ^ 0xffffffff) == -4) {
                            if (((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) >= -6) || Class9.aClass14_199.method518(0) > 0) {
                                int i = Class9.aClass14_199.method516(0);
                                if ((i ^ 0xffffffff) != -1) {
                                    method34((byte) 109, i);
                                    break;
                                }
                                Class29.anInt545++;
                            } else if ((System.currentTimeMillis() + -Class11_Sub10_Sub9.aLong2210) > 30000L) {
                                method34((byte) 109, -2);
                                break;
                            }
                        }
                        if ((Class29.anInt545 ^ 0xffffffff) != -5) break;
                        Class42.method746(Class9.aClass14_199, (byte) -37, (Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) < -21);
                        Class8.anInt190 = 0;
                        Class40.aClass41_745 = null;
                        Class9.aClass14_199 = null;
                        Class29.anInt545 = 0;
                    } catch (java.io.IOException ioexception) {
                        method34((byte) 109, -3);
                        break;
                    }
                    break;
                } while (false);
            }
        }
    }

    public static void main(String[] arg0) {
        try {
            try {
                if (arg0.length != 5) Class37_Sub1.method710(12726);
                Class55_Sub1.anInt1863 = Integer.parseInt(arg0[0]);
                if (!arg0[1].equals("live")) {
                    if (!arg0[1].equals("office")) {
                        if (arg0[1].equals("local")) Class50.anInt993 = 2;
                        else Class37_Sub1.method710(12726);
                    } else Class50.anInt993 = 1;
                } else Class50.anInt993 = 0;
                if (arg0[2].equals("live")) Class39_Sub1.anInt1832 = 0;
                else if (arg0[2].equals("rc")) Class39_Sub1.anInt1832 = 1;
                else if (arg0[2].equals("wip")) Class39_Sub1.anInt1832 = 2;
                else Class37_Sub1.method710(12726);
                if (arg0[3].equals("lowmem")) Class11.method106(true);
                else if (!arg0[3].equals("highmem")) Class37_Sub1.method710(12726);
                else Class34.method675((byte) 84);
                if (!arg0[4].equals("free")) {
                    if (arg0[4].equals("members")) Class4.aBoolean146 = true;
                    else Class37_Sub1.method710(12726);
                } else Class4.aBoolean146 = false;
                client var_client = new client();
                var_client.method32(410, "runescape", 32 + Class39_Sub1.anInt1832, InetAddress.getLocalHost(), (byte) 54, 12, 503, 765);
                var_client.loadRSAKeys();
            } catch (Exception exception) {
                Class14.method517((byte) 106, null, exception);
            }
            anInt1462++;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "client.main(" + (arg0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void method37(int arg0) {
        try {
            if (arg0 <= 91) anInt1466 = 104;
            aClass31_1451 = null;
            aClass31_1453 = null;
            aByteArrayArray1454 = null;
            aClass31_1452 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "client.Q(" + arg0 + ')');
        }
    }

    public void method25(int arg0) {
        try {
            method37(arg0 ^ ~0x1239);
            anInt1456++;
            Class31.method624(arg0 ^ ~0x127c);
            Applet_Sub1.method18(true);
            Class51.method849(23017);
            Class39.method728(-39);
            Class37.method702(false);
            Canvas_Sub1.method40(1);
            Class46.method781(-3);
            Buffer.method149(arg0 + 874571332);
            Class14.method523(true);
            Class55_Sub1.method915((byte) 73);
            Class3.method50((byte) -73);
            Class64.method989(6);
            Class11_Sub10_Sub4_Sub2_Sub2.method286(true);
            Class11_Sub5_Sub1.method198(-1650);
            Class11_Sub10_Sub13_Sub2.method431();
            Class49.method814();
            Class8.method99(5314);
            Class11_Sub10_Sub4_Sub2_Sub1.method278(-1537);
            Class36.method689(-19737);
            Class11_Sub10_Sub5.method336(3);
            Class50.method847(-27290);
            Class24.method589(-103);
            Class11_Sub10_Sub4_Sub2.method272(true);
            Class11_Sub8.method219((byte) -98);
            Class11_Sub10_Sub14.method469(true);
            Class34.method678((byte) -74);
            Class11.method109((byte) -99);
            Class63.method987((byte) -127);
            Class13.method514((byte) -66);
            Class11_Sub10.method225(-5563);
            if (arg0 == -4700) {
                Class55.method889((byte) -84);
                Class40.method738(-30466);
                Class11_Sub10_Sub12.method393((byte) 68);
                Class11_Sub10_Sub4_Sub4.method309();
                RuntimeException_Sub1.method998(123);
                Class11_Sub12.method498((byte) -35);
                Class28.method608(0);
                Class48.method788(32);
                Class11_Sub10_Sub4.method253(-16711936);
                Class54.method874(126);
                Class1.method48(51);
                Class23.method579((byte) 29);
                Class43.method756(arg0 + 4700);
                Class30.method617();
                Class20.method573(0);
                Class58.method946((byte) -68);
                Class47.method786((byte) -31);
                Class53.method868(-29246);
                Class61.method956(-125);
                Class12.method504(false);
                Class59.method947(-1);
                Class32.method661((byte) 114);
                Class11_Sub10_Sub16.method489(-5361);
                Class22.method575((byte) -115);
                Class11_Sub10_Sub13_Sub1.method422();
                Class11_Sub10_Sub13.method397();
                Class25.method599(true);
                Class9.method100(arg0 ^ ~0x120a);
                Class29.method611(92);
                Class11_Sub10_Sub10.method371((byte) 69);
                Class11_Sub10_Sub8.method366(7954);
                Class11_Sub10_Sub7.method352(arg0 ^ ~0x125b);
                Class11_Sub10_Sub2.method245(128);
                Class11_Sub10_Sub15.method483(86);
                Class11_Sub10_Sub6.method344((byte) 70);
                Class11_Sub10_Sub11.method383((byte) -76);
                Class11_Sub10_Sub1.method231(91);
                Class11_Sub10_Sub3.method251(29737);
                Class7.method76((byte) 73);
                Class11_Sub9.method221();
                Class33.method666(-77);
                Class10.method103((byte) -63);
                Class42.method749(-88);
                Class52.method858(false);
                Class19.method567();
                Class62.method982((byte) -39);
                Class11_Sub10_Sub4_Sub1.method261(arg0 + 4701);
                Class11_Sub10_Sub4_Sub6.method330(arg0 + 4608);
                Class6.method72(113);
                Class11_Sub10_Sub4_Sub3.method290(true);
                Class11_Sub10_Sub4_Sub5.method323(true);
                NotActuallyBuffer.method601((byte) -89);
                Class11_Sub7.method211((byte) 111);
                Class17.method563((byte) 126);
                Class39_Sub1.method731((byte) -6);
                Class37_Sub1.method712((byte) -66);
                Class44.method762((byte) -10);
                Class27.method602();
                Class60.method951(0);
                Class38.method722();
                Class57.method935((byte) -76);
                Class18.method565();
                Class11_Sub6.method207((byte) 35);
                Class11_Sub11.method492(arg0 ^ ~0x1226);
                Class15.method530(false);
                Class11_Sub10_Sub9.method367((byte) 106);
                Class61_Sub1.method972();
                Class61_Sub1_Sub2.method979();
                Class4.method60((byte) 99);
                Class11_Sub4.method136((byte) -39);
                Class15_Sub1.method549(arg0 ^ 0x1233);
                Class56.method930();
                Class15_Sub2.method557(true);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "client.I(" + arg0 + ')');
        }
    }

    public void method27(byte arg0) {
        if (Class11_Sub10_Sub3.aClass46_2020 != null) Class11_Sub10_Sub3.aClass46_2020.aBoolean849 = false;
        Class11_Sub10_Sub3.aClass46_2020 = null;
        if (Class11_Sub12.aClass14_1699 != null) Class11_Sub12.aClass14_1699.method520(-9098);
        if (arg0 > -36) anInt1466 = 40;
        anInt1459++;
        Class11_Sub10_Sub4.method252(-1);
        Class11_Sub10_Sub4_Sub2.method267(-72);
        Class53.method863((byte) 78);
        Class34.method670((byte) 3);
        Class11_Sub10_Sub4_Sub2_Sub2.method282(-21933);
        Class39.method729(-27632);
        do {
            try {
                if (Class28.aClass3_521 != null) Class28.aClass3_521.method58(41);
                if (Class12.aClass3Array245 != null) {
                    for (int i = 0; ((Class12.aClass3Array245.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
                        if (Class12.aClass3Array245[i] != null) Class12.aClass3Array245[i].method58(39);
                    }
                }
                if (Class60.aClass3_1246 != null) Class60.aClass3_1246.method58(62);
                if (Class62.aClass3_1301 != null) Class62.aClass3_1301.method58(112);
                if (Class11_Sub7.aClass3Array1609 == null) break;
                for (int i = 0; Class11_Sub7.aClass3Array1609.length > i; i++) {
                    if (Class11_Sub7.aClass3Array1609[i] != null) Class11_Sub7.aClass3Array1609[i].method58(85);
                }
            } catch (java.io.IOException ioexception) {
                break;
            }
            break;
        } while (false);
    }

    public void method22(boolean arg0) {
        try {
            Class61.anInt1283++;
            anInt1465++;
            if (arg0 != true) anInt1466 = -37;
            method35(1000);
            Class42.method751(-123);
            Class53.method870(-127);
            Class3.method52((byte) 21);
            Class29.method616(0);
            Class11_Sub10_Sub4_Sub2_Sub1.method275(0);
            if (Class11_Sub10_Sub3.anInt2013 != 0) {
                if (Class11_Sub10_Sub3.anInt2013 == 5) {
                    Class58.method941((byte) -15);
                    Class11_Sub10_Sub12.method392(65535);
                } else if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -11) Class11_Sub10_Sub4_Sub2.method274(192);
                else if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -21) {
                    Class11_Sub10_Sub4_Sub2.method274(192);
                    Class15.method531(-100);
                } else if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -26) Class32.method660(-70);
            } else {
                Class58.method941((byte) -15);
                Class11_Sub10_Sub12.method392(65535);
            }
            if (Class11_Sub10_Sub3.anInt2013 != 30) {
                if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) != -36) {
                    if ((Class11_Sub10_Sub3.anInt2013 ^ 0xffffffff) == -41) Class15.method531(-90);
                } else Class37_Sub1.method709(113);
            } else Class37_Sub1.method709(63);
        } catch (RuntimeException runtimeexception) {
            throw Class58.method939(runtimeexception, "client.L(" + arg0 + ')');
        }
    }

    static {
        aClass31_1451 = Class64.method992("green:", 255);
        aClass31_1453 = Class64.method992("Report abuse @whi@", 255);
        anInt1466 = 0;
    }
}
