package Model;
public class Vote {
  
    private Integer vote_id;


	private Integer vote_pkid;
    private String voteturn;

    private String votestatus;

    public Integer getVote_pkid() {
		return vote_pkid;
	}

	public void setVote_pkid(Integer vote_pkid) {
		this.vote_pkid = vote_pkid;
	}
    

    public Integer getVote_id() {
		return vote_id;
	}

	public void setVote_id(Integer vote_id) {
		this.vote_id = vote_id;
	}

	public String getVoteturn() {
		return voteturn;
	}

	public void setVoteturn(String voteturn) {
		this.voteturn = voteturn;
	}

	public String getVotestatus() {
		return votestatus;
	}

	public void setVotestatus(String votestatus) {
		this.votestatus = votestatus;
	}

	

}