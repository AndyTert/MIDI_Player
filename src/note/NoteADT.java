package note;

public abstract class NoteADT {
	protected int	midiNoteValue	= -1;

	public int getMidiNoteValue() {
		return midiNoteValue;
	}

	public void setMidiNoteValue(int midiNoteValue) {
		this.midiNoteValue = midiNoteValue;
	}

	// cb3
	public NoteADT(String note) throws Exception { // ie. "c" --> 0
		int[][] ary = new int[12][11]; // index 0y = -1octave
		int midiCounter = 0;
		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 12; x++) {
				ary[x][y] = midiCounter++;
			}
		}

		int xVal = getNoteIndex(note);
		int yVal = getOctaveIndex(note.charAt(note.length() - 1));

		char s = note.charAt(1);
		int[] indexValues = recalculate(s, xVal, yVal);
		xVal = indexValues[0];
		yVal = indexValues[1];

		midiNoteValue = ary[xVal][yVal];
	}

	private int[] recalculate(char s, int xVal, int yVal) {
		int[] result = new int[2];

		switch (s) {
		case '#':
			if (xVal == NoteConstants.B) {
				xVal = NoteConstants.C;
				yVal++;
			} else {
				xVal = xVal + 1;
			}
			break;
		case 'b':
			if (xVal == NoteConstants.C) {
				xVal = NoteConstants.B;
				yVal--;
			} else {
				xVal--;
			}
			break;
		}

		result[0] = xVal;
		result[1] = yVal;
		return result;
	}

	private int getOctaveIndex(char c) {
		int yVal = -1;
		switch (c) {
		case '-':
			yVal = OctaveConstants.MINUS_ONE;
			break;
		case '0':
			yVal = OctaveConstants.ZERO;
			break;
		case '1':
			yVal = OctaveConstants.ONE;
			break;
		case '2':
			yVal = OctaveConstants.TWO;
			break;
		case '3':
			yVal = OctaveConstants.THREE;
			break;
		case '4':
			yVal = OctaveConstants.FOUR;
			break;
		case '5':
			yVal = OctaveConstants.FIVE;
			break;
		case '6':
			yVal = OctaveConstants.SIX;
			break;
		case '7':
			yVal = OctaveConstants.SEVEN;
			break;
		case '8':
			yVal = OctaveConstants.EIGHT;
			break;
		case '9':
			yVal = OctaveConstants.NINE;
			break;
		}
		return yVal;
	}

	private int getNoteIndex(String note) throws Exception {
		int xVal = -1;
		switch (note.toUpperCase().charAt(0)) {
		case 'C':
			xVal = NoteConstants.C;
			break;
		case 'D':
			xVal = NoteConstants.D;
			break;
		case 'E':
			xVal = NoteConstants.E;
			break;
		case 'F':
			xVal = NoteConstants.F;
			break;
		case 'G':
			xVal = NoteConstants.G;
			break;
		case 'A':
			xVal = NoteConstants.A;
			break;
		case 'B':
			xVal = NoteConstants.B;
			break;
		default:
			throw new Exception("invalid note");
		}

		return xVal;
	}
}
