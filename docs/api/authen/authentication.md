# Authen Authentication API Specification

---

## Public endpoints

### POST /authen/login
- Mô tả: Login with username/password
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "username": "...",
    "password": "..."
  }
}
```

- Response 200 (object `v1LoginResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/login-with-google
- Mô tả: Login with Google OAuth2
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "google_id_token": "..."
  }
}
```

- Response 200 (object `v1LoginResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/logout
- Mô tả: Logout (revoke refresh token / session)
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  }
}
```

- Response 200 (object `v1AuthenticationResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/register
- Mô tả: Register with username/password
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "username": "...",
    "password": "...",
    "email": "...",
    "display_name": "..."
  }
}
```

- Response 200 (object `v1RegisterResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/renew-access-token
- Mô tả: Renew access token using refresh token
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  }
}
```

- Response 200 (object `v1TokenResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/revoke-access-token
- Mô tả: Revoke Access Token
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response 200 (object `v1TokenResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/revoke-refresh-token
- Mô tả: Revoke refresh token
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response 200 (object `v1TokenResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /authen/verify-token
- Mô tả: Verify access token (used by Kong / internal services)
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  }
}
```

- Response 200 (object `v1TokenResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  },
  "token": {
    "access_token": "...",
    "refresh_token": "...",
    "expires_in": "...",
    "expires_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /user-role/assign-role
- Mô tả: Assign roles for user
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "user_id": "...",
    "roles": [
      "..."
    ]
  }
}
```

- Response 200 (object `v1UserRoleResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /user-role/list-role
- Mô tả: Override roles for user
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "filter": {
      "keyword": "...",
      "tenant_id": "...",
      "role_id": "...",
      "permission_id": "..."
    },
    "pagination": {
      "total": "...",
      "page": "...",
      "limit": "..."
    }
  }
}
```

- Response 200 (object `v1ListUserRoleResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "roles": [
    "..."
  ],
  "pagination": {
    "total": "...",
    "page": "...",
    "limit": "..."
  },
  "filter": {
    "keyword": "...",
    "tenant_id": "...",
    "role_id": "...",
    "permission_id": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /user-role/override-role
- Mô tả: Override roles for user
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "user_id": "...",
    "roles": [
      "..."
    ]
  }
}
```

- Response 200 (object `v1UserRoleResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /user-role/unassign-role
- Mô tả: Unassign roles for user
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "user_id": "...",
    "roles": [
      "..."
    ]
  }
}
```

- Response 200 (object `v1UserRoleResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /user-status/active
- Mô tả: Activate user
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "user_id": "...",
    "status": "..."
  }
}
```

- Response 200 (object `v1UserRoleResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /user-status/unactive
- Mô tả: Deactivate user
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "tenant_id": "...",
    "user_id": "...",
    "status": "..."
  }
}
```

- Response 200 (object `v1UserRoleResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "user": {
    "user_id": "...",
    "tenant_id": "...",
    "email": "...",
    "username": "...",
    "roles": [
      "..."
    ],
    "attributes": {},
    "status": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

---

## Notes chung / Behaviour
- Server sử dụng in-memory stores (maps) cho dữ liệu. Dữ liệu sẽ mất khi server dừng.
- Một vài sample data có thể được seed sẵn để test.

---

End of spec.
