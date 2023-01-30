/* Class15_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;

public class Class15_Sub1_Sub2 extends Class15_Sub1 implements Receiver
{
    public static Receiver aReceiver2447 = null;
    public static Sequencer aSequencer2448 = null;
    
    public void close() {
	/* empty */
    }
    
    public void method537(int arg0) {
	if (arg0 != -1)
	    method529((byte) -77, 15, 90);
    }
    
    public void method536(int arg0) {
	if (arg0 != 1)
	    aReceiver2447 = null;
	if (aSequencer2448 != null)
	    method544((byte) -103, -1L);
    }
    
    public void method534(int arg0) {
	if (arg0 == 128) {
	    if (aSequencer2448 != null) {
		aSequencer2448.close();
		aSequencer2448 = null;
	    }
	    if (aReceiver2447 != null) {
		aReceiver2447.close();
		aReceiver2447 = null;
	    }
	}
    }
    
    public void method535(boolean arg0, byte arg1, byte[] arg2, int arg3) {
//		exception = exception_1_;
//		break;
    }
    
    public synchronized void method529(byte arg0, int arg1, int arg2) {
	if (aSequencer2448 != null) {
	    if (arg0 != -97)
		method547(94, -95, -106, 26L);
	    method541(-65, arg2, -1L, arg1);
	}
    }
    
    public void method547(int arg0, int arg1, int arg2, long arg3) {
	try {
	    ShortMessage shortmessage = new ShortMessage();
	    shortmessage.setMessage(arg0, arg1, arg2);
	    aReceiver2447.send(shortmessage, arg3);
	} catch (InvalidMidiDataException invalidmididataexception) {
	    /* empty */
	}
    }
    
    public synchronized void send(MidiMessage arg0, long arg1) {
	byte[] is = arg0.getMessage();
	if (is.length < 3 || !method538(is[0], is[1], is[2], arg1))
	    aReceiver2447.send(arg0, arg1);
    }
    
    public void method526(byte arg0) {
	if (aSequencer2448 != null) {
	    aSequencer2448.stop();
	    method542(-1L, (byte) 69);
	    int i = -104 / ((arg0 - -2) / 57);
	}
    }
    
    public Class15_Sub1_Sub2() {
	try {
	    aReceiver2447 = MidiSystem.getReceiver();
	    aSequencer2448 = MidiSystem.getSequencer(false);
	    aSequencer2448.getTransmitter().setReceiver(this);
	    aSequencer2448.open();
	    method542(-1L, (byte) 69);
	} catch (Exception exception) {
	    Class63.method988(true);
	}
    }
}
