package Ds.M2.A4;

import java.util.Arrays;

class Solution{
	public Team[] sort(Team[] teams){
		//System.out.println("Before Sort : "+Arrays.toString(teams));
		Arrays.sort(teams);
		//System.out.println("After Sort : "+Arrays.toString(teams));
		return teams;
	}
}
class Team implements Comparable<Team> {
	String teamName;
	int noOfWins;
	int noOfLosses;
	int noOfDraws;
	Team(String name, int wins, int losses, int draws){
		teamName = name;
		noOfDraws = draws;
		noOfWins = wins;
		noOfLosses = losses;
	}


	@Override
	public int compareTo(Team o) {
		if(this.noOfWins==o.noOfWins){

			if(this.noOfLosses == o.noOfLosses){
				return o.noOfDraws- this.noOfDraws;
					
			} else
				return this.noOfLosses - o.noOfLosses;
		} else
			return o.noOfWins-this.noOfWins;
		
	}

	@Override
	public String toString() {
		return "Team [noOfWins=" + noOfWins + ", noOfLosses=" + noOfLosses +", noOfDraws=" + noOfDraws + ", teamName="
				+ teamName + "]\n";
	}
}