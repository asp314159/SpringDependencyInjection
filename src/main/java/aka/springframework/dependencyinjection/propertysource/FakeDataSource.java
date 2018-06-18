package aka.springframework.dependencyinjection.propertysource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by AP
 */
@Component
public class FakeDataSource {

    @Value("${aka.username}")
    private String userName;
    @Value("${aka.password}")
    private String password;
    @Value("${aka.dburl}")
    private String url;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
