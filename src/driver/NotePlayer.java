package driver;

import java.util.Scanner;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

import note.Note;

public class NotePlayer {


	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a note to play: ");
		String noteString = sc.next();
		sc.close();
		
		Note note = new Note(noteString);
		int midiNoteValue = note.getMidiNoteValue();
		
		for(int i = midiNoteValue; i <= 127; i++) {
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			Instrument[] availableInstruments = synth.getAvailableInstruments();
			synth.loadInstrument(availableInstruments[50]);
			MidiChannel[] channels = synth.getChannels();
			channels[0].noteOn(i, 127);
			Thread.sleep(300);
			channels[0].noteOff(i);
		}
		
	}

}
