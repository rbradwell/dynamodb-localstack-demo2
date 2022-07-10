package com.example.demo.api.router;
import com.example.demo.api.handler.HealthHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HealthRouter {

    @Bean
    public RouterFunction<ServerResponse> healthRouterFunction(HealthHandler healthHandler) {
        RequestPredicate healthRoute =
                RequestPredicates.GET("/dynamodb/health")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON));

        return RouterFunctions.route(healthRoute, healthHandler::health);
    }
}
