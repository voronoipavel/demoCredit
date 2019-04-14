package Credit.KG.demoCredit.repository;

import Credit.KG.demoCredit.entity.Credit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CreditRepository extends JpaRepository<Credit,Long> {

}