package pro.sky.homework24;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class BasketService {

    private final Set<Integer> codesId = new HashSet<>();

    public void add(int[] args) {
        for (int id : args) {
            codesId.add(id);
        }
    }

    public Collection<Integer> getCodesId() {
        return codesId;
    }
}
