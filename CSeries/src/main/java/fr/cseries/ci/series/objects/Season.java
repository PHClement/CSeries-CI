package fr.cseries.ci.series.objects;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Season {

	@Getter @Setter private Integer       id;
	@Getter @Setter private Integer       number;
	@Getter @Setter private String        poster;
	@Getter @Setter private String        episodeFormat;
	@Getter @Setter private Boolean       ready = false;
	@Getter @Setter private List<Episode> episodeList;

	public Season(Integer id, Integer number, String date) {
		this.id = id;
		this.number = number;
		this.poster = date;
	}
}
