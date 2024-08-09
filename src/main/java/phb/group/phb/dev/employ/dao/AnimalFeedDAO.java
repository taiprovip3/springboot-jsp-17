package phb.group.phb.dev.employ.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phb.group.phb.dev.employ.entity.AnimalFeed;
import phb.group.phb.dev.employ.repository.AnimalFeedRepository;
import phb.group.phb.dev.employ.service.AnimalFeedService;

@Service
public class AnimalFeedDAO implements AnimalFeedService {

	@Autowired
	private AnimalFeedRepository animalFeedRepository;
	
	@Override
	public void save(AnimalFeed animalFeed) {
		animalFeedRepository.save(animalFeed);
	}

	@Override
	public List<AnimalFeed> findAll() {
		return animalFeedRepository.findAll();
	}

	@Override
	public void deleteById(long id) {
		animalFeedRepository.deleteById(id);
	}

	@Override
	public AnimalFeed findById(Long id) {
		return animalFeedRepository.findById(id).orElse(null);
	}

}
