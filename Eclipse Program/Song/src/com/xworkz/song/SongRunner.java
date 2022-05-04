package com.xworkz.song;

import com.xworkz.song.constants.Language;
import com.xworkz.song.dao.SongDAO;
import com.xworkz.song.dto.SongDTO;

public class SongRunner {

	public static void main(String[] args) {
		SongDTO song = new SongDTO();
		song.setId(1);
		song.setLang(Language.KANNADA);
		song.setName("Hutidhare Kannada");
		song.setDuration(3.5);
		song.setSingerName("Rajkumar");
		song.setYear(1995);

		SongDAO dao = new SongDAO();
		boolean saveDTO = dao.save(song);
		System.out.println(saveDTO);

		SongDTO song1 = new SongDTO();
		song1.setId(2);
		song1.setLang(Language.HINDI);
		song1.setName("Main Hoon Na");
		song1.setDuration(4.2);
		song1.setSingerName("Sonu Nigam");
		song1.setYear(2001);

		boolean saveDTO1 = dao.save(song1);
		System.out.println(saveDTO1);

		SongDTO song2 = new SongDTO();
		song2.setId(3);
		song2.setLang(Language.TAMIL);
		song2.setName("Yaanji");
		song2.setDuration(4.4);
		song2.setSingerName("Anirudh");
		song2.setYear(2016);

		boolean saveDTO2 = dao.save(song2);
		System.out.println(saveDTO2);

		SongDTO song3 = new SongDTO();
		song3.setId(4);
		song3.setLang(Language.TELUGU);
		song3.setName("BlockBuster");
		song3.setDuration(3.60);
		song3.setSingerName("Shreya Ghosal");
		song3.setYear(2015);

		SongDTO song4 = new SongDTO();
		song4.setId(5);
		song4.setLang(Language.KANNADA);
		song4.setName("RajaKumara");
		song4.setDuration(4.5);
		song4.setSingerName("Vijay Prakash");
		song4.setYear(2016);

		SongDTO song5 = new SongDTO();
		song5.setId(6);
		song5.setLang(Language.HINDI);
		song5.setName("Chaiya Chaiya");
		song5.setDuration(6.5);
		song5.setSingerName("Sapna Awasthi");
		song5.setYear(1999);

		SongDTO song6 = new SongDTO();
		song6.setId(7);
		song6.setLang(Language.MALYALAM);
		song6.setName("Darshana");
		song6.setDuration(5.1);
		song6.setSingerName("Darshana Rajendran");
		song6.setYear(2021);

		SongDTO song7 = new SongDTO();
		song7.setId(8);
		song7.setLang(Language.KANNADA);
		song7.setName("Sahasa Simha");
		song7.setDuration(3.4);
		song7.setSingerName("SP Balasubramanyam");
		song7.setYear(2005);

		SongDTO song8 = new SongDTO();
		song8.setId(9);
		song8.setLang(Language.TAMIL);
		song8.setName("Maari");
		song8.setDuration(6.2);
		song8.setSingerName("Anirudh");
		song8.setYear(2014);

		SongDTO song9 = new SongDTO();
		song9.setId(10);
		song9.setLang(Language.MALYALAM);
		song9.setName("Chundari Penne");
		song9.setDuration(4.7);
		song9.setSingerName("Dulquer Salman");
		song9.setYear(2014);

		SongDTO[] name = { song3, song4, song5, song6, song7, song8, song9 };
		dao.saveMultiple(name);

		boolean update1 = dao.updateDurationByName(4.9, "Chundari Penne");
		System.out.println(update1);
		System.out.println("**************************************");

		boolean update2 = dao.updateSingerNameByName("V Hariharan", "RajaKumara");
		System.out.println(update2);
		System.out.println("***************************************");

		boolean update3 = dao.updateNameById("Kal ho na ho", 2);
		System.out.println(update3);
		System.out.println("***************************************");

		SongDTO find = dao.findBySingerName("Sapna Awasthi");
		System.out.println(find);
		System.out.println("***************************************");

		String find1 = dao.findSingerNameByName("Kal ho na ho");
		System.out.println(find1);
		System.out.println("***************************************");

		Language find2 = dao.findLangByName("Maari");
		System.out.println(find2);
		System.out.println("***************************************");

		Double find3 = dao.findDurationByName("Darshana");
		System.out.println(find3);
		System.out.println("***************************************");

		Double find4 = dao.findByMaxDuration();
		System.out.println(find4);
		System.out.println("***************************************");

		Double find5 = dao.findByMinDuration();
		System.out.println(find5);
		System.out.println("***************************************");

		SongDTO[] total = dao.findTotal();
		System.out.println("***************************************");

	}

}
