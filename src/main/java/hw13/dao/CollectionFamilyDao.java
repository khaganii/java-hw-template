package hw13.dao;

import hw13.entity.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements Dao<Family> {
  ArrayList<Family> familyList = new ArrayList<>();

  @Override
  public List<Family> getAllFamilies() {
    return familyList;
  }

  @Override
  public Family getFamilyByIndex(int index) {
    if(index < familyList.size()) return familyList.get(index);
    return null;
}

  @Override
  public Boolean deleteFamily(int index) {
    if(index < familyList.size()) {
      familyList.remove(index);
      return true;
    }
    else {
     return false;
    }
  }

  @Override
  public Boolean deleteFamily(Family family) {
    List<Family> families = new ArrayList<>();
    boolean deleted = false;
    for (Family f: familyList){
      if(!family.equals(f)) {
        families.add(f);
      }
      else deleted = true;
    }
    familyList.clear();
    familyList.addAll(families);
    return deleted;
  }

  @Override
  public void saveFamily(Family family) {
    familyList.add(family);
  }
}
