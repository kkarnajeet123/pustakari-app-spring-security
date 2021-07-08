package com.pustakari.pustakarionlineshopping.repository;


import com.pustakari.pustakarionlineshopping.model.UserInfo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {


   /* @Query(name = "select *\n" +
            "from user_info_table u\n" +
            "inner join authentication_table au\n" +
            "on u.authentication_auth_id = au.auth_id\n" +
            "where u.authentication_auth_id=1?")*/
   /* @Query(name="select u from user_info_table u inner join authentication au" +
            "on u.authentication_auth_id= au.auth_id" +
            " where u.authID = :id")
    UserInfo findByauthentication_authId_auth_Id(@Param("id")int authId);*/


    /*@EntityGraph(value = "userInfo.authentication",type = EntityGraph.EntityGraphType.FETCH)
    public Authentication findByauthId(int authId);*/
}
