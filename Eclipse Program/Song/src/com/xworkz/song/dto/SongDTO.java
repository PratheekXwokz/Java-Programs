package com.xworkz.song.dto;

import com.xworkz.song.constants.Language;

public class SongDTO {
	private Integer id;
	private String name;
	private String singerName;
	private Double duration;
	private Integer year;
	private Language lang;

	public SongDTO() {
		System.out.println("Default Constructor Created");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Language getLang() {
		return lang;
	}

	public void setLang(Language lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", name=" + name + ", singerName=" + singerName + ", duration=" + duration
				+ ", year=" + year + ", lang=" + lang + "]";
	}

}
