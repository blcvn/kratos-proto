# Author Authorization API Specification

---

## Public endpoints

### POST /permission/create
- Mô tả: Tạo mới
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
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1PermissionResponse`):

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
  "payload": {
    "tenant_id": "...",
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /permission/delete
- Mô tả: Gửi yêu cầu
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
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1PermissionResponse`):

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
  "payload": {
    "tenant_id": "...",
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /permission/get
- Mô tả: Gửi yêu cầu
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
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1PermissionResponse`):

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
  "payload": {
    "tenant_id": "...",
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /permission/list
- Mô tả: Gửi yêu cầu
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
  "pagination": {
    "total": "...",
    "page": "...",
    "limit": "..."
  }
}
```

- Response 200 (object `v1ListPermissionResponse`):

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
  "payload": [
    {
      "tenant_id": "...",
      "permission_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    }
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

### POST /permission/search
- Mô tả: Gửi yêu cầu
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

- Response 200 (object `v1ListPermissionResponse`):

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
  "payload": [
    {
      "tenant_id": "...",
      "permission_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    }
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

### POST /permission/update
- Mô tả: Gửi yêu cầu
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
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1PermissionResponse`):

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
  "payload": {
    "tenant_id": "...",
    "permission_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /role-permission/assign
- Mô tả: Gửi yêu cầu
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
    "role_id": "...",
    "permissions": [
      "..."
    ]
  }
}
```

- Response 200 (object `v1RolePermissionResponse`):

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
  "payload": {
    "role": {
      "tenant_id": "...",
      "role_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    },
    "permissions": [
      {
        "tenant_id": "...",
        "permission_id": "...",
        "name": "...",
        "description": "...",
        "status": "...",
        "created_at": "...",
        "updated_at": "..."
      }
    ]
  },
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

### POST /role-permission/override
- Mô tả: Gửi yêu cầu
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
    "role_id": "...",
    "permissions": [
      "..."
    ]
  }
}
```

- Response 200 (object `v1RolePermissionResponse`):

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
  "payload": {
    "role": {
      "tenant_id": "...",
      "role_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    },
    "permissions": [
      {
        "tenant_id": "...",
        "permission_id": "...",
        "name": "...",
        "description": "...",
        "status": "...",
        "created_at": "...",
        "updated_at": "..."
      }
    ]
  },
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

### POST /role-permission/search
- Mô tả: Gửi yêu cầu
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

- Response 200 (object `v1ListRolePermissionResponse`):

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
  "payload": [
    {
      "role": {
        "tenant_id": "...",
        "role_id": "...",
        "name": "...",
        "description": "...",
        "status": "...",
        "created_at": "...",
        "updated_at": "..."
      },
      "permissions": [
        {
          "tenant_id": "...",
          "permission_id": "...",
          "name": "...",
          "description": "...",
          "status": "...",
          "created_at": "...",
          "updated_at": "..."
        }
      ]
    }
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

### POST /role-permission/unassign
- Mô tả: Gửi yêu cầu
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
    "role_id": "...",
    "permissions": [
      "..."
    ]
  }
}
```

- Response 200 (object `v1RolePermissionResponse`):

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
  "payload": {
    "role": {
      "tenant_id": "...",
      "role_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    },
    "permissions": [
      {
        "tenant_id": "...",
        "permission_id": "...",
        "name": "...",
        "description": "...",
        "status": "...",
        "created_at": "...",
        "updated_at": "..."
      }
    ]
  },
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

### POST /role/create
- Mô tả: Tạo mới
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
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1RoleResponse`):

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
  "payload": {
    "tenant_id": "...",
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /role/delete
- Mô tả: Gửi yêu cầu
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
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1RoleResponse`):

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
  "payload": {
    "tenant_id": "...",
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /role/get
- Mô tả: Gửi yêu cầu
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
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1RoleResponse`):

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
  "payload": {
    "tenant_id": "...",
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /role/list
- Mô tả: Gửi yêu cầu
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
  "pagination": {
    "total": "...",
    "page": "...",
    "limit": "..."
  }
}
```

- Response 200 (object `v1ListRoleResponse`):

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
  "payload": [
    {
      "tenant_id": "...",
      "role_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    }
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

### POST /role/search
- Mô tả: Gửi yêu cầu
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

- Response 200 (object `v1ListRoleResponse`):

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
  "payload": [
    {
      "tenant_id": "...",
      "role_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    }
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

### POST /role/update
- Mô tả: Gửi yêu cầu
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
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1RoleResponse`):

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
  "payload": {
    "tenant_id": "...",
    "role_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /tenant/create
- Mô tả: Tạo mới
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
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1TenantResponse`):

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
  "payload": {
    "tenant_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /tenant/delete
- Mô tả: Gửi yêu cầu
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
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1TenantResponse`):

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
  "payload": {
    "tenant_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /tenant/get
- Mô tả: Gửi yêu cầu
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
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1TenantResponse`):

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
  "payload": {
    "tenant_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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

### POST /tenant/list
- Mô tả: Gửi yêu cầu
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
  "pagination": {
    "total": "...",
    "page": "...",
    "limit": "..."
  }
}
```

- Response 200 (object `v1ListTenantResponse`):

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
  "payload": [
    {
      "tenant_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    }
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

### POST /tenant/search
- Mô tả: Gửi yêu cầu
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

- Response 200 (object `v1ListTenantResponse`):

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
  "payload": [
    {
      "tenant_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "created_at": "...",
      "updated_at": "..."
    }
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

### POST /tenant/update
- Mô tả: Gửi yêu cầu
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
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response 200 (object `v1TenantResponse`):

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
  "payload": {
    "tenant_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
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
