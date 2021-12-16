package interfaces;

import entities.product_master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface productrepo extends JpaRepository<product_master,String > {
    @Query(value = "",nativeQuery = true)
    public List find();

}
