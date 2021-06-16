package team02.issue_tracker.oauth.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import team02.issue_tracker.domain.User;

@ToString
@Getter
@NoArgsConstructor
public class GoogleUserProfile implements SocialProfile{

    private String name;
    private String email;
    private String picture;

    @Override
    public User becomeUser() {
        return User.builder()
                .oauthResource(SocialLogin.GOOGLE)
                .username(this.name)
                .email(this.email)
                .profileImage(this.picture)
                .build();
    }
}
