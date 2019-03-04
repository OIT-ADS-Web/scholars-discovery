package edu.tamu.scholars.middleware.view.model.repo;

import static edu.tamu.scholars.middleware.view.ViewTestUtility.getMockResultView;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.tamu.scholars.middleware.config.MiddlewareConfig;
import edu.tamu.scholars.middleware.view.model.ResultView;

public class ResultViewRepoTest extends ViewRepoTest<ResultView, ResultViewRepo> {

    @TestConfiguration
    static class ResultViewRepoTestContextConfiguration {

        @Bean
        public MiddlewareConfig middlewareConfig() {
            return new MiddlewareConfig();
        }

        @Bean
        public BCryptPasswordEncoder bCryptPasswordEncoder() {
            return new BCryptPasswordEncoder();
        }

    }

    @Override
    protected ResultView getMockView() {
        return getMockResultView();
    }

}
