package Credit.KG.demoCredit.repository;


import Credit.KG.demoCredit.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client,Long> {

    @Query("select c from Client c where c.login = :login and c.password = :password")
    Client getClientByAuthorization(@Param("login") String login,
                                    @Param("password") String password);

    @Query("select c from Client c where c.login = :login and c.inn = :inn")
    Client getCheckClient(@Param("login") String login,
                          @Param("inn") String inn);





}