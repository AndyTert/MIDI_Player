package driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

import note.Note;

public class SongPlayer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("./res/Song");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line,",");
				while(st.hasMoreTokens()) {
					Note note = new Note(st.nextToken());
					int midiNoteValue = note.getMidiNoteValue();
					Synthesizer synth = MidiSystem.getSynthesizer();
					synth.open();
					Instrument[] availableInstruments = synth.getAvailableInstruments();
					synth.loadInstrument(availableInstruments[50]);
					MidiChannel[] channels = synth.getChannels();
					channels[0].noteOn(midiNoteValue, 127);
					Thread.sleep(300);
					channels[0].noteOff(midiNoteValue);
				}
				line = br.readLine();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
			br.close();
		}
	}

	//	private static int getSize(char charAt) {
	//
	//	String sizeString = String.valueOf(charAt);
	//		return Integer.parseInt(sizeString);
	//	}

}


