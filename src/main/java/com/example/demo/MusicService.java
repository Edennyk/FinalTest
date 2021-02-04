package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MusicService {

	@Autowired
	private MusicRepository repo;
	
	public List<Music> listAll(){
		return repo.findAll();
	}
	
	public void save(Music music) {
		repo.save(music);
	}
	
	public Music get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
