package o25bBiograf;


public class Cinema {
	private int row;
	private int seatsOnRow[];
	private boolean seats[][];

	Cinema(int [] seatsOnRow){
		row = seatsOnRow.length;
		this.seatsOnRow =seatsOnRow;

		seats = new boolean[row][];
		for (int i = 0; i < seatsOnRow.length; i++) {
			seats[i]= new boolean[seatsOnRow[i]];
		}
	}

	public int rows(){
		return row;
	}

	public int seatsOnRow(int row){
		if(row>=0 && row<seatsOnRow.length)
			return seatsOnRow[row];
		else return 0;
	}

	public int seats(){
		int totalSeats=0;
		for(int i=0; i<row;i++){
			totalSeats +=seatsOnRow(i);
		}
		return totalSeats;
	}

	public int rowVacancies(int row){
		if(row>=0 && row<seatsOnRow.length){
			int ledig =0;
			for(int i=0; i<seats[row].length; i++){
				if(seats[row][i] == false){
					ledig++;
				}
			}
			return ledig;
		}
		else return 0;
	}

	public int vacancies(){
		int ledig = 0;
		for(int i=0; i<seatsOnRow.length;i++){
			for(int j=0; j<seats[i].length;j++){
				if(seats[i][j] == false){
					ledig++;
				}
			}
		}
		return ledig;
	}

	public void booking(int row, int seat){
		if((row>=0 && row<seatsOnRow.length) && (seat>=0 && seat<seats[row].length)){
			seats[row][seat] = true;
		}

	}

	public void release(int row, int seat){
		if((row>=0 && row<=seatsOnRow.length) && (seat>=0 && seat<=seats[row].length)){
			seats[row][seat] = false;
		}
	}

	public String toString(){
		String result ="";
		for(int i=0; i<seatsOnRow.length;i++){
			for(int j=0; j<seats[i].length;j++){
				if(seats[i][j]==false)
					result += "0";
				else
					result += "#";
			}
			result += "\n";
		}
		return result;
	}


}
