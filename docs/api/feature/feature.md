# Feature Feature API Specification

---

## Public endpoints

### POST /feature/create
- Mô tả: Create Feature
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
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "..."
  }
}
```

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "order": 1000,
    "status": "...",
    "current_phase": "...",
    "current_step": "...",
    "progress": {},
    "artifacts": {},
    "data": {},
    "created_at": "...",
    "updated_at": "...",
    "children": [
      "..."
    ]
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

### POST /feature/list
- Mô tả: List Features (Children of a parent or project root)
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
    "project_id": "...",
    "parent_id": "...",
    "status": "...",
    "search": "..."
  }
}
```

- Response 200 (object `v1ListFeaturesReply`):

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
      "project_id": "...",
      "parent_id": "...",
      "name": "...",
      "description": "...",
      "order": 1000,
      "status": "...",
      "current_phase": "...",
      "current_step": "...",
      "progress": {},
      "artifacts": {},
      "data": {},
      "created_at": "...",
      "updated_at": "...",
      "children": [
        "..."
      ]
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

### PUT /feature/update
- Mô tả: Update Feature
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
    "current_phase": "...",
    "current_step": "...",
    "progress": {},
    "artifacts": {},
    "data": {}
  }
}
```

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "order": 1000,
    "status": "...",
    "current_phase": "...",
    "current_step": "...",
    "progress": {},
    "artifacts": {},
    "data": {},
    "created_at": "...",
    "updated_at": "...",
    "children": [
      "..."
    ]
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

### DELETE /feature/{id}
- Mô tả: Delete Feature theo `id`
- Auth: không

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "order": 1000,
    "status": "...",
    "current_phase": "...",
    "current_step": "...",
    "progress": {},
    "artifacts": {},
    "data": {},
    "created_at": "...",
    "updated_at": "...",
    "children": [
      "..."
    ]
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

### GET /feature/{id}
- Mô tả: Get Feature theo `id`
- Auth: không

- Response 200 (object `v1FeatureReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "parent_id": "...",
    "name": "...",
    "description": "...",
    "order": 1000,
    "status": "...",
    "current_phase": "...",
    "current_step": "...",
    "progress": {},
    "artifacts": {},
    "data": {},
    "created_at": "...",
    "updated_at": "...",
    "children": [
      "..."
    ]
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
