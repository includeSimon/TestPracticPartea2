package Repository;

import Model.Bestellung;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BestellungRepository implements ICrudRepository<Bestellung> {
    private List<Bestellung> bestellungList;

    public void sortByGesamtpreis(){
        Collections.sort(bestellungList,
                Comparator.comparingInt(
                        Bestellung::gesamtPreis));
    }


    @Override
    public Bestellung findOne(Integer id) {
        return bestellungList.get(id);
    }

    @Override
    public List<Bestellung> findAll() {
        return bestellungList;
    }

    @Override
    public Bestellung save(Bestellung obj) {
        bestellungList.add(obj);
        return null;
    }

    @Override
    public Bestellung update(Bestellung obj) {
        Bestellung oldBestellung = findOne(bestellungList.indexOf(obj));
        bestellungList.set(bestellungList.indexOf(obj),obj);
        return oldBestellung;
    }

    @Override
    public Bestellung delete(Integer id) {
        bestellungList.remove(findOne(id));
        return null;
    }
}
