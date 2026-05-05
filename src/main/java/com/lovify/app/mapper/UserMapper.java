package com.lovify.app.mapper;

import com.lovify.app.dto.auth.SignupRequest;
import com.lovify.app.dto.auth.UserProfileResponse;
import com.lovify.app.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
