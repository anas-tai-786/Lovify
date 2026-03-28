package com.lovify.app.dto.member;

import com.lovify.app.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
