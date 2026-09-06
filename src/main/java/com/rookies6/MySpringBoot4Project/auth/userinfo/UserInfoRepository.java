package com.rookies6.MySpringBoot4Project.auth.userinfo;

import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserInfoRepository extends ListCrudRepository<UserInfo, Integer> {
    //인증할 때 username의 값은 email 주소로 입력함
Optional<UserInfo> findByEmail(String email);
}