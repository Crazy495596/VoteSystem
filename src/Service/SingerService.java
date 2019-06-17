package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.SingerDao;
import Model.Singer;

@Service
public class SingerService {
	@Autowired
	private SingerDao singerDao;
	
	public int addSinger(Singer singer) {
		return singerDao.addSinger(singer);
	}
}
