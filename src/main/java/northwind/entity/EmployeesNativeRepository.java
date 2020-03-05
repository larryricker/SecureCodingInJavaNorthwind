//package northwind.entity;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//
//public interface EmployeesNativeRepository extends JpaRepository<Employees, Long> {
//
//	@Query(value = "SELECT e FROM Employees e ORDER BY EmployeesID")
//	Page<Employees> findAllEmployeesWithPagination(Pageable pageable);
//
//}
// new class resulted in error {"timestamp":"2020-02-29T17:51:48.712+0000","status":404,"error":"Not Found","message":"No message available","path":"/employees"}bash-3.2$ 