package Repository;

import Model.Produkt;

import java.util.List;

public class ProduktRepository implements ICrudRepository<Produkt> {
    private List<Produkt> produkteList;

    @Override
    public Produkt findOne(Integer id) {
        return produkteList.get(id);
    }

    @Override
    public List<Produkt> findAll() {
        return produkteList;
    }

    @Override
    public Produkt save(Produkt obj) {
        produkteList.add(obj);
        return null;
    }

    @Override
    public Produkt update(Produkt obj) {
        Produkt oldProdukt = findOne(produkteList.indexOf(obj));
        produkteList.set(produkteList.indexOf(obj),obj);
        return oldProdukt;
    }

    @Override
    public Produkt delete(Integer id) {
        produkteList.remove(findOne(id));
        return null;
    }
}
