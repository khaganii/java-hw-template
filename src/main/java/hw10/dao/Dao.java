package hw10.dao;

import hw10.entity.Family;

import java.util.List;

public interface Dao<E> {
  public List<Family> getAllFamilies();
  public Family getFamilyByIndex(int index);
  public Boolean deleteFamily(int index);
  public Boolean deleteFamily(Family family);
  public void saveFamily(Family family);
}
