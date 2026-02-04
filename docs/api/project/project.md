# Project Project API Specification

---

## Public endpoints

### POST /project/create
- Mô tả: Create Project
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
    "name": "...",
    "description": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    }
  }
}
```

- Response 200 (object `v1ProjectReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "user_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    },
    "feature_count": 1000,
    "progress": 1000,
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

### POST /project/list
- Mô tả: List Projects
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
    "page": 1000,
    "limit": 1000,
    "sort": "...",
    "total": "..."
  },
  "payload": {
    "status": "...",
    "search": "..."
  }
}
```

- Response 200 (object `v1ListProjectsReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "pagination": {
    "page": 1000,
    "limit": 1000,
    "sort": "...",
    "total": "..."
  },
  "payload": [
    {
      "id": "...",
      "user_id": "...",
      "name": "...",
      "description": "...",
      "status": "...",
      "confluence_config": {
        "enabled": true,
        "space_key": "...",
        "parent_page_id": "..."
      },
      "feature_count": 1000,
      "progress": 1000,
      "created_at": "...",
      "updated_at": "..."
    }
  ]
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

### PUT /project/update
- Mô tả: Update Project
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
    "id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    }
  }
}
```

- Response 200 (object `v1ProjectReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "user_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    },
    "feature_count": 1000,
    "progress": 1000,
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

### DELETE /project/{id}
- Mô tả: Delete Project theo `id`
- Auth: không

- Response 200 (object `v1DeleteReply`):

```json
{
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

### GET /project/{id}
- Mô tả: Get Project theo `id`
- Auth: không

- Response 200 (object `v1ProjectReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "user_id": "...",
    "name": "...",
    "description": "...",
    "status": "...",
    "confluence_config": {
      "enabled": true,
      "space_key": "...",
      "parent_page_id": "..."
    },
    "feature_count": 1000,
    "progress": 1000,
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
