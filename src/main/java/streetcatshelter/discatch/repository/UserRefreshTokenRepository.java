package streetcatshelter.discatch.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import streetcatshelter.discatch.domain.UserRefreshToken;

@Repository
public interface UserRefreshTokenRepository extends JpaRepository<UserRefreshToken, Long> {
    UserRefreshToken findByUserId(String userId);
    UserRefreshToken findByUserIdAndRefreshToken(String userId, String refreshToken);
}
