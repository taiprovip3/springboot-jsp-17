package phb.group.phb.dev.employ.service;

import java.util.List;

import phb.group.phb.dev.employ.entity.AnimalFeed;

public interface AnimalFeedService {
	public List<AnimalFeed> findAll();
    public void save(AnimalFeed animalFeed);
    public void deleteById(long id);
	public AnimalFeed findById(Long id);
}