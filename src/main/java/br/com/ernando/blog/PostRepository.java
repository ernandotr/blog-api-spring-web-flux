package br.com.ernando.blog;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import reactor.core.publisher.Flux;

interface PostRepository extends R2dbcRepository<Post, Integer> {

    @Query("SELECT * FROM posts WHERE title like :name")
    Flux<Post> findByTitleContains(String name);

}
