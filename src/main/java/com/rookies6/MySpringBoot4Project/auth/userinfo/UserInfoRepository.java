package com.rookies6.MySpringBoot4Project.auth.userinfo;

import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserInfoRepository extends ListCrudRepository<UserInfo, Integer> {
Optional<UserInfo> findByEmail(String email);
}