package com.mshz.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import com.mshz.domain.enumeration.AuditUserRole;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.mshz.domain.AuditRecomUser} entity. This class is used
 * in {@link com.mshz.web.rest.AuditRecomUserResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /audit-recom-users?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class AuditRecomUserCriteria implements Serializable, Criteria {
    /**
     * Class for filtering AuditUserRole
     */
    public static class AuditUserRoleFilter extends Filter<AuditUserRole> {

        public AuditUserRoleFilter() {
        }

        public AuditUserRoleFilter(AuditUserRoleFilter filter) {
            super(filter);
        }

        @Override
        public AuditUserRoleFilter copy() {
            return new AuditUserRoleFilter(this);
        }

    }

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private LongFilter recomId;

    private LongFilter userId;

    private StringFilter userFullName;

    private StringFilter userEmail;

    private AuditUserRoleFilter role;

    public AuditRecomUserCriteria() {
    }

    public AuditRecomUserCriteria(AuditRecomUserCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.recomId = other.recomId == null ? null : other.recomId.copy();
        this.userId = other.userId == null ? null : other.userId.copy();
        this.userFullName = other.userFullName == null ? null : other.userFullName.copy();
        this.userEmail = other.userEmail == null ? null : other.userEmail.copy();
        this.role = other.role == null ? null : other.role.copy();
    }

    @Override
    public AuditRecomUserCriteria copy() {
        return new AuditRecomUserCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public LongFilter getRecomId() {
        return recomId;
    }

    public void setRecomId(LongFilter recomId) {
        this.recomId = recomId;
    }

    public LongFilter getUserId() {
        return userId;
    }

    public void setUserId(LongFilter userId) {
        this.userId = userId;
    }

    public StringFilter getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(StringFilter userFullName) {
        this.userFullName = userFullName;
    }

    public StringFilter getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(StringFilter userEmail) {
        this.userEmail = userEmail;
    }

    public AuditUserRoleFilter getRole() {
        return role;
    }

    public void setRole(AuditUserRoleFilter role) {
        this.role = role;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AuditRecomUserCriteria that = (AuditRecomUserCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(recomId, that.recomId) &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(userFullName, that.userFullName) &&
            Objects.equals(userEmail, that.userEmail) &&
            Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        recomId,
        userId,
        userFullName,
        userEmail,
        role
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AuditRecomUserCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (recomId != null ? "recomId=" + recomId + ", " : "") +
                (userId != null ? "userId=" + userId + ", " : "") +
                (userFullName != null ? "userFullName=" + userFullName + ", " : "") +
                (userEmail != null ? "userEmail=" + userEmail + ", " : "") +
                (role != null ? "role=" + role + ", " : "") +
            "}";
    }

}
